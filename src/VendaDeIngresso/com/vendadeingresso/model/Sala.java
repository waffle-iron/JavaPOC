package VendaDeIngresso.com.vendadeingresso.model;

public class Sala {
	
	private int numeroSala;
	private int quantidadeAssento;
	
	public Sala(int numero, int quantidade){
		this.numeroSala = numero;
		this.quantidadeAssento = quantidade;
	}
	
	public boolean setNumeroSala(int numero){
		if(numero > 0){
			this.numeroSala = numero;
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getNumeroSala(){
		return this.numeroSala;
	}
	
	public boolean setQuantidadeAssento(int quantidade){
		if(quantidade > 0){
			this.quantidadeAssento = quantidade;
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getQuantidadeAssento(){
		return this.quantidadeAssento;
	}
	
	public String toString(){
		String mensagem = "Número Sala: " + this.getNumeroSala() + "\n" +
						  "Quantidade de Assentos: " + this.getQuantidadeAssento();
		
		return mensagem;
	}
}
