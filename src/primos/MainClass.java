package primos;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Suma de los primeros 50 numeros primos");
		System.out.println("resultado: "+sumFirstFiftyPrimeNumbers());
		System.out.println();
		System.out.println("Suma de los numeros primos entre los primeros 5o números");
		System.out.println("resultado: "+sumPrimeNumbersInFirstFifty());
	}

	public static int sumFirstFiftyPrimeNumbers() {
		int number=1, counter=0, divisor, sum=0;
		do {
			number++;
			divisor=2;
			while (number%divisor!=0 && divisor<number){
				divisor++;
			}
			if(divisor==number) {
				counter++;
				sum+=number;
			}
		} while(counter<50);
		return sum;
	}
	
	public static int sumPrimeNumbersInFirstFifty() {
		int divisor, sum=0;
		for (int number=2;number<=50;number++) {
			divisor=2;
			while (number%divisor!=0 && divisor<number){
				divisor++;
			}
			if(divisor==number) {
				sum+=number;
			}
		}
		return sum;
	}

}
