import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

/**
 * Created by yh on 17/11/2.
 */
@RunWith(SpringJUnit4ClassRunner.class) //测试自动创建应用上下文
@ContextConfiguration(classes = CDPlayerConfig.class) // 指定在哪里加载配置
public class CDPlayerTest {


    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
    }

}
