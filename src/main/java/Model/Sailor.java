package Model;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class Sailor {
    private ArrayList<Article> articles = new ArrayList<Article>();
    private int inspirationRate = 1;
    private String name;

    public Sailor(String name) {
        this.name = name;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public Article getLastArticle() {
        ArrayList<Article> as = getArticles();
        if (as.size() > 0)
            return as.get(as.size() - 1);
        else {
            return null;
        }
    }

    public int getInspirationRate() {
        return inspirationRate;
    }

    public void setInspirationRate(int inspirationRate) {
        this.inspirationRate = inspirationRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean writeArticle(Computer c) {
        System.out.println(this.name + " пробует написать новую статью c помощью компьютера #" + Integer.toString(c.getId()));
        if (inspirationRate <= 0) {
            System.out.println("Недостаточно вдохновения!");
            return false;
        }

        byte[] array = new byte[8];
        new Random().nextBytes(array);
        String topic = new String(array, Charset.forName("UTF-8"));

        byte[] array2 = new byte[c.getPower() * this.inspirationRate];
        new Random().nextBytes(array2);
        String text = new String(array2, Charset.forName("UTF-8"));
        Article a = new Article(topic, text, this.inspirationRate/2);
        this.articles.add(a);
        this.inspirationRate += -4;
        System.out.println("Cтатья " + topic + " написана");
        return true;
    }

    public void walk(boolean withBathrobe) {
        System.out.println(this.name + " прогуливается");
        this.inspirationRate += 2;
        if (withBathrobe) this.inspirationRate += 3;
    }

    public void sleep() {
        System.out.println(this.name + " спит");
        this.inspirationRate += 3;
    }


}
