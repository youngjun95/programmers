package org.example.level2;

public class Country123 {
    public static void main(String[] args) {
        String answer = "";
        int n = 3;
        answer = sol(n, "");
        System.out.println(answer);
    }
    public static String sol(int num, String answer) {
        System.out.println(answer);
        if (num <= 2) {
            return answer;
        } else {
            if (num % 3 == 0) {
                return sol((num/3) -1, "4"+ answer);
            } else {
                return sol(num/3, (num%3) + answer);
            }
        }
    }
}
