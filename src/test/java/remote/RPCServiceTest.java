package remote;

import config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import service.Spitter2Service;
import service.Spitter3Service;
import service.SpitterService;

/**
 * Created by yh on 2019-01-30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {RootConfig.class})
public class RPCServiceTest {
    @Autowired
    SpitterService spitterService;
    @Autowired
    Spitter2Service spitter2Service;
    @Autowired
    Spitter3Service spitter3Service;


    @Test
    public void hessianRPC() {
        System.out.println(spitterService.helloSpitter());
    }

    @Test
    public void httpInvokerRPC() {
        System.out.println(spitter2Service.hello2Spitter());
    }

    @Test
    public void wsRPC() {
        System.out.println(spitter3Service.hello3Spitter());
    }


}
