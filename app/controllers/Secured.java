package controllers;

import play.mvc.*;
import play.mvc.Http.*;

/**
 * Security authentication class.
 */
public class Secured extends Security.Authenticator {

    /**
     * Validate by usernmame.
     * @param ctx current context
     * @return session email.
     */
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    /**
     * Method for unauthorized login credentials.
     * @param ctx current context.
     * @return login page
     */
    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.HomeController.login());
    }
}
