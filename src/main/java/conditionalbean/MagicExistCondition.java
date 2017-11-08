package conditionalbean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by yh on 17/11/8.
 */
public class MagicExistCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
//        根据环境中是否存在magic属性来做出决策
        return environment.containsProperty("magic");
    }

// ConditionContext
//    借助getRegistry()返回的BeanDefinitionRegistry检查bean定义;
//    借助getBeanFactory()返回的ConfigurableListableBeanFactory检查bean是 否存在,甚至探查bean的属性;
//    借助getEnvironment()返回的Environment检查环境变量是否存在以及它的值是什么;
//    读取并探查getResourceLoader()返回的ResourceLoader所加载的资源;
//    借助getClassLoader()返回的ClassLoader加载并检查类是否存在。

// AnnotatedTypeMetadata
//    AnnotatedTypeMetadata则能够让我们检查带有@Bean注解的方法上还有什么其他的注解
//    借助isAnnotated()方法,我们能够判断带有@Bean注解的方法是不是还有其他特定的注解。
//    借助其他的那些方法,我们能够检查@Bean注解的方法上其他注解的属性。

}
