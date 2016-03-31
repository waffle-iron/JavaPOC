import java.util.Scanner;


public class Menu {
	
	private Scanner teclado = new Scanner(System.in);
	
	public void menuInicial(){
		String menu = "";
		int op = 0;
		do{
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
					menuCadastrarMedicamento();
					break;
				case 3:
					menuCadastrarConsulta();
					break;
				case 4:
					menuConsultas();
					break;
			}
			
		}while(op!=0);
		
		
	}
	
}
