package source;

import java.util.HashMap;

public class BinomioDeNewton {
	private HashMap<Integer, Integer> factoriales = new HashMap<Integer, Integer>();
	private double a;
	private double b;
	private int n;

	public BinomioDeNewton(double a, double b, int n) {
		factoriales.put(0, 1);
		this.a = a;
		this.b = b;
		this.n = n;
	}

//	Metodo principales de Binomio de newton

	public double evaluarBinomio(double x) {
		double res = 0;
		double xAux = 1;
		for (int k = 0; k <= n; k++) {
			res += (getTerminoBueno(k) * xAux);
			xAux *= x;
		}
		return res;
	}

	public double getTerminoBueno(int k) {
		return combinatoriaDinamica(n, k) * Polinomio.potenciaPar(a, k) * Polinomio.potenciaPar(b, n - k);
	}

	public double getTermino(int k) {
		return combinatoria(n, k) * Polinomio.potencia(a, k) * Polinomio.potencia(b, n - k);
	}

//	Solución alternativa

	public static double[] crearPascal(int n) {
		double[] vec = new double[n + 1];
		for (int line = 1; line <= n; line++) {

			int C = 1;// used to represent C(line, i)
			for (int i = 0; i <= line; i++) {
				vec[i] = C;
				C = C * (line - i) / (i + 1);
			}
		}
		return vec;
	}

	public double evaluarBinomioPorPascal(double x) {
		double[] vecPascal = crearPascal(n);
		double res = 0;
		double xAux = 1;
		for (int k = 0; k <= n; k++) {
			res += (vecPascal[k] * Polinomio.potenciaPar(a, k) * Polinomio.potenciaPar(b, n - k) * xAux);
			xAux *= x;
		}
		return res;
	}

//	Metodos utilitarios de Binomio de newton

	public int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

	public int factorialDinamico(int n) {
		if (!factoriales.containsKey(n))
			factoriales.put(n, factorialDinamico(n - 1) * n);
		return factoriales.get(n);
	}

	public int combinatoria(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}

	public int combinatoriaDinamica(int n, int k) {
		return factorialDinamico(n) / (factorialDinamico(k) * factorialDinamico(n - k));
	}

//	Getters & Setters

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
