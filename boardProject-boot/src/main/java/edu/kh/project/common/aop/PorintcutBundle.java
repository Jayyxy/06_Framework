package edu.kh.project.common.aop;

import org.aspectj.lang.annotation.Pointcut;

// Pointcut : 실제 advice가 적용될 지점
// Pointcut 모아두는 클래스 

public class PorintcutBundle {

	// 작성하기 어려운 Pointcut을 미리 작성해두고
	// 필요한 곳에서 클래스명.메서드명()으로 호출해서
	// 사용가능 !
	
	// execution(* edu.kh.project..*Controller*.*(..))
	// == @Before("PointcutBundle.contollerPointcut()")
	
	@Pointcut("execution(* edu.kh.project..*Controller*.*(..))")
	public void contollerPointcut() {}
	
	@Pointcut("execution(* edu.kh.project..*Controller*.*(..))")
	public void serviceImplPointcut() {}

}
