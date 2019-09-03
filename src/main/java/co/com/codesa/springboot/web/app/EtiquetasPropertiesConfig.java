package co.com.codesa.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({ @PropertySource("classpath:etiquetasMsg.properties") })
public class EtiquetasPropertiesConfig {

}
