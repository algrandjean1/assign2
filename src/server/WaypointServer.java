package assign2.server;

import java.rmi.*;

/**
 * Purpose: demonstrate using the RMI API
 * remote interface for the employee server.
 * @author Tim Lindquist (Tim@asu.edu), ASU Polytechnic
 * @version June 2014
 */
public interface WaypointServer extends Remote {
    public String[] getNames() throws RemoteException;
    public Waypoint get(String name) throws RemoteException;
    public void remove(String name) throws RemoteException;
    public void add(String name, Waypoint wp) throws RemoteException;
    public double distGC(String from, String to) throws RemoteException;
    public double directionGC(String from, String to) throws RemoteException;    
}
