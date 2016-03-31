import java.util.Date;


public class Paciente {
	private String nome;
	private String rg;
	private String dataNascimento;
	private String prontuario;
	
	Paciente(String nome, String rg, String dataNascimento){
		this.nome = nome;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setProntuario(String prontuario){
		this.prontuario = prontuario;
	}
	
	public String getProntuario(){
		return this.prontuario;
	}
	public String getRg(){
		return this.rg;
	}
	
	public String getData(){		
		return dataNascimento;
	}
	public String toString(){
		String mensagem = "";
		mensagem += "Nome: " + getNome();
		mensagem += "RG: " + getRg();
		mensagem += "Data de Nascimento: " + getData();
		return mensagem;
	}
}
