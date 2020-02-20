package Engine;

import Objects.Enemy;
import Objects.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import com.github.TeamCarter.Frame.Controls;
import com.github.TeamCarter.Frame.Canvas;
import org.academiademiadecodigo.hackstreetboys.teamcarter.Audio;
import org.academiademiadecodigo.hackstreetboys.teamcarter.Music;

import java.awt.*;

public class GameEngine {

    private int obstacle = 1;
    private int level = 0;
    private Player player;
    private boolean levelOneOn = true;
    private boolean levelTwoOn;
    private Audio audio;

    private Enemy enemy;

    public GameEngine() {
        //levelOnCanvas();
        //player = new Player();
        //player.spawn();
    }

    public void init() {
        //Player player = new Player();
        levelOneCanvas();
        //audio starter
        audio = new Audio();
        audio.startAudio();
        //audio starter
        player = new Player();
        player.spawn();

        enemy = new Enemy();
        enemy.spawn();

        //enemy.move();

        Controls controls = new Controls();

        controls.setPlayerObject(player);
        controls.init();
    }

    public void levelOneCanvas() {
        Canvas canvas= new Canvas(423, 850);
        canvas.makeCanvas();
    }
    public void start() {

        switch (level) {
            case 0:
                Rectangle rectangle = new Rectangle(10, 10, 423, 850);
                rectangle.draw();
                rectangle.fill();                                                           
            case 1:
                startLevelOne();
            case 2:
                Rectangle rectangle2 = new Rectangle(10, 10, 423, 850);
                rectangle2.draw();
                rectangle2.fill();
                break;
        }
        /*
        if (levelOneOn) {
            startLevelOne();
        } else if (levelTwoOn) {
            Rectangle rectangle = new Rectangle(10, 10, 423, 850);
            rectangle.draw();
            rectangle.fill();
        }

         */
    }

    public void startLevelOne(){
        init();
        while(!player.isReachedObjective()) {
            if(levelOneOn) {
                enemy.move();
                System.out.println(player.getUp() + " " + player.getLeft() + " !");;
            }
        }
        levelOneOn = false;
        levelTwoOn = true;
        level = 2;
        System.out.println("hiiiiii");
        Rectangle c = new Rectangle(10, 10, 89, 90);
        c.draw();
        c.fill();
    }
/*
    public void checkDestination(){
        if(player.getUp() == 75 && player.getLeft() == 20){
            System.out.println("You've arrived");
            player.setReachedObjective(true);
        }
    }

 */




    public boolean isLevelOneOn() {
        return levelOneOn;
    }

    public int getObstacle() {
        return obstacle;
    }

    public int getLevel() {
        return level;
    }

    public void setObstacle(int obstacle) {
        this.obstacle = obstacle;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}
