package luta;

import ninjas.*;
import javax.swing.*;
import java.util.*;
/*
 * Pensar em como fazer o sistema de turnos
 * Testar functions e outputs
 * Pensar em como definir o vencedor e mostrar na tela
 * */
public class Main {

	public static void main(String[] args) {
		Luta luta = new Luta();
		int opc = 0;
		
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(">>Bem vindo a luta Rock Lee Vs Gaara!<<\nPor favor Digite:\n1- Para começar a luta\n2-Sair"));
			switch(opc) {
			case 1:
				luta.luta();
				break;
			case 2:
				System.out.println("Obrigado por ter aparecido! Volte sempre :)");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida");
				break;
			}
		}while(opc!=2);
	}
	

}
