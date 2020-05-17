package Proxy;

import Proxy.model.GumballMonitor;

import java.rmi.Naming;

public class Simulator_Monitor {

    public static void main(String[] args) {
        String[] location = {
                "rmi://localhost/gumballmachine"
        };

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
