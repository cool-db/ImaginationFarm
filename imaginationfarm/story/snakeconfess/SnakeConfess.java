package imaginationfarm.story.snakeconfess;

import imaginationfarm.spirit.item.snake.Chicken;
import imaginationfarm.spirit.item.snake.Snake;

public class SnakeConfess {
    public static void snakeConfess() {
        Chicken chicken = Chicken.getInstance();
        Snake snake = new Snake();
        //the healthy chicken makes the snake evil
        chicken.setHealthy(true);
        snake.setMemory();
        snake.actionPerformed();

        //state change
        chicken.setHealthy(false);
        snake.setMemory();
        snake.actionPerformed();
    }
}
