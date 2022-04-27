package com.netcracker.homeworks.project3.Chess;

import java.util.ArrayList;

public class Queen extends ChessPiece{
    private String column;
    private String row;
    ArrayList<String> validMoves = new ArrayList<>();

    public Queen() {
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


        System.out.println('\n'+"This queen can move to: ");
        System.out.print("diagonally: ");

        //1st diagonal
        int i = iCurrentCol;
        int j = iCurrentRow;

        while(i < super.allColumnsList.size()-1 && j < super.allColumnsList.size()-1){
            i++;
            j++;
        }
        while(i >= 0 && j >= 0){
            System.out.print(super.allColumnsList.get(i) + super.allRowsList.get(j) + "  ");
            i--;
            j--;
        }

        //  2nd diagonal
        i = iCurrentCol;
        j = iCurrentRow;

        while(i < super.allColumnsList.size() && j > 0){
            System.out.print(super.allColumnsList.get(i) + super.allRowsList.get(j) + "  ");
            i++;
            j--;
        }
        while(i >= 0 && j < allRowsList.size()){
            System.out.print(super.allColumnsList.get(i) + super.allRowsList.get(j) + "  ");
            i--;
            j++;
        }

        System.out.print('\n' + "vertically: ");
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
