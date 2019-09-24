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
	
	public double evaluarPolinomioCombinatoria(double x) {
		double res = 0;
		double xAux = 1;
		for(int k = 0; k <= n; k++) {
			res += (getTermino(k) * xAux); 
			xAux *= x;
		}
		return res;
	}
	
	public double getTermino(int k) {
		return combinatoriaDinamica(n, k) * Polinomio.potenciaPar(a, k) *
				Polinomio.potenciaPar(b, n-k);
	}
	
	
//	Metodos utilitarios de Binomio de newton
	
	public int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return factorial(n-1)*n;
	}
	
	public int factorialDinamico(int n) {
		if(!factoriales.containsKey(n))
			factoriales.put(n, factorialDinamico(n-1)*n);
		return factoriales.get(n);
	}
	public int combinatoria(int n, int k) {
		return factorial(n)/(factorial(k)*factorial(n-k));
	}
	
	public int combinatoriaDinamica(int n, int k) {
		return factorialDinamico(n)/(factorialDinamico(k)*factorialDinamico(n-k));
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
