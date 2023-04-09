package A38_AbstractKeyword.Task3;


import A35_Tasks_Inheritance.Task4.Gender;

public abstract class Animal {


    private int id;

    private String name;
    private String colour;
    private int age;
    private Gender gender;
    private String originCountry;


    public abstract String noise();

    public abstract String eat();

    public abstract double sleep();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String toString() {

        return  "\n" + getClass().getSimpleName() +
                "\nId :"	+ this.getId() +
                "\nName :" + this.getName() +
                "\nColour :" + this.getColour() +
                "\nAge :" + this.getAge() +
                "\nGender :" + this.getGender() +
                "\nOrgin Country :" + this.getOriginCountry() +
                "\nNoise :" + this.noise() +
                "\nEat :" + this.eat() +
                "\nSleep :" + this.sleep();

    }


}
