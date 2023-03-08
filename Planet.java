import java.util.ArrayList;

abstract class Planet extends Celestial_Body {
    private ArrayList<Moon> moons;


    public ArrayList<Moon> getMoons() {
        return moons;
    }
    public Planet(int orbitTime, String designation, boolean habbitable) {
        super(orbitTime, designation);
        moons = new ArrayList<>();
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }

}


