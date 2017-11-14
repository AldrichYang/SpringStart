package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yh on 17/11/14.
 */
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<>();

    //    通知playTrack方法，有参数传递
//    args(trackNumber)限定符。它表明传递给playTrack()方法的int类型参数也会传递到通知中去。
//  参数的名称trackNumber也与切点方法签名中的参数相匹配。
//    这个参数会传递到通知方法中,这个通知方法是通过@Before注解和命名切点trackPlayed(trackNumber)定义的。
// 切点定义中的参数与切点方法中的参数名称是一样 的,这样就完成了从命名切点到通知方法的参数转移。

    @Pointcut("execution(* soundsystem.CompactDisc.playTrack(int))" +
            " && args(trackNumber)")
    public void trackPlayed(int trackNumber) {
    }

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}
