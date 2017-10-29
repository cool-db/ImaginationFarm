package AbstractFactory.AbstFactory;


public class AnimalProducts implements Products{
    public String id = "";

    public AnimalProducts(){
        id = "defalutName";
    }

    public AnimalProducts(String s) {
        id = s;
        create();
    }

    public void create(){
        System.out.println(this.getClass().getName() + ": " + id + ": " + "create" + ": " + "I'm created");
    }

    public void use() {
        System.out.println(this.getClass().getName() + ": " + id + ": " + "use" + ": " + "I'm used");
    }
}
