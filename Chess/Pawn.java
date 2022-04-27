package com.netcracker.homeworks.project3.Chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pawn extends ChessPiece{
    private String column;
    private String row;
    ArrayList <String> validMoves = new ArrayList<>();

    public Pawn() {
        column = "";
        row = "";
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public void setPosition(String c, String r){
        column = c;
        row = r;
    }

    @Override
    public ArrayList<String> canMoveTo() {

        int iCurrentRow = super.allRowsList.indexOf(Integer.parseInt(row));
        int iCurrentCol = Integer.parseInt(String.valueOf(super.allColumnsList.indexOf(column)));


        System.out.println("This pawn can move to: ");
        System.out.print("vertically: ");
        for(int i = iCurrentRow; i < super.allRowsList.size(); i++){
           System.out.print(column + super.allRowsList.get(i) + "  ");
            validMoves.add(column + String.valueOf(super.allRowsList.get(i)));
        }
        return validMoves;
    }


}
