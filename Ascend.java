// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double a = num*Math.random();
		double b = num*Math.random();
		double c = num*Math.random();

		System.out.println((int)a+" "+(int)b+" "+(int)c+" ");

		double max = Math.max(a, b);
		max = Math.max(max, c);
		double min = Math.min(a, b);
		min = Math.min(min,c);
		double mid = a+b+c-max-min;

		System.out.println((int)min+" "+(int)mid+" "+(int)max);



	}
}
