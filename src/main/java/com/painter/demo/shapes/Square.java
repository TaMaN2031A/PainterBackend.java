package com.painter.demo.shapes;

import org.springframework.stereotype.Component;
@Component
 public class Square implements Ishape
{
    private String first;
    private String second;
    private String third;
    private String fourth;
    private String fifth;
    private String sixth;
    private String seventh;
    private String eight;
    private String ninth;
    private String tenth;
    private String eleventh;
    private String twelfth;


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    public String getSixth() {
        return sixth;
    }

    public void setSixth(String sixth) {
        this.sixth = sixth;
    }

    public String getSeventh() {
        return seventh;
    }

    public void setSeventh(String seventh) {
        this.seventh = seventh;
    }

    public String getEight() {
        return eight;
    }

    public void setEight(String eight) {
        this.eight = eight;
    }

    public String getNinth() {
        return ninth;
    }

    public void setNinth(String ninth) {
        this.ninth = ninth;
    }

    public String getTenth() {
        return tenth;
    }

    public void setTenth(String tenth) {
        this.tenth = tenth;
    }

    public String getEleventh() {
        return eleventh;
    }

    public void setEleventh(String eleventh) {
        this.eleventh = eleventh;
    }

    public String getTwelfth() {
        return twelfth;
    }

    public void setTwelfth(String twelfth) {
        this.twelfth = twelfth;
    }

    @Override
    public String toString() {
        return "{" +
                "\"first\":\"" + first + "\""+
                ", \"second\":\"" + second + "\"" +
                ", \"third\":\"" + third + "\"" +
                ", \"fourth\":\"" + fourth + "\"" +
                ", \"fifth\":\"" + fifth + "\"" +
                ", \"sixth\":\"" + sixth + "\"" +
                ", \"seventh\":\"" + seventh + "\"" +
                ", \"eight\":\"" + eight + "\"" +
                ", \"ninth\":\"" + ninth + "\"" +
                ", \"tenth\":\"" + tenth + "\"" +
                ", \"eleventh\":\"" + eleventh + "\"" +
                ", \"twelfth\":\"" + twelfth + "\"" +
                '}';
    }
    public void handle(jsonShape data)
    {
        this.setFirst("Square");
        this.setSecond(data.second);
        this.setThird(data.third);
        this.setFourth(data.fourth);
        this.setFifth(data.fifth);
        this.setSixth(data.sixth);
        this.setSeventh(data.seventh);
        this.setEight(data.eight);
        this.setNinth(data.ninth);
        this.setTenth(data.tenth);
    }
}
