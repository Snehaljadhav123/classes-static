package awt;

public class Counter1 {
	 
	   int count;
	   static int stCount;
	 
	   public Counter1() {
	      count ++ ;
	      stCount ++ ;
	   }
	   public int getCount(){
	      return count;
	   }
	   public static int getStCount(){
	      return stCount;
	   }
	}
	 
