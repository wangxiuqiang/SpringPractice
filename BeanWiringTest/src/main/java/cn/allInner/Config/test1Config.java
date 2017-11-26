package cn.allInner.Config;

import cn.allInner.pojo.Impl.DogOne;
import cn.allInner.pojo.Impl.DogTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class test1Config {

    @Bean
    public DogOne dogOne(DogTwo dogTwo){
        return new DogOne(dogTwo);
    }

}
