package VendaDeIngressoCinema.model;

public class Filme {
	
	private String codigo;
	private String nomeFilme;
	private String genero;
	private String sinopse;
	
	public Filme(String codigo, String nome, String genero, String sinopse){
		this.codigo = codigo;
		this.nomeFilme = nome;
		this.genero = genero;
		this.sinopse = sinopse;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setNome(String nome){
		this.nomeFilme = nome;
	}
	
	public String getNome(){
		return this.nomeFilme;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public String getGenero(){
		return this.genero;
	}
	
	public void setSinopse(String sinopse){
		this.sinopse = sinopse;
	}
	
	public String getSinopse(){
		return this.sinopse;
	}
	
	public String toString(){
		String msg = "Código: " + this.getCodigo() + "\n"
				   + "Nome: " + this.getNome() + "\n"
				   + "Gênero: " + this.getGenero() + "\n"
				   + "Sinopse: " + this.getSinopse();
		return msg;
		
	}
}
