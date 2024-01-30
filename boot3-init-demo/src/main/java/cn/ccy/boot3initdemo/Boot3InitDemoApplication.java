package cn.ccy.boot3initdemo;

import cn.ccy.boot3initdemo.pojo.Car;
import cn.ccy.boot3initdemo.pojo.Dog;
import cn.ccy.boot3initdemo.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "cn.ccy")
public class Boot3InitDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Boot3InitDemoApplication.class, args);

        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println("beanDefinitionName = " + beanDefinitionName);
//        }

        String[] beanNamesForType = ioc.getBeanNamesForType(Dog.class);
        for (String s : beanNamesForType) {
            System.out.println("dog = " + s);
        }

        String[] beanNamesForType1 = ioc.getBeanNamesForType(Car.class);
        for (String s : beanNamesForType1) {
            System.out.println("car = " + s);//car = car
        }

        String[] beanNamesForType2 = ioc.getBeanNamesForType(User.class);
        for (String s : beanNamesForType2) {
            System.out.println("user = " + s);//user = lisi
        }

        Car bean = ioc.getBean(Car.class);
        System.out.println("bean = " + bean);
        // -----------------------------------------------

    }

}
