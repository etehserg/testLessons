package massives;

import java.util.ArrayList;
import java.util.Comparator;


class CarArray {
    public String name;
    public int year;
    public float topSpeed;
    public float maxPower;
    public float acceleration;

    public CarArray(String name, int year, float topSpeed, float maxPower, float acceleration) {
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
}
class AccelerationComparator implements Comparator<CarArray>{
    public int compare(CarArray c1, CarArray c2){
        return Float.compare(c1.acceleration, c2.acceleration);
    }
}

class PowerComparator implements Comparator<CarArray>{
    public int compare(CarArray c1, CarArray c2){
        return Float.compare(c2.maxPower, c1.maxPower);
    }
}
class CarArrayMain {
    public static void main(String[] args) {
        ArrayList<CarArray> cars = new ArrayList<>();
        cars.add(new CarArray("Rimac Nevera", 2021, 415.2F, 1888, 2));
        cars.add(new CarArray("Hennesy Venom F5", 2020, 500.5F, 1817F, 2.7F));
        cars.add(new CarArray("SCC Tucara", 2018, 508.5F, 1750, 2.6F));
        cars.add(new CarArray("Tesla Model S", 2014, 249.4F, 691, 3.3F));

        AccelerationComparator myAccelerationComparator = new AccelerationComparator();
        cars.sort(myAccelerationComparator);
        System.out.println("Сортировка по возрастанию ускорения:");
        for (CarArray o : cars) {
            System.out.println(o);
        }

        PowerComparator myPowerComparator = new PowerComparator();
        cars.sort(myPowerComparator);
        System.out.println("Сортировка по убыванию мощности:");
        for (CarArray o : cars) {
            System.out.println(o);
        }
    }
}