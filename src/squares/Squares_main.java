package squares;

public class Squares_main {
	
	public static void main(String[] args) {
		
		double x[] = { 0.0, 0.3, 0.6, 0.9, 1.2, 1.5, 1.8 };
		double y[] = { 0.8, 1.5, 2.3, 3.1, 4.0, 5.0, 5.8 };
		double theta[] = new double[2];

		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
		 }

	}

}
