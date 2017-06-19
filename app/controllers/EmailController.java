package controllers;

import models.Transaction;
import org.apache.commons.mail.EmailAttachment;
import play.api.Play;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import play.mvc.Result;
import play.data.validation.Constraints;
import play.mvc.Controller;
import views.html.saleConfirmation;

import javax.inject.Inject;
import javax.transaction.TransactionRequiredException;
import java.io.File;

public class EmailController extends Controller {
    private final MailerClient mailer;
    @Inject
    public EmailController(MailerClient mailer) {
        this.mailer = mailer;
    }

    public Result sendReceipt(String saleID, String transactionID) {
        Transaction t = Transaction.findUniqueTransaction(transactionID);
        File receipt = new File(t.printReceipt());
        String username = t.getUserName();
        if (username.contains("@")) {
            final Email email = new Email()
                    .setSubject("Simple email")
                    .setFrom("Yard Sale Helper<yardsalehelpergatech@gmail.com>")
                    .addTo("<" + username + ">")
                    .setBodyText("Attached is a copy of your receipt from your purchase.")
                    .addAttachment(receipt.getName() + ".txt", receipt, "Simple data", EmailAttachment.INLINE);
            String id = mailer.send(email);
            flash("success", "Email Sent!");
        } else {
            flash("success", "Email Failed!");
        }
        return ok(saleConfirmation.render(saleID, transactionID));
    }
}

