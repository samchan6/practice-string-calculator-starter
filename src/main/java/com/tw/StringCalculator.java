package com.tw;

public class StringCalculator {
    public int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        String[] numbers = string.split("[,\n/;]");

        int sum = 0;
        for (String num : numbers) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        return sum;
    }
}
