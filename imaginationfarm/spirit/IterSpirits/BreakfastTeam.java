package imaginationfarm.spirit.IterSpirits;


import imaginationfarm.abst.AbstIter.Commander;
import imaginationfarm.abst.AbstIter.Team;

import java.util.ArrayList;

public class BreakfastTeam implements Team {
    private ArrayList<Animals> bfTeam;
    private int size = 0;
    private boolean hasSize = false;
    private int cur = 0;

    private int pt = 0;
    private int lastRect = -1;

    public void setTeamSize(int i){
        bfTeam = new ArrayList<Animals>();
        size = i;
        hasSize = true;
    }

    @Override
    public Commander getCommander() {
        System.out.println("CommanderPig: getCommander: I'm the commander of the breakfast team now");
        return new CommanderPig();
    }

    @Override
    public boolean add(Animals c) {
        if (!hasSize || cur == size){
            System.out.println("CommanderPig: add: The cook needs to know the number of animals having breakfast");
            return false;
        }
        bfTeam.add(c);
        cur++;
        System.out.println("CommanderPig: add: " + c.name + " starts to waiting for breakfast");
        return true;
    }

    @Override
    public boolean remove() {
        if (cur == 0){
            return false;
        }
        System.out.println("CommanderPig: remove: " + bfTeam.get(cur-1).name + " quit the team");
        bfTeam.remove(--cur);
        return true;
    }


    private class CommanderPig implements Commander{
        @Override
        public Animals next() {
            lastRect = pt++;
            System.out.println("CommanderPig: next: " + bfTeam.get(lastRect).name + " gets breakfast");
            return bfTeam.get(lastRect);
        }

        @Override
        public boolean hasNext() {
            if (pt < size) {
                System.out.println("CommanderPig: hasNext: " + bfTeam.get(pt).name + " is waiting for breakfast");
                return true;
            }
            return false;
        }

        @Override
        public boolean isEmpty() {
            if (size == 0) {
                System.out.println("CommanderPig: isEmpty: The team is Empty and no one is waiting for breakfast");
                return true;
            }
            return false;
        }
    }
}
