package Polinoame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Controler {
	Panel panel;

	public Controler(Panel panel) {
		this.panel = panel;
		panel.adunareButton(new addButtonListener());
		panel.scadereButtonListener(new subButtonListener());
		panel.inmultireButtonListener(new inmButtonListener());
		panel.derivare1ButtonListener(new derivv1ButtonListener());
		panel.derivare2ButtonListener(new deriv2ButtonListener());
		panel.integrare1ButtonListener(new integ1ButtonListener());
		panel.integrare2ButtonListener(new integ2ButtonListener());
	}

	private class addButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String s1 = panel.getPolinom1();
			String s2 = panel.getPolinom2();

			Polinom polinom1 = new Polinom();
			Polinom polinom2 = new Polinom();
			Polinom polinom3 = new Polinom();
			Operatii o = new Operatii();
			polinom1 = polinom1.transforma(s1);
			polinom2 = polinom2.transforma(s2);
			o.verifica(polinom1);
			o.verifica(polinom2);
			polinom3 = o.adunare(polinom1, polinom2);
			o.odoneazaDescrescator(polinom3);
			o.verifica(polinom3);
			String rezultat = polinom3.toString();
			panel.setRezultat(rezultat);
		}

	}

	private class subButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String s1 = panel.getPolinom1();
			String s2 = panel.getPolinom2();

			Polinom polinom1 = new Polinom();
			Polinom polinom2 = new Polinom();
			Polinom polinom3 = new Polinom();
			Operatii o = new Operatii();
			polinom1 = polinom1.transforma(s1);
			polinom2 = polinom2.transforma(s2);
			o.verifica(polinom1);
			o.verifica(polinom2);
			polinom3 = o.scadere(polinom1, polinom2);
			o.odoneazaDescrescator(polinom3);
			o.verifica(polinom3);
			String rezultat = polinom3.toString();
			panel.setRezultat(rezultat);
		}

	}

	private class inmButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String s1 = panel.getPolinom1();
			String s2 = panel.getPolinom2();

			Polinom polinom1 = new Polinom();
			Polinom polinom2 = new Polinom();
			Polinom polinom3 = new Polinom();
			Operatii o = new Operatii();
			polinom1 = polinom1.transforma(s1);
			polinom2 = polinom2.transforma(s2);
			o.verifica(polinom1);
			o.verifica(polinom2);
			polinom3 = o.inmultire(polinom1, polinom2);
			o.odoneazaDescrescator(polinom3);
			o.verifica(polinom3);
			o.verifica(polinom3);
			String rezultat = polinom3.toString();
			panel.setRezultat(rezultat);
		}
	}

	private class derivv1ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String s1 = panel.getPolinom1();

			Polinom polinom1 = new Polinom();
			Polinom polinom4 = new Polinom();
			Operatii o = new Operatii();
			polinom1 = polinom1.transforma(s1);
			o.verifica(polinom1);

			polinom4 = o.derivare(polinom1);
			o.odoneazaDescrescator(polinom4);
			o.verifica(polinom4);
			String rezultat = polinom4.toString();
			panel.setRezultat(rezultat);
		}

	}

	private class deriv2ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String s2 = panel.getPolinom2();

			Polinom polinom2 = new Polinom();
			Polinom polinom3 = new Polinom();
			Operatii o = new Operatii();
			polinom2 = polinom2.transforma(s2);
			o.verifica(polinom2);
			polinom3 = o.derivare(polinom2);
			o.odoneazaDescrescator(polinom3);
			o.verifica(polinom3);
			String rezultat = polinom3.toString();
			panel.setRezultat(rezultat);
		}

	}

	private class integ1ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String s1 = panel.getPolinom1();

			Polinom polinom1 = new Polinom();
			Polinom polinom3 = new Polinom();
			Operatii o = new Operatii();
			polinom1 = polinom1.transforma(s1);
			o.verifica(polinom1);
			polinom3 = o.integrare(polinom1);
			o.odoneazaDescrescator(polinom3);
			o.verifica(polinom3);
			String rezultat = polinom3.toString();
			panel.setRezultat(rezultat);
		}

	}

	private class integ2ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String s2 = panel.getPolinom2();

			Polinom polinom2 = new Polinom();
			Polinom polinom3 = new Polinom();
			Operatii o = new Operatii();
			polinom2 = polinom2.transforma(s2);
			o.verifica(polinom2);
			polinom3 = o.integrare(polinom2);
			o.odoneazaDescrescator(polinom3);
			o.verifica(polinom3);
			String rezultat = polinom3.toString();
			panel.setRezultat(rezultat);
		}

	}

	public static void main(String arg[]) {

		Panel p = new Panel();
		Controler controler = new Controler(p);

	}

}
