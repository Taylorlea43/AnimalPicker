import java.util.Scanner;

public class animalpicker{
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to see a cat or a dog? type 'c' for cat or 'd for dog:");
    String animal = scanner.next();

    while(animal != "c" || animal != "d"){
    if(animal.contains("c")){
        System.out.println(" /\\_/\\\n( o.o )\n > ^ <");
        return;
    }else if(animal.contains("d")){
        System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
        return;
    }else{
        System.out.println("Error: invalid animal, please enter 'c' or 'd'");
        animal = scanner.next();
    }
}
    

}

}