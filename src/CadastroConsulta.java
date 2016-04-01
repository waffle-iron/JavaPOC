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
	
	public ArrayList<Consulta> getConsultasByDia(String dia)
	{	
		ArrayList<Consulta> l = new ArrayList();
		if(lista.size() > 0)
		{
			for(int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getDia().equals(dia))
					l.add(lista.get(i));
			}
			if(l.size() > 0)
			{
				
			}
		}
		else
		{
			return null;
		}
		
	}

	public ArrayList<Consulta> organizaLista(ArrayList<Consulta> l)
	{
		if(l.size() > 0){
			for(int i = 0; i < l.size(); i ++)
			{
				if(l.get(i).getHora().equals("08:00"))
					l.add(0, l.get(i));
				else if(l.get(i).getHora().equals("08:30"))
					l.add(1,l.get(i));
				else if(l.get(i).getHora().equals("09:00"))
					l.add(2, l.get(i));
				else if(l.get(i).getHora().equals("09:30"))
					l.add(3, l.get(i));
				else if(l.get(i).getHora().equals("10:00"))
					l.add(4, l.get(i));
				else if(l.get(i).getHora().equals("10:30"))
					l.add(5, l.get(i));
				else if(l.get(i).getHora().equals("11:00"))
					l.add(6, l.get(i));
			}
		}
		
		return l;
		
	}
	
	
}
