
1. Compile all of the source code first.
2. Register each RMI (Remote Method Invocation) by using different terminal to 
simulate.
    ```sh
    # kill the previous rmiregistry process first in case the port is occupied
    lsof -i tcp:1099
    kill {process}
   
    cd {repo}/out/production/DesignPattern
    rmiregistry &
    java Proxy.Simulator_Machine localhost 200    
    ```
3. Run the "Simulator_Monitor" to check the output.

