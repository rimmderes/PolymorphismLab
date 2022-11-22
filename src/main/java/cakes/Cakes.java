package cakes;

public abstract class Cakes {

    protected String name;
    protected String baseFlavour;

    protected boolean healthier;

    protected String eggsBased;

    public Cakes(String name, String baseFlavour, boolean healthier, String eggsBased) {
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


    public String isEggsBased() {
        return eggsBased;
    }

    private void setEggsBased(String eggsBased) {
        this.eggsBased = eggsBased;
    }




}
