abstract class Animal 
{
    public abstract void animalSound();
    public void sleep()
    {
        System.out.println("ZZZzzz");
    }

}
class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee wee weeeee");

    }
}
class Main
{
    public static void main(Strings[] args)
    {
        Pig myObj = new Pig();
        myObj.animalSound();
    }
}
