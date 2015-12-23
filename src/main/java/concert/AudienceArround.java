package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Przykład użycia adnotacji @Around
 */
@Aspect
public class AudienceArround {
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance() {
	}

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Wyłączamy telefony");
			System.out.println("Zajmujemy miejsca");
			jp.proceed();
			System.out.println("Brawo Brawo!!!");
		} catch (Throwable e) {
			System.out.println("Buu");
		}
	}
}