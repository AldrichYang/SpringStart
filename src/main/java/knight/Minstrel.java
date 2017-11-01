package knight;

import java.io.PrintStream;

/**
 * Created by yh on 17/11/1.
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tse hee hee ,the brave knight did embark on a quest !");

    }
}
