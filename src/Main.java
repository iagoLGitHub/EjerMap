import java.util.HashMap;


public class Main {



    public static void main(String[] args) {

        HashMap<String,Car>automatas=new HashMap<>();

        Car ibiza=new Car("Ibiza","rojo","2022");
        Car arona=new Car("Arona","negro","2019");
        Car leon=new Car("leon","rojo","2020");
        Car ateca=new Car("Ateca","verde","2022");
        Car tarraco=new Car("Tarraco","gris","2021");

        automatas.put("ibiza",ibiza);
        automatas.put("arona",arona);
        automatas.put("leon",leon);
        automatas.put("ateca",ateca);
        automatas.put("tarraco",tarraco);

        ProductMap mapa=new ProductMap(automatas);


        mapa.busquedaAutomata("Tarraco");


    }
}