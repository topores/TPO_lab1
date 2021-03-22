package Mathematics;

import java.math.*;

public class Mathematics {
    public Mathematics() {
    }

    private int iters = 6;

    public int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) ans *= i;
        return ans;
    }

    public double cos(double val) {
        double a = 0;
        int c = 1;
        if (val < 0) val = -val;
        if (val > 2 * Math.PI) val = val - 2 * Math.PI * Math.floor(val / (2 * Math.PI));
        if (val > Math.PI) val = 2 * Math.PI - val;
        if (val > (Math.PI / 2)) {
            val = Math.PI - val;
            c = -1;
        }
        for (int i = 0; i < this.iters; i++) {
            a += Math.pow(-1, i) * Math.pow(val, 2 * i) / this.factorial(2 * i);

        }
        return c * a;


    }
}
