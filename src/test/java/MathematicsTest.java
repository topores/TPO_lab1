import Mathematics.Mathematics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(doubles = {+Math.PI*0.5-0.01, Math.PI*0.5, Math.PI*0.5+0.01, -0.01, -0, 0.01})
    void ParametrizedCosTest(double x) {
        Mathematics m=new Mathematics();
        Assertions.assertTrue(Math.abs((m.cos(x))-Math.cos(x))<0.01);
    }

    }
