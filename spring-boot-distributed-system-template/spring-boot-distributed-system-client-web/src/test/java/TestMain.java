import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/17 9:33
 * @version: V1.0.0
 * @Description:
 **/
public class TestMain {
	private static volatile ApplicationContext ctx;


	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("classpath:spring*.xml");

		System.out.println("---------init finish------");
	}
}
