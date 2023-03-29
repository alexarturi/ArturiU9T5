import java.util.*;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer n){
        if (performers.contains(n)){
            return false;
        } else {
            performers.add(n);
            return true;
        }
    }

    public boolean removePerformer(Performer n){
        int ind = performers.indexOf(n);
        if (ind>=0){
            performers.remove(ind);
            return true;
        } else {
            return false;
        }
    }

    public double averagePerformerAge(){
        double sum = 0;
        int count = 0;
        for (Performer per : performers){
            sum += per.getAge();
            count++;
        }
        return sum/count;
    }

    public ArrayList<Performer> performersOverAge(int n){
        ArrayList<Performer> ret = new ArrayList<Performer>();
        for (Performer per : performers){
            if (per.getAge()>=n){
                ret.add(per);
            }
        }
        return ret;
    }

    public void groupRehearsal(){
        for (Performer performer : performers){
            System.out.println("REHEARSAL CALL! " + performer.getName());
            if (performer instanceof Comedian){
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow(){
        for (Performer performer : performers){
            System.out.println("Welcome to the cabaret! Next act up... " + performer.getName());
            if (performer instanceof Dancer){
                Dancer temp = (Dancer) performer;
                temp.pirouette(2);
                temp.perform();
            } else {
                performer.perform();
            }
        }
    }
}
