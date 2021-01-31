package cn.cloudwalk.com;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: FangcunApplication. <br/>
 * Description: 启动类. <br/>
 * Date: 2018-11-29. <br/>
 *
 * @author hebing Tu
 * @version 1.0.0
 * @since 1.7
 */


@SpringBootApplication
@ComponentScan(basePackages = {"cn.cloudwalk.*.**"})
public class DemoApplication {


    /**
     * 启动函数主入口
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        System.out.println("[DEMO]-API开始启动...");
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        System.out.println("[DEMO]-API启动完成...");
    }
}
