package assign2.server;

/**
 * Purpose: demonstrate using the RMI API
 * a simple serializable employee class including name and id number.
 * @author Tim Lindquist (Tim@asu.edu), ASU Polytechnic
 * @version June 2014
 */


// Put constants for nautical and 
public class Waypoint implements java.io.Serializable {
    public final static int STATUTE = 0;
    public final static int NAUTICAL = 1;
    public final static int KMETER = 2;
    public final static double radiusE = 6371;
    public double lat;
    public double lon;
    public double ele;
    public String address;
    private String name;

   public Waypoint(double lat,double lon,double ele, String name, String adress) {
      this.lat = lat;
      this.lon = lon;
      this.ele = ele;
      this.name = name;
      this.address = address;
   }
}		
