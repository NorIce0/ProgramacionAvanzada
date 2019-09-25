package tests;

import org.junit.*;
import org.junit.experimental.theories.PotentialAssignment;

import source.BinomioDeNewton;
import source.Polinomio;

public class BinomioTest {
	BinomioDeNewton b1 = new BinomioDeNewton(1, 2, 10);
	BinomioDeNewton b2 = new BinomioDeNewton(3.5, 2, 6);
	BinomioDeNewton b3 = new BinomioDeNewton(2, 4.5, 4);
	BinomioDeNewton b4 = new BinomioDeNewton(1.5, 3, 5);

	double x1;
	double x2;
	double x3;
	double x4;

	@Before
	public void iniciar() {

		x1 = 1.0;
		x2 = 2.5;
		x3 = 2.13;
		x4 = 3.49;
	}

	@Test
	public void getTerminoTest() {

		Assert.assertEquals(8064.0, b1.getTermino(5), 0.001);
		Assert.assertEquals(9003.75, b2.getTermino(4), 0.001);
		Assert.assertEquals(486.0, b3.getTermino(2), 0.001);
		Assert.assertEquals(303.75, b4.getTermino(3), 0.001);

	}

	@Test
	public void evaluarBinomioTest() {
		
		System.out.println("\nBinomio Por Combinatoria\n");
		
		long tIni = System.nanoTime();
		Assert.assertEquals(59049.0, b1.evaluarBinomio(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(3405062.892, b1.evaluarBinomio(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1443778.322, b1.evaluarBinomio(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(24872729.37, b1.evaluarBinomio(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

//
		tIni = System.nanoTime();
		Assert.assertEquals(27680.64063, b2.evaluarBinomio(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1543301.526, b2.evaluarBinomio(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(714445.6546, b2.evaluarBinomio(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(8250517.393, b2.evaluarBinomio(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

//
		tIni = System.nanoTime();
		Assert.assertEquals(1785.0625, b3.evaluarBinomio(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(8145.0625, b3.evaluarBinomio(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(5888.659254, b3.evaluarBinomio(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(17368.70953, b3.evaluarBinomio(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		//
		tIni = System.nanoTime();
		Assert.assertEquals(1845.28125, b4.evaluarBinomio(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(14012.60449, b4.evaluarBinomio(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(9124.447014, b4.evaluarBinomio(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(37871.98055, b4.evaluarBinomio(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

	}

	@Test
	public void crearPascalTest() {
		
	}

	@Test
	public void evaluarBinomioPorPascalTest() {
		
		System.out.println("\nBinomio por Pascal:\n");
		
		long tIni = System.nanoTime();
		Assert.assertEquals(59049.0, b1.evaluarBinomioPorPascal(x1), 0.001);
		long tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(3405062.892, b1.evaluarBinomioPorPascal(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1443778.322, b1.evaluarBinomioPorPascal(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(24872729.37, b1.evaluarBinomioPorPascal(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b1 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

//
		tIni = System.nanoTime();
		Assert.assertEquals(27680.64063, b2.evaluarBinomioPorPascal(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(1543301.526, b2.evaluarBinomioPorPascal(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(714445.6546, b2.evaluarBinomioPorPascal(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(8250517.393, b2.evaluarBinomioPorPascal(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b2 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

//
		tIni = System.nanoTime();
		Assert.assertEquals(1785.0625, b3.evaluarBinomioPorPascal(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(8145.0625, b3.evaluarBinomioPorPascal(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(5888.659254, b3.evaluarBinomioPorPascal(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(17368.70953, b3.evaluarBinomioPorPascal(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b3 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		//
		tIni = System.nanoTime();
		Assert.assertEquals(1845.28125, b4.evaluarBinomioPorPascal(x1), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x1: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(14012.60449, b4.evaluarBinomioPorPascal(x2), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x2: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(9124.447014, b4.evaluarBinomioPorPascal(x3), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x3: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		tIni = System.nanoTime();
		Assert.assertEquals(37871.98055, b4.evaluarBinomioPorPascal(x4), 0.001);
		tFin = System.nanoTime();
		System.out.println("Tiempo de ejecuciòn b4 y x4: " + (tFin - tIni) * Math.pow(10, -9) + " nanosegundos.");

		
	}
}
