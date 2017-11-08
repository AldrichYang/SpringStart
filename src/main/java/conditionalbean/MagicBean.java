package conditionalbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by yh on 17/11/8.
 */
public class MagicBean {

    @Autowired
    @Qualifier("cake")
    Dessert dessert;

    @Autowired
    @Cold
    Dessert dessert1;
}
