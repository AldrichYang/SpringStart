package knight;

/**
 * Created by yh on 17/11/1.
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
// 传统的做法，每个对象管理与自己相互协作的对象(即它所依赖的对象)，会导致高度耦合和难以测试的代码
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
