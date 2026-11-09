package Model;

public class ContentType extends EmailMessage{
    public void setContentType(EmailMessage message, contentType type){
        message.type = type;
    }
}
