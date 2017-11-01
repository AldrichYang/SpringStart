import knight.BraveKnight;
import knight.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by yh on 17/11/1.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
//        创建一个mockQuest
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        //要求Mockito框架验证Quest的mock实现的embark方法仅仅被调用了一次
        verify(mockQuest, times(1)).embark();
    }
}
