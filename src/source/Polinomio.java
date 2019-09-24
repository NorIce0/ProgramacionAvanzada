package source;

public class Polinomio {
	private int grado;
	private double[] coeficientes;
	/*
	 * La posición 0 del arreglo de coeficientes contiene el coeficiente de grado n
	 * y la posición n contiene al término independiente.
	 */

	public Polinomio(double[] coefi, int gra) {
		coeficientes = coefi;
		grado = gra;
	}

	public double evaluarMSucesivas(double x) {
		double res = 0;
		
		double multip = 1;
		for (int i = 0; i < coeficientes.length; i++) {
			
			for (int j = grado - i; j > 0; j--) {
				multip *= x;
			}
			res += coeficientes[i] * multip;
			multip = 1;
			
		}
		
		return res;
	}
	
	public double evaluarRecursiva(double x) {

		double res = 0;
		
		for(int i = 0; i < grado+1; i++)
			res+=coeficientes[i]*potencia(x,grado-i);
		
		return res;
	}

	public double evaluarRecursivaPar(double x) {
		double res = 0;
		
		for(int i = 0; i < grado+1; i++)
			res+=coeficientes[i]*potenciaPar(x,grado-i);
		
		return res;
	}
	
	public static double potencia(double x, double n) {
		return (n>0)?x*potencia(x, n-1):1;
	}
	
	static double potenciaPar(double x, int n) {
		
		if(n%2==0 && n!=0)
			return potenciaPar(x*x, n/2);
		
		if(n!=0)
			return x*potenciaPar(x, n-1);
		
		return 1;	
	}

	public double evaluarProgDinamica(double x) {
		
		double res = coeficientes[grado];
		double[] potencias = new double[grado];
		int i;
		
		potencias[grado-1]=x;
		
		for(i = grado-1; i > 0; i--)
		{
			potencias[i-1]=x*potencias[i];
		}
		
		for(i = 0; i < grado; i++)
		{
			res+=coeficientes[i]*potencias[i];
		}
		
		return res;
			
	}
	
	public double evaluarMejorada(double x) {
		
		double xAcumulada = 1;
		double resultado = coeficientes[grado];
		for(int i = grado-1; i >= 0; i--) {
			xAcumulada*=x; 
			resultado += coeficientes[i]*xAcumulada;
		}
		return resultado;
	}

	public double evaluarPow(double x) {

		double res = 0;

		for (int i = 0; i <= grado; i++)
			res += coeficientes[i] * Math.pow(x, grado - i);
		return res;

	}

	public double evaluarHorner(double x) {
		double res = coeficientes[0];
		
		for(int i = 1; i < grado+1; i++) {
			res = coeficientes[i] + res*x;
		}
		return res;

	}
}
