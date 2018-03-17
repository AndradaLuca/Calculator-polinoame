package Polinoame;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class testOp {

	public testOp()

	{

	}

	Polinom p1 = new Polinom();
	Polinom p2 = new Polinom();
	Polinom p3 = new Polinom();
	Operatii o = new Operatii();

	@Test
	public void TestAdunare() {
		p1.add(new Monom(1, 2));
		p1.add(new Monom(2, 3));
		p1.add(new Monom(0, 3));
		p2.add(new Monom(1, 3));
		p2.add(new Monom(2, 1));
		p2.add(new Monom(0, 4));

		p3 = o.adunare(p1, p2);
		o.odoneazaDescrescator(p3);
		o.verifica(p3);
		Polinom p4 = new Polinom();
		p4.add(new Monom(1, 5));
		p4.add(new Monom(2, 4));
		p4.add(new Monom(0, 7));

		o.odoneazaDescrescator(p4);

		assertEquals(p3.toString(), p4.toString());

	}

	@Test
	public void TestInmultiree() {
		p1.add(new Monom(1, 2));
		p1.add(new Monom(2, 3));
		p1.add(new Monom(0, 3));
		p2.add(new Monom(1, 3));
		p2.add(new Monom(2, 1));
		p2.add(new Monom(0, 4));

		p3 = o.inmultire(p1, p2);
		o.odoneazaDescrescator(p3);
		o.verifica(p3);
		Polinom p4 = new Polinom();
		p4.add(new Monom(1, 17));
		p4.add(new Monom(2, 21));
		p4.add(new Monom(0, 12));
		p4.add(new Monom(3, 11));
		p4.add(new Monom(4, 3));

		o.odoneazaDescrescator(p4);
		o.verifica(p3);

		assertEquals(p3.toString(), p4.toString());

	}

	@Test
	public void TestScadere() {
		p1.add(new Monom(1, 2));
		p1.add(new Monom(2, 3));
		p1.add(new Monom(0, 3));
		p2.add(new Monom(1, 3));
		p2.add(new Monom(2, 1));
		p2.add(new Monom(0, 4));

		p3 = o.scadere(p1, p2);
		o.odoneazaDescrescator(p3);

		Polinom p4 = new Polinom();
		p4.add(new Monom(1, -1));
		p4.add(new Monom(2, 2));
		p4.add(new Monom(0, -1));

		o.odoneazaDescrescator(p4);
		o.verifica(p3);

		assertEquals(p3.toString(), p4.toString());

	}

	@Test
	public void TestDerivare() {
		p1.add(new Monom(2, 2));
		p1.add(new Monom(3, 3));
		p1.add(new Monom(1, 3));

		p3 = o.derivare(p1);
		o.odoneazaDescrescator(p3);

		Polinom p4 = new Polinom();
		p4.add(new Monom(1, 4));
		p4.add(new Monom(2, 9));
		p4.add(new Monom(0, 3));

		o.odoneazaDescrescator(p4);
		o.verifica(p3);

		assertEquals(p3.toString(), p4.toString());

	}

	@Test
	public void TestIntegrare() {
		p1.add(new Monom(1, 2));
		p1.add(new Monom(2, 3));
		p1.add(new Monom(3, 4));

		p3 = o.integrare(p1);
		o.odoneazaDescrescator(p3);

		Polinom p4 = new Polinom();
		p4.add(new Monom(2, 1));
		p4.add(new Monom(3, 1));
		p4.add(new Monom(4, 1));

		o.odoneazaDescrescator(p4);
		o.verifica(p3);

		assertEquals(p3.toString(), p4.toString());

	}

	@Test
	public void TestParsare() {
		String string = "2x^1+3x^3+4x^2";
		Polinom p1 = new Polinom();
		Polinom p2 = new Polinom();
		Operatii o = new Operatii();
		p2.add(new Monom(1, 2));
		p2.add(new Monom(3, 3));
		p2.add(new Monom(2, 4));

		p1 = p1.transforma(string);
		o.verifica(p1);
		o.odoneazaDescrescator(p1);
		o.verifica(p2);
		o.odoneazaDescrescator(p2);
		assertEquals(p1.toString(), p2.toString());

	}

}
