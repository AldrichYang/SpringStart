package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yh on 17/11/2.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    //    构造器注入
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    //  方法注入
// 将required属性设置为false时,Spring会尝试执行自动装配,但是如果没有匹配的bean的 话,Spring将会让这个bean处于未装配的状态
//    如果有多个bean都能满足依赖关系的话,Spring将会抛出一个异常,表明没有明确指定要选择哪 个bean进行自动装配
    @Autowired(required = false)
    public void insertCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
