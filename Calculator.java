class Calculator{
	
	public static void add(int firstNumber, int secondNumber) {
		System.out.println("Adding two numbers: "+((6*firstNumber) + (6*secondNumber)));
	}
	
	public static void difference(int firstNumber, int secondNumber) {
		System.out.println("Difference of two numbers: " +((6*firstNumber) - (6*secondNumber)));
	}
	public static void main(String[] args) {
		
		add(2,3);	
		difference(10,2);
	}
	
	
}