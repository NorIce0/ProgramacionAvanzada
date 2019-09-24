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
		BinomioDeNewton bdn = new BinomioDeNewton(10, 20, 2);
		System.out.println(bdn.factorial(7));

		
	}
}
