package sit707_week6;

public class ConditionalLoops {
	 // Function with a conditional loop
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Function with a conditional loop and a conditional statement inside the loop body
    public static int sumEvenUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
