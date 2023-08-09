package massives;

import java.util.TreeSet;

class Car implements Comparable<Car> {
    public String name;
    public int year;
    public float topSpeed;
    public float maxPower;
    public float acceleration;

    public Car(String name, int year, float topSpeed, float maxPower, float acceleration) {
        this.name = name;
        this.year = year;
        this.topSpeed = topSpeed;
        this.maxPower = maxPower;
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", topSpeed=" + topSpeed +
                ", maxPower=" + maxPower +
                ", acceleration=" + acceleration +
                '}';
    }

    @Override
    public int compareTo(Car anotherCar)
    {
        return Float.compare(anotherCar.topSpeed, this.topSpeed);
    }

}

class CarMain {
    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<>();
        cars.add(new Car("Rimac Nevera", 2021, 415.2F, 1888, 2));
        cars.add(new Car("Hennesy Venom F5", 2020, 500.5F, 1817F, 2.7F));
        cars.add(new Car("SCC Tucara", 2018, 508.5F, 1750, 2.6F));
        cars.add(new Car("Tesla Model S", 2014, 249.4F, 691, 3.3F));
        for(Car o : cars){
            System.out.println(o);
        }
    }
}