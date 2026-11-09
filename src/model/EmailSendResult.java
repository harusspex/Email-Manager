package Model;
import java.time.LocalDateTime;
public class EmailSendResult {
    private EmailMessage message;
    private EmailStatus status;
    private LocalDateTime sentAt;

    public EmailSendResult(EmailMessage message){
        this.message = message;
        //status = emailSender.send() ????????, EmailLogObserver. ???????????;
        this.sentAt = LocalDateTime.now();
    }

    public EmailMessage getMessage() {
        return message;
    }

    public void setMessage(EmailMessage message) {
        this.message = message;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
