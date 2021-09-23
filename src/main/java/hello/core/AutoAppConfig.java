package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = Configuration.class)
) // 해당 프로젝트 내에서 Configuration 중복을 피하기 위해서 설정
public class AutoAppConfig {
}
