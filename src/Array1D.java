public class Array1D {
    int[] numbers = new int[10];

    public static void main(String[] args) {
        System.out.println("Hello World");
        Array1D a1d = new Array1D();
    }


    public Array1D() {
        numbers[0] = 54;
        for (int i = 0; i < numbers.length; i++) {
            int tim = (int) (Math.random() * 101);
            numbers[i] = tim;
        }
        printArray();
        System.out.println("the sum is " +sumArray());
        avgArray();
    }

    public void printArray() {
        //write code to print numbers array
        for (int x = 0; x < numbers.length; x++) {
            System.out.println(numbers[x]);
        }
    }

    public int sumArray(){
        int sum = 0;
        //write code for sum
        for(int w = 0; w < numbers.length; w++) {
            sum += numbers[w];
        }



        return sum;
    }
    public double avgArray(){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("The average is " + average);
        return average;
    }
}
