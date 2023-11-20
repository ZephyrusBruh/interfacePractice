public class Bird implements Animal{

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public String move() {
        return "I'm flying!";
    }
}
