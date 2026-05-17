public class Bus{
    public String busNum;
    public int capacity;
    public int bookedseats;
public Bus(String busNum,int capacity,int bookedseats){
    this.busNum=busNum;
    this.capacity=capacity;
    this.bookedseats=bookedseats;
}
public int available(){
    int a=capacity-bookedseats;
    return a;
}
public String getBusNum() {
    return busNum;
}
public int getCapacity() {
    return capacity;
}
public int getBookedSeats() {
    return bookedseats;
}
public boolean book(){
    if (bookedseats<capacity){
        bookedseats++;
        return true;
    }
    return false;
}
public boolean cancel(){
    if (bookedseats>0){
        bookedseats--;
        return true;
    }
    return false;
}
public String AC(){
    if(capacity==40){
        return "With AC";
    }
    else {
        return "Without AC";
    }
}
public String toString(){
  return "Bus No: " + getBusNum() + " | Capacity: " + getCapacity() + " | Booked: " + getBookedSeats() + " | Available seats : " +available() + " | AC : " + AC();

}
public String toDataString(){
    return getBusNum()+","+getCapacity()+","+getBookedSeats();
}
public static Bus fromDataString(String data){
    String []parts=data.split(",");
    int capacity=Integer.parseInt(parts[1]);
    int bookedseats=Integer.parseInt(parts[2]);
    return new Bus(parts[0],capacity,bookedseats);
}}