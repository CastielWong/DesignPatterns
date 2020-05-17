package Proxy;

import Proxy.model.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    public State getState() throws RemoteException;
    public String getLocation() throws RemoteException;
    public int getCount() throws RemoteException;
}
