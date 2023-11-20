import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class AnimalTest {
    private Animal testObj;
    @Test
    public void testDogBark(){
        testObj = new Dog();
        assertEquals("Bark", testObj.makeSound());
    }
    @Test
    public void testBirdChirp(){
        testObj = new Bird();
        assertEquals("Chirp", testObj.makeSound());
    }
    @Test
    public void testDogMove(){
        testObj = new Dog();
        assertEquals("I'm running!", testObj.move());
    }
    @Test
    public void testBirdMove(){
        testObj = new Bird();
        assertEquals("I'm flying!", testObj.move());
    }
    @Test
    public void testDogMisbehave(){
        Dog testDog = new Dog();
        String homework = "homework";
        assertEquals("I chewed up your " + homework, testDog.misbehave(homework));
    }

}