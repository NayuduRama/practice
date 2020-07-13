package aspect;

import model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allGetters()&& allCircleMethods())")
    public void LoggingAdvice(JoinPoint joinPoint){
//        System.out.println(joinPoint.toString());
//        System.out.println(joinPoint.getTarget());
//        Circle circle = (Circle) joinPoint.getTarget();



    }


//    @Before("args(name)")
//    public void stringArgumentMethods( String name) {
//
//        System.out.println("A method that takes String arguments has been called. The value is "+ name);
//    }

//    @After("args(name)")
//    public void stringArgumentMethods( String name) {
//
//        System.out.println("A method that takes String arguments has been called. The value is "+ name);
//    }

    @AfterReturning(pointcut="args(name)", returning  ="returnString")
    public void stringArgumentMethods( String name, String returnString) {

        System.out.println("A method that takes String arguments has been called. The value is "+ name+ "The output " +
                "value is "+ returnString);
    }


    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void exceptionAdvice(String name, RuntimeException ex){
        System.out.println("An exception has thrown" +ex);

    }
//    @Before("allGetters())")
//    public void secondAdvices(){
//        System.out.println("Second Advice Executed");
//    }

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
