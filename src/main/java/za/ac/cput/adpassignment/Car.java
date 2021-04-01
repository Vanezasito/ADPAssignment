//Ra'ees Manuel 219074089

package za.ac.cput.adpassignment;

import java.util.Objects;

public class Car
{
    private String color;
    private int model;

    public Car (String color, int model)
    {
        this.setColor(color);
        this.setModel(model);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model == car.model && Objects.equals(color, car.color);
    }
}
