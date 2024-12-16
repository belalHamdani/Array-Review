public class Arrays2D {
    int[][] nums = new int[4][5];

    public static void main(String[] args) {
        Arrays2D a2d = new Arrays2D();
    }

    public Arrays2D() {
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                nums[r][c] = (int) (Math.random() * 101);
            }
        }
        printArray();
        System.out.println(sum2D());
        System.out.println(avgArray());
    }

    public void printArray() {
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                System.out.print(nums[r][c] + " ");
            }
            System.out.println();
        }
    }

    public int sum2D() {
        int sum = 0;
        for (int y = 0; y < nums.length; y++) {
            for (int x = 0; x < nums[y].length; ) {
                sum += nums[y][x];
            }
        }
        return sum;
    }

    public double avgArray() {
        int sum = 0;
        for (int y = 0; y < nums.length; y++) {
            for (int x = 0; x < nums[y].length; ) {
                sum += nums[y][x];
            }
        }
            double average = (double) sum / nums.length;
            System.out.println("The average is " + average);

        return average;
    }
}

//make avg

