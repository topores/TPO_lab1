package BinomialQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinomialQueueTest {
    private static BinomialQueue bq;

    @BeforeEach
    void beforeEach() {
        bq=new BinomialQueue();


    }

    @Test
    void isEmpty() {
        Assertions.assertTrue(bq.isEmpty());
    }

    @Test
    void getSize() {
        Assertions.assertEquals(bq.getSize(),0);

    }

    @Test
    void makeEmpty() {
        bq.insert(0);
        bq.makeEmpty();
        Assertions.assertEquals(bq.getSize(),0);
    }

    @Test
    void insert() {
        bq.insert(6);
        bq.insert(3);
        bq.insert(7);
        BinomialQueueNode n1=bq.findNodebyKey(3);
        BinomialQueueNode n2=bq.findNodebyKey(7);
        Assertions.assertEquals(n2.sibling.key,n1.key);
    }

    @Test
    void findMinimum() {
        bq.insert(3);
        bq.insert(4);
        bq.insert(5);
        Assertions.assertEquals(bq.findMinimum(),3);
    }

    @Test
    void delete() {
        bq.insert(3);
        bq.insert(4);
        bq.insert(5);


        bq.delete(3);
        //bq.displayQueue();
        BinomialQueueNode n1=bq.findNodebyKey(4);
        BinomialQueueNode n2=bq.findNodebyKey(5);
        Assertions.assertEquals(n1.child.key,n2.key);

        //Assertions.assertTrue(bq.getSize(),0);

    }

    @Test
    void decreaseKeyValue() {
        bq.insert(3);
        bq.insert(4);
        bq.decreaseKeyValue(4,2);
        Assertions.assertEquals(bq.findMinimum(),2);
        BinomialQueueNode n1=bq.findNodebyKey(3);
        BinomialQueueNode n2=bq.findNodebyKey(2);
        //System.out.println(n2.child.key,n1.key);
        Assertions.assertEquals(n2.child.key,n1.key);
        //bq.displayQueue();
    }

    @Test
    void extractMin() {
        bq.insert(3);
        bq.insert(4);
        bq.insert(5);

        Assertions.assertEquals(bq.extractMin(),3);
        Assertions.assertEquals(bq.extractMin(),4);
        Assertions.assertEquals(bq.extractMin(),5);

    }

}