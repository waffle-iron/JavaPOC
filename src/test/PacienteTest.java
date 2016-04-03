package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ConsultórioMedico.Paciente;

public class PacienteTest {

	@Test
	public void novoPacienteTest() {
		Paciente p = new Paciente("Rafael","101010","04/10/1996");
		String expected = "Rafael";
		String actual = p.getNome();
		assertEquals(expected, actual);
	}

}
