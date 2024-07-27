//Pacote principal
public class Principal {
	//definiçao
	public static void main(String[]args) {
	Calculadora c1,c2;
	
	c1 = new Calculadora(2,3);
	c2 = new Calculadora();
	c2.setOp1(2);
	c2.setOp2(-2);
	
	c2.somar();

	System.out.println(c2.resultado);	
	System.out.println(c1);	
	System.out.println(c2);
	}
}
//Classe Calculadora
package Aula01ex01;

public class Calculadora {
	//Definir de atributos
	int op1, op2, resultado;
	//Metodo construtor padrão
  	public Calculadora() {}
	//Metodo construtor alternativo	
	public Calculadora(int o1,int o2) {
		op1 = o1;
		op2 = o2;
	}
  //Metodos
	void setOp1(int op) {
		op1 = op;
	}
	void setOp2(int op) {
		op2 = op;
	}
	int getResultado() {
		return resultado;
	}
	int somar() {
		resultado = op1 + op2;
		return resultado;
	}
	int subtrair() {
		resultado = op1 - op2;
		return resultado;
	}
}
