package Polinoame;

import java.util.ArrayList;

public class Operatii {

	// aceasta metoda verifica daca avem 2 monoame de acelasi grad intr-un
	// Polinom
	public void verifica(Polinom p1) {
		int n = p1.getPolinom().size();
		int i = 0;

		while (i < n - 1) {
			int j = i + 1;

			while (j < n) {
				int gradP1 = p1.getPolinom().get(i).getGrad();
				int gradP2 = p1.getPolinom().get(j).getGrad();
				// daca doua monoame au gradele egale
				if (gradP1 == gradP2) {
					double coeficientP1 = p1.getPolinom().get(i).getCoeficient();
					double coeficientP2 = p1.getPolinom().get(j).getCoeficient();
					// adunam coeficientii in primul monom
					// si stergem al doilea monom
					p1.getPolinom().get(i).setCoeficient(coeficientP1 + coeficientP2);
					p1.getPolinom().remove(j);

					n--;
				}

				j++;
			}

			i++;
		}
	}

	public void odoneazaDescrescator(Polinom polinom) {
		int k;
		int n = polinom.getPolinom().size();
		do {
			k = 0;
			Monom aux = new Monom();
			for (int i = 0; i <= n - 1; i++) {
				for (int j = i + 1; j <= n - 1; j++)
				// luam gradele a doua monoame consecutive
				{
					int grad1 = polinom.getPolinom().get(i).getGrad();
					int grad2 = polinom.getPolinom().get(i + 1).getGrad();

					// verificam daca sunt ordonate descrescator
					if (grad1 < grad2) {
						// interschimbat monomul1 cu monomul2
						aux = polinom.getPolinom().get(i);
						polinom.getPolinom().set(i, polinom.getPolinom().get(i + 1));
						polinom.getPolinom().set(i + 1, aux);
						k = 1;
					}

				}
			}

		} while (k == 1);
	}

	public Polinom adunare(Polinom polinom1, Polinom polinom2) {
		Polinom suma = new Polinom();

		// introducem in polinomul suma monoamele polinomului 1

		for (Monom i : polinom1.getPolinom()) {
			Monom aux = new Monom();
			aux.setCoeficient(i.getCoeficient());
			aux.setGrad(i.getGrad());
			suma.getPolinom().add(aux);
		}

		// introducem in polinomul suma monoamele polinomului 2

		for (Monom i : polinom2.getPolinom()) {
			Monom aux = new Monom();
			aux.setCoeficient(i.getCoeficient());
			aux.setGrad(i.getGrad());
			suma.getPolinom().add(aux);
		}

		int n = suma.getPolinom().size();
		// cautam in polinomul suma grade identice
		for (int i = 0; i < suma.getPolinom().size(); i++) {
			for (int j = i + 1; j < suma.getPolinom().size(); j++)

			// daca 2 grade sunt identice
			{
				if (suma.getPolinom().get(i).getGrad() == suma.getPolinom().get(j).getGrad())
				// insumama coeficientii si stergem al doilea monom
				{
					suma.getPolinom().get(i).setCoeficient(
							suma.getPolinom().get(i).getCoeficient() + suma.getPolinom().get(j).getCoeficient());
					// stergem al doilea monom din polinomul suma
					suma.getPolinom().remove(j);
					j--;
				}

			}
		}
		return suma;
	}

	public Polinom scadere(Polinom polinom1, Polinom polinom2) {
		Polinom scadere = new Polinom();

		// introducem in polinomul suma monoamele polinomului 1

		for (Monom i : polinom1.getPolinom()) {
			Monom aux = new Monom();
			aux.setCoeficient(i.getCoeficient());
			aux.setGrad(i.getGrad());
			scadere.getPolinom().add(aux);
		}

		// introducem in polinomul suma monoamele polinomului 2
		// dar cu semnul schimbat

		for (Monom i : polinom2.getPolinom()) {
			Monom aux = new Monom();
			aux.setCoeficient(-i.getCoeficient());
			aux.setGrad(i.getGrad());
			scadere.getPolinom().add(aux);
		}
		int n = scadere.getPolinom().size();

		// cautam in polinomul suma grade identice
		for (int i = 0; i < scadere.getPolinom().size(); i++) {
			for (int j = i + 1; j < scadere.getPolinom().size(); j++)

			{
				int gradP1 = scadere.getPolinom().get(i).getGrad();
				int gradP2 = scadere.getPolinom().get(j).getGrad();
				// daca gasim 2 monoame au acelasi grad

				if (gradP1 == gradP2) {

					// aduman coeficientii in primul monom
					double coefP1 = scadere.getPolinom().get(i).getCoeficient();
					double coefP2 = scadere.getPolinom().get(j).getCoeficient();
					scadere.getPolinom().get(i).setCoeficient(coefP1 + coefP2);
					// stergem al doilea monom din polinomul suma
					scadere.getPolinom().remove(j);
					j--;
				}

			}
		}
		return scadere;
	}

	public Polinom inmultire(Polinom polinom1, Polinom polinom2) {
		Polinom inmultire = new Polinom();

		// parcurgem cele 2 Polinoame
		for (int i = 0; i < polinom1.getPolinom().size(); i++) {
			for (int j = 0; j < polinom2.getPolinom().size(); j++)

			{
				int grad1 = polinom1.getPolinom().get(i).getGrad();
				int grad2 = polinom2.getPolinom().get(j).getGrad();
				double coeficient1 = polinom1.getPolinom().get(i).getCoeficient();
				double coeficient2 = polinom2.getPolinom().get(j).getCoeficient();

				// construim un Monom nou adunanad gradele si inmultind
				// coeficientii
				Monom aux = new Monom(grad1 + grad2, coeficient1 * coeficient2);

				// adaugam monomul creat la Polinomul returnat
				inmultire.getPolinom().add(aux);

			}

		}
		return inmultire;
	}

	public Polinom derivare(Polinom polinom) {
		Polinom derivare = new Polinom();
		int n = polinom.getPolinom().size();
		for (int i = 0; i < n; i++) {
			int gradp = polinom.getPolinom().get(i).getGrad();
			double coeficientp = polinom.getPolinom().get(i).getCoeficient();
			// scadem gradul cu 1 si imnultim vechiul grad cu coeficientul
			Monom aux = new Monom(gradp - 1, coeficientp * gradp);
			derivare.getPolinom().add(aux);

		}

		return derivare;
	}

	public Polinom integrare(Polinom polinom) {
		Polinom integrare = new Polinom();
		int n = polinom.getPolinom().size();
		for (int i = 0; i < n; i++) {
			int gradp = polinom.getPolinom().get(i).getGrad();
			double coeficientp = polinom.getPolinom().get(i).getCoeficient();

			// construim un Monom cu gradul + 1 si coeficientul impartit la grad
			if (gradp != 0) {
				Monom aux = new Monom(gradp + 1, coeficientp / (gradp + 1));
				integrare.getPolinom().add(aux);
			}

			if (gradp == 0) {
				Monom aux1 = new Monom(gradp + 1, coeficientp);
				integrare.getPolinom().add(aux1);
			}

		}

		return integrare;

	}

}