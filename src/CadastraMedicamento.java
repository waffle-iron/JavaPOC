import java.util.ArrayList;


public class CadastraMedicamento {
	private ArrayList<Medicamento> lista = new ArrayList();
	
	public void add(Medicamento m){
		lista.add(m);
	}
	
	public int size(){
		if(lista.size() == 0){
			return 0;
		}else{
			return lista.size();
		}
		
	}
}
