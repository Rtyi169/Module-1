abstract class Celestial_Body {
    private static String designation;
    private int orbitTime;

    public Celestial_Body(int orbitTime, String designation) {
    }

    public void CelestialBody(int orbitTime, String designation) {
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public static String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public abstract boolean equals(Object o);

    public abstract String toString();
}