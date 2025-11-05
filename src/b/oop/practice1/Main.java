package b.oop.practice1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        person.printInfo();

        System.out.println("=====");

        Dog dog = new Dog("진돗개", "백구");
        dog.sit();
        dog.hand();

        System.out.println("=====");

        Car car = new Car("Benz", 0);
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.printInfo();

        System.out.println("=====");

        BankAccount account = new BankAccount("111", 0);
        account.deposit(10000);
        account.withdraw(3000);

        System.out.println("=====");

        Counter counter = new Counter();
        counter.getCount();

        counter.increment();
        counter.getCount();

        counter.decrement();
        counter.getCount();

        counter.increment();
        counter.increment();
        counter.getCount();

        counter.reset();
        counter.getCount();
    }
}
