package com.theironyard;

/**
 * Created by Jack on 12/1/15.
 */
public class Room {
    int row;
    int col;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;
    boolean isStart = true;
    boolean isEnd = true;

    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
