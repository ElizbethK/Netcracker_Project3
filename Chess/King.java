package com.netcracker.homeworks.project3.Chess;

import java.util.ArrayList;

public class King extends ChessPiece{
    private String column;
    private String row;
    ArrayList<String> validMoves = new ArrayList<>();

    public King() {
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

        validMoves.add(column + String.valueOf(super.allRowsList.get(iCurrentRow+1)));
        validMoves.add(column + String.valueOf(super.allRowsList.get(iCurrentRow - 1)));
        validMoves.add(String.valueOf(super.allColumnsList.get(iCurrentCol + 1)) + row);
        validMoves.add(String.valueOf(super.allColumnsList.get(iCurrentCol - 1)) + row);
        validMoves.add(String.valueOf(super.allColumnsList.get(iCurrentCol - 1) +
                String.valueOf(super.allRowsList.get(iCurrentRow +1))));
        validMoves.add(String.valueOf(super.allColumnsList.get(iCurrentCol - 1) +
                String.valueOf(super.allRowsList.get(iCurrentRow - 1))));
        validMoves.add(String.valueOf(super.allColumnsList.get(iCurrentCol + 1) +
                String.valueOf(super.allRowsList.get(iCurrentRow - 1))));
        validMoves.add(String.valueOf(super.allColumnsList.get(iCurrentCol + 1) +
                String.valueOf(super.allRowsList.get(iCurrentRow + 1))));


        System.out.println('\n'+"This king can move to: ");
        for(String s : validMoves){
            System.out.print(s + " ");
        }
        return validMoves;
    }

}
