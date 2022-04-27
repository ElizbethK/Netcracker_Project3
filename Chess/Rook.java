package com.netcracker.homeworks.project3.Chess;

import java.util.ArrayList;

public class Rook extends ChessPiece{
    private String column;
    private String row;
    ArrayList<String> validMoves = new ArrayList<>();

    public Rook() {
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
        int i;

        System.out.println('\n'+"This rook can move to: ");
        System.out.print( "vertically: ");
        for( i = 0; i < super.allRowsList.size(); i++){
            System.out.print(column + super.allRowsList.get(i) + "  ");
            validMoves.add(column + String.valueOf(super.allRowsList.get(i)));
        }

        System.out.print('\n' + "horizontally: ");
        for( i = 0; i < super.allColumnsList.size(); i++){
            System.out.print(super.allColumnsList.get(i) + row + "  ");
            validMoves.add(column + String.valueOf(super.allRowsList.get(i)));
        }

        return validMoves;
    }
}
