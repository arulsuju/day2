public class Coach {

    private String name;
    private double experience;
    private int nom;
    private boolean isActive;

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", nom=" + nom +
                ", isActive=" + isActive +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public int getNom() {
        return nom;
    }

    public boolean isActive() {
        return isActive;
    }
}
