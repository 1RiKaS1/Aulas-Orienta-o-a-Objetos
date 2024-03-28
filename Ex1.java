
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex1 {
	public static  void main(String[] args) {
		
		/*
		 * Scanner sc = new Scanner (System.in);
		 * System.out.println("Digite o seu nome:"); String nome = sc.next();
		 * System.out.println("Olá " + nome + ".Seja bem vindo");
		 */
		
		
		String rikas = JOptionPane.showInputDialog("Prescisa de ajuda?");
		if(rikas.equals("sim")) {
			JOptionPane.showMessageDialog(null, "Alguem me ajuda ");
		}else {
			JOptionPane.showMessageDialog(null, "Mentira,vc ta programando em java prescisa de ajuda sim");
		}
	}	
}
