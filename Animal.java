package modificadores;

public class Animal {
	private String nome;
	private String cor;
	private String tamanho;
	private String peso;
	private String raca;

	protected String setNome () {
		return nome;
	}
	protected void setNome (String nome) {
		this.nome = nome;
	}
	protected String setCor () {
		return cor;
	}
	protected void setCor (String cor) {
		this.cor = cor;
	}
	protected String setTamanho () {
		return tamanho;
	}
	protected void setTamanho (String tamanho) {
		this.tamanho = tamanho;
	}
	protected String setPeso () {
		return peso;
	}
	protected void setPeso (String peso) {
		this.peso = peso;
	}
	protected String setRaca () {
		return raca;
	}
	protected void setRaca (String raca) {
		this.raca = raca;
	}
}
