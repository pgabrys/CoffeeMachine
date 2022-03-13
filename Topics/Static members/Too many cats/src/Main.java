
class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;
    static final int MAXIMUM_NUMBER_OF_CATS = 5;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > MAXIMUM_NUMBER_OF_CATS) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}