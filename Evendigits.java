package demo;

public class Evendigits {
   public static void main(String[] args) {
	   int no = 123456789;
	   int copy = no;
	   int count = 0;
	   while (copy != 0) {
	       int digit = copy % 10;
	       if (digit % 2 == 0) {
	           count++;
	       }
	       copy = copy / 10;
	   }
	   System.out.println(count);

}
}
