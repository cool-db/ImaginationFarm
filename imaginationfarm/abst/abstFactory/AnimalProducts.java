package imaginationfarm.abst.abstFactory;


import imaginationfarm.abst.logger.Logger;

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
        Logger.i(this.getClass().getName() + ": " + id + ": " + "create" + ": " + "I'm created");
    }

    public void use() {
        Logger.i(this.getClass().getName() + ": " + id + ": " + "use" + ": " + "I'm used");
    }
}
