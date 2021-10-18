package cn.liyong.test.springboot.config;

import cn.liyong.test.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This is Description
 *
 * @author liyong
 * @date 2021/10/18
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
				.addPathPatterns("/**")
				.excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**");

	}
}
