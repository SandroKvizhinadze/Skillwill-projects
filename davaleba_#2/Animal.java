public class Animal {
    public static void main(String[] args){
        System.out.println(AnimalScanner("dog")); // გატესტვა;
    }

    //მეთოდი რომელსაც გადაეცმემა ცხოველის სახელი სტრინგად;
    static String AnimalScanner(String animal){
        // პირობა რომელიც ამოიცნობს ცხოველებს;
        switch (animal){
            case "dog":
                return "l am the dog";
            case "cat":
                return "l am the cat";
            case "lion":
                 return "l am the lion";
            case "pig":
                 return "l am the pig";
            default:
                 return  "l Am an Animal"; // სხვა ცხოველების შემთხვევაში

        }
    }
}