public class Arrays2DObjects {
    Country [][] countries = new Country[4][5];
    public static void main(String[] args){
        Arrays2DObjects obj = new Arrays2DObjects();


    }
    public Arrays2DObjects() {
        for(int r = 0; r< countries.length; r++) {
            for (int c = 0; c < countries[r].length; c++) {
                countries[r][c] = new Country();
                countries[r][c].setPop((int)(Math.random()*1001));
            }
        }
      printArray();
        System.out.println(sumPoPo());
        System.out.println(avgPopo());
        }

    public void printArray(){
        for(int r = 0; r< countries.length; r++){
            for(int c =0; c< countries[r].length;c++){
                System.out.print(countries[r][c].getPop() +" ");

            }
            System.out.println();
        }
    }
    public int sumPoPo(){
        int sum = 0;
        for(int r = 0; r< countries.length; r++){
            for(int c = 0;c<countries[r].length;c++){
                sum += countries[r][c].getPop();
            }
        }
        return sum;
    }
    public double avgPopo(){
        int sum = 0;
        for(int r = 0; r< countries.length; r++){
            for(int c = 0;c<countries[r].length;c++){
                sum += countries[r][c].getPop();
            }
        }
        double average = (double) sum / countries.length;
        System.out.println("The avg is " + average);



        return average;
}
}