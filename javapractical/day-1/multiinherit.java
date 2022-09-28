
//multi level inheritence

class Country{
    public void country(){
        System.out.println("INDIA");
    }
}
class State extends Country{
    public void state(){
        System.out.println("GUJARAT");
    }
}
class City extends State{
    public void city(){
        System.out.println("AHMEDABAD");
    }
}

public class multiinherit {
    public static void main(String[] args){
        City c = new City();
        c.country();
        c.state();
        c.city();
    }
}
