package com.example.demo.global.config;

import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;
// import com.myhomes.app.global.AuthInterceptor;
// import com.navercorp.lucy.security.xss.servletfilter.XssEscapeServletFilter;

import lombok.RequiredArgsConstructor;

/**<pre>
 * 1. 패키지명 : com.myhomes.app.global.config
 * 2. 타입명 : WebConfig.java
 * 2. 작성일 : 2022. 1. 19. 오후 2:59:02
 * 3. 작성자 : 남승식
 * 4. 설명 : WebMvc 설정
 * </pre>
 */
@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {

	private final ObjectMapper objectMapper;

	private static final String CLASSPATH_RESOURCE_LOCATIONS = "classpath:/static/";

	/**<pre>
	 * 1. 메소드명 : addResourceHandlers
	 * 2. 작성일 : 2022. 1. 21. 오후 4:25:36
	 * 3. 작성자 : 남승식
	 * 4. 설명 : 정적자원 위치 명시
	 * </pre>
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
		registry.addResourceHandler("/js/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS+"js/");
		registry.addResourceHandler("/css/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS+"css/");
		registry.addResourceHandler("/img/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS+"img/");
		registry.addResourceHandler("/font/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS+"font/");
		registry.addResourceHandler("/SE2/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS+"SE2/");
	}

	// @Override
	// public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
	// 	resolvers.add(getCustomResolver());
	// }


	/**<pre>
	 * 1. 메소드명 : siteMeshRegFilter
	 * 2. 작성일 : 2022. 1. 19. 오후 2:58:44
	 * 3. 작성자 : 남승식
	 * 4. 설명 : siteMesh 설정
	 * </pre>
	 * @return
	 */
	// @Bean
	// public FilterRegistrationBean<SiteMeshConfig> siteMeshRegFilter() {
	// 	FilterRegistrationBean<SiteMeshConfig> filter = new FilterRegistrationBean<>();
	// 	filter.setFilter(new SiteMeshConfig());
	// 	return filter;
	// }


	/**<pre>
	 * 1. 메소드명 : filterRegistrationBean
	 * 2. 작성일 : 2022. 1. 19. 오후 2:57:52
	 * 3. 작성자 : 남승식
	 * 4. 설명 : Xss 필터 설정
	 * </pre>
	 * @return
	 */
	// @Bean
	// public FilterRegistrationBean<XssEscapeServletFilter> xssRegFilter() {
	// 	FilterRegistrationBean<XssEscapeServletFilter> xssFilter = new FilterRegistrationBean<>();
	// 	xssFilter.setFilter(new XssEscapeServletFilter());
	// 	xssFilter.setOrder(1);
	// 	xssFilter.addUrlPatterns("/*");
	// 	return xssFilter;
	// }

	// /**<pre>
	//  * 1. 메소드명 : jsonEscapeConverter
	//  * 2. 작성일 : 2022. 1. 19. 오후 4:20:11
	//  * 3. 작성자 : 남승식
	//  * 4. 설명 : XSS 필터 적용된 JsonConverter
	//  * </pre>
	//  * @return
	//  */
	// @Bean
    // public MappingJackson2HttpMessageConverter jsonEscapeConverter() {
    //     ObjectMapper copy = Jackson2ObjectMapperBuilder.json().build();
    //     copy.getFactory().setCharacterEscapes(new HtmlEscapeConfig());
    //     return new MappingJackson2HttpMessageConverter(copy);
    // }

	// @Bean
	// public CustomResolver getCustomResolver() {
	// 	return new CustomResolver();
	// }

	// @Override
	// public void addInterceptors(InterceptorRegistry registry) {
	// 	registry.addInterceptor(new AuthInterceptor())
	// 			.addPathPatterns("/**")
	// 			.excludePathPatterns("/adm/**"
	// 					, "/admchg/**"
	// 					, "/lgn*"
	// 					, "/header"
	// 					, "/left"
	// 					, "/footer"
	// 					, "/pageHeader"
	// 					, "/file/**"
	// 					, "/js/**"
	// 					, "/css/**"
	// 					, "/img/**"
	// 					, "/font/**"
	// 					, "/SE2/**"
	// 					, "/API/**"
	// 					, "/favicon.ico"
	// 					, "/error"
	// 					, "/subscribe"
	// 					, "/aptmngr/modPasswd.json"
	// 					, "/getNtcFooterDetail.json"
	// 					, "/systemAlarm.json"
	// 					, "/alramrmov.json"
	// 					, "/subscribe"
	// 					, "/sserg.json"
	// 					, "/modAlmChk.json"
	// 					, "/setAlarmOk.json"
	// 					, "/parkFile/**"//20230314 kj 개발용 추후 삭제 예정
	// 					,"/parkPatrl/**" //20230314 kj 개발용 추후 삭제 예정
	// 					, "/cncg/**"//20230314 kj 개발용 추후 삭제 예정
	// 					, "/");
	// }
}
