import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<Animal> animals = new ArrayList<>();
    Animal[] Animal;
    public static void main(String[] args) {

    }
    public void addAnimal(){
        boolean flagNames = true;
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of Animal");
        while (true){
            String name = " ";
            try {
                name = scanner.nextLine();
                for (Animal a : animals){
                    if(name.trim().equals(name)){
                        System.out.println("Tên đã tồn tại!");
                        flagNames = false;
                        break;
                    }
                    flagNames = true;
                }
            } catch (Exception e){
                System.out.println("Wrong value");
                System.out.println(e.getMessage());
                flagNames = false;
            }
            if (flagNames){
                animal.setName(name);
                break;
            }
        }
        System.out.println("Enter age");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            animal.setAge(age);
        }catch (Exception e){
            System.out.println("Wrong value!!");
            System.out.println(e.getMessage());
        }
        animals.add(animal);
    }

    public void deleteAnimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name Animal");
        try {
            List<Animal> newAnimal = new ArrayList<>();
            String name = scanner.nextLine();
            for (Animal a : animals){
                if (name.trim().equals(name)){
                    continue;
                }
                newAnimal.add(a);
            }
            animals = newAnimal;
        }catch (Exception e){
            System.out.println("Name is value Int");
            System.out.println(e.getMessage());
        }
    }
    public void editAnimal(){
        Scanner scanner = new Scanner(System.in);
        boolean flagEdit = false;
        System.out.println("Enter Name");
        try {

            String name = scanner.nextLine();
            for (Animal a : animals){
                if (name.trim().equals(name)){
                    flagEdit = true;
                    System.out.println("Enter Name");
                    String newName = scanner.nextLine();
                    while (true){
                        if (newName == null || name.trim().equals("")){
                            System.out.println("Name illegal");
                            continue;
                        }
                        a.setName(newName);
                        break;
                    }
                }
            }
        }
    }
}
