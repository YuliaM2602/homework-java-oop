package example.equals2;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private int weight;

    private int dogPassportNumber;

    public Dog(int dogPassportNumber) {
        this.dogPassportNumber = dogPassportNumber;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null) return false;

        if (getClass()!= object.getClass()) return false;
        Dog dog = (Dog)object;
        return this.dogPassportNumber == dog.dogPassportNumber;

    }
}
