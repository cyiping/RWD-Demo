package course.c03.aop.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import course.c03.aop.Show;
import course.c03.aop.ShowImpl;

@Configuration
@EnableAspectJAutoProxy
//@ComponentScan
public class ShowConfig {
	//@Bean
	public Audience audience() {
		return new Audience();
	}

	//@Bean
	public AudiencePointcut audiencePointcut() {
		return new AudiencePointcut();
	}

	@Bean
	public AudienceAround audienceAround() {
		return new AudienceAround();
	}

	@Bean
	public Show getShow() {
		return new ShowImpl();
	}

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ShowConfig.class);

		Show show = context.getBean(Show.class);
		show.play();
	}
}
