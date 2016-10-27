package cn.qdsoft.yzm.common.filter;

import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mtf81 on 2016/10/26.
 */
@WebFilter(filterName = "securityFilter",urlPatterns = "/*")
public class SecurityFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
		HttpServletResponse httpServletResponse=(HttpServletResponse)servletResponse;
		String url=httpServletRequest.getServletPath();
		if(url.startsWith("/user/register")||url.startsWith("/user/login")||httpServletRequest.getSession().getAttribute("user")!=null){
			filterChain.doFilter(servletRequest,servletResponse);
		}else{
			httpServletResponse.sendRedirect("/user/login");
		}
	}

	@Override
	public void destroy() {

	}
}
