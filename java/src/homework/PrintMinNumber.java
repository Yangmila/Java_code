package homework;

public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        String str = new String("");
        if (numbers == null || numbers.length < 0) {
            return str;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum1 = Integer.valueOf(numbers[i] + "" + numbers[j]);
                int sum2 = Integer.valueOf(numbers[j] + "" + numbers[i]);

                if (sum1 > sum2) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            str = str + numbers[i];
        }
        return str;
    }
}
