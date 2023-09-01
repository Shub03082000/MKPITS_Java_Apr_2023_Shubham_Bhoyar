package InterfaceExample;

abstract class TwoWheeler extends Car implements Cycle{
    public void speed(){
        System.out.println("speed = 90km/hr");
    }
}
