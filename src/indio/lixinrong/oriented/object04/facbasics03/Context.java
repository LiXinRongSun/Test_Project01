package indio.lixinrong.oriented.object04.facbasics03;
/**
 * 环境类 客户调用策略
 */
public class Context {
 private  Istrategy istrategy;
 private  Fib fib;

 public Context(){

 }  
public Context(Fib fib){
     this.fib = fib;}
 public Context(Istrategy istrategy){
     this.istrategy = istrategy;

 }
 

 
 public void doAnything(int[] arr){
     this.istrategy.algorithm(arr);

 }
 public int doFib(int first, int second, int n){
     return this.fib.fibArr(first, second, n);
 }

 public Fib getFib() {
     return fib;
 }

 public void setFib(Fib fib) {
     this.fib = fib;
 }
@Override
public String toString() {
	return "Context [fib=" + fib + "]";
}

 
 
}
