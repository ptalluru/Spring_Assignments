package com.cg.app.springaopdemo.Aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

	Logger logger = Logger.getLogger(ValidationAspect.class.getName());

	@Before("execution(* com.cg.app.springaopdemo..*.*(..))") 
	public void log1(JoinPoint joinPoint) throws Exception {
	  logger.info("Before - Logging the method"); }

	@After("execution(* com.cg.app.springaopdemo..*.*(..))")
	public void log2() {
		logger.info("After - Logging the method");
	}

	@Around("execution(* com.cg.app.springaopdemo..*.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {

		Object[] args = pjp.getArgs();
		Object retval = null;
		if (((Integer) args[0]) == 0 || ((Integer) args[1]) == 0) {
			logger.info("Input number should not be 0.");
		} else {

			retval = pjp.proceed();
			logger.info("After - Logging the method");
		}
		return retval;
	}

	@AfterReturning(pointcut = "execution(* com.cg.app.springaopdemo..*.*(..))", returning = "retval")
	public void returning(Integer retval) {
		logger.info("Result : " + retval);
	}
}
