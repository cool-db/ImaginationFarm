package imaginationfarm.story;

import imaginationfarm.abst.AbstIter.Commander;
import imaginationfarm.spirit.IterSpirits.Animals;
import imaginationfarm.spirit.IterSpirits.BreakfastTeam;
import imaginationfarm.spirit.IterSpirits.ExerciseTeam;

public class CommanderDemo {
    public void teamUp(){
        System.out.println("=====================Now the animals in the farm are exercising=====================");
        ExerciseTeam e = new ExerciseTeam();
        Commander pg = e.getCommander();

        e.add(new Animals("dog"));
        e.add(new Animals("snake"));
        e.add(new Animals("dragon"));
        e.add(new Animals("monkey"));
        System.out.println("------------------------------------------------------");
        while (pg.hasNext()){
            Animals temp = pg.next();
        }
        System.out.println("------------------------------------------------------");
        for (int i = 0; i<4; i++){
            e.remove();
        }
        System.out.println("------------------------------------------------------");
        System.out.println();

        System.out.println("=====================Now the animals in the farm are having breakfast=====================");
        BreakfastTeam b = new BreakfastTeam();
        Commander p = b.getCommander();
        b.setTeamSize(3);

        System.out.println("------------------------------------------------------");
        b.add(new Animals("cow"));
        b.add(new Animals("mouse"));
        b.add(new Animals("sheep"));

        System.out.println("------------------------------------------------------");
        while (p.hasNext()){
            Animals temp = p.next();
        }

        System.out.println("------------------------------------------------------");
        for (int i = 0; i<3; i++){
            b.remove();
        }
        System.out.println("------------------------------------------------------");


    }

    static public void main(String[] args){
        CommanderDemo c = new CommanderDemo();
        c.teamUp();
    }
}
