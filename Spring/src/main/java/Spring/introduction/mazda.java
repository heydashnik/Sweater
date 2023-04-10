package Spring.introduction;

import org.springframework.context.annotation.Bean;



public class mazda implements Car {
@Bean
    @Override
    public void model() {
        System.out.println("This is model mazda");
    }
}
