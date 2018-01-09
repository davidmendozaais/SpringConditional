import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import com.ais.spring4.config.EmployeeBeanConfig;
import com.ais.spring4.domain.Employee;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {EmployeeBeanConfig.class},loader=AnnotationConfigContextLoader.class)
public class Spring4DevBeanPresenceConditionalTest {

	@Autowired
	private ApplicationContext applicationContext;
	  
	  @Test	 
	  public void testDevDataSource() {
		  Employee emp = (Employee)applicationContext.getBean("employee");
		  assertNotNull(emp);
		  assertEquals(222, emp.getId());
		  assertEquals("Popeye", emp.getName());
	  }
}