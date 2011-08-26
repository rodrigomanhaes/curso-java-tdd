package br.edu.iff.nsi.academico;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserBeanTest {
	
	@Test
	public void initializesNameWithMessage() {
		assertThat(new UserBean().getName(), equalTo("Enter your name"));
	}

}
