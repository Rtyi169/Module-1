import java.util.ArrayList;
import java.util.Objects;

abstract class Moon extends Celestial_Body {
    private Planet planet;
    private boolean atmosphere;
    private String color;
    public Moon(Planet planet, int orbitTime, boolean atmosphere, String color, String designation) {
        super(orbitTime, designation);
        this.planet = planet;
        this.atmosphere = atmosphere;
        this.color = color;
    }
    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moon)) return false;
        Moon moon = (Moon) o;
        return isAtmosphere() == moon.isAtmosphere() && Objects.equals(getDesignation(), moon.getDesignation()) && Objects.equals(getPlanet(), moon.getPlanet()) && Objects.equals(getColor(), moon.getColor());
    }

    @Override
    public String toString() {
        return "Moon{" +
                "designation='" + getDesignation() + '\'' +
                ", planet=" + Planet.getDesignation() +
                ", orbitTime=" + getOrbitTime() +
                ", atmosphere=" + atmosphere +
                ", color='" + color + '\'' +
                '}';
    }
}

