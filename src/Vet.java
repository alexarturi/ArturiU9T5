import java.util.*;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name){
        this.name = name;
        clients = new ArrayList<Animal>();
    }

    public void addClient(Animal n){
        if(clients.contains(n)){
            System.out.println(n.getName() + " is already a client of " + name);
        } else {
            clients.add(n);
            System.out.println("Welcome to " + name + "'s office, " + n.getName()+ "!");
        }
    }
}
