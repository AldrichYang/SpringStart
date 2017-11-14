package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yh on 17/11/14.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = Audience.class)
public class ConcertConfig {

    @Bean
    public Audience getAudience() {
        return new Audience();
    }
}
