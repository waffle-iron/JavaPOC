import java.util.Date;


public class Paciente {
	private String nome;
	private String rg;
	private Date dataNascimento;
	
	Paciente(String nome, String rg, Date dataNascimento){
		this.nome = nome;
		this.rg = rg;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getRg(){
		return this.rg;
	}
	
	public String toString(){
		String mensagem = "";
		mensagem += "Nome: " + getNome();
		mensagem += "RG: " + getRg();
		mensagem += "Data de Nascimento: " + dataNascimento.toString();
		return mensagem;
	}
}