//Java Program to demostrate encapsulation
public class Encapsulation {
    /*private variables declared
    these can only be accessed by
    public methods of class*/

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    private String Name;
    private int Roll;
    private int Age;

}
