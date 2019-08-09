package aop2anno;
// 관심사항이 생겼을 때 사용
// 관심사항이 여러개일때는 여러개 만들고 포함으로 부르면 됨
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProfileAdvice { // Advice, Aspect(관심사항을 가진 클래스)
	// init2.xml에서 쓰어야 할 것을 이렇게 간단하게 쓸 수 있음
	@Around("execution(public * aop2anno..*(..))") // 여러개 주고 싶으면 || 
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("핵심 메소드 수행 전 작업 : 로그인, 보안, 트랜잭션...");
		// 이곳에서 로그인작업, 보안작업등 할 수 있음
		Object object = joinPoint.proceed(); // 핵심 메소드 수행

		System.out.println("핵심 메소드 수행 후 하고 싶은 것 기술");	
		
		return object;
	}

}
