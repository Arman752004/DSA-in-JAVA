package Oops.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
    }
    
}
