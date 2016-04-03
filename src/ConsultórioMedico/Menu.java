package ConsultórioMedico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Menu {
	
	private Scanner teclado = new Scanner(System.in);
	private CadastroPaciente listaPaciente = new CadastroPaciente();
	private CadastraMedicamento listaMedicamento = new CadastraMedicamento();
	private CadastroConsulta listaConsulta = new CadastroConsulta();
	
	public void menuInicial(){
		
		int op = 0;
		do{
			String menu = "";
			menu += "##### CONSULTÓRIO #####\n";
			menu += "1 - Cadastrar Paciente\n";
			menu += "2 - Cadastrar Medicamento\n";
			menu += "3 - Cadastrar Consulta\n";
			menu += "4 - Consultas\n";
			menu += "0 - Sair";
			
			System.out.println(menu);
			
			op = teclado.nextInt();
			
			switch(op)
			{
				case 1:
					menuCadastrarPaciente();
					break;
				case 2:
					menuCadastraMedicamento();
					break;
				case 3:
					menuCadastrarConsulta();
					break;
				case 4:
					//menuConsultas();
					break;
			}
			
		}while(op!=0);
		
		
	}
	
	public void menuCadastrarPaciente(){
		Date d = new Date();
		System.out.println("Insira um Nome: ");
		String nome = teclado.next();
		
		if(nome.length() == 0)
		{
			System.out.println("Nome Invalido");
		}
		else{

			System.out.println("Data de Nascimento: (dd/mm/yyyy)");
			String data = teclado.next();
			SimpleDateFormat dataNasc = new SimpleDateFormat("dd/mm/yyyy");
			
			if(data.length() == 0){
				System.out.println("Data Invalida");
			}
			else{
				try{
					d = dataNasc.parse(data);
				}catch(ParseException e){
					e.printStackTrace();
				}
				
				System.out.println("RG:");
				String rg = teclado.next();
				
				listaPaciente.add(new Paciente(nome,rg,dataNasc.format(d)));
			}
		
		}
	}
	
	public void menuCadastraMedicamento(){
		System.out.println("Nome do Medicamento: ");
		String nome = teclado.next();
		
		if(nome.length() == 0){
			System.out.println("Nome invaldio");
		}
		else{
			System.out.println("Descrição do Remédio: ");
			String descricao = teclado.next();
			if(descricao.length() == 0){
				System.out.println("Descrição inválida");
			}
			else{
				System.out.println("Codigo: " + listaMedicamento.size());
				listaMedicamento.add(new Medicamento(listaMedicamento.size(),nome,descricao));
			}
		}
	}
	
	public void menuCadastrarConsulta(){
		System.out.println("Informe uma data:");
		Date d = new Date();		
		String data = teclado.next();
		SimpleDateFormat dataConsulta = new SimpleDateFormat("dd/mm/yyyy");
		ArrayList<Consulta> consultas = new ArrayList();
		if(data.length() == 0){
			System.out.println("Data Invalida");
		}
		else{
			try{
				d = dataConsulta.parse(data);
			}catch(ParseException e){
				e.printStackTrace();
			}
			 consultas = listaConsulta.getConsultasByDia(dataConsulta.format(d));
			String m = listaConsulta.getConsultasDoDiaX(consultas);
			System.out.println(m);
			int op = teclado.nextInt();
			//Verificar se está vago o horário
			if(listaConsulta.podeCadastrarConsulta(op, consultas, dataConsulta.format(d)))
			{
				System.out.println("Nome do Paciente: ");
				String nomePaciente = teclado.next();
				boolean existe = listaPaciente.procuraPaciente(nomePaciente);
				Paciente p = listaPaciente.getPaciente(nomePaciente);
				if(existe)
				{
					//Medicamento
					System.out.println("Código do Medicamento: ");
					int codigoMedicamento = teclado.nextInt();
					boolean medicamentoExiste = listaMedicamento.existMedicamento(codigoMedicamento);
					if(medicamentoExiste)
					{
						Medicamento medicamento = listaMedicamento.getMedicamento(codigoMedicamento);
						
						System.out.println("Prontuário: ");
						String prontuario = teclado.next();
						listaConsulta.add(new Consulta(p, medicamento, dataConsulta.format(d), listaConsulta.getHoraConsulta(op) ));
					}
					
				}
				else{
					System.out.println("Paciente não existe");
				}
			}
		   
		}		

	}
	
}
