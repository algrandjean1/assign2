package assign2.server;

import assign2.client.*;
import assign2.server.*;
import java.rmi.server.*;
import java.rmi.*;
import java.util.Hashtable;

/**
 * Purpose: demonstrate using the RMI API
 * Implementation of employee server - create a remote server object 
 * (with a couple of employees). Register the remote server object with the
 * rmi registry.
 * @author Tim Lindquist (Tim@asu.edu), ASU Polytechnic
 * @version June 2014
 */
class WaypointServerImpl extends UnicastRemoteObject implements WaypointServer {

    protected Hashtable<String,Waypoint> wps;
    
    public WaypointServerImpl() throws RemoteException{
        wps = new Hashtable<String,Waypoint>();
    }
    
    public String[] getNames() throws RemoteException{
        String ret[];
        ret = (wps.keySet()).toArray(new String[0]);
        return ret;
    }
    public Waypoint get(String name) throws RemoteException{
        return wps.get(name);
    }
    public void remove(String name) throws RemoteException{
        wps.remove(name);
    }
    public void add(String name, Waypoint wp) throws RemoteException{
        wps.put(name,wp);
    }
    public double distGC(String from, String to) throws RemoteException{ //insert from project1
        double ret = 0.0;
        return ret;
    }
    public double directionGC(String from, String to) throws RemoteException{ //insert from project1
        double ret = 0;
        return ret;
    }
    
    
   public static void main(String args[]) {
      try {
         String hostId="localhost";
         String port="2222";
         if (args.length >= 2){
	    hostId=args[0];
            port=args[1];
         }
         WaypointServer obj = new WaypointServerImpl();
         Naming.rebind("rmi://"+hostId+":"+port+"/WaypointServer", obj);
         System.out.println("Server bound in registry as: "+
                            "rmi://"+hostId+":"+port+"/WaypointServer");
      }catch (Exception e) {
         e.printStackTrace();
      }
   }
}
