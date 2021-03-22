import Mathematics.Mathematics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathematicsTest {
    @Test
    void CosTest() {
        Mathematics m=new Mathematics();
        m.cos(0.01);
        double val=-3.14*5;
        for (int i=0; i<=314*10; i++)
            Assertions.assertTrue(Math.abs((m.cos(val))-Math.cos(val))<0.01);
            val+=0.01;
        }

    }
