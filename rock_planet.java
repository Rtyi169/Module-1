import java.awt.*;
abstract class rock_planet extends Planet{
    private boolean habbitable;
    private boolean isHabbitable;
    public void setHabbitable(boolean habbitable) {
        this.habbitable = habbitable;
    }

    @Override
    public String toString() {
        return null;
    }

    public rock_planet(int orbitTime, String designation, boolean habbitable) {
        super(orbitTime, designation, habbitable);
    }
}

