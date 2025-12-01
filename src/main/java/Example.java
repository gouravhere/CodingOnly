public class Example {
//tesdt
    /*
    Write a function solution(xs) that takes a list of integers representing the power output levels
    of each panel in an array, and returns the maximum product of some non-empty subset of those numbers.
     So for example, if an array contained panels with power output levels of [2, -3, 1, 0, -5],
     then the maximum product would be found by taking the subset: xs[0] = 2, xs[1] = -3, xs[4] = -5,
     giving the product 2*(-3)*(-5) = 30. So solution([2,-3,1,0,-5]) will be 30.

Each array of solar panels contains at least 1 and no more than 50 panels,
 and each panel will have a power output level whose absolute value is no greater than
  1000 (some panels are malfunctioning so badly that they're draining energy, but you
  know a trick with the panels' wave stabilizer that lets you combine two negative-output
  panels to produce the positive output of the multiple of their power values).
     */

    public static void main (String [] args){
        int [] arr = {2, -3, 1, 0, -5,0,1,-2,-2,-3};
      //  int [] arr ={0};
        System.out.printf(solution(arr));
    }

    public static int solution(int [] arr){
        long MaxProduct =0;
        long product =1;
        int negativeCount =0;
        int nonZeroCount =0;
        int smallestAbsNeg = Integer.MAX_VALUE;

            for (int x: arr){
                if (x==0){
                    continue;
                }
                nonZeroCount++;
                if(x<0){
                    negativeCount++;
                    smallestAbsNeg = Math.min(smallestAbsNeg,Math.abs(x));
                }
                product *=Math.abs(x);
                //MaxProduct = Math.max(MaxProduct,product);

            }
                if(nonZeroCount ==0) return 0;
                if(nonZeroCount ==1) return arr[0];
                if (negativeCount % 2 !=0) product /=smallestAbsNeg;
        return (int) product;
    }

}

