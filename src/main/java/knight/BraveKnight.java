package knight;

/**
 * Created by yh on 17/11/1.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
//        BraveKnigh没有与特定的Quest实现发生耦合。
// 探险任务作为构造器参数传入，依赖注入的方式之一，既构造器注入(construct injection)
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
