package Polinoame;

public class Monom {

	private int grad;
	private double coeficient;

	public Monom(int grad, double coeficient) {
		this.grad = grad;
		this.coeficient = coeficient;
	}

	public Monom() {
		// TODO Auto-generated constructor stub
	}

	public void setGrad(int grad) {
		this.grad = grad;
	}

	public int getGrad() {
		return this.grad;
	}

	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}

	public double getCoeficient() {
		return this.coeficient;
	}

	public String toStringg() {// afisarea Monomului

		return getCoeficient() + "x^" + getGrad();

	}

}
