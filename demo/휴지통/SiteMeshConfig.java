package com.example.demo.global.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**<pre>
 * 1. 패키지명 : com.myhomes.app.global.config
 * 2. 타입명 : SiteMeshConfig.java
 * 2. 작성일 : 2023. 4. 30.
 * 3. 작성자 : 은재관
 * 4. 설명 : siteMesh 적용 규칙
 * </pre>
 */
public class SiteMeshConfig extends ConfigurableSiteMeshFilter {

	/**<pre>
	 * 1. 메소드명 : applyCustomConfiguration
	 * 2. 작성일 : 2022. 1. 21. 오후 4:23:20
	 * 3. 작성자 : 남승식
	 * 4. 설명 : SiteMesh 적용할 요청URL 패턴 / 레이아웃 설정
	 * </pre>
	 * @param builder
	 */
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder
			.addDecoratorPath("/lgn", "/WEB-INF/include/layout/lgnLayout.jsp") // 요청URL, 적용 레이아웃 Path
			.addDecoratorPath("/", "/WEB-INF/include/layout/dashBoardLayout.jsp") // 요청URL, 적용 레이아웃 Path
			.addDecoratorPath("/*", "/WEB-INF/include/layout/defaultLayout.jsp")
			.addExcludedPath("/test/*")
			.addExcludedPath("*.json") // Ajax 요청
			.addExcludedPath("/imgView") // 원본 이미지
			.addExcludedPath("/SE2/*") // 스마트에디터
			.addExcludedPath("/publish") //알림 발송
			.addExcludedPath("/subscribe") // 알림 구독
		;

	}

}
