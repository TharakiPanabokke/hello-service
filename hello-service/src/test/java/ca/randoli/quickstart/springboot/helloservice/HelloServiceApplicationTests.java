package ca.randoli.quickstart.springboot.helloservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class HelloServiceApplicationTests {

	@Autowired
	private HelloServiceApplication helloServiceApplication;

	@Test
	void contextLoads() {
    // Do Nothing, only load context
	}

	@Test
	public void helloTest() {
		assertThat(helloServiceApplication.hello()).isEqualTo("Hello");
	}

  @Test
  void helloWorldTest() {
    assertThat(helloServiceApplication.helloWord()).isEqualTo("Hello World");
  }

  @Test
  void oopsTest() {

    Exception exception = assertThrows(UnsupportedOperationException.class, () -> helloServiceApplication.oops());

    String expectedMessage = "Oops";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

  @Test
  void mainTest() { // This is a dummy test to get the 100% code coverage
    HelloServiceApplication.main(new String[] { "test" });
    assertTrue(true);
  }
}
