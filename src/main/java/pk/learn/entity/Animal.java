package pk.learn.entity;

public class Animal {

    private String type;

    private String name;

    private double weight;

    private void giveSound(){
        System.out.println("I'm a " + type + " and my name is " + name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
