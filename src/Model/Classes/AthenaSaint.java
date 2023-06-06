package Model.Classes;

import Model.ENUM.SpecialTechniques;
import Model.Interfacesz.AttackAndDefend;

import java.util.HashSet;

public class AthenaSaint implements AttackAndDefend {

    private String name;

    private String constellation;

    private int age;
    private int weight;
    private int height;
    private String birthday;
    private String bloodtype;
    private String birthplace;
    private String trainingField;
    private HashSet<SpecialTechniques> specialTechniques;
    private int hp;
    private int power;


    /**constructor
     *
     * @param name
     * @param constellation
     * @param age
     * @param weight
     * @param birthday
     * @param bloodtype
     * @param birthplace
     * @param trainingField
     * @param
     * @param hp
     * @param power
     */
    public AthenaSaint(String name, String constellation, int age,int height, int weight, String birthday, String bloodtype, String birthplace, String trainingField, int hp, int power) {
        this.name = name;
        this.constellation = constellation;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.birthday = birthday;
        this.bloodtype = bloodtype;
        this.birthplace = birthplace;
        this.trainingField = trainingField;
        this.specialTechniques = new HashSet<>();
        this.hp = hp;
        this.power = power;

        loadSpecialTechniques();
    }


    public AthenaSaint()
    {
        name = "";
        constellation = "";
        age = 0;
        weight = 0;
        birthday = "";
        bloodtype = "";
        birthplace = "";
        trainingField = "";
        specialTechniques = new HashSet<>();
        hp = 0;
        power = 0;

        loadSpecialTechniques();
    }

    /**getters and setters
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getTrainingField() {
        return trainingField;
    }

    public void setTrainingField(String trainingField) {
        this.trainingField = trainingField;
    }

    public HashSet<SpecialTechniques> getSpecialTechniques() {
        return specialTechniques;
    }

    public void setSpecialTechniques(HashSet<SpecialTechniques> specialTechniques) {
        this.specialTechniques = specialTechniques;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }




    /**pre-load SpecialTechniques
     *
     */
    
    private void loadSpecialTechniques()
    {
        if(getConstellation().compareTo("Pegasus") == 0)
        {
            specialTechniques.add(SpecialTechniques.COMETA);
            specialTechniques.add(SpecialTechniques.METEORO);
            specialTechniques.add(SpecialTechniques.PEGASUS_FIST);
        }
        else if(getConstellation().compareTo("Swan") == 0)
        {
            specialTechniques.add(SpecialTechniques.AURORA_RAY);
            specialTechniques.add(SpecialTechniques.DIAMOND_DUST);
            specialTechniques.add(SpecialTechniques.ICE_RAY);
        }
        else if (getConstellation().compareTo("Dragon") == 0 )
        {
            specialTechniques.add(SpecialTechniques.DRAGON_RAGE);
            specialTechniques.add(SpecialTechniques.ASCENDING_DRAGON);
            specialTechniques.add(SpecialTechniques.FUERZA_DEL_DRAGON);
        }

    }


    /**hashcode and equals**/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AthenaSaint that)) return false;

        if (getAge() != that.getAge()) return false;
        if (getWeight() != that.getWeight()) return false;
        if (getHp() != that.getHp()) return false;
        if (getPower() != that.getPower()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getConstellation() != null ? !getConstellation().equals(that.getConstellation()) : that.getConstellation() != null)
            return false;
        if (getBirthday() != null ? !getBirthday().equals(that.getBirthday()) : that.getBirthday() != null)
            return false;
        if (getBloodtype() != null ? !getBloodtype().equals(that.getBloodtype()) : that.getBloodtype() != null)
            return false;
        if (getBirthplace() != null ? !getBirthplace().equals(that.getBirthplace()) : that.getBirthplace() != null)
            return false;
        if (getTrainingField() != null ? !getTrainingField().equals(that.getTrainingField()) : that.getTrainingField() != null)
            return false;
        return getSpecialTechniques() != null ? getSpecialTechniques().equals(that.getSpecialTechniques()) : that.getSpecialTechniques() == null;
    }

    @Override
    public int hashCode() {
        return 1;
    }


    public int compareTo(AthenaSaint saint)
    {
        int compare = 0;
        if(getPower() < saint.getPower()) {compare = -1;}
        else if(getPower() == saint.getPower()){compare = 0;}
        else if(getPower() > saint.getPower()){compare = 1;}
        return compare;
    }

    @Override
    public String AttackWithFists()
    {
        return "Pow! Fear my cosmos!";
    }

    @Override
    public String Defend()
    {
        return "Your cosmos cannot harm me.";
    }

    @Override
    public String toString() {
        return "AthenaSaint{" +
                "name='" + name + '\'' +
                ", constellation='" + constellation + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", birthday='" + birthday + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", trainingField='" + trainingField + '\'' +
                ", specialTechniques=" + specialTechniques +
                ", hp=" + hp +
                ", power=" + power +
                '}';
    }
}
