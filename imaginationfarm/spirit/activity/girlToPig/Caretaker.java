package imaginationfarm.spirit.activity.girlToPig;

//encapsulate momentos
public class Caretaker {

    public Caretaker() {System.out.println("Caretaker is created.");}

    private Momento momento;

    public Momento getMomento() {
        return momento;
    }

    public void setMomento(Momento momento) {
        this.momento = momento;
        System.out.println("Momento is set.");
    }
}
