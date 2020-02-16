
public class Strategy {
	 public static void main(String[] args) {
	      Context context = new Context(new Add());		
	      System.out.println( context.stuff(10, 5));

	      context = new Context(new Sub());		
	      System.out.println(  context.stuff(10, 5));

	      context = new Context(new Mul());		
	      System.out.println( context.stuff(10, 5));
	   }
}
