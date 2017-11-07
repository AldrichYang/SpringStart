package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by yh on 17/11/6.
 */
@Configuration
@Import({CDConfig.class, CDPlayerConfig.class})
//在JavaConfig中引用xml的配置
@ImportResource("classpath:knight.xml")
public class SoundSystemConfig {
}
