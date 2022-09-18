import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductMap {

    HashMap<String,Car>automatas=new HashMap<>();

    public ProductMap(HashMap<String, Car> automatas) {
        this.automatas = automatas;
    }

        public void busquedaAutomata(String automata){
        try {
            Car car = automatas.get(automata);
            System.out.println(car.toString());
        }catch(NullPointerException e){

            System.out.println("No se ha encontrado ningun automata con ese nombre");
        }


    }
}
