/*5. Design and implement a Java program that simulates a network monitoring system. Your system should be capable 
of monitoring different types of network devices, such as routers and switches, and alerting if any devices are 
experiencing errors or downtime. Use interfaces to define common behaviors for network devices and implement these 
behaviors in different device classes. Create an interface named NetworkDevice with at least two methods: getStatus()
 which returns a String indicating the current status of the device, and isAvailable() which returns a boolean indicating
  if the device is currently available and functioning correctly. Implement the NetworkDevice interface in at least three 
  separate classes, Router and Switch. Each class should have a constructor that sets specific properties for the device 
  and specific logic to determine its status and availability.
*/
public class SecD5 {
    static void deviceStatus(NetworkDevice nd){
        if(nd.isAvailable()){
        System.out.println("Device is running");
    }
    else{
        System.out.println("Device is not running");
    }
}
    public static void main(String[] args){
        NetworkDevice r= new Router("on",12);
        NetworkDevice s= new Switch("off",13);
        System.out.println(r.getStatus());
        System.out.println(s.getStatus());
        deviceStatus(r);
        deviceStatus(s);
        
    }
    
}
interface NetworkDevice{
    public String getStatus();
    public boolean isAvailable();
}
class Router implements NetworkDevice{
    private String status;
    int routerId;
    Router(String status,int routerId){
      this.routerId=routerId;
      this.status=status;
    }
    @Override
    public String getStatus(){
        return status;
        
    }
    @Override
    public boolean isAvailable(){
        return status.equals("on");
    }
}

class Switch implements NetworkDevice{
    private String status;
    int routerId;
    Switch(String status,int routerId){
      this.routerId=routerId;
      this.status=status;
    }
     @Override
    public String getStatus(){
        return status;
        
    }
    @Override
    public boolean isAvailable(){
        return status.equals("on");
    }
}
