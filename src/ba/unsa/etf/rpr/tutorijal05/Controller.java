package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private SimpleStringProperty rezultat;

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

    public void ispisi(ActionEvent actionEvent) {
        rezultat.set("");
    }
}
