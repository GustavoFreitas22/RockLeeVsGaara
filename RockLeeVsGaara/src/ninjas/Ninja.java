package ninjas;

public class Ninja {
	private String nome;
	private String aldeia;
	protected int forca;
	protected int hp = 400;
	private boolean vencedor = false;
	public Ninja(String nome, String aldeia, int forca) {
		super();
		this.nome = nome;
		this.aldeia = aldeia;
		this.forca = forca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAldeia() {
		return aldeia;
	}
	public void setAldeia(String aldeia) {
		this.aldeia = aldeia;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public boolean isVencedor() {
		return vencedor;
	}
	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}
	public void receberGolpe(int danoGolpe) {
		this.hp = this.hp-danoGolpe;
		if(this.hp<=0) {
			this.morrer();
		}else {
			System.out.println("Ai! recebi "+danoGolpe+" e agora só tenho HP:"+this.hp);
			System.out.println("----------------------------------");
		}
	}
	public void morrer() {
		System.out.println("Sinto muito... mas voce perdeu a luta "+this.nome);
		vencedor = false;
	}
	public void mostraStatus() {
		System.out.println("Pontos de HP: "+this.hp+"\nA força Atual: "+this.forca);
		System.out.println("----------------------------------");
	}
	
}
