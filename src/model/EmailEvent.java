package Model;

public class EmailEvent {
    EmailMessage message;
    EmailSendResult result;

    public EmailEvent(EmailMessage message){
        this.message = message;
        this.result = new EmailSendResult(message);
    }

    public EmailSendResult getResult(){
        return result;
    }
}
