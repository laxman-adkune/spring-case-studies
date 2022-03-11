package Exception;
public class Division {
	public static void main(String[] args) {

		try{
			System.out.println("enter 1st");
			int a= Integer.parseInt(args[0]);
			System.out.println("enter 2st");
			int b= Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please pass atleast two integer values");
		}
		
		catch(NumberFormatException e1){
			System.out.println("Please pass only integer values");
		}
		
		catch(ArithmeticException e2){
			System.out.println("Please do not pass second value as zero");
		}
	}
}