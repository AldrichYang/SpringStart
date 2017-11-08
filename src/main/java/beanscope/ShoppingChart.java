package beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by yh on 17/11/8.
 */
@Component
@Scope(proxyMode = ScopedProxyMode.INTERFACES,value = WebApplicationContext.SCOPE_SESSION)
public class ShoppingChart {
}
