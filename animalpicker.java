import java.util.Scanner;

public class animalpicker{
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to see a cat or a dog? type 'c' for cat or 'd for dog:");
    String animal = scanner.next();

    if(animal.contains("c")){
        System.out.println("CAT ASCII ART HERE");
    }else if(animal.contains("d")){
        System.out.println("DOG ASCII ART HERE");
    }else{
        System.out.println("error: animal not found");
    }
    

}

}