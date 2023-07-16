
public class Recc_8 {
    public static boolean isLuckyNumber(int num) {
        return isLuckyNumberHelper(num, 2);
    }

    private static boolean isLuckyNumberHelper(int num, int index) {
        if (index > num) {
            return true;
        }
        if (num % index == 0) {
            return false;
        }
        return isLuckyNumberHelper(num - (num / index), index + 1);
    }

    public static void main(String[] args) {
        int n = 19;
        boolean isLucky = isLuckyNumber(n);
        System.out.println(n + " is" + (isLucky ? " " : " not ") + "a lucky number.");
    }
}

