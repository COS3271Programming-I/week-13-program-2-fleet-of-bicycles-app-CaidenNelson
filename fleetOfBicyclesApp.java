import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bicycle2 {
    // the Bicycle class has five fields
    public int cadence, gear, speed;
    String owner, type;
    // the Bicycle class has one constructor
    public Bicycle2(int startCadence, int startSpeed, int startGear, String startType, String startOwner) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.type = startType;
        this.owner = startOwner;
    }
    public String getInfo (){
        String message;
        message = "The cadence is " + this.cadence + ", the speed is " + this.speed + ", the gear is " + this.gear;
        message += "\nthe start type is " + this.type + ", and the owner is " + this.owner;
        return message;
    }
}

public class bikeFleet {
    static Scanner userinput = new Scanner(System.in);
    public static void main (String[] args){
    List<Bicycle2> fleetOfBikes = new ArrayList<>();

    int fleetSize;

    System.out.println("How many bikes would you like to have in your fleet? Max of 6.");
    fleetSize = userinput.nextInt();

        for(int i = 0; i<fleetSize; i++){
            Bicycle2 fleetBike = new Bicycle2(0, 0, 0, "","");

            System.out.println("What is the cadence for bike " +(i+1));
            fleetBike.cadence = userinput.nextInt();

            System.out.println("What is the speed for bike " +(i+1));
            fleetBike.speed = userinput.nextInt();

            System.out.println("What is the gear for bike " +(i+1));
            fleetBike.gear = userinput.nextInt();

            System.out.println("What is the start type for bike " +(i+1));
            fleetBike.type = userinput.nextLine();
            fleetBike.type = userinput.nextLine();

            System.out.println("Who is the owner for bike " +(i+1));
            fleetBike.owner = userinput.nextLine();

            fleetOfBikes.add(fleetBike);
        }

        for(int j = 0; j<fleetSize; j++){
            System.out.println(fleetOfBikes.get(j).getInfo());
        }
    }
}
