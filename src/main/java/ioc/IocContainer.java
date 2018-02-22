package ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class IocContainer {

    public static void main(String[] args) {
        iocContainerProgramming();
    }

    /**
     * 简单编程式的从xml文件建立ioc容器
     *
     * @param args
     */
    public static void iocContainerProgramming() {
        /* 1. 创建IOC配置文件的抽象资源，这个抽象资源包含了BeanDefinition的定义信息
         * 2. 创建一个BeanFactory，这里使用DefaultListableBeanFactory
         * 3. 创建一个载入BeanDefinition的读取器，这里使用XmlBeanDefinitionReader来载入xml文件形式的BeanDefinition，通过一个回调配置给BeanFactory
         * 4. 从定义好的资源位置读入配置信息
         * 完成载入和注册Bean定义后，Ioc容器就建立起来了，可以直接使用*/
        // failed       ClassPathResource resource = new ClassPathResource("knight.xml");
        ClassPathResource resource = new ClassPathResource("/META-INF/spring/knight.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

    }
}
