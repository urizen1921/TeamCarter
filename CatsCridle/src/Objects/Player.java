package Objects;

import Engine.GameEngine;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Player extends GameObject{
    private String name;

    private Picture playerObject;
    //private Rectangle field;
    private static final int PLAYER_CELL_SIZE = 20;
    private int up;
    private int down = 820 / 10;
    private int left;
    private int right = 390 / 10;
    private boolean reachedObjective;
    //private int width = 390 / 10;
    //private int heigth = 820;
    private GameEngine gameEngine;

   // protected CollisionDetector collisionDetector;
    //protected CanvasDirection currentDirection;




    public void checkDestination(){
        if(up == 75 && left == 20){
            System.out.println("You've arrived");
            reachedObjective = true;
        }
    }

    public void spawn(){
        playerObject = new Picture(PLAYER_CELL_SIZE, PLAYER_CELL_SIZE,"resources/Images/PlayerObj/playerobj.png");
        playerObject.draw();
    }

    public void moveRight() {
        if(right > 0) {
            playerObject.translate(10, 0);
            left++;
            right--;
            System.out.println("right: " + right);
            //System.out.println("destination: " + reachedObjective);
            checkDestination();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }
    }

    public void moveLeft() {
        if(left > 0) {
            playerObject.translate(-10, 0);
            right++;
            left--;
            System.out.println("left: " + left);
            checkDestination();
            //checkDestination();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }
    }

    public void moveUp() {
        if(up > 0) {
            playerObject.translate(0,-10);
            down++;
            up--;
            System.out.println("up: " + up);
            checkDestination();
            //checkDestination();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }
    }

    public void moveDown() {
        if(down > 0) {
            playerObject.translate(0,+10);
            up++;
            down--;
            System.out.println("down: " + down);
            checkDestination();
            //checkDestination();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }

    }

    public int getUp() {
        return up;
    }

    public int getLeft() {
        return left;
    }

    public void setReachedObjective(boolean reachedObjective) {
        this.reachedObjective = true;
    }

    public boolean isReachedObjective() {
        return reachedObjective;
    }
}
