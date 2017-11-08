package conditionalbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by yh on 17/11/8.
 */
@Configuration
public class ConditionalConfig {


//    Spring在确定哪个profile处于激活状态时,需要依赖两个独立的属 性:spring.profiles.active和spring.profiles.default。
// 如果设置 了spring.profiles.active属性的话,那么它的值就会用来确定哪个profile是激活的。但如 果没有设置spring.profiles.active属性的话,那Spring将会查 找spring.profiles.default的值。
// 如果spring.profiles.active和spring.profiles.default均没有设置的话,那就没有 激活的profile,因此只会创建那些没有定义在profile中的bean。
//    有多种方式来设置这两个属性:
//    1. 作为DispatcherServlet的初始化参数;
//    2. 作为Web应用的上下文参数;
//    3. 作为JNDI条目;
//    4. 作为环境变量;
//    5. 作为JVM的系统属性; 在集成测试类上,使用@ActiveProfiles注解设置。
    @Bean
    @Profile("dev")
    public DataSource devSource(){
        return null;
    }

    @Bean
    @Profile("prod")
    public DataSource prodSource(){
        return null;
    }

    @Bean
    @Conditional(MagicExistCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }

}
