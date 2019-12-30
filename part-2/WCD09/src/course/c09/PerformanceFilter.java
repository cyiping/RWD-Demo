package course.c09;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.DispatcherType;

@WebFilter(
	filterName = "perfFilter", 
	urlPatterns = { "/*" }, 
	dispatcherTypes = { 
		DispatcherType.FORWARD,
		DispatcherType.ERROR, 
		DispatcherType.REQUEST,
		DispatcherType.INCLUDE }, 
	initParams = { @WebInitParam(name = "Log Entry Prefix", value = "Performance:") })
public class PerformanceFilter implements Filter {

	private FilterConfig config;

	public void init(FilterConfig config) throws ServletException {
		this.config = config;		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		long begin = System.currentTimeMillis();
		chain.doFilter(request, response);
		long end = System.currentTimeMillis();

		StringBuffer logMessage = new StringBuffer();
		if (request instanceof HttpServletRequest) {
			logMessage = ((HttpServletRequest) request).getRequestURL();
		}
		logMessage.append(": ");
		logMessage.append(end - begin);
		logMessage.append(" ms");

		String logPrefix = config.getInitParameter("Log Entry Prefix");
		if (logPrefix != null) {
			logMessage.insert(0, logPrefix);
		}		
		System.out.println(logMessage.toString());
	}

	public void destroy() {
		config = null;
	}
}
