package org.academiadecodigo.hackstreetboys.Objects;


import org.academiadecodigo.hackstreetboys.Engine.Position;

public abstract class GameObject {
    public  int WIDTH=423;
    public  int HEIGHT=850;
    public  int ENEMY_CELL_SIZE = 20;
    protected static final int MOVEMENT = 10;


    Position position;


    public void move() {

    }
}
