public class Largest {

    public static void main(String[] args) {
        double[] numArray = { 45.8, 29, -30.5, -89.5, 35.5, 93.9, 2.7, 23.5 };
        double largest = numArray[0];

        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }

        System.out.format("Largest element = %.2f", largest);
    }
}
