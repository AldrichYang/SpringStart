package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yh on 17/11/2.
 */
//组件扫描默认是不启用的。我们还需要显式配置一下Spring,从而命令它去寻找带 有@Component注解的类
// 如果没有其他配置的话,@ComponentScan默认会扫描与配置类相同的包。
// 因为CDPlayerConfig类位于soundsystem包中,因此Spring将会扫描这个包以及这个包下的所 有子包,查找带有@Component注解的类
@Configuration
//@ComponentScan
// 各种方式指定扫描的Package。最后一种指定classes的方式，类所在的包将会作为组件扫描的基础包
//@ComponentScan("soundsystem")
//@ComponentScan(basePackages = "soundsystem")
//@ComponentScan(basePackages = {"soundsystem","knight"})
//@ComponentScan(basePackageClasses = {SgtPeppers.class, BraveKnight.class))
public class CDPlayerConfig {
//  xml配置:  Spring context命名空间 的<context:component-scan>元素

    @Bean
//    @Bean注解会告诉Spring这个方法将会返回一个对象,该对象要注册为Spring应用上下文中的 bean。方法体中包含了最终产生bean实例的逻辑。
//    默认情况下,bean的ID与带有@Bean注解的方法名是一样的
//    @Bean(name = "lonelyHeartClubBand") 自定义bean名字
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

//    带有@Bean注解的方法可以采用任何必要的Java功能来产生bean实例
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }





}
