package Model;

import BinomialQueue.BinomialQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SailorTest {
    private static Sailor s;
    private static Computer c;


    @BeforeEach
    void beforeEach() {
        s=new Sailor("Ford");
        c=new Computer(80,1);
    }

    @Test
    void getLastArticle() {
        assertNull(s.getLastArticle());
        s.setInspirationRate(100);
        s.writeArticle(c);
        s.writeArticle(c);
        assertEquals(s.getLastArticle(),s.getArticles().get(s.getArticles().size()-1));
    }

    @Test
    void writeArticle() {
        int initialIR=100;
        s.setInspirationRate(initialIR);
        int sch=0;
        for (int i=0;i<=100;i++){
            if (s.writeArticle(c)) sch+=1;
            assertEquals(sch,s.getArticles().size());
            assertEquals(initialIR-sch*4,s.getInspirationRate());
        }


    }

    @Test
    void walk() {
        int initialIR=100;
        s.setInspirationRate(initialIR);

        s.walk();
        assertEquals(2+initialIR,s.getInspirationRate());

    }

    @Test
    void sleep() {
        int initialIR=100;
        s.setInspirationRate(initialIR);

        s.sleep();
        assertEquals(3+initialIR,s.getInspirationRate());
    }


}