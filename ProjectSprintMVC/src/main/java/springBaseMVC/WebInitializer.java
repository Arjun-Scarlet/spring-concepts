package springBaseMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import springBaseMVC.Config.AppConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
}
