package concert;

import org.springframework.stereotype.Component;

/**
 * Created by yh on 17/11/20.
 */
@Component
public class ConcertPerformanceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("There is a concert");
    }
}
