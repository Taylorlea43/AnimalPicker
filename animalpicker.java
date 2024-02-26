import java.util.Scanner;

public class animalpicker{
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to see a cat, a dog, a fish, or an ardvark? Type 'c' for cat, 'd for dog, 'f' for fish, or 'a' for ardvark:");
    String animal = scanner.next();

    while(animal != "c" || animal != "d" || animal != "f" || animal != "a"){
    if(animal.contains("c")){
        System.out.println(" /\\_/\\\n( o.o )\n > ^ <");
        return;
    }else if(animal.contains("d")){
        System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
        return;
    }else if(animal.contains("f")){
        System.out.println("      .            \n\\_____)\\_____\n/--v____ __`<         \n        )/           \n        \'");
        return;
    }else if(animal.contains("a")){
        System.out.println("      _.---._    /\\\\\n    ./\'       \"--`\\//\n  ./              o \\\n /./\\  )______   \\__ \\\n./  / /\\ \\   | \\ \\  \\ \\\n   / /  \\ \\  | |\\ \\  \\7\n    \"     \"    \"  \"     ");
        return;  
    }else{
        System.out.println("Error: invalid animal, please enter 'c', 'd', 'f', or 'a'.");
        animal = scanner.next();
    }
}

}

}