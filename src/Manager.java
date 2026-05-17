import java.io.*;
import java.util.*;

public class Manager{
    private List<Bus> buses=new ArrayList<>();
    public void addBus(Bus b){
        buses.add(b);
    }
    public void showBus(){
        if(buses.isEmpty()){
            System.out.println("No Buses added Yet by the Manager");
        }
        else{
            for(Bus b:buses){
                System.out.println(b);
            }
        }
    }
    public void booking(String passenger, String BusNo){
        for(Bus b:buses){
            if(b.getBusNum().equalsIgnoreCase(BusNo)){
                if(b.book()){
                    System.out.println("Ticked is Booked Sucessfully.");
                    System.out.println("----------------------------");
                    System.out.println("Passenger: " + passenger);
                    System.out.println("Bus No:    " + b.getBusNum());
                    System.out.println("Capacity:   " + b.getCapacity());
                    System.out.println("Seat No: " + b.getBookedSeats());
                    System.out.println("AC: " + b.AC());
                    System.out.println("----------------------------");
                }
                else{
                    System.out.println("Tickets are not available");
                }
                return;
            }
        }
        System.out.println("Bus Not Found");
    }
    public void canceling(String BusNo){
        for(Bus b:buses){
            if(b.getBusNum().equalsIgnoreCase(BusNo)){
                if(b.cancel()){
                    System.out.println("Ticket is Cancelled Sucessfully.");
                }
                else{
                    System.out.println("No Booking Found");
                }
                return;
            }
        }
        System.out.println("Bus Not Found");
    }
    public void save(String filename) throws IOException{
        FileWriter fw=new FileWriter(filename);
        for(Bus b:buses){
            fw.write(b.toDataString()+"\n");
        }
        fw.close();
    }
    public void load(String filename) throws IOException{
       buses.clear();
       File file= new File(filename);
       if(!file.exists()) return;
       Scanner sc=new Scanner(file);
       while(sc.hasNextLine()){
        String line= sc.nextLine();
        Bus b=Bus.fromDataString(line);
        buses.add(b); 
      }
      sc.close();
    }
}