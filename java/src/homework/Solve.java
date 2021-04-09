package homework;

import java.math.BigInteger;

public class Solve {
    public String solve (String s, String t) {
        BigInteger bigInteger1 = new BigInteger(s);
        BigInteger bigInteger2 = new BigInteger(t);

        return bigInteger1.add(bigInteger2).toString();
    }
}
