package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allGetters()&& allCircleMethods())")
    public void LoggingAdvice(){
        System.out.println("Advice run. Get method called");
    }

    @Before("allGetters())")
    public void secondAdvices(){
        System.out.println("Second Advice Executed");
    }

    @Pointcut("execution(* get*())")
    public void allGetters(){

    }



//    @Pointcut("execution(* model.Circle.*(..))")
//    public void allCircleMethods(){
//
//    }

    @Pointcut("within(model.Circle)")
        public void allCircleMethods(){

        }




}
