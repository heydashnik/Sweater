package Spring.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("");
        Person person = context.getBean("personBean", Person.class);
        person.callYourCar();
        context.close();

    }



}
