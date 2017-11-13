package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"services",
				"dao", 
				"servlets"})
public class SpringConfiguration {

}