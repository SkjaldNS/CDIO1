public class Test {
    //Testing parameters, dependent on the implementation of the roll() function. If roll() returns one die, n = 2000 is used to generate 1000 dice roll sets. 
    int n = 2000;
    //Variable for storing all rolls generated during test.
    int diceRolls = new int [n];
    //countDoubles and rollSumx are used to track test analysis.
    int countDoubles = 0;
    int rollSum2 = 0;
    int rollSum3 = 0;
    int rollSum4 = 0;
    int rollSum5 = 0;
    int rollSum6 = 0;
    int rollSum7 = 0;
    int rollSum8 = 0;
    int rollSum9 = 0;
    int rollSum10 = 0;
    int rollSum11 = 0;
    int rollSum12 = 0;
    double mean = 0.0;
    double standardDeviation = 0.0;
}
public class DateSetEvaluation {
    //Goes through every second element in the array, and compares it to the next element. If they're identical, it increases count. In the end, it return
    //the total amount of doubles from the test set.
    public static int countDoubles (int [] array){
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
    public static int countSum (int [] array, int sum) {
        int count = 0;
        for (int i = 0; i < array.length; i = i+2){
            if (array[i]+array[i+1]==sum){
                count++;
            }
        }
        return count;
    }
}