package com.netcracker.homeworks.project3.Chess;

/*------P9.1 Implement a class ChessPiece with method setPosition(String coordinates).
        The coordinate string identifies the row and column in chess notation,
        such as "d8" for the initial position of the black queen.
        Also provide a method ArrayList<String> canMoveTo() that enumerates the valid moves
        from the current position. Provide subclasses Pawn, Knight, Bishop, Rook, Queen, and King.-----------*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessPiece {
    private String column;
    private String row;
    private ArrayList <String> coordinates = new ArrayList<>();

    //Creating a chessboard
    Integer[] allRows = new Integer []{1,2,3,4,5,6,7,8};
    List<Integer> allRowsList = (List<Integer>) Arrays.asList(allRows);
    String[] allColumns = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
    List<String> allColumnsList = Arrays.asList(allColumns);


    public ChessPiece() {
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public void setPosition(String column, String row){
        this.column = column;
        this.row = row;
    }

    public ArrayList<String> canMoveTo(){
        System.out.println("This chess piece can move to: ");
       return coordinates;
    }
}
