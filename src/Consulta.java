import java.util.Date;


public class Consulta {
	private Paciente paciente;
	private Medicamento medicamento;
	private Date dataConsulta;
	
	
	Consulta(Paciente paciente, Medicamento medicamento, Date dataConsulta){
		this.paciente = paciente;
		this.medicamento = medicamento;
		this.dataConsulta = dataConsulta;
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
