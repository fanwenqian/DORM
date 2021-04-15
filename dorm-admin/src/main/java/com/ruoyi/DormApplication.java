package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author zhumf
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DormApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DormApplication.class, args);
        System.out.println("====================================================");
        System.out.println("(♥◠‿◠)ﾉﾞ  宿舍管理系统启动成功   ლ(´ڡ`ლ)ﾞ ");
        System.out.println("====================================================");
    }
}