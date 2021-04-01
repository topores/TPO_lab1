package Model;

public class Article {
    private String topic;
    private String text;

    private int acridity;

    public Article(String topic, String text,int acridity) {
        this.topic = topic;
        this.text = text;
        this.acridity = acridity;
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


    public int getAcridity() {
        return acridity;
    }

    public void setAcridity(int acridity) {
        this.acridity = acridity;
    }

}
