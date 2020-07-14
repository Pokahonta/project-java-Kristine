package Model;

public class Room {
    //svoistva (parametri)//

    private double height;
    private double width;
    private double lenght;
    //v boolean vsegda is - skprawivaet//
    private boolean isLightOn;
    //dlja kazhdoj peremennoj getter, setter//
    //osnovnoj funkcional Alt+insert; Getter and Setter//



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public void setLightOn(boolean lightOn) {
        isLightOn = lightOn;
    }
}
