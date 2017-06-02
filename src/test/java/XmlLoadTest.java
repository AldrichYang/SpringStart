import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yh on 17/6/1.
 */
public class XmlLoadTest {

    @Test
    public void testXml(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        ac.getBean("");
    }
}
