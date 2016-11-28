import com.jfinal.core.JFinal;

/**
 * Created by lanccj on 16/11/28.
 */
public class Start {
    /**
     * 建议使用 JFinal 手册推荐的方式启动项目
     * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
     */
    public static void main(String[] args) {
        JFinal.start("webapp", 8089, "/", 5);
    }
}
