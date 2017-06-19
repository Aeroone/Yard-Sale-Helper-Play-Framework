package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.data.DynamicForm;
import play.data.validation.Constraints.*;
import views.html.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * Renders homepage.
     * @return homepage
     */
    public Result index() {
        return ok(index.render(session().get("email")));
    }

    /**
     * Renders superuser's homepage.
     * @return a homepage
     */
    //@Security.Authenticated(Secured.class)
    //public Result superuserContent() {
    //    return ok(superuser_content.render(
    //            User.finduser(request().username())));
    //}

    /**
     * Guest/admin's homepage.
     * @return a homepage
     */
    @Security.Authenticated(Secured.class)
    public Result content() {
        User user = User.finduser(request().username());
        String id = user.getSaleEventID();
        return ok(content.render(
                User.finduser(request().username()), id));
    }


    /**
     * Seller homepage.
     * @return homepage
     */
    //@Security.Authenticated(Secured.class)
    //public Result sellerContent() {
    //    User user = User.finduser(request().username());
    //    String id = user.getSaleEventID();
    //    return ok(content_seller.render(
    //            User.finduser(request().username()), id));
    //}

    /**
     * Clerk's homepage.
     * @return homepage
     */
    //@Security.Authenticated(Secured.class)
    //public Result clerkContent() {
    //    User user = User.finduser(request().username());
    //    String id = user.getSaleEventID();

     //   return ok(content_clerk.render(
     //           User.finduser(request().username()), id));
    //}

    /**
     * Bookkeeper's homepage.
     * @return homepage
     */
    //@Security.Authenticated(Secured.class)
    //public Result bookkeeperContent() {
    //    User user = User.finduser(request().username());
    //    String id = user.getSaleEventID();

     //   return ok(content_bookkeeper.render(
     //           User.finduser(request().username()), id));
    //}

    /**
     * Cashier's homepage.
     * @return homepage
     */


    /**
     * Static form for a Profile request.
     */
    @Security.Authenticated(Secured.class)
    public static class Profile {

        /**
         * String address of user.
         */
        public String address;
        /**
         * String hobby of user.
         */
        public String hobby;
        /**
         * String job of user.
         */
        public String job;
    }

    /**
     * Generates the profile form.
     * @return profile edit page
     */
    @Security.Authenticated(Secured.class)
    public Result editProfile() {
        Form<Profile> userForm = Form.form(Profile.class);
        return ok(profile.render(
                userForm, User.finduser(request().username())));
    }

    /**
     * Post method for profile edit.
     * @return edited profile.
     */
    @Security.Authenticated(Secured.class)
    public Result posteditProfile() {
        Form<Profile> userForm =
                Form.form(Profile.class).bindFromRequest();
        User user = User.finduser(request().username());
        user.address = userForm.get().address;
        user.hobby = userForm.get().hobby;
        user.job = userForm.get().job;
        user.save();
        return redirect(
                routes.HomeController.content());
    }

    /**
     * Static class for a login form.
     */
    public static class Login {
        @Email
        public String email;
        @Required
        public String password;

        public String validate() {
            if (User.finduser(email) == null) {
                return "The user does not exist!";
            } else if (User.finduser(email).getislocked() == true) {
                return "The user has been locked!";
            } else if (User.authenticate(email, password) == null) {
                    return "Invalid password!";
            }
            return null;
        }
    }

    /**
     * Generates login form.
     * @return login page
     */
    public Result login() {
        Form<Login> userForm = Form.form(Login.class);
        return ok(login.render(userForm));
    }

    /**
     * Posts login data and authenticates user.
     * @return homepage or login page
     */
    public Result postlogin() {
        int lockThreshhold = 3;
       Form<Login> userForm = Form.form(Login.class).bindFromRequest();
       if (userForm.hasErrors()) {
            DynamicForm requestData = Form.form().bindFromRequest();

            if (User.finduser(requestData.get("email")) != null) {
                User user = User.finduser(requestData.get("email"));
                user.setloginTime(user.getloginTime() + 1);
                if (user.getloginTime() > lockThreshhold) {
                    user.setislocked(true);
                }
                user.save();
            }

            return badRequest(login.render(userForm));
        } else {

            User user = User.finduser(userForm.get().email);
            user.setloginTime(1);
            user.setislocked(false);
            user.save();
            session().clear();
            session("email", userForm.get().email);

           //General content page
           return redirect(
               routes.HomeController.content()
           );
        }
    }
    //------------------------------------------------

    /**
     * Logout post method.
     * @return front page
     */
    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.HomeController.index()
        );
    }
    //------------------------------------------------

    //----------------Registration system-------------

    /**
     * Registration static class form.
     */
    public static class Registration {
        /**
         * String email of user.
         */
        @Email
        public String email;
        /**
         * String user's password.
         */
        @Required
        public String password;
        /**
         * String conformPassword entry.
         */
        @Required
        public String confirmPassword;
        /**
         * String username.
         */
        @Required
        public String name;

        /**
         * Validates the registration information.
         * @return Error message or null
         */
        public String validate() {
            if (User.finduser(email) != null) {
                return "The user exists! Try another email!";
            }
            if (!confirmPassword.equals(password)) {
                return "Confirm the password again!";
            }
            return null;
        }
    }

    /**
     * Generates register page.
     * @return register page
     */
    public Result register() {
        Form<Registration> userForm = Form.form(Registration.class);
        return ok(register.render(userForm));
    }

    /**
     * Post method for registration.
     * @return homepage or error page
     */
    public Result postRegister() {

        Form<Registration> userForm =
                Form.form(Registration.class).bindFromRequest();
        if (userForm.hasErrors()) {
            return badRequest(register.render(userForm));
        } else {
            User user = new User(userForm.get().email,
                    userForm.get().name,
                    userForm.get().password);
            if (userForm.get().name.equals("SuperUser")) {
                user.setAuthority("SuperUser");
            }
            user.save();
            session().clear();
            session("email", userForm.get().email);
            return redirect(
                    routes.HomeController.content());
        }
    }
}
