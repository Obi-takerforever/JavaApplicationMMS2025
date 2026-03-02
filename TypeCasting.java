public class TypeCasting{
	public static void main(String[] args) {
	//Java will do widening. it will convert automatically to double
	//taking from small to largest
		double balance = 68949;
		System.out.printf("The account balance is %f%n", balance); //this entire line is literal
		
		
		//this is narrowing, you manually convert it. Java will not do it for you(and you'll lose the .56)
		double number = 89.56;
		int newValue = (int)number;
		
		System.out.printf("The number is %d%n",newValue);
	}
}