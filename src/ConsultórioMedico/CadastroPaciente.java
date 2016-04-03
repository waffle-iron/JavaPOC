package ConsultórioMedico;
import java.util.ArrayList;


public class CadastroPaciente {
	
	private ArrayList<Paciente> lista = new ArrayList();
	
	public void add(Paciente p){
		lista.add(p);
	}
	
	public boolean procuraPaciente(String nome){
		if(lista.size() > 0)
		{
			for(int i = 0; i < lista.size(); i++)
			{
				if(lista.get(i).getNome().equals(nome))
					return true;
			}
		}
		
		return false;
	}
	
	public Paciente getPaciente(String nome)
	{
		if(lista.size() > 0){
			for(int i = 0; i < lista.size(); i ++)
			{
				if(lista.get(i).getNome().equals(nome))
					return lista.get(i);
			}
		}
		return null;
	}
	
}
