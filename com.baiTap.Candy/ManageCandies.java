import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCandies {
    List<Candies> candiesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayCandies() {
        for (Candies c : candiesList) {
            System.out.println(c);
        }
    }

    public void displayCandiesById(int id) {
        for (Candies c : candiesList) {
            if (c.getId() == id) {
                System.out.println("----------");
                System.out.println(String.format(" Id: %s \n Color: %s \n Featured: %s \n Quantity: %s \n Price: %s", c.getId(), c.getColors(), c.getFeatured(),
                        c.getQuantity(), c.getPrice()));
                System.out.println("----------");
                break;
            }
        }
    }

    public void addCandies() {
        boolean flagId = true;
        Candies candies = new Candies();
        System.out.println("Enter ID: ");
        while (true) {
            int id = 0;
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (Candies c : candiesList) {
                    if (c.getId() == id) {
                        System.out.println("ID exist!");
                        flagId = false;
                        break;
                    }
                    flagId = true;
                }
            } catch (Exception e) {
                System.out.println("ID is value int !!!");
                System.out.println(e.getMessage());
                flagId = false;
            }
            if (flagId) {
                candies.setId(id);
                break;
            }
        }
        System.out.println("Enter Color");
        String color = scanner.nextLine();
        while (true) {
            if (color == null || color.trim().equals("")) {
                System.out.println("Color is not available!");
                continue;
            }
            candies.setColors(color);
            break;
        }

        System.out.println("Enter Featured: ");
        String featured = scanner.nextLine();
        while (true){
            candies.setFeatured(featured);
            break;
        }




        System.out.println("Enter Quantity: ");
        try {
            int quantity = Integer.parseInt(scanner.nextLine());
            candies.setQuantity(quantity);

        } catch (Exception e) {
            System.out.println("Quantity is value int");
            System.out.println(e.getMessage());
        }

        System.out.println("Enter price");
        try {
            double price = scanner.nextDouble();
            candies.setPrice(price);
        } catch (Exception e) {
            System.out.println("Price is number");
            System.out.println(e.getMessage());
        }
        candiesList.add(candies);
    }

    public void findCandiesById() {

        System.out.println("Enter Id: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            for (Candies c : candiesList) {
                if (c.getId() == id) {
                    displayCandiesById(c.getId());
                }
            }
        } catch (Exception e) {
            System.out.println("Id is value int !!!");
            System.out.println(e.getMessage());
        }
    }

    public void deleteCandiesById() {
        System.out.println("Enter Id: ");
        try {
            List<Candies> newCandies = new ArrayList<>();
            int id = Integer.parseInt(scanner.nextLine());
            for (Candies c : candiesList) {
                if (c.getId() == id) {
                    continue;
                }
                newCandies.add(c);
            }
            candiesList = newCandies;
        } catch (Exception e) {
            System.out.println("Id is value int !!!");
            System.out.println(e.getMessage());
        }
    }

    public void editCandiesById() {
        boolean flagEdit = false;
        System.out.println("Enter Id: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            for (Candies c : candiesList){
                if (c.getId() == id){
                    flagEdit = true;
                    System.out.println("Enter color: ");
                    String color = scanner.nextLine();
                    while (true){
                        if (color ==null || color.trim().equals("")){
                            System.out.println("Color is not available!");
                            continue;
                        }
                        c.setColors(color);
                        break;
                    }

                    System.out.println("Enter Featured: ");
                    try {
                        String featured = scanner.nextLine();
                        c.setFeatured(featured);
                    }catch (Exception e){
                        System.out.println("Featured is not available!!!");
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Enter Quantity: ");
                    try {
                        int quantity = Integer.parseInt(scanner.nextLine());
                        c.setQuantity(quantity);
                    }catch (Exception e){
                        System.out.println("Featured is not available!!!");
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Enter price: ");
                    try {
                        double price = scanner.nextDouble();
                        c.setPrice(price);
                    }catch (Exception e){
                        System.out.println("Featured is not available!!!");
                        System.out.println(e.getMessage());
                    }

                }
                if (!flagEdit){
                    System.out.println("Candy is not find");
                }
            }
        }catch (Exception e){
            System.out.println("Id does not exist");
            System.out.println(e.getMessage());
        }
    }
}
