import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageCandies manageCandies = new ManageCandies();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("------------------------");
            System.out.println("Enter function");
            System.out.println("1: Add new candy");
            System.out.println("2: find candy by id");
            System.out.println("3: show all candies");
            System.out.println("4: edit cand by id");
            System.out.println("5: delete candy id");
            try {
                int choice = Integer.valueOf(scanner.nextLine());
                switch (choice){
                    case 1:
                        manageCandies.addCandies();
                        break;
                    case 2:
                        manageCandies.findCandiesById();
                        break;
                    case 3:
                        manageCandies.displayCandies();
                    case 4:
                        manageCandies.editCandiesById();
                        break;
                    case 5:
                        manageCandies.deleteCandiesById();
                        break;
                }
            }catch (Exception e){
                System.out.println("Enter number plssss !!!");
                System.out.println(e.getMessage());
            }
        }
    }
}
