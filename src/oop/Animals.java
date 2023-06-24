package oop;/*
Создать классы и интерфейсы для разных животных

 - все животные имеют общие свойства - для простоты пусть будет только одно такое свойство String name
 - некоторые животные умеют плавать - имеют метод swim() - пусть просто выводит строку "i'm swimming"
 - некоторые животные умеют летать - имеют метод fly() - пусть просто выводит строку "i'm flying"
 - некоторые животные умеют петь - имеют метод sing() - пусть разные животные выводят разную строку, например кот будет выводить "meow"

опиши следующих животных - кот(поёт), утка(поёт плавает и летает), рыба(только плавает), муха (только летает)

 */

abstract class Animals {
    String name;
}

interface Swimming {
    String swim();
}

interface Flying {
    String fly();
}

interface Singing {
    String sing();
}

class Cat extends Animals implements Singing {
    Cat(String name){
        this.name = name;
    }
    public String sing() {
        return "i'm singing";
    }
}

class Duck extends Animals implements Singing, Swimming, Flying {
    Duck(String name){
        this.name = name;
    }
    public String sing() {
        return "i'm singing";
    }

    public String swim() {
        return "i'm swimming";
    }

    public String fly() {
        return "i'm flying";
    }
}

class Fish extends Animals implements Swimming {
    Fish(String name){
        this.name = name;
    }
    public String swim() {
        return "i'm swimming";
    }
}

class Fly extends Animals implements Flying {
    Fly(String name){
        this.name = name;
    }
    public String fly() {
        return "i'm flying";
    }
}

class test {
    public static void main(String[] args) {
        Cat barsicCat = new Cat("Барсик");
        System.out.println(barsicCat.name + " умеет " + barsicCat.sing());
        Duck stuppedDuck = new Duck("Тупая утка");
        System.out.println(stuppedDuck.name + " умеет " + stuppedDuck.sing() + " " + stuppedDuck.fly() + " " + stuppedDuck.swim());
        Fish nemo = new Fish("Немо");
        System.out.println(nemo.name + " умеет " + nemo.swim());
        Fly cokotuha = new Fly("Цокотуха");
        System.out.println(cokotuha.name + " умеет " + cokotuha.fly());
    }
}

