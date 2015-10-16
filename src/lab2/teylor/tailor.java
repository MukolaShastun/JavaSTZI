package lab2.teylor;

/**
 * Created by Микола on 16.10.2015.
 */
public class tailor {
    private static double arctg(double x, int eps) {
        if (Math.abs(x) >= 1) {
            throw new IllegalArgumentException("x must be < 1");
        }
        double result = 0.0;
        for (int i = 0; i < eps; i++) {
            result += (Math.pow(-1, i) / (2 * i + 1)) * Math.pow(x, (2 * i + 1));

        }
         return result;
    }
}
