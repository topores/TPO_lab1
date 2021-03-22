package Model;

public class Article {
    private String topic;
    private String text;

    public Article(String topic, String text) {
        this.topic = topic;
        this.text = text;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
