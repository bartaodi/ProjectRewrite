public class ProjectRewrite {
    public static void main(String[] args) {
        System.out.println(multiply(0, 5));
    }

    private static int min(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }

//oaw
//        return Math.min(x, y);
    }

    private static int max(int[] values) {

        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int length(int[] values) {
        int count = 0;
        for (int value : values) {
            count++;
        }
        return count;
    }

    private static int multiply(int x, int y) {
        int result = 0;
        boolean isNegative = false;

        if (x < 0) {
            x = -x;
            isNegative = true;
        }

        if (y < 0) {
            y = -y;
            isNegative = !isNegative;
        }

        for (int i = 0; i < y; i++) {
            result = result + x;
        }

        return isNegative ? -result : result;
    }

    private static int pow(int x, int y) { return 0; }

    private static int[] divmod(int x, int y) { return new int[0]; }
}
