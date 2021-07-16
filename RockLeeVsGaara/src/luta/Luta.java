package luta;

import java.util.Random;

import javax.swing.JOptionPane;

import ninjas.Gaara;
import ninjas.RockLee;

public class Luta {
	
	public static void luta() {
		Random acao = new Random();
		Gaara gaara = new Gaara("Gaara", "Aldeia da Areia", 2);
		RockLee lee = new RockLee("RockLee", "Aldeia da folha", 4);
		int opc, turno = 1, desvio, dano;
		boolean stop = false;
		// Ações RockLee
		JOptionPane.showMessageDialog(null,"Olá! Eu sou o RockLee e vou derrotar o Gaara apenas com o meu esforço! *-*");
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(">>Estamos no turno: "+turno+"<<\nDigite:\n1- Soco\n2- Chute \n3- Usar a Lotus Primaria\n4- Tirar os pesos\n5- Abrir os portões de chakra"));
			lee.mostraStatus();
			gaara.mostraStatus();
			switch(opc) {
			case 1:
				dano = lee.soco();
				desvio = acao.nextInt(10)+1;
				if(desvio>3) {
					gaara.escudoDeAreia(dano);
				}else {
					gaara.receberGolpe(dano);
					if(gaara.getHp()<=0) {
						lee.setVencedor(true);
					}
				}
				break;
			case 2:
				dano = lee.chute();
				desvio = acao.nextInt(10)+1;
				if(desvio>3) {
					gaara.escudoDeAreia(dano);
				}else {
					gaara.receberGolpe(dano);
					if(gaara.getHp()<=0) {
						lee.setVencedor(true);
					}
				}
				break;
			case 3:
				dano = lee.lotusPrimaria();
				desvio = acao.nextInt(10)+1;
				if(desvio>3) {
					gaara.escudoDeAreia(dano);
				}else {
					gaara.receberGolpe(dano);
					if(gaara.getHp()<=0) {
						lee.setVencedor(true);
					}
				}
				break;
			case 4:
				lee.tirarPeso();
				break;
			case 5:
				lee.abrirPortoesChakra();
				break;
			case 99:
				JOptionPane.showMessageDialog(null, "A luta foi interrompida!");
				stop = true;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida");
				break;
			}
			// Ações gaara:
			opc= acao.nextInt(3)+1;
			switch(opc) {
			case 1:
				dano = gaara.caixaoDeAreia();
				desvio = Integer.parseInt(JOptionPane.showInputDialog("Voce gostaria de desviar\n1- Sim\n2- Não?\nDesvios restantes:"+lee.getQtdDesvios()));
				if(desvio==1) {
					lee.desviar(dano);
				}else {
					lee.receberGolpe(dano);
					if(lee.getHp()<=0) {
						gaara.setVencedor(true);
					}
				}
				break;
			case 2:
				dano = gaara.golpePadrao();
				desvio = Integer.parseInt(JOptionPane.showInputDialog("Voce gostaria de desviar\n1- Sim\n2- Não?\nDesvios restantes:"+lee.getQtdDesvios()));
				if(desvio==1) {
					lee.desviar(dano);
				}else {
					lee.receberGolpe(dano);
					if(lee.getHp()<=0) {
						gaara.setVencedor(true);
					}
				}
				break;
			case 3:
				gaara.carregarAreia();
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida");
				break;
			}
			turno++;
			
		}while(stop!=true && lee.isVencedor()!=true && gaara.isVencedor()!=true);
		if(lee.isVencedor()) {
			JOptionPane.showMessageDialog(null, "O Vencedor da luta é: "+lee.getNome());
		}else {
			JOptionPane.showMessageDialog(null, "O Vencedor da luta é: "+gaara.getNome());
			JOptionPane.showMessageDialog(null, "-Gai Sensei:\nOh Lee, você já provou o seu valor ;-;");
		}
		
	}
}
