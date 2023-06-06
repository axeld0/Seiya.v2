package Model.ENUM;

public enum SpecialTechniques {


    METEORO("Meteoro de pegaso"),COMETA("Cometa de pegaso"), PEGASUS_FIST("Pegasus Fist"),
    FUERZA_DEL_DRAGON("Dragon force"), DRAGON_RAGE ("Dragon Rage"), ASCENDING_DRAGON("This is the Ascending dragon tech."),

    DIAMOND_DUST("Diamondo Dusto"), AURORA_RAY("Aurora Ray"), ICE_RAY("Ice ray");



    private String description;

        private SpecialTechniques(String description)
        {
            this.description = description;
        }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "SpecialTechniques{" +
                "description='" + description + '\'' +
                "} " + super.toString();
    }
}
