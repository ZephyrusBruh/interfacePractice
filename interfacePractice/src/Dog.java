public class Dog implements Animal,Devilish{

    @Override
    public String makeSound() {
        return "Bark";
    }
    @Override
    public String move() {
        return "I'm running!";
    }
    @Override
    public String misbehave(String woah) {
        return "I chewed up your " + woah;
    }
}
