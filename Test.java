import java.timeDuration;
import java.time.Instant;

public class Test {
    private String name = "";
    //Testing parameters, dependent on the implementation of the roll() function. If roll() returns one die, n = 2000 is used to generate 1000 dice roll sets. 
    private int n = 0;
    //Variable for storing all rolls generated during test.
    private int diceRolls[] = new int [n];
    //countDoubles and rollSumx are used to track test analysis.
    private int countDoubles = 0;
    private int rollSum2 = 0;
    private int rollSum3 = 0;
    private int rollSum4 = 0;
    private int rollSum5 = 0;
    private int rollSum6 = 0;
    private int rollSum7 = 0;
    private int rollSum8 = 0;
    private int rollSum9 = 0;
    private int rollSum10 = 0;
    private int rollSum11 = 0;
    private int rollSum12 = 0;
    private double mean = 0.0;
    private double standardDeviation = 0.0;
    public Test (String name, int n){
        this.name = name;
        this.n = n;
        this.diceRolls = addRollsArray(new int [n]);
        this.countDoubles = countDoubles (this.diceRolls);
        this.rollSum2 = countSum (this.diceRolls, 2);
        this.rollSum3 = countSum (this.diceRolls, 3);
        this.rollSum4 = countSum (this.diceRolls, 4);
        this.rollSum5 = countSum (this.diceRolls, 5);
        this.rollSum6 = countSum (this.diceRolls, 6);
        this.rollSum7 = countSum (this.diceRolls, 7);
        this.rollSum8 = countSum (this.diceRolls, 8);
        this.rollSum9 = countSum (this.diceRolls, 9);
        this.rollSum10 = countSum (this.diceRolls, 10);
        this.rollSum11 = countSum (this.diceRolls, 11);
        this.rollSum12 = countSum (this.diceRolls, 12);
        this.mean = calcMean (this.diceRolls);
        this.standardDeviation = calcStandardDeviation(this.diceRolls);
    }

    private static class rollArray {
        //used to populate an n-size array with die rolls.
        private static int[] addRollsArray (int [] array) {
            for (int i = 0; i < length.array; i++) {
             //This line is dependant on the implementation of roll() function.
                array[i]=rollDie();
            }
            return array;
        }

    }
    private static class DateSetEvaluation {
        //Goes through every second element in the array, and compares it to the next element. If they're identical, it increases count. In the end, it return
        //the total amount of doubles from the test set.
        private static int countDoubles (int [] array){
            int count = 0;
            for (int i = 0; i < array.length; i=i+2) {
                if (array[i]==array[i+1]){
                    count++;
                }           
                }
            return count;
        }
        //Goes through every second element in the array, adds the next element and compares it so sum. If they're identical, it increases count. In the end, it returns
        //the total amount of rolls of a given sum from the dataset.
        private static int countSum (int [] array, int sum) {
            int count = 0;
            for (int i = 0; i < array.length; i = i+2){
                if (array[i]+array[i+1]==sum){
                    count++;
                }
            }
            return count;
        }
        //Takes the sum of each element in the array, divides it by the number of elements and returns the mean of the array as a double.
        private static double calcMean(int [] array){
            int elements = array.length;
            double sum = 0.0;
            double meanResult = 0.0;
            for (int i = 0; i < array.length; i++){
                sum = sum + array[i];
            }
            meanResult = sum/elements;
            return meanResult;
        }
        //Calculates the standard deviation of an array by looking at the number of elements and the mean (via calCMean). Returns standard deviation as a double.
        private static double calcStandardDeviation(int [] array){
            int elements = array.length;
            double meanResult = calcMean(array);
            double sumSquared = 0.0;
            for (int i = 0; i < array.length ; i++){
                sumSquared =sumSquared + (Math.pow(array[i]-meanResult,2));
            }
            double standardDeviationResult = Math.sqrt(sumSquared/elements);
            return standardDeviationResult;
        }
    }
    private class EvaluateTime {
        private static double[] timeData (int n) {
            //For each element in the array, it records start time in milliseconds, performs two dice rolls, records end time, and adds endTime-startTime to the array
            double timeArray[] = new double [n];
            for (int i = 0; i < timeArray.length; i++) {
                double startTime = System.currentTimeMillis();
                int rollOne = rollDie();
                int rollTwo = rollDie();
                double endTime = System.currentTimeMillis();
                timeArray[i]=endTime-startTime;
            }
            return timeArray;
        }
        private static double meanTime(double [] array){
            double sumOfTime = 0.0;
            int elements = array.length;
            for (int i = 0; i < array.length; i++){
                sumOfTime = sumOfTime+array[i];
            }
            return (sumOfTime/elements);
        }
        private static double lowTime (double [] array){
            //to be added
        }
        private static double highTime (double [] array){
            //to be added
        }
        
    }    
}    