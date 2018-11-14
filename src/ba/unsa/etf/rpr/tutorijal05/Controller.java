package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private SimpleStringProperty rezultat;
    private double operand1, operand2;
    private String operator;

    public  Controller(){
        rezultat=new SimpleStringProperty();
        rezultat.set("0");
    }

    public SimpleStringProperty rezultatProperty() {
        return rezultat;
    }
    public String getRezultat(){
        return rezultat.get();
    }

    private double dajBroj(String s){
        return Double.parseDouble(s);
    }

    private void broj(String s){
        if(rezultat.get().equals("0") && !s.equals(".")) rezultat.set("");
        rezultat.set(rezultat.get()+s);
    }
    public void dugme0(ActionEvent actionEvent) {
        broj("0");
    }
    public void dugme1(ActionEvent actionEvent) {
        broj("1");
    }
    public void dugme2(ActionEvent actionEvent) {
        broj("2");
    }
    public void dugme3(ActionEvent actionEvent) {
        broj("3");
    }
    public void dugme4(ActionEvent actionEvent) {
        broj("4");
    }
    public void dugme5(ActionEvent actionEvent) {
        broj("5");
    }
    public void dugme6(ActionEvent actionEvent) {
        broj("6");
    }
    public void dugme7(ActionEvent actionEvent) {
        broj("7");
    }
    public void dugme8(ActionEvent actionEvent) {
        broj("8");
    }
    public void dugme9(ActionEvent actionEvent) {
        broj("9");
    }
    public void tacka(ActionEvent actionEvent) {
        broj(".");
    }

    private void operacija(String s) {
        if (s == "=") {
            operand2 = dajBroj(rezultat.get());
            switch (operator) {
                case "+":
                    double rez1 = operand1 + operand2;
                    rezultat.set("" + rez1);
                    break;
                case "-":
                    double rez2 = operand1 - operand2;
                    rezultat.set("" + rez2);
                    break;
                case "×":
                    double rez3 = operand1 * operand2;
                    rezultat.set("" + rez3);
                    break;
                case "/":
                    double rez4 = operand1 / operand2;
                    rezultat.set("" + rez4);
                    break;
                case "%":
                    double rez5 = operand1 % operand2;
                    rezultat.set("" + rez5);
                    break;
            }
            operand1=0;
            operand2=0;
        } else {
            operand1 = dajBroj(rezultat.get());
            rezultat.set("");
            operator = s;
        }
    }

    public void plus(ActionEvent actionEvent){
        operacija("+");
    }

    public void minus(ActionEvent actionEvent){
        operacija("-");
    }

    public void puta(ActionEvent actionEvent){
        operacija("*");
    }

    public void podjeljeno(ActionEvent actionEvent){
        operacija("/");
    }

    public void modulo(ActionEvent actionEvent){
        operacija("%");
    }

    public void jednako(ActionEvent actionEvent){
        operacija("=");
    }

}
