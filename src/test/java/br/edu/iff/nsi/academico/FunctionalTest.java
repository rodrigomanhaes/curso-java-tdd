package br.edu.iff.nsi.academico;

import static br.edu.iff.nsi.academico.AcademicoSuite.flyway;

import org.junit.Before;

public class FunctionalTest {
	@Before
	public void cleanDatabase() {
		flyway.clean();
		flyway.migrate();
	}
}
