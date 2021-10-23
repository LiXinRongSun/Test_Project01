package indio.lixinrong.oriented.object04.facbasics03;

public class FibArrtion implements Fib {
   @Override
   public int fibArr(int first , int second ,int n){
        int sum = 0;
        if(n==1){
            sum =first;
            //return first;
        }
         else if(n==2){
             sum =second;
            //return second;
        }
        else if(n==3){
            sum = first+second;
            //return first+second;
        }
        else{
            sum = fibArr(second, first+second, n-1);
        }
        return sum;
           

   } 
}
