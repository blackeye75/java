package inheritance;

public class Car extends vehicle{

    int numDoors;
    int maxSpeed;

    public void print(){
        super.print();
        System.out.println("Car "+ " numdoors "+ numDoors);
    }

    public void printMaxspeed(){
        super.maxSpeed = 15;
        System.out.println(maxSpeed+ " " + super.maxSpeed);
    }
}
