import java.util.Date;


public class Consulta {
	private Paciente paciente;
	private Medicamento medicamento;
	private String dataConsulta;
	private String hora;
	
	Consulta(Paciente paciente, Medicamento medicamento, String dataConsulta, String hora){
		this.paciente = paciente;
		this.medicamento = medicamento;
		this.dataConsulta = dataConsulta;
		this.hora = hora;
	}
	
	public String getDia()
	{
		return dataConsulta;
	}
	
	public String getHora()
	{
		return hora;
	}
	
	public Paciente getPaciente()
	{
		return this.paciente;
	}
	
	public String toString(){
		String mensagem = "";
		mensagem += "Dia: " + dataConsulta.toString();
		mensagem += "\nPaciente " + paciente.getNome();
		mensagem += "\nMedicamento: " + medicamento.getNome();
		mensagem += "Prontuário: " + paciente.getProntuario();
		return mensagem;
	}
}
