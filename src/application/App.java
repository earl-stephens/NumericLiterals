package application;

public class App {
	public static void main(String[] args) {
		//some quirks of literal values
		
		long lValue = 1234;
		//by default, long values are ints
		System.out.println(lValue);
		
		long lValue2 = 1234567891234L;
		//have to append the L so that Java
		//knows it's a long
		
		float fValue = 7.34F;
		//have to append the F so that Java
		//doesn't put it as a double
		
		byte bValue = 127;
		//bytes are signed - can be +ive or
		//-ive
		
		/* there are 255 numbers in byte, but it;s
		 * signed.  Can do something like
		 * byte byteValue = (byte)245 
		 * and this will work, but only up to 255
		 */
		
		byte byteValue = (byte)200;
		System.out.println(byteValue);
		//this gets interpreted as a signed value
		
		//to show the actual value, use the bitwise and operator
		System.out.println(byteValue & 0xFF);
		
		int iValue = 1_000_000;
		System.out.println(iValue);
		//can use _ to make the numbers more readable
		
		//scientific notation
		double dValue = 1.5E6;
		System.out.println(dValue);
		
	}
}
