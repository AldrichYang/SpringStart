package conditionalbean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by yh on 17/11/8.
 */
@Component
@Qualifier("cake")
public class Cake implements Dessert {
}
