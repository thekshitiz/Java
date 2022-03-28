public class Car {
    private String model;
    private int currentSpeed;
    private String color;
    private int year;

    // constructors

    public Car (String model){
        this.model = model;
    }
    public Car(String model, String color, int year){
        this.model=model;
        this.color=color;
        int year1 =year;
    }
    //methods
    public void start(){
        System.out.println(this.model + " has started.");
    }
    public void accelerate(){
        System.out.println(this.model + " has stopped");
        this.currentSpeed +=20;
    }
    public void stop(){
        this.currentSpeed=0;
    }
    public void showSpeed(){
        System.out.println("the current speed of " + this.model + " is : " +this.currentSpeed);
    }

    public String toString() {
        return " model: " + this.model + " color: " + this.color + " year: " +this.year;

    }
}

