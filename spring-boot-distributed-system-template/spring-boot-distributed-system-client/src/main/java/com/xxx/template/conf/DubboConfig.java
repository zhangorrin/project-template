package com.xxx.template.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 17:38
 * @version: V1.0.0
 * @Description:
 **/
@Configuration
@ImportResource({"classpath:spring/spring-dubbo.xml"}) //加入spring的bean的xml文件
public class DubboConfig {
}
