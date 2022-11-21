public abstract class Cakes {

    private String name;
    private String baseFlavour;

    private boolean healthier;

    private boolean eggsBased;

    public Cakes(String name, String baseFlavour, boolean healthier, boolean eggsBased) {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.healthier = healthier;
        this.eggsBased = eggsBased;
    }


    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public boolean isHealthier() {
        return healthier;
    }

    private void setHealthier(boolean healthier) {
        this.healthier = healthier;
    }


    public boolean isEggsBased() {
        return eggsBased;
    }

    private void setEggsBased(boolean eggsBased) {
        this.eggsBased = eggsBased;
    }




}
