import java.util.ArrayList;


public class CadastroConsulta {
	private ArrayList<Consulta> lista = new ArrayList();
	
	public void add(Consulta c){
		lista.add(c);
	}
	
	public int size(){
		if(lista.size() == 0){
			return 0;
		}
		else{
			return lista.size();
		}
	}
	
	
}
