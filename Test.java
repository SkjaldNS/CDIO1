import java.time.Duration;
import java.time.Instant;

class TestDiceRolls { 
    private int numberOfRolls = 0;
    //Variable for storing all rolls generated during test.
    private int diceRolls[];
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
    private TestDiceRolls (int n){
        this.numberOfRolls = n*2;
        this.diceRolls = addRollsArray(new int [n*2]);
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
    public static String executeDiceRollsTest (int n){
        var testDiceRollsObj = new TestDiceRolls(n);
        String testResults = ((n)+" dice rolls were made.\n In total, "+testDiceRollsObj.countDoubles+" doubles were rolled.\n The sum of dice rolls equal to 2 were "+testDiceRollsObj.rollSum2+".\n"
        +"The sum of dice rolls equal to 3 were "+testDiceRollsObj.rollSum3+".\n"+"The sum of dice rolls equal to 4 were "+testDiceRollsObj.rollSum4+".\n"+"The sum of dice rolls equal to 5 were "+testDiceRollsObj.rollSum5+".\n"
        +"The sum of dice rolls equal to 6 were "+testDiceRollsObj.rollSum6+".\n"+"The sum of dice rolls equal to 7 were "+testDiceRollsObj.rollSum7+".\n"+"The sum of dice rolls equal to 8 were "+testDiceRollsObj.rollSum8+".\n"
        +"The sum of dice rolls equal to 9 were "+testDiceRollsObj.rollSum9+".\n"+"The sum of dice rolls equal to 10 were "+testDiceRollsObj.rollSum10+".\n"+"The sum of dice rolls equal to 11 were "+testDiceRollsObj.rollSum11+".\n"
        +"The sum of dice rolls equal to 12 were "+testDiceRollsObj.rollSum12+".\n"+"The mean value of the dice rolls was "+testDiceRollsObj.mean+".\n"+"The standard deviation was "+testDiceRollsObj.standardDeviation+".\n");
        return testResults;    
    }
    //used to populate an n-size array with die rolls.
    private static int[] addRollsArray (int [] array) {
        //Need to create an object first?
        Die dieObj = new Die();
        for (int i = 0; i < array.length; i++) {
            //This line is dependant on the implementation of roll() function.
            array[i]=dieObj.rollDie();
        }
        return array;
    }
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
        meanResult = sum/(elements/2);
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

class TestTime {
    private int numberOfRolls = 0;
    private long[] timeDataSet;
    private double meanTime = 0.0; 
    private double lowestTime;
    private double highestTime;
    private TestTime (int n){
        this.numberOfRolls = n;
        this.timeDataSet = timeData(n);
        this.meanTime = meanTime(this.timeDataSet);
        this.lowestTime = lowTime(this.timeDataSet);
        this.highestTime = highTime(this.timeDataSet);
    }
    //Public accessible method to execute a time test.
    public static String executeTimeTest(int n){
        var testTimeObj = new TestTime(n);
        String testResults = "With "+n+" sets of rolls, the mean time to roll two dice was "+testTimeObj.meanTime+"ms, the lowest time was "+testTimeObj.lowestTime+"ms, and the highest time was "+testTimeObj.highestTime+"ms.";
        return testResults;
    }
    //Method for generating a long array of time data.
    private static long[] timeData (int n) {
        //For each element in the array, it records start time in milliseconds, performs two dice rolls, records end time, and adds endTime-startTime to the array
        long timeArray[] = new long [n];
        //Need to create an object - maybe?
        Die dieObj = new Die();
        for (int i = 0; i < timeArray.length; i++) {
            long startTime = System.currentTimeMillis();
            //references created object
            int rollOne = dieObj.rollDie();
            int rollTwo = dieObj.rollDie();
            System.out.println(rollOne+"+"+rollTwo);
            long endTime = System.currentTimeMillis();
            timeArray[i]=endTime-startTime;
        }
        return timeArray;
    }
    //Finds the mean time of a timeData array.
    private static double meanTime(long [] array){
        double sumOfTime = 0.0;
        int elements = array.length;
        for (int i = 0; i < array.length; i++){
            sumOfTime = sumOfTime+array[i];
        }
        return (sumOfTime/elements);
    }
    //Finds the lowest time value of a timeData array.
    private static double lowTime (long [] array){
        //automatically add the first element of an array, to ensure that the value of the variable is always from the array.
        double low = array[0];
        //Skips the first element, since we have already set it above.
        for (int i = 1; i < array.length; i++)
            if(array[i] < low) {
                low = array[i];
            }
        return low;    
    }
    //Finds the highest time value of a timeData array.
    private static double highTime (long [] array){
        //automatically add the first element of an array, to ensure that the value of the variable is always from the array.
        double high = array[0];
        //Skips the first element, since we have already set it above.
        for (int i = 1 ; i < array.length; i++) {
            if(array[i] > high){
                high = array[i];
            }
        }
        return high;
    }    
}    