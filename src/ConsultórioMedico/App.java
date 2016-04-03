package ConsultórioMedico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroPaciente l = new CadastroPaciente();
		l.add(new Paciente("Rafael", "12123123", "04/10/1996"));
		System.out.println(l.procuraPaciente("Rafael"));
		Menu m = new Menu();
		m.menuInicial();
		
		Date newdate = new Date();
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd/M/yyy");
				        String strdate2 = "04/10/1996";
		     try {
		          newdate = dateformat2.parse(strdate2);
		          System.out.println(newdate.toString());
		      } catch (ParseException e) {
		          e.printStackTrace();
		      }

		System.out.println("Data is: "+dateformat2.format(newdate));

		Paciente p = new Paciente("Rafael", "111111", dateformat2.format(newdate));
		System.out.println(p.getData());
	}

}
