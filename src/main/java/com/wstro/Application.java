package com.wstro;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot
 *
 * @author changhf
 * @date
 */
@ServletComponentScan
@SpringBootApplication
@ComponentScan(basePackages = {"com.wstro"})
public class Application extends SpringBootServletInitializer {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Mode.CONSOLE);
        app.run(Application.class, args);
//		SpringApplication.run(App.class,args);
    }

    /**
     * 部署Tomcat
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

}
