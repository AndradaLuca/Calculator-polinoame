package Polinoame;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Polinom {

	private ArrayList<Monom> polinom = new ArrayList<Monom>();

	public Polinom(ArrayList<Monom> polinom) {
		this.polinom = polinom;
	}

	public Polinom() {
		// TODO Auto-generated constructor stub
	}

	public void setPolinom(ArrayList<Monom> polinom) {
		this.polinom = polinom;
	}

	public void add(Monom monom) {
		polinom.add(monom);
	}

	public ArrayList<Monom> getPolinom() {
		return polinom;
	}

	public String toString() {
		int grad;
		double coeficient;
		String afisare = " ";
		// pentru fiecare monom
		for (Monom i : polinom) {
			grad = i.getGrad();
			coeficient = i.getCoeficient();

			// daca gradul este egal cu 0 se verifica daca coeficientul e
			// pozitiv sau negativ
			// si se afiseaza doar coeficientul corespunzator
			if (grad == 0) {
				if (coeficient > 0)
					afisare += " + " + coeficient;
				else
					afisare += "+" + "(" + coeficient + ")";
			} else// daca gradul este pozitiv se verifica daca semnul
					// coeficientului si se
			// apeleaza metoda de afisare din clasa Monom

			if (grad > 0) {
				if (coeficient > 0) {
					afisare += " + " + i.toStringg();
				} else if (coeficient < 0) {
					afisare += " + " + "(" + i.toStringg() + ")";
				}
				if (coeficient == 0) {// daca coeficientul e 0 se afiseaza 0
					afisare += " + " + 0;
				}
			}
		}
		return "R(x) =" + afisare;
	}

	public Polinom transforma(String string) {
		Polinom polinom = new Polinom();
		// am creat un pattern pentru a identifica monoame in Stringul introdus
		// ca parametru
		// (-?\\b\\d+) identifica coeficientu si semnul acestuia = group(1)
		// [xX]\\^ identifica daca intre coeficient si grad este x^ sau X^
		// (-?\\d+\\b) identifica gradu = group(2)

		String pattern = "(-?\\b\\d+)[xX]\\^(-?\\d+\\b)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(string);

		while (m.find())
		// daca am gasit un monom sub forma de strig construim un nou monom
		// convertim gradul respectiv coeficientul din string in int respectiv
		// double
		{
			int gradd = Integer.parseInt(m.group(2));
			double coeff = Double.parseDouble(m.group(1));
			Monom monom = new Monom(gradd, coeff);
			// si is adaugam intr-un Polinom
			polinom.getPolinom().add(monom);
		}

		return polinom;
	}

}
