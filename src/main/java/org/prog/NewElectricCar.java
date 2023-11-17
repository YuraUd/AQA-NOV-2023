package org.prog;


//TODO: add another class that extends electric car / DONE
public class NewElectricCar extends ElectricCar implements IMovable{

    public void driveElectric() {
        System.out.println("New electric drive");
    }

    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }
}
