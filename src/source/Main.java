package source;

public class Main {

	public static void main(String[] args) {
//		double[] coefi = {4, 7 , 3 , 6 , 2};
//		
//		Polinomio p = new Polinomio(coefi,4);
//		
//		double val_x = 8;
//		
//		long tIni = System.nanoTime();
//		double res = p.evaluarHorner(val_x);
//		long tFin = System.nanoTime();
//		
//		System.out.println("Resultado: " + res);
//		System.out.println("Tiempo de ejecuciòn: " + (tFin-tIni) + " nanosegundos.");
//		System.out.println("Tiempo de ejecuciòn: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		BinomioDeNewton bdn = new BinomioDeNewton(1, 2, 10);
		int n = 10, k = 5;
		BinomioDeNewton b1 = new BinomioDeNewton(1, 2, 10);
		BinomioDeNewton b2 = new BinomioDeNewton(3.5, 2, 6);
		BinomioDeNewton b3 = new BinomioDeNewton(2, 4.5, 4);
		BinomioDeNewton b4 = new BinomioDeNewton(1.5, 3, 5);
		
		System.out.println(b1.getTerminoBueno(k));
		System.out.println(b2.getTerminoBueno(4));
		System.out.println(b3.getTerminoBueno(2));
		System.out.println(b4.getTerminoBueno(3));
	}
}
