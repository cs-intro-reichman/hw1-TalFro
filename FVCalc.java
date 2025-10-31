// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentvalue = Integer.parseInt(args[0]);
		double ribit = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double futurevalue = currentvalue* Math.pow((1+ribit/100), years);

		System.out.println("After " + years + "years , " + currentvalue + "$ saved at " + ribit + "% will yield " + futurevalue + "$");



	}
}