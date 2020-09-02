public class Change {

	public static void main (String args[]){

		System.out.println(NumberOfWaysToMakeChange(6));
	
	}

	public static int NumberOfWaysToMakeChange (int cents) {
		int counter = 0;
		for (int i=0; i<=cents; i++) {
			counter = counter + numSol(25, 10, i)*numSol(5, 1, cents-i);
		}
		return counter;
	}
	
	
	/*
	 * Finds the number of solutions to ax+by=c, over integers
	 */
	public static int numSol (int a, int b, int c) {
		int numx = c/a;
		int counter = 0;
		for (int i=0; i<=numx; i++) {
			if ((c-(a*i)) % b == 0) {
				counter++;
			}
		}
		
		return counter;
	}}