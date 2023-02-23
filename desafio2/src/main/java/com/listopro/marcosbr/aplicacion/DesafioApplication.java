package com.listopro.marcosbr.aplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = {"com.listopro.marcosbr"})
public class DesafioApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DesafioApplication.class);
    }

}
