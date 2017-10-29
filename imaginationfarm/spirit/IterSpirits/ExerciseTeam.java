package imaginationfarm.spirit.IterSpirits;


import imaginationfarm.abst.AbstIter.Commander;
import imaginationfarm.abst.AbstIter.Team;

import java.util.Vector;

public class ExerciseTeam implements Team {
    private Vector<Animals> exeTeam = new Vector<Animals>();
    private int cur = 0;
    private int lastRect = -1;

    @Override
    public Commander getCommander() {
        return new CommanderPigGirl();
    }

    @Override
    public boolean remove() {
        if (exeTeam.isEmpty()){
            return false;
        }
        System.out.println("ExerciseTeam: remove: " + exeTeam.get(exeTeam.size()-1).name + " quit the team.");
        exeTeam.removeElementAt(exeTeam.size()-1);
        return true;
    }

    @Override
    public boolean add(Animals c) {
        System.out.println("ExerciseTeam: add:" + c.name + " entered the team.");
        return exeTeam.add(c);
    }

    private Animals getEle(int i){
        return exeTeam.get(i);
    }

    private class CommanderPigGirl implements Commander{
        private int cur = 0;

        CommanderPigGirl(){
            System.out.println("CommanderPigGirl: create: " + "I'm the commander of the team");
        }


        public Animals next(){
            Animals next = getEle(cur);
            lastRect = cur++;
            System.out.println("CommanderPigGirl: next: The next Animal " + next.name + " is exercising");
            return next;
        }

        public boolean hasNext(){
            if (cur < exeTeam.size()) {
                System.out.println("CommanderPigGirl: hasNext: There is an animal waiting for exercise");
                return true;
            }
            return false;
        }

        public boolean isEmpty() {
            System.out.println("CommanderPigGirl: isEmpty: The team is Empty");
            return exeTeam.isEmpty();
        }
    }

}
