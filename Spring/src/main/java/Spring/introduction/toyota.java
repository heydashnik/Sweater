package Spring.introduction;

import org.springframework.stereotype.Component;

@Component("myToyota")

public class toyota implements Car{
    @Override
    public void model() {
        System.out.println("This is model toyota");
    }
}
