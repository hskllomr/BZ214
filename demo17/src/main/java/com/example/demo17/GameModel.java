package com.example.demo17;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class GameModel {

    private  User user1=new User(Color.BLACK,"BLACK");
    private  User user2=new User(Color.RED,"RED");

    public int countnumberofblackpolygon=0;

    public int countnumberofredpolygon=0;
    private boolean user1isavailable;


    @FXML
    protected void onStartButtonClick() {
        resetpolygon();
        setBlack(0);
        setRed(0);
        countnumberofredpolygon=0;
        countnumberofblackpolygon=0;

    }

    @FXML
    protected void resetpolygon()
    {
        polygon0.setFill(Color.GRAY);
        polygon.setFill(Color.GRAY);
        polygon1.setFill(Color.GRAY);
        polygon2.setFill(Color.GRAY);
        polygon3.setFill(Color.GRAY);
        polygon4.setFill(Color.GRAY);
        polygon5.setFill(Color.GRAY);
        polygon6.setFill(Color.GRAY);
        polygon7.setFill(Color.GRAY);
        polygon8.setFill(Color.GRAY);
        polygon9.setFill(Color.GRAY);
        polygon10.setFill(Color.GRAY);
        polygon11.setFill(Color.GRAY);
        polygon12.setFill(Color.GRAY);
        polygon13.setFill(Color.GRAY);
        polygon14.setFill(Color.GRAY);
        polygon15.setFill(Color.GRAY);
        polygon16.setFill(Color.GRAY);
        polygon17.setFill(Color.GRAY);
        polygon18.setFill(Color.GRAY);
        polygon19.setFill(Color.GRAY);
        polygon20.setFill(Color.GRAY);
        polygon21.setFill(Color.GRAY);
        polygon22.setFill(Color.GRAY);
        polygon23.setFill(Color.GRAY);


    }

    @FXML
    private Polygon polygon0;

    @FXML
    private Polygon polygon;

    @FXML
    private Polygon polygon1;

    @FXML
    private Polygon polygon2;

    @FXML
    private Polygon polygon3;

    @FXML
    private Polygon polygon4;

    @FXML
    private Polygon polygon5;

    @FXML
    private Polygon polygon6;

    @FXML
    private Polygon polygon7;

    @FXML
    private Polygon polygon8;

    @FXML
    private Polygon polygon9;

    @FXML
    private Polygon polygon10;

    @FXML
    private Polygon polygon11;

    @FXML
    private Polygon polygon12;

    @FXML
    private Polygon polygon13;

    @FXML
    private Polygon polygon14;

    @FXML
    private Polygon polygon15;

    @FXML
    private Polygon polygon16;

    @FXML
    private Polygon polygon17;

    @FXML
    private Polygon polygon18;

    @FXML
    private Polygon polygon19;

    @FXML
    private Polygon polygon20;

    @FXML
    private Polygon polygon21;

    @FXML
    private Polygon polygon22;

    @FXML
    private Polygon polygon23;

    @FXML
    protected void changecolor0() {

        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon0.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else{
            Color usercolor = user2.getColor();
            polygon0.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else{
            Color usercolor = user2.getColor();
            polygon.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor1() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon1.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon1.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor2() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon2.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else{
            Color usercolor = user2.getColor();
            polygon2.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor3() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon3.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else{
            Color usercolor = user2.getColor();
            polygon3.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor4() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon4.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else{
            Color usercolor = user2.getColor();
            polygon4.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor5() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon5.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else{
            Color usercolor = user2.getColor();
            polygon5.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor6() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon6.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else{
            Color usercolor = user2.getColor();
            polygon6.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor7() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon7.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon7.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor8() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon8.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon8.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor9() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon9.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon9.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor10() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon10.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon10.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();

    }

    @FXML
    protected void changecolor11() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon11.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon11.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor12() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon12.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon12.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor13() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon13.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon13.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor14() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon14.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon14.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor15() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon15.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon15.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor16() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon16.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon16.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor17() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon17.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon17.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor18() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon18.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon18.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }


    @FXML
    protected void changecolor19() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon19.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon19.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }


    @FXML
    protected void changecolor20() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon20.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon20.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor21() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon21.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon21.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }

    @FXML
    protected void changecolor22() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon22.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon22.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
        winner();
    }


    @FXML
    protected void changecolor23() {
        if(user1isavailable)
        {
            Color usercolor = user1.getColor();
            polygon23.setFill(usercolor);
            countnumberofblackpolygon=countnumberofblackpolygon+1;
        }
        else {
            Color usercolor = user2.getColor();
            polygon23.setFill(usercolor);
            countnumberofredpolygon=countnumberofredpolygon+1;
        }
        user1isavailable = !user1isavailable;
        setRed(countnumberofredpolygon);
        setBlack(countnumberofblackpolygon);
    }


   @FXML
   private Label myLabel;

    public void setRed(int countnumberofredpolygon) {
        myLabel.setText(Integer.toString(countnumberofredpolygon));
    }

    @FXML
    private Label myLabel2;

    public void setBlack(int countnumberofblackpolygon) {
        myLabel2.setText(Integer.toString(countnumberofblackpolygon));
    }

    @FXML
    private Label myLabel3;

    public void winner() {
        if (countnumberofblackpolygon >= 5) {
            myLabel3.setText("Winner is user1");
        } else if (countnumberofredpolygon >= 5) {
            myLabel3.setText("Winner is user2");
        } else {
            myLabel3.setText("the result is draw");
        }
    }

}