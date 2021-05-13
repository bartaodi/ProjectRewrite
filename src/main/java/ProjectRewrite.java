public class ProjectRewrite {
    public static void main(String[] args) {
        int[] maxArr = {1,2,3,4,5};
        System.out.println(max(maxArr));
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

    private static int length(int[] values) { return 0; }

    private static int multiply(int x, int y) { return 0; }

    private static int pow(int x, int y) { return 0; }

    private static int[] divmod(int x, int y) { return new int[0]; }
}
