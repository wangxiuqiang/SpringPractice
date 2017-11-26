package cn.allInner.Config;

import cn.allInner.pojo.Impl.DogTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class test2Config {

    @Bean
    public DogTwo dogTwo() {
        return new DogTwo();
    }
}
