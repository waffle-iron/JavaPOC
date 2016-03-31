import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Menu {
	
	private Scanner teclado = new Scanner(System.in);
	private CadastroPaciente listaPaciente = new CadastroPaciente();
	private CadastraMedicamento listaMedicamento = new CadastraMedicamento();
	private CadastroConsulta listaConsulta = new CadastroConsulta();
	public void menuInicial(){
		String menu = "";
		int op = 0;
		do{
			menu += "##### CONSULT�RIO #####\n";
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
			System.out.println("Descri��o do Rem�dio: ");
			String descricao = teclado.next();
			if(descricao.length() == 0){
				System.out.println("Descri��o inv�lida");
			}
			else{
				listaMedicamento.add(new Medicamento(listaMedicamento.size(),nome,descricao));
			}
		}
	}
	
	public void menuCadastrarConsulta(){
		System.out.println("Informe uma data:");
		Date d = new Date();		
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
		}		
/*
		if(mes == 2 && dia < 28){
			for(int i = dia; i < 28; i++){
				if(i % 5 == 0){
					dia += i + "\n";
				}
				else{
				dia += " " + i;
				}
			}
		}
	*/	
	}
}
