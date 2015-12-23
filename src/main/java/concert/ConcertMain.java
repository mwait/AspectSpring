package concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ConcertMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(concert.ConcertConfig.class);
		Performance performance = (Performance) context.getBean("performance");
		performance.perform();
		((AbstractApplicationContext) context).close();
	}
}
