package Spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Car car;
//    public Person() {
//        System.out.println("Person Bean creating");
//    }

    public Person(Car car) {
        System.out.println("Person Bean creating");
        this.car = car;
    }

    public void callYourCar() {
        System.out.println("My lovely car");
        car.model();
    }

    public void setCar(Car car) {
        System.out.println("Set : car");
        this.car = car;
    }
}
