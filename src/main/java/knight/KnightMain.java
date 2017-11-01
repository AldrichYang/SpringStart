package knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yh on 17/11/1.
 */
public class KnightMain {
    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext 作为应用上下文相对是比较合适的。该类加载位于应用程序类路径下的一个或多个XML配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(KnightConfig.class);
        //        获取Knight Bean
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
