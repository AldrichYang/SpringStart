package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by yh on 17/11/14.
 */
@Aspect
public class AudienceAround {

    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance() {

    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {

        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking Seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP !!!!");

        } catch (Throwable throwable) {

            System.out.println("Demanding a refund");
        }
    }

//    关于这个新的通知方法,你首先注意到的可能是它接受ProceedingJoinPoint作为参数。
//    这个对象是必须要有的,因为你要在通知中通过它来调用被通知的方法。通知方法中可以做任何的事情,当要将控制权交给被通知的方法时,它需要调用ProceedingJoinPoint的proceed()方法。
//    需要注意的是,别忘记调用proceed()方法。如果不调这个方法的话,那么你的通知实际上会阻塞对被通知方法的调用。有可能这就是你想要的效果,但更多的情况是你希望在某个点上执行被通知的方法。
//    有意思的是,你可以不调用proceed()方法,从而阻塞对被通知方法的访问,与之类似,你也可以在通知中对它进行多次调用。要这样做的一个场景就是实现重试逻辑,也就是在被通知方法失败 后,进行重复尝试。

}
