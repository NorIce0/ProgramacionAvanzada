package tests;

import org.junit.*;

import source.Polinomio;

public class PolinomioTest {
	
	Polinomio pol1, pol2, pol3, pol4;
	double x1, x2, x3;
	double [][]coeficientes = { {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{8, 7, 6, 5, 4, 3, 2, 1},
								{3, 2, 5, 8, 4, 6},
								{1,0,12,2,36,5,4,88,9,0,0,1,11}};

	@Before
	public void inicio() {
		pol1 = new Polinomio(coeficientes[0], 9);
		pol2 = new Polinomio(coeficientes[1], 7);
		pol3 = new Polinomio(coeficientes[2],5);
		pol4 = new Polinomio(coeficientes[3],12);
		
		x1 = 2.0;
		x2 = 3.0;
		x3 = 3.5;
		
	}
	
	@Test
	public void muestraInicio() {
		System.out.println("Prueba Polinomio");
		System.out.print("Polinomio 1:"); for(double i: coeficientes[0]) { System.out.print(" "+ i); }
		System.out.print("\nPolinomio 2:"); for(double i: coeficientes[1]) { System.out.print(" "+ i); }
		System.out.print("\nPolinomio 3:"); for(double i: coeficientes[2]) { System.out.print(" "+ i); }
		System.out.print("\nPolinomio 4:"); for(double i: coeficientes[3]) { System.out.print(" "+ i); }
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
	}
	
	@Test
	public void evaluarPorMSucesivas() {

		System.out.println("\nMultiplicaciones Sucesivas");
		
		
		long tIni = System.nanoTime();
		Assert.assertEquals(1023.0, pol1.evaluarMSucesivas(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(29524, pol1.evaluarMSucesivas(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(110341.4941, pol1.evaluarMSucesivas(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
//		===========================================================================================

		
		tIni = System.nanoTime();
		Assert.assertEquals(1793.0, pol2.evaluarMSucesivas(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
		tIni = System.nanoTime();
		Assert.assertEquals(24604.0, pol2.evaluarMSucesivas(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(68457.17188, pol2.evaluarMSucesivas(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================
		
		tIni = System.nanoTime();
		Assert.assertEquals(214.0, pol3.evaluarMSucesivas(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(1116.0, pol3.evaluarMSucesivas(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(2208.15625, pol3.evaluarMSucesivas(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================

		tIni = System.nanoTime();
		Assert.assertEquals(30493.0, pol4.evaluarMSucesivas(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1551569.0, pol4.evaluarMSucesivas(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		

		tIni = System.nanoTime();
		Assert.assertEquals(7744890.774, pol4.evaluarMSucesivas(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
	}
	
	@Test
	public void evaluarPorRecursiva() {
		
		System.out.println("\n\nRecursiva");
		
		
		long tIni = System.nanoTime();
		Assert.assertEquals(1023.0, pol1.evaluarRecursiva(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(29524, pol1.evaluarRecursiva(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(110341.4941, pol1.evaluarRecursiva(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
//		===========================================================================================

		
		tIni = System.nanoTime();
		Assert.assertEquals(1793.0, pol2.evaluarRecursiva(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
		tIni = System.nanoTime();
		Assert.assertEquals(24604.0, pol2.evaluarRecursiva(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(68457.17188, pol2.evaluarRecursiva(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================
		
		tIni = System.nanoTime();
		Assert.assertEquals(214.0, pol3.evaluarRecursiva(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(1116.0, pol3.evaluarRecursiva(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(2208.15625, pol3.evaluarRecursiva(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================

		tIni = System.nanoTime();
		Assert.assertEquals(30493.0, pol4.evaluarRecursiva(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1551569.0, pol4.evaluarRecursiva(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		

		tIni = System.nanoTime();
		Assert.assertEquals(7744890.774, pol4.evaluarRecursiva(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
	}
	
	@Test
	public void evaluarPorRecursivaPar() {
		
		System.out.println("\n\nRecursiva Par");
		
		
		long tIni = System.nanoTime();
		Assert.assertEquals(1023.0, pol1.evaluarRecursivaPar(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(29524, pol1.evaluarRecursivaPar(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(110341.4941, pol1.evaluarRecursivaPar(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
//		===========================================================================================

		
		tIni = System.nanoTime();
		Assert.assertEquals(1793.0, pol2.evaluarRecursivaPar(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
		tIni = System.nanoTime();
		Assert.assertEquals(24604.0, pol2.evaluarRecursivaPar(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(68457.17188, pol2.evaluarRecursivaPar(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================
		
		tIni = System.nanoTime();
		Assert.assertEquals(214.0, pol3.evaluarRecursivaPar(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(1116.0, pol3.evaluarRecursivaPar(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(2208.15625, pol3.evaluarRecursivaPar(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================

		tIni = System.nanoTime();
		Assert.assertEquals(30493.0, pol4.evaluarRecursivaPar(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1551569.0, pol4.evaluarRecursivaPar(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		

		tIni = System.nanoTime();
		Assert.assertEquals(7744890.774, pol4.evaluarRecursivaPar(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
	}
	
	@Test
	public void evaluarPorProgramacionDinamica() {
		
		System.out.println("\n\nProgramación Dinámica");
		
		
		long tIni = System.nanoTime();
		Assert.assertEquals(1023.0, pol1.evaluarProgDinamica(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(29524, pol1.evaluarProgDinamica(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(110341.4941, pol1.evaluarProgDinamica(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
//		===========================================================================================

		
		tIni = System.nanoTime();
		Assert.assertEquals(1793.0, pol2.evaluarProgDinamica(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
		tIni = System.nanoTime();
		Assert.assertEquals(24604.0, pol2.evaluarProgDinamica(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(68457.17188, pol2.evaluarProgDinamica(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================
		
		tIni = System.nanoTime();
		Assert.assertEquals(214.0, pol3.evaluarProgDinamica(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(1116.0, pol3.evaluarProgDinamica(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(2208.15625, pol3.evaluarProgDinamica(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================

		tIni = System.nanoTime();
		Assert.assertEquals(30493.0, pol4.evaluarProgDinamica(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1551569.0, pol4.evaluarProgDinamica(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		

		tIni = System.nanoTime();
		Assert.assertEquals(7744890.774, pol4.evaluarProgDinamica(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
	}
	
	@Test
	public void evaluarPorProgramacionDinamicaMejorada() {

		System.out.println("\n\nProgramación Dinámica Mejorada");
		
		
		long tIni = System.nanoTime();
		Assert.assertEquals(1023.0, pol1.evaluarMejorada(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(29524, pol1.evaluarMejorada(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(110341.4941, pol1.evaluarMejorada(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
//		===========================================================================================

		
		tIni = System.nanoTime();
		Assert.assertEquals(1793.0, pol2.evaluarMejorada(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
		tIni = System.nanoTime();
		Assert.assertEquals(24604.0, pol2.evaluarMejorada(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(68457.17188, pol2.evaluarMejorada(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================
		
		tIni = System.nanoTime();
		Assert.assertEquals(214.0, pol3.evaluarMejorada(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(1116.0, pol3.evaluarMejorada(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(2208.15625, pol3.evaluarMejorada(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================

		tIni = System.nanoTime();
		Assert.assertEquals(30493.0, pol4.evaluarMejorada(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1551569.0, pol4.evaluarMejorada(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		

		tIni = System.nanoTime();
		Assert.assertEquals(7744890.774, pol4.evaluarMejorada(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
	}
	
	@Test
	public void evaluarPorPow() {
		
		System.out.println("\n\nPrueba Pow");
		
		
		long tIni = System.nanoTime();
		Assert.assertEquals(1023.0, pol1.evaluarPow(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(29524, pol1.evaluarPow(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(110341.4941, pol1.evaluarPow(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
//		===========================================================================================

		
		tIni = System.nanoTime();
		Assert.assertEquals(1793.0, pol2.evaluarPow(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
		tIni = System.nanoTime();
		Assert.assertEquals(24604.0, pol2.evaluarPow(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(68457.17188, pol2.evaluarPow(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================
		
		tIni = System.nanoTime();
		Assert.assertEquals(214.0, pol3.evaluarPow(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(1116.0, pol3.evaluarPow(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(2208.15625, pol3.evaluarPow(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================

		tIni = System.nanoTime();
		Assert.assertEquals(30493.0, pol4.evaluarPow(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1551569.0, pol4.evaluarPow(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		

		tIni = System.nanoTime();
		Assert.assertEquals(7744890.774, pol4.evaluarPow(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
	}
	
	@Test
	public void evaluarPorHorner() {
		
		System.out.println("\n\nHorner");
		
		
		long tIni = System.nanoTime();
		Assert.assertEquals(1023.0, pol1.evaluarHorner(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(29524, pol1.evaluarHorner(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		tIni = System.nanoTime();
		Assert.assertEquals(110341.4941, pol1.evaluarHorner(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol1 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
//		===========================================================================================

		
		tIni = System.nanoTime();
		Assert.assertEquals(1793.0, pol2.evaluarHorner(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		
		tIni = System.nanoTime();
		Assert.assertEquals(24604.0, pol2.evaluarHorner(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(68457.17188, pol2.evaluarHorner(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol2 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================
		
		tIni = System.nanoTime();
		Assert.assertEquals(214.0, pol3.evaluarHorner(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(1116.0, pol3.evaluarHorner(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
		tIni = System.nanoTime();
		Assert.assertEquals(2208.15625, pol3.evaluarHorner(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol3 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

//		===========================================================================================

		tIni = System.nanoTime();
		Assert.assertEquals(30493.0, pol4.evaluarHorner(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x1: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1551569.0, pol4.evaluarHorner(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x2: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");

		

		tIni = System.nanoTime();
		Assert.assertEquals(7744890.774, pol4.evaluarHorner(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn pol4 y x3: " + (tFin-tIni)*Math.pow(10, -9) + " segundos.");
		
		
	}
}
