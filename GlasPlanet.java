import java.awt.*;

abstract class GlasPlanet extends Planet{
    private boolean hasRings;
    private Color color;

    public GlasPlanet(int orbitTime, String designation, boolean hasRings) {
        super(orbitTime, designation, hasRings);
    }
}