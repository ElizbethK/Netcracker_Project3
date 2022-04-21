package com.netcracker.homeworks.project3;

/*------P3.4 Most countries (with the exception of Canada, Colombia, the Dominican Republic,
        Mexico, and the United States) follow the ISO 216 standard for paper sizes. An A0
        sheet has dimensions 841 × 1189 millimeters. An A1 sheet is obtained by cutting an
        A0 sheet in half along the larger dimension, yielding a 594 × 841 sheet. An A2 sheet
        is obtained by cutting it in half again, yielding a 420 × 594 sheet, and so on. Implement
        a class Sheet whose constructor makes an A0 sheet. Provide a method cutInHalf
        that yields a Sheet object of half the size. Also provide methods width, height, and name,
        returning the width and height in millimeters, as well as the name (such as "A2").----------*/

public class Sheet {
    private String name;
    private int width;
    private int height;
    private int counter;

    public Sheet() {
        counter = 0;
        name = "A0";
        width = 841;
        height = 1189;
    }

    public void cutInHalf(){
        if(width > height){
            width = this.width / 2;
        } else {
            height = this.height / 2;
        }
        ++ counter;
        name = "A" + counter;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", height: " + height +
                ", width: " + width;
    }
}
