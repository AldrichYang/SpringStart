package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by yh on 17/11/2.
 */
//这个简单的注解表明该类会作为组件类,并告知 Spring要为这个类创建bean。
// 没有必要显式配置SgtPeppersbean,因为这个类使用 了@Component注解,所以Spring会为你把事情处理妥当
@Component // bean的id默认为类名，首字母小写
//@Component("lonelyHeartsClub") 方式1:指定bean的id
//@Named("lonelyHeartsClub") 方式2:指定bean的id
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
