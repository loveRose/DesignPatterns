package lvyerose.builder;

/**
 * Created by lvyeRose on 16/12/16.
 */
public class BuilderTest {
    public static void main(String[] args) {

        System.out.println("-------第一种配置方式结果---------");

        Builder builder = new MacbookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");
        System.out.println(builder.create().toString());

        System.out.println("-------第二种配置方式结果---------");

        FinalComputer finalComputer = new FinalComputer.Builder()
                .OS("Mac OS X 10.10")
                .board("英特尔超级主板")
                .display("Retina显示器")
                .build();
        System.out.print(finalComputer.toString());


    }
}
