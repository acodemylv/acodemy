package practice.homework;

public class FirstHomeWork {

    public static void main(String[] args) {

        String name = "Nikita";
        String lastName = "Milka";
        int yearsOld = 27;

        System.out.println("My name is: " + name + " " + lastName + "." + " I am " + yearsOld + " years old");

        String text = String.format("My name is: %s %s. I am %d years old", name, lastName, yearsOld);
        System.out.println(text);

        System.out.printf("My name is: %s %s. I am %d years old\n", name, lastName, yearsOld);

        char n = 'n';
        char i = 'i';

        int nameCharacterCount = name.length();
        System.out.println(nameCharacterCount);

    }

}
