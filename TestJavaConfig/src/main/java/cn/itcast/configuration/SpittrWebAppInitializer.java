package cn.itcast.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 将一个或者多个路径映射到DispatcherServlet上，使用的 “/” 表示的是默认的Servlet
     * 会处理进入应用的所有请求
     * @return
     */
    @Override
    protected String[] getServletMappings(){
       return new String[] {"/"};
    }

    /**
     * RootConfig      ContextLoaderListener  ,DispatcherServlet 启用时同时创建，
     * 用来配置骐达的应用上下文的bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    /**
     * DispatcherServlet在加载应用上下文的额时候，使用定义在webConfig中的bean
     * 在webConfig中启用springmvc，配置视图管理器等
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }
}
