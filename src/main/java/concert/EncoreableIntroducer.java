package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by yh on 17/11/20.
 */
@Aspect
public class EncoreableIntroducer {

    //  @DeclareParents注解由三部分组成:
// value属性指定了哪种类型的bean要引入该接口。在本例中,也就是所有实 现Performance的类型。(标记符后面的加号表示是Performance的所有子类型,而不是Performance本身。)
// defaultImpl属性指定了为引入功能提供实现的类。在这里,我们指定的 是DefaultEncoreable提供实现。
// @DeclareParents注解所标注的静态属性指明了要引入了接口。在这里,我们所引入的 是Encoreable接口。
    @DeclareParents(value = "concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
