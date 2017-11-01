package knight;

import java.io.PrintStream;

/**
 * Created by yh on 17/11/1.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

//    SlayDragonQuest没有使 用System.out.println(),而是在构造方法中请求一个更为通用的PrintStream。
// 这里最 大的问题在于,我们该如何将SlayDragonQuest交给BraveKnight呢?又如何 将PrintStream交给SlayDragonQuest呢?

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }


    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
//        System.out.println("Embarking on quest to slay the dragon");
    }
}
