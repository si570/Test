
import java.util.Scanner;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
     ArrayList<String>Product=new ArrayList<>();
        ArrayList<double>Price=new ArrayList<>();
        ArrayList<int>Quantity=new ArrayList<>();

     Product.add("Book");
        Product.add("Eletronics");
        Product.add("Watches");
        Product.add("Cars");

        Price.add(5.99);
        Price.add(350.22);
        Price.add(85.45);
        Price.add(45600.89);

        Quantity.add(600);
        Quantity.add(1000);
        Quantity.add(9000);
        Quantity.add(750);




        System.out.println("Enter A product(Books,Electronics,Watches,Cars): ");
        String first =scan1.toString();
        System.out.println("You entered: "+ first);



        if(first == "Books"){
            System.out.println("The price is: " + Price.get(0));
        }
        if(first == "Electronics"){
            System.out.println("The price is: " + Price.get(1));
        }
        if(first == "Watches"){
            System.out.println("The price is: " + Price.get(2));
        }
        if(first == "Cars"){
            System.out.println("The price is: " + Price.get(3));
        }

        if(first == "Books"){
            System.out.println("The Quantity is: " + Quantity.get(0));
        }
        if(first == "Electronics"){
            System.out.println("The Quantity is: " + Quantity.get(1));
        }
        if(first == "Watches"){
            System.out.println("The Quantity is: " + Quantity.get(2));
        }
        if(first == "Cars"){
            System.out.println("The Quantity is: " + Quantity.get(3));
        }

        System.out.println("Add a product");
        String Userin =scan1.toString();

        System.out.println("Update product"+ Product.get());
        String Userinp =scan1.toString();

        Product.set(0,Userinp);
        Product.set(1,Userinp);
        Product.set(2,Userinp);
        Product.set(3,Userinp);

        System.out.println("All products" + Product.get(0) + Product.get(1) + Product.get(2) + Product.get(3));


        System.out.println("press E to Exit: ");
        String Userinpu =scan1.toString();

        if(Userinpu == "E"){
            //myscan.exit
        }


    }
}
