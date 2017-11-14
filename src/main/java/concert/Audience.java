package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;

/**
 * Created by yh on 17/11/14.
 */
public class Audience {
//    Audience依然可以当做一个普通bean来使用，只是它通过注解表明会作为切面使用
//    切点定义了何处执行
//    通知定义了做什么以及什么时候做
//    Before,After,AfterReturning,AfterThrowing,Around5个注解定义通知

    //    表演之前
    @Before("execution(** concert.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    //    表演之前
    @Before("execution(** concert.Performance.perform(..)))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    //    表演之后
    @AfterReturning("execution(** concert.Performance.perform(..)))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP !!!");
    }

    //    表演失败之后
    @AfterThrowing("execution(** concert.Performance.perform(..)))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

//    //    定义命名的切点 pointcut的值是一个切点表达式
//      performance方法实际上应该是空的，本身只是一个标示，供pointcut注解依附
//    @Pointcut("execution (** concert.Performance.perform(..))")
//    public void performance() {
//
//    }
//
//    //    表演之前
//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//
//    //    表演之前
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("Taking seats");
//    }
//
//    //    表演之后
//    @AfterReturning("performance()")
//    public void applause() {
//        System.out.println("CLAP CLAP CLAP !!!");
//    }
//
//    //    表演失败之后
//    @AfterThrowing("performance()")
//    public void demandRefund() {
//        System.out.println("Demanding a refund");
//    }
}
