package com.zsp;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

import static org.springframework.util.unit.DataUnit.MEGABYTES;

//解决jmx重复注册bean的问题
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
@Import(FdfsClientConfig.class)//只需要一行注解 @Import(FdfsClientConfig.class)就可以拥有带
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})//禁止Security认证
//@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory=new MultipartConfigFactory();
        //文件单次上传最大限制
        factory.setMaxFileSize(DataSize.of(50,MEGABYTES));
        //文件总上传最大限制
        factory.setMaxRequestSize(DataSize.of(100,MEGABYTES));
        return factory.createMultipartConfig();
    }
}
