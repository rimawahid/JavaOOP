
package mathClass;

import java.text.DecimalFormat;

public class DecimalNumberFormatting {
    public static void main(String[] args) {
        DecimalFormat ob = new DecimalFormat("0.00");
        double x = 2.1568;
        System.out.println("x = "+ob.format(x));
    }
}
