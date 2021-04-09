package are.edu.unju.fi.tp1pto1.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private double num1, num2, suma, resta, division, multiplicacion;

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public double sumarNum() {
		return suma = num1 + num2;
	}

	public double multiplicarNum() {
		return multiplicacion = num1 * num2;
	}

	public double restarNum() {
		return resta = num1 - num2;
	}

	public double dividirNum() {
		if (num2 == 0) {
			return division = -812773627;
		} else {
			return division = num1 / num2;
		}
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public double getResta() {
		return resta;
	}

	public void setResta(double resta) {
		this.resta = resta;
	}

	public double getDivision() {
		return division;
	}

	public void setDivision(double division) {
		this.division = division;
	}

	public double getMultiplicacion() {
		return multiplicacion;
	}

	public void setMultiplicacion(double multiplicacion) {
		this.multiplicacion = multiplicacion;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
