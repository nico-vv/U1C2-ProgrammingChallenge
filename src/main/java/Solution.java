public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1+t2+t3+t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) (average+.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage>=65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares*price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public int addOne(int num){
        if (num==9)
            return 0;
        else
            return num+1;
    }

    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int hundreds = addOne((int) ((userDouble/100)%10));
        int tens = addOne((int) ((userDouble/10)%10));
        int ones = addOne((int) ((userDouble)%10));
        int tenths = addOne((int) ((userDouble*10)%10));
        int hundredths = addOne((int) ((userDouble*100)%10));
        if (hundreds!=1)
            return hundreds*100+tens*10+ones+tenths/10.0+hundredths/100.0;
        else
            return tens*10+ones+tenths/10.0+hundredths/100.0;
    }

    /*`userDouble` is a number between `100.00` and `999.99` with up to 2
decimal places. Add 1 to each of its five digits - a `9` wraps around to
`0` - and return the result as a `Double` in the form `ddd.dd`.

| Call | Returns |
|---|---|
| `adjustDigits(123.45)` | `234.56` |
| `adjustDigits(999.99)` | `000.00` |
| `adjustDigits(109.90)` | `210.01` |

Hints:
- `%` and `/` can pull individual digits out of a whole number. Experiment with `%` and groups of `10` . What does `1234%10` give you? What about `1234%100`? You want to extract the digits and then add them back together for the final result.  */

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
