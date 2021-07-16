package ninjas;

public class RockLee extends Ninja{
	private int qtdDesvios = 5;
	private boolean peso = true;
	private boolean portao = false;
	private int golpe;
	public RockLee(String nome, String aldeia, int forca) {
		super(nome, aldeia, forca);
	}
	public int getQtdDesvios() {
		return qtdDesvios;
	}
	public void setQtdDesvios(int qtdDesvios) {
		this.qtdDesvios = qtdDesvios;
	}
	public boolean isPeso() {
		return peso;
	}
	public void setPeso(boolean peso) {
		this.peso = peso;
	}
	public int getGolpe() {
		return golpe;
	}
	public void setGolpe(int golpe) {
		this.golpe = golpe;
	}
	
	public void desviar(int danoGolpe) {
		if(this.qtdDesvios==0) {
			System.out.println("-RockLee:\nNão posso mais desviar!");
			System.out.println("----------------------------------");
			this.receberGolpe(danoGolpe);
		}else{
			this.qtdDesvios--;
			System.out.println("-RockLee:\nAinda posso desviar: "+this.qtdDesvios);
			System.out.println("----------------------------------");
		}
	}
	public int soco() {
		if(peso==false) {
			System.out.println("-RockLee:\nUau, aqueles pesos estavam me segurando mesmo!");
			System.out.println("----------------------------------");
			this.golpe = 20*this.getForca(); 
		}else {
			System.out.println("-RockLee:\nAaaaaa toma isso!");
			System.out.println("----------------------------------");
			this.golpe = 10*this.getForca();
		}
		return golpe;
	}
	public int chute() {
		if(peso==false) {
			System.out.println("-RockLee:\nAaaaaah dessa vez voce não escapa!");
			System.out.println("----------------------------------");
			this.golpe = 30*this.getForca(); 
		}else {
			System.out.println("-RockLee:\nAaaaaa toma isso!");
			System.out.println("----------------------------------");
			this.golpe = 15*this.getForca();
		}
		return golpe;
	}
	public void tirarPeso() {
		this.peso = false;
		System.out.println("-RockLee:\nObrigado por me deixar tirar os pesos Gai Sensei");
		System.out.println("----------------------------------");
	}
	public int lotusPrimaria() {
		if(peso==false) {
			System.out.println("-RockLee:\nEsse é o meu golpe definitivo!");
			System.out.println("----------------------------------");
			this.golpe = 120; 
		}else {
			System.out.println("-RockLee:\nEu vou mostrar que o esforço vence o talento nato!");
			System.out.println("----------------------------------");
			this.golpe = 80;
		}
		return golpe;
	}
	public void abrirPortoesChakra() {
		
		this.setForca(10);
		System.out.println("-RockLee:\nEssa é a minha técnica lendaria!!!\nPortão da dor ABRAAAAAA!!! ");
		System.out.println("----------------------------------");
		this.qtdDesvios+=10;
	}
	
	@Override
	public void mostraStatus() {
		System.out.println("\n>>Ninja RockLee<<:"+"\nPontos de HP: "+this.hp+"\nA força Atual: "+this.forca+"\nQuantide de esquivas restantes: "+this.qtdDesvios);
		System.out.println("----------------------------------\n\n");
	}
	@Override
	public void receberGolpe(int danoGolpe) {
		this.hp = this.hp-danoGolpe;
		if(this.hp<=0) {
			this.morrer();
		}else {
			System.out.println("RockLee:\n-Ai! recebi "+danoGolpe+" e agora só tenho HP:"+this.hp);
			System.out.println("----------------------------------\n\n");
		}
	}
}
