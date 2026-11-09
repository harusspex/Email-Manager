package Model;

import java.util.List;
import java.util.ArrayList;

public class EmailMessage {
    public String sender;
    private String subject;
    private String content;

    private List<String> recipients = new ArrayList<>();
    private List<EmailAttachment> attachments = new ArrayList<>();

    public enum contentType{
        TEXT,
        HTML
    }

    public contentType type;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public List<EmailAttachment> getAttachments() {
        return attachments;
    }

    public void addAttachments(EmailAttachment attachment) {
        attachments.add(attachment);
    }

    public void setContentType(contentType type){
         this.type = type;
    }

    public contentType getType() {
        return type;
    }
}
