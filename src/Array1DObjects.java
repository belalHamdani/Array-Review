public class Array1DObjects {
    Country [] countries = new Country[10];
    public static void main(String[] args){
        Array1DObjects obj = new Array1DObjects();


    }
    public Array1DObjects(){
        Country us =new Country();
        us.printInfo();
        for(double i =0; i < countries.length; i++) {
            ;
            countries[(int) i] = new Country();
            countries[(int) i].setPop((int) (Math.random() * 101));
        }

printArray();
        addPops();
        avgPop();

    }
    public void printArray(){
        for (int x = 0; x < countries.length; x++) {
            System.out.println(countries[x].getPop());

        }
    }
    public int addPops(){
        int sum = 0;
        //write code for sum
        for(int w = 0; w < countries.length; w++) {
            sum += (countries[w].getPop());

        }



        return sum;
    }
    public double avgPop(){
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            sum += countries[i].getPop();
        }
        double average = (double) sum / countries.length;
        System.out.println("The avg is " + average);



        return average;




    }


}
