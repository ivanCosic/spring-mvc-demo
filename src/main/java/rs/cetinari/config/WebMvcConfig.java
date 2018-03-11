package rs.cetinari.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import rs.cetinari.controller.ControllerMarker;
import rs.cetinari.service.ServiceMarker;

@Configuration
@EnableWebMvc
//@ComponentScan(basePackages = "rs.cetinari.controller")
@ComponentScan(basePackageClasses = {ControllerMarker.class, ServiceMarker.class})

public class WebMvcConfig {

    // While other .jsp files for all requests are not needed, index.jsp in WEB-INF folder is a good idea, since servlet
    // expects to find it.
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
