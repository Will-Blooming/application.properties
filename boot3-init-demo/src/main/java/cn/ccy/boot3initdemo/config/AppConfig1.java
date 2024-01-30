package cn.ccy.boot3initdemo.config;


import cn.ccy.boot3initdemo.pojo.Car;
import cn.ccy.boot3initdemo.pojo.Dog;
import cn.ccy.boot3initdemo.pojo.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration

public class AppConfig1 {

    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    @Bean
    public Dog dog(){
        return new Dog();
    }

    @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
    @Bean
    public Car car(){
        return new Car();
    }

    @ConditionalOnBean(value = Dog.class)
    @Bean
    public User zhangsan(){
        return new User();
    }

    @ConditionalOnBean(value = Car.class)
    @Bean
    public User lisi(){
        return new User();
    }
}
