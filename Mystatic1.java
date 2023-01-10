package awt;

public class Mystatic1{
	 
	   static int x = 6;
	 
	   Mystatic1() {
	      x ++ ;
	   }
	   void method(){
	      System.out.print("-x" + x);
	   }
	   public static void main(String[] args){
	      MyStatic mc1,mc2,mc3,mc4;

	      MyStatic mc5 = new MyStatic();
	      MyStatic mc6 = new MyStatic();
	      MyStatic mc7 = new MyStatic();

	      mc7.method();
	   }
	}


