package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import service.Spitter2Service;
import service.SpitterService;

/**
 * Created by yh on 2019-02-20.
 */
@Configuration
public class RootConfig {
    /**
     * 访问Hessian服务的Bean，一般应该在另一个客户端应用中，此处偷懒
     *
     * @return
     */
    @Bean
    public HessianProxyFactoryBean spitterService() {
        HessianProxyFactoryBean proxyFactoryBean = new HessianProxyFactoryBean();
//        serviceUrl标示了这个服务的URL，Hessian是基于HTTP的，这里就是Http URL
        proxyFactoryBean.setServiceUrl("http://localhost:8080/spittr/spitter.service");
        proxyFactoryBean.setServiceInterface(SpitterService.class);
        return proxyFactoryBean;
    }

    @Bean
    public HttpInvokerProxyFactoryBean spitter2Service() {
        HttpInvokerProxyFactoryBean proxyFactoryBean = new HttpInvokerProxyFactoryBean();
        proxyFactoryBean.setServiceUrl("http://localhost:8080/spittr/spitter2.service");
        proxyFactoryBean.setServiceInterface(Spitter2Service.class);
        return proxyFactoryBean;
    }
}
