
public class Medicamento {
	private int codigo;
	private String nome;
	private String descricao;
	
	Medicamento(int codigo, String nome, String descricao){
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public String toString(){
		String mensagem = "";
		
		mensagem +="Codigo: " + getCodigo();
		mensagem += "\nNome: " + getNome();
		mensagem += "\nDescrição: " + getDescricao();
		
		return mensagem;
	}
}
