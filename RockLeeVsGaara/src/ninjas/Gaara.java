package ninjas;

public class Gaara extends Ninja{
	private int qtdAreia;
	private int golpe;

	public Gaara(String nome, String aldeia, int forca) {
		super(nome, aldeia, forca);
	}

	public int getQtdAreia() {
		return qtdAreia;
	}

	public void setQtdAreia(int qtdAreia) {
		this.qtdAreia = qtdAreia;
	}
	
	public int caixaoDeAreia() {
		System.out.println("-Gaara:\nCaixão de areia!!!");
		System.out.println("----------------------------------");
		this.golpe = 80*this.getForca();
		return golpe;
	}
	public int golpePadrao() {
		System.out.println("-Gaara:\nVocê é fraco demais!\nGolpe de areia!");
		System.out.println("----------------------------------");
		this.golpe=25*this.getForca();
		return this.golpe;
	}
	public void escudoDeAreia(int danoGolpe) {
		if(qtdAreia<(danoGolpe/2)) {
			System.out.println("-Gaara:\nO ataque foi muito forte!\nNão consegui me Defender!!!");
			System.out.println("----------------------------------");
			this.receberGolpe(danoGolpe);
		}else {
			System.out.println("-Gaara:\nIsso não vai passar pela defesa perfeita!");
			System.out.println("----------------------------------");
			this.qtdAreia = this.qtdAreia-(danoGolpe/2);
		}
	}
	public void carregarAreia() {
		System.out.println("-Gaara:\nAreia, volte para mim!");
		System.out.println("----------------------------------");
		this.qtdAreia += 60;
	}
	
	@Override
	public void mostraStatus() {
		System.out.println("\n>>Ninja Gaara<<:"+"\nPontos de HP: "+this.hp+"\nA força Atual: "+this.forca+"\nQuantide de areia: "+this.qtdAreia);
		System.out.println("----------------------------------\n\n");
	}
	@Override
	public void receberGolpe(int danoGolpe) {
		this.hp = this.hp-danoGolpe;
		if(this.hp<=0) {
			this.morrer();
		}else {
			System.out.println("\nGaara:\n-Ai! recebi "+danoGolpe+" e agora só tenho HP:"+this.hp);
			System.out.println("----------------------------------\n\n");
		}
	}
	
}
