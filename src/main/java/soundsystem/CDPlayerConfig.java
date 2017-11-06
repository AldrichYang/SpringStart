package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yh on 17/11/2.
 */
//组件扫描默认是不启用的。我们还需要显式配置一下Spring,从而命令它去寻找带 有@Component注解的类
// 如果没有其他配置的话,@ComponentScan默认会扫描与配置类相同的包。
// 因为CDPlayerConfig类位于soundsystem包中,因此Spring将会扫描这个包以及这个包下的所 有子包,查找带有@Component注解的类
@Configuration
@ComponentScan
// 各种方式指定扫描的Package。最后一种指定classes的方式，类所在的包将会作为组件扫描的基础包
//@ComponentScan("soundsystem")
//@ComponentScan(basePackages = "soundsystem")
//@ComponentScan(basePackages = {"soundsystem","knight"})
//@ComponentScan(basePackageClasses = {SgtPeppers.class, BraveKnight.class))
public class CDPlayerConfig {
//  xml配置:  Spring context命名空间 的<context:component-scan>元素

}
