package JavaFundamentals.ObjectsAndClassesE.VehicleCatalogue;

public class Catalogue {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    //-----------------------------------------------------------------------

    public Catalogue(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;

    }

    //----------------------------------------------------------------------------
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        String formattedType = "";
        if (this.type.equalsIgnoreCase("Car")) {
            formattedType = "Car";
        } else if (this.type.equalsIgnoreCase("Truck")) {
            formattedType = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                formattedType, this.model, this.color, this.horsepower);
    }
}
