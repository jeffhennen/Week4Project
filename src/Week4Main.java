import java.util.ArrayList;

public class Week4Main {

    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(3);
        ages.add(9);
        ages.add(23);
        ages.add(64);
        ages.add(2);
        ages.add(8);
        ages.add(28);
        ages.add(93);

        ArrayList<Double> doubleTesta = new ArrayList<Double>();
        doubleTesta.add(3.0);
        doubleTesta.add(9.0);
        doubleTesta.add(23.0);
        doubleTesta.add(64.0);
        doubleTesta.add(2.0);
        doubleTesta.add(8.0);
        doubleTesta.add(28.0);
        doubleTesta.add(93.0);

        ArrayList<Double> doubleTestb = new ArrayList<Double>();
        doubleTestb.add(3.0);
        doubleTestb.add(9.0);
        doubleTestb.add(23.0);
        doubleTestb.add(64.0);
        doubleTestb.add(2.0);
        doubleTestb.add(8.0);
        doubleTestb.add(2.0);
        doubleTestb.add(28.0);
        doubleTestb.add(93.0);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Sam");
        names.add("Tommy");
        names.add("Tim");
        names.add("Sally");
        names.add("Buck");
        names.add("Bob");




        codingQuestion1(ages);
        codingQuestion2(names);

        //3.How do you access the last element of the array
        System.out.println("3.) Last element of Array: " + ages.get(ages.size() - 1));


        //4.How do you access the first element of the array
        System.out.println("4.) First element of Array: " + ages.get(1));

        //5.) Create Name Lengths array and loop over names and add each names length to the names length array
        ArrayList<Integer> nameLengths = new ArrayList<Integer>();

        for(String name: names){

            nameLengths.add(name.length());
        }
        System.out.println("5.) Length of the names in the array: " + nameLengths.toString());
        //6.) Iterate over the nameLengths array and calculate the sum
        System.out.println("6.) Sum of the name Lengths Array: " + sumArray(nameLengths));

        //7.) Concatenate String with method
        String concatenatedName = concatName("Hello", 10);
        System.out.println("7.) Concatenated Names: " + concatenatedName);

        //8.) method with arguments firstName and Last Name to create fullName
        System.out.println("8.) Full Name of Jeffrey Hennen: " + fullName("Jeffrey", "Hennen"));

        //9.) is greater than 100, ages array
        System.out.println("9.) is the sum greater than 100: " + sumGreaterThan100(ages));

        //10.) average of array
        System.out.println("10.) What is the average of the array: " + averageOfArray(doubleTesta));

        //11.) is array a bigger than array b
        System.out.println("11.) Is array a larger than array b: " + isArrayAAverageLargerThanB(doubleTesta, doubleTestb));

        //12.) Will you buy a drink
        System.out.println("12.) Will you buy a drink: " + willBuyDrink(true, 25.34));

        //13.) What is the down payment requirement for house
        double listPrice = 356000.00;
        double downPaymentPercent = .05;
        System.out.println("13.) The cost of the house is " + listPrice + " percent down payment is " + downPaymentPercent + " the down payment amount is: " + downPaymentForHouse(listPrice, downPaymentPercent));
    }

    public static int sumArray(ArrayList<Integer> array){

        int sum = 0;
        for(int index: array){

            sum += index;
        }

        return sum;
    }

    public static double sumDoubleArray(ArrayList<Double> array){

        double sum = 0;
        for(double index: array){

            sum += index;
        }

        return sum;
    }

    /*
     * a.) Programmatically subtract the value of the first element in the array from the value in the last element of the array print the result to the console.
     * b.) Create a new array with 9 elements (one more than the ages array) Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
     * c.) Use a loop to iterate through the array and calculate the average age. Print the result to the console.
     */
    public static void codingQuestion1(ArrayList<Integer> ages){

        System.out.println("1a.): " + (ages.get(ages.size() - 1) - ages.get(0)));
        ArrayList<Integer> ages2 = new ArrayList<>();
        ages2.addAll(ages);

        ages2.add(85);
        System.out.println("1b.): " + (ages2.get(ages2.size() - 1) - ages2.get(0)));

        System.out.println("1c.): " + averageOfIntArray(ages));
    }


    //a. Loop through the array and calculate the average number of letters per name and print to console.
    //b. Loop again, iterate through array again and concatenate all the names together separated by space and print the result to the console.
    public static void codingQuestion2(ArrayList<String> names){

        System.out.println("2a.): " + averageCharsInArray(names));
        System.out.println("2b.): " + concatNamesofArray(names));
    }

    public static String concatNamesofArray(ArrayList<String> names){

        StringBuilder allNames = new StringBuilder();
        for(String name: names){

            allNames.append(name).append(" ");
        }

        return allNames.toString();
    }
    public static double averageCharsInArray(ArrayList<String> names){

        double sum = 0;
        for(String name: names){

            sum += name.length();
        }
        return sum / names.size();
    }

    public static String concatName(String word, int n){

        StringBuilder concatString = new StringBuilder();
        for (int x = 0 ; x < n; x++){

            concatString.append(word);
        }
        return concatString.toString();
    }

    public static String fullName(String firstName, String lastName){

        return firstName + " " + lastName;
    }

    public static boolean sumGreaterThan100(ArrayList<Integer> numbers){

        return sumArray(numbers) > 100;
    }

    public static double averageOfIntArray(ArrayList<Integer> numbers){

        return (double) sumArray(numbers) / numbers.size();

    }
    public static double averageOfArray(ArrayList<Double> numbers){

        return sumDoubleArray(numbers) / numbers.size();

    }

    public static boolean isArrayAAverageLargerThanB(ArrayList<Double> a, ArrayList<Double> b){

        return averageOfArray(a) > averageOfArray(b);
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){

        return isHotOutside && (moneyInPocket >= 10.50);
    }

    public static double downPaymentForHouse( double listPrice, double percentDownPayment){

        return listPrice * percentDownPayment;
    }
}
