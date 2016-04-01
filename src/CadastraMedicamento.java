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
	
	public boolean existMedicamento(int codigo)
	{
		if(lista != null)
		{
			for(int i = 0; i < lista.size(); i++)
			{
				if(lista.get(i).getCodigo() == codigo)
					return true;
					
			}
		}
		return false;
	}
	
	public Medicamento getMedicamento(int codigo)
	{
		if(lista != null)
		{
			for(int i = 0; i < lista.size(); i++)
			{
				if(lista.get(i).getCodigo() == codigo)
					return lista.get(i);
			}
		}
		
		return null;
	}
}
