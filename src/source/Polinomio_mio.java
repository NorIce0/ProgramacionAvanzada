package source;

public class Polinomio_mio {
	private int grado;
	private double[] coeficientes;
	/*
	 * La posición 0 del arreglo de coeficientes contiene el coeficiente de grado n
	 * y la posición n contiene al término independiente.
	 */

	public Polinomio_mio(double[] coefi, int gra) {
		coeficientes = coefi;
		grado = gra;
	}

	double evaluarMSucesivas(double x) {
		double res = 0, multip = 1;

		for (int i = 0; i < coeficientes.length; i++) {
			for (int j = grado - i; j > 0; j--) {
				multip *= x;
			}

			res += coeficientes[i] * multip;
			multip = 1;
		}

		return res;

		// return evaluarPow(x);
	}

	double evaluarRecursiva(double x) {

		double res = 0;
		
		for(int i = 0; i < grado+1; i++)
			res+=coeficientes[i]*potencia(x,grado-i);
		
		return res;
	}

	static double potencia(double x, int n) {
		if(n>0)
			return x*potencia(x, n-1);
		
		return 1;	
	}
	
	double evaluarRecursivaPar(double x) {
		double res = 0;
		
		for(int i = 0; i < grado+1; i++)
			res+=coeficientes[i]*potenciaPar(x,grado-i);
		
		return res;
	}

	static double potenciaPar(double x, int n) {
		
		if(n%2==0 && n!=0)
			return potenciaPar(x*x, n/2);
		if(n%1==0 && n!=0)
			return x*potenciaPar(x, n-1);
		
		return 1;	
	}
	
	double evaluarProgDinamica(double x) {

		double[] potencias_calculadas = new double[grado];
		double res = 0;
		int i;
		
		potencias_calculadas[0]=x;
		
		for(i = 1; i < grado; i++)
			potencias_calculadas[i]=potencias_calculadas[i-1]*x;
		
		for(i = 0; i < grado; i++)
			res+=(coeficientes[i]*potencias_calculadas[grado-1-i]);
			
		return (res+coeficientes[i]);
	}

	double evaluarMejorada(double x) {
		
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

	double evaluarPow(double x) {

		double res = 0;

		for (int i = 0; i <= grado; i++)
			res += coeficientes[i] * Math.pow(x, grado - i);
		return res;

	}

	double evaluarHorner(double x) {
		double res_parc, res;
		res = res_parc = 0;

		for (int i = 1; i <= grado; i++) {
			res_parc = (coeficientes[i - 1] + res_parc) * x;
			res = res_parc + coeficientes[i];
		}
		return res;

	}
}
