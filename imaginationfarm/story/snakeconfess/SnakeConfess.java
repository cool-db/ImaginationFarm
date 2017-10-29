package SnakeConfessing;

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
