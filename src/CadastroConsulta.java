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
				l = organizaLista(l);
			}
		}
		else
		{
			return null;
		}
		
		return l;
		
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
				else if(l.get(i).getHora().equals("11:30"))
					l.add(7, l.get(i));
				else if(l.get(i).getHora().equals("14:00"))
					l.add(8, l.get(i));
				else if(l.get(i).getHora().equals("14:30"))
					l.add(9, l.get(i));
				else if(l.get(i).getHora().equals("15:00"))
					l.add(10, l.get(i));
				else if(l.get(i).getHora().equals("15:30"))
					l.add(11, l.get(i));
				else if(l.get(i).getHora().equals("16:00"))
					l.add(12, l.get(i));
				else if(l.get(i).getHora().equals("16:30"))
					l.add(13, l.get(i));
				else if(l.get(i).getHora().equals("17:00"))
					l.add(14, l.get(i));
				else if(l.get(i).getHora().equals("17:30"))
					l.add(15, l.get(i));
				else if(l.get(i).getHora().equals("18:00"))
					l.add(16, l.get(i));
			}
		}
		
		return l;
		
	}
	
	public String getConsultasDoDiaX(ArrayList<Consulta> l){
		String msg = "-----\n";
		if(l != null)
		{
			for(int i = 0; i < l.size(); i++)
			{
				msg += i + ") " + l.get(i).getHora() + " - " + l.get(i).getPaciente().getNome() + "\n";
			}
			
		}
		else{
			msg += "0) 08:00 - \n";
			msg += "1) 08:30 - \n";
			msg += "2) 09:00 - \n";
			msg += "3) 09:30 - \n";
			msg += "4) 10:00 - \n";
			msg += "5) 10:30 - \n";
			msg += "6) 11:00 - \n";
			msg += "7) 11:30 - \n";
			msg += "8) 14:00 - \n";
			msg += "9) 14:30 - \n";
			msg += "10) 15:00 - \n";
			msg += "11) 15:30 - \n";
			msg += "12) 16:00 - \n";
			msg += "13) 16:30 - \n";
			msg += "14) 17:00 - \n";
			msg += "15) 17:30 - \n";
			msg += "16) 18:30 - \n";
		}
		return msg;
	}
	
	public boolean podeCadastrarConsulta(int posicao, ArrayList<Consulta> l, String dia)
	{
		if(l != null)
		{
			if(l.get(posicao) == null)
				return true;
		}
		if(l == null)
			return true;
		return false;
	}
	
	public String getHoraConsulta(int op)
	{
		String msg = "";
		if(op == 0)
			msg += "08:00";
		else if(op == 1)
			msg += "08:30";
		else if(op == 2)
			msg += "09:00";
		else if(op ==3)
			msg += "09:30n";
		else if(op ==4)
			msg += "10:00";
		else if(op == 5)
			msg += "10:30";
		else if(op == 6)
			msg += "11:00";
		else if(op == 7)
			msg += "11:30";
		else if(op == 8)
			msg += "14:00";
		else if(op == 9)
			msg += "14:30";
		else if(op == 10)
			msg += "15:00";
		else if(op == 11)
			msg += "15:30";
		else if(op == 12)
			msg += "16:00 ";
		else if(op == 13)
			msg += "16:30";
		else if(op == 14)
			msg += "17:00";
		else if(op == 15)
			msg += "17:30";
		else if(op == 16)
			msg += "18:30";
		
		return msg;
	}
	
}
