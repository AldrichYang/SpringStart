package conditionalbean;

import org.springframework.stereotype.Component;

/**
 * Created by yh on 17/11/8.
 */
@Component
//@Qualifier("cold")
@Cold
public class IceCream implements Dessert {
}
