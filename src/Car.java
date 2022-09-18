public class Car {

    private String modelo;
    private  String color;
    private String anho;

    public Car(String modelo, String color, String anho) {
        this.modelo = modelo;
        this.color = color;
        this.anho = anho;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getAnho() {
        return anho;
    }

    @Override
    public String toString() {
        return "Coche:\n" +
                "modelo:" + modelo + '\n' +
                "color: " + color + '\n' +
                "año: " + anho + '\n';
    }
}
