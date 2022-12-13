package shangguigu.foundation.a13polymorphism;

import java.util.Random;
/*
考试题：多态是编译时行为还是运行时行为？
体现多态是运行时行为
 */
public class Exercise02 {
    public static void main(String[] args) {
        int key = new Random().nextInt(3);
        System.out.println(key);
        Animal animal = getInstance(key);
        animal.eat();
    }

    public static Animal getInstance(int key){

        switch (key){
            case 0:return new Cat();
            case 1:return new Dog();
            default:return new  Sheep();
        }
    }
}
