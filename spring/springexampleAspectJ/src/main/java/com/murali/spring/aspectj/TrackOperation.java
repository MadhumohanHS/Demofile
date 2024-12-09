package com.murali.spring.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	
	  @Pointcut("execution(* Operation.*(..))") 
	  public void Service() {
	  System.out.println("Service method is called"); 
	  }
	  
	  
//	  @Before("Service()") // applying pointcut on before advice public void
//	  public void myadvice(JoinPoint jp) {// it is advice (before advice) {
//	 System.out.println("Before Service additional concern");
//	  System.out.println("Method Signature: " + jp.getSignature());
//	  }
	 

	
//	  @After("Service()") // applying pointcut on afte advice public void
//	  public void myadvice2(JoinPoint jp) {// it is advice (after advice) {
//	  System.out.println("After Service additional concern");
//	  System.out.println("Method Signature: " + jp.getSignature());
//	  }
//	 

	
//		@Around("Service()") // applying pointcut on around advice
//		public Object myadvice3(ProceedingJoinPoint jp) { // it is advice (around advice) {
//			System.out.println("Around Advice");
//			System.out.println("Before Service additional concern");
//			System.out.println("Method Signature: " + jp.getSignature());
//			Object obj = null;
//			try {
//				obj = jp.proceed();
//			} catch (Throwable e) {
//				e.printStackTrace();
//			}
//			System.out.println("After Service additional concern");
//			System.out.println("Method Signature: " + jp.getSignature());
//			return obj;
//		}
	 

	
		@AfterThrowing(pointcut = "execution(* Operation2.*(..))", throwing = "error")
		public void myadvice(JoinPoint jp, Throwable error) { // it is advice {
			System.out.println("@AfterThrowing additional concern");
			System.out.println("Method Signature: " + jp.getSignature());
			System.out.println("Exception is: " + error);
			System.out.println("end of after throwing advice...");
		}
	 

//	@AfterReturning(pointcut = "execution(* Operation.*(..))", returning = "result")
//
//	public void myadvice(JoinPoint jp, Object result)// it is advice (after returning advice)
//	{
//		System.out.println("@AfterReturning additional concern");
//		System.out.println("Method Signature: " + jp.getSignature());
//		System.out.println("Result in advice: " + result);
//		System.out.println("end of after returning advice...");
//	}
}
