import java.util.Scanner;

public class animalpicker{
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to see a cat, a dog, or a fish? type 'c' for cat, 'd for dog, or 'f' for fish:");
    String animal = scanner.next();

    while(animal != "c" || animal != "d" || animal != "f"){
    if(animal.contains("c")){
        System.out.println(" /\\_/\\\n( o.o )\n > ^ <");
        return;
    }else if(animal.contains("d")){
        System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
        return;
    }else if(animal.contains("f")){
        System.out.println("      .            \n\\_____)\\_____\n/--v____ __`<         \n        )/           \n        \'");
        return;
    }else{
        System.out.println("Error: invalid animal, please enter 'c' or 'd'");
        animal = scanner.next();
    }
}
    

}

}