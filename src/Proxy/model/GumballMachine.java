package Proxy.model;

import Proxy.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private final static State SOLD_OUT = State.SoldOut;
    private final static State NO_QUARTER = State.NoQuarter;
    private final static State HAS_QUARTER = State.HasQuarter;
    private final static State SOLD = State.Sold;

    private State state = SOLD_OUT;
    private String location;
    private int count;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;

        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public State getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }
}
