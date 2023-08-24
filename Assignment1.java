
import java.util.Scanner;

public class Assignment1 {

    public static void main(String args[]) {
        // allow user to use keybaord input
        Scanner sc = new Scanner(System.in);
        //peopleNo =number of people , sliceNeed= user need how many slices of pizza , 
        //hungryLevelCode= the hungry list code, quantity= the pizzas amount 
        int peopleNo = 0, pizzaCode = 0, sliceNeed = 0, hungryLevelCode = 0, quantity=0;
        // hungryLevel_Checking= purpose to check the hungry level code
        boolean hungryLevel_Checking = true;
        //for calculating the pizza prices
        double price = 0.0, totalPrice = 0.0;
        // for decision making and display the hungry type
        String choice = " ", hungryLabel = " ";

        // display the header
        printWelcomeHeading();

        //use do while loop to avoid user enter exceed 99 people and also less then 1 person
        do {    //prompt user to enter number of people
            System.out.print("Enter number of people: ");
            peopleNo = sc.nextInt();

            // use if else to identify the number of people
            if (peopleNo >= 1 && peopleNo <= 99); // if less then, output the re-enter
            else if (peopleNo <= 0) {
                System.out.println("You entered less then 1 person!");
                System.out.println("Please Re-Enter...\n");
            } // if more then, output the re-enter
            else if (peopleNo >= 100) {
                System.out.println("You entered more then 99 people!");
                System.out.println("Please Re-Enter...\n");
            } else {
                System.out.println("Please enter correct value");
            }
            // loop again went number of people more then 99 or less then 1
        } while (peopleNo <= 0 || peopleNo > 99);

        // print out the hungry list to user as a reference 
        printHungryLevelList();

        //use do while loop to avoid user enter wrong code
        do {    //prompt user to enter thr hungry list code
            System.out.print("\nEnter your hungry level [1/2/3]:");
            hungryLevelCode = sc.nextInt();

            //use if else to identify the hungry list code
            // store the slice number and also the hungry phrase
            switch (hungryLevelCode) {
                case 1 -> {
                    hungryLabel = "light";
                    sliceNeed = peopleNo * 1; //calculate the slices need from the user
                    hungryLevel_Checking = true;  //boolean use for checking the code
                }
                case 2 -> {
                    hungryLabel = "medium";
                    sliceNeed = peopleNo * 2;
                    hungryLevel_Checking = true;
                }
                case 3 -> {
                    hungryLabel = "ravenous";
                    sliceNeed = peopleNo * 4;
                    hungryLevel_Checking = true;
                }
                default -> {
                    System.out.println("Enter wrongly! Please Re-Enter.");
                    hungryLevel_Checking = false;
                }
            }
            // if the boolean is false it will continue looping
            // if the code not in the hungry list will display it
                    } while (hungryLevel_Checking!= true);
        // display pizza menu
        printMenu();
               
        //use do while for looping
        do {    //prompt user to enter the pizza code
            System.out.print("\nEnter the Pizza Code you want[1/2/3/...]: ");
            pizzaCode = sc.nextInt();
            
            //use switch to identify the pizza
            switch (pizzaCode) {
                case 1 -> {
                    //inform user have ordered the pizza
                    System.out.println("You have ordered a Lee Pizza with 4 slices!");
                    price = 10; //store the pizza price in price variable
                    // use if else statement to extrat the whole number and decimal
                    /// if the number of slice can be module by 4
                    // it indicates as whole number and the number of slices are suit for 4 slices pizza
                    if ( sliceNeed%4==0){
                        quantity= sliceNeed/4; //take the number of slice diveded by 4 (constant) slices pizza
                    }
                    // else the number of slices have remainders it will go
                    //to else stament
                    //then remainder means that the number of slices will more than the 4 slices pizza
                    else
                        quantity= sliceNeed/4+1; // so the quantity has to add 1 to increase 1 pizza
                    // calculate the total price of the pizza needed
                    totalPrice = price * quantity;
                }
                case 2 -> {
                    System.out.println("You have ordered a Chicago Pizza with 4 slices!");
                    price = 15;
                    if ( sliceNeed%4==0){
                        quantity= sliceNeed/4;
                    }
                    else
                        quantity= sliceNeed/4+1;
                    
                    totalPrice = price * quantity;
                }
                case 3 -> {
                    System.out.println("You have ordered a New York-Style Pizza with 6 slices!");
                    price = 20;
                    if ( sliceNeed%6==0){
                        quantity= sliceNeed/6;
                    }
                    else
                        quantity= sliceNeed/6+1;
                    totalPrice = price * quantity;
                }
                case 4 -> {
                    System.out.println("You have ordered a Sicilian Pizza with 6 slices!");
                    price = 10;
                    if ( sliceNeed%6==0){
                        quantity= sliceNeed/6;
                    }
                    else
                        quantity= sliceNeed/6+1;
                    totalPrice = price * quantity;
                }
                case 5 -> {
                    System.out.println("You have ordered a Greek Pizza with 8 slices!");
                    price = 14;
                    if ( sliceNeed%8==0){
                        quantity= sliceNeed/8;
                    }
                    else
                        quantity= sliceNeed/8+1;
                    totalPrice = price * quantity;
                }
                case 6 -> {
                    System.out.println("You have ordered a California Pizza with 8 slices!");
                    price = 24;
                    if ( sliceNeed%8==0){
                        quantity= sliceNeed/8;
                    }
                    else
                        quantity= sliceNeed/8+1;
                    totalPrice = price * quantity;
                }
                case 7 -> {
                    System.out.println("You have ordered a Detroit Pizaa with 10 slices!");
                    price = 9;
                    if ( sliceNeed%10==0){
                        quantity= sliceNeed/10;
                    }
                    else
                        quantity= sliceNeed/10+1;
                    totalPrice = price * quantity;
                }
                case 8 -> {
                    System.out.println("You have ordered a Neapolitan Pizza with 10 slices!");
                    price = 12;
                    if ( sliceNeed%10==0){
                        quantity= sliceNeed/10;
                    }
                    else
                        quantity= sliceNeed/10+1;                    
                    totalPrice = price * quantity;
                }// if pizza code can't be founded will display try again.
                default ->
                    System.out.println("The pizza Code Can't be found! Please try again...");
     
            }
          
            printLine("~ ", 30);
            // after identify the pizza
            // system will display the number of people user typed and also
            // the hungry type, number of slices, number of pizzas needed. 
            System.out.printf("There are %d %s hungry people, then %d slices are needed or %d pizzas that you have slected.\n", peopleNo, hungryLabel, sliceNeed, quantity);
            //print out the total price
            System.out.printf("Beloved Customer, the total amount is (RM%.2f x %dpizzas)-> RM%.2f !\n\n", price,quantity,totalPrice);
            // prompt user to enter whether user want continue or no
            while(!"N".equalsIgnoreCase(choice)||!"Y".equalsIgnoreCase(choice)){     
                System.out.print("Do you want to continue [Y/N]: ");
                choice = sc.next();

                    if("N".equalsIgnoreCase(choice)||"Y".equalsIgnoreCase(choice))
                        break;
                    else      
                        System.out.println("Enter wrongly! Please Re-Enter.");
                }

            // only user enter N/n then it will stop continuing
        } while (!"N".equalsIgnoreCase(choice));
        System.out.println("\nSee you! Have a nice day!! ");
    }

    // displaying the line
    public static void printLine(String line, int num) {

        for (int i = 1; i <= num; i++) {
            System.out.print(line);
        }

        System.out.println();
    }

    public static void printWelcomeHeading() {
        System.out.println("   Welcome to Lee Pizza Calculator House!");
        printLine("-", 45);

    }

    public static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Lee Pizza [4 slices]---------------- RM 10.00");
        System.out.println("2. Chicago Pizza [4 slices]------------ RM 15.00");
        System.out.println("3. New York-Style Pizza [6 slices]----- RM 20.00");
        System.out.println("4. Sicilian Pizza [6 slices]----------- RM 10.00");
        System.out.println("5. Greek Pizza [8 slices]-------------- RM 14.00");
        System.out.println("6. California Pizza [8 slices]--------- RM 24.00");
        System.out.println("7. Detroit Pizaa [10 slices]----------- RM  9.00");
        System.out.println("8. Neapolitan Pizza [10 slices]-------- RM 12.00");

    }

    public static void printHungryLevelList() {
        System.out.println("\nHungry Level List:");
        System.out.println("1) Light- 1 slice per person");
        System.out.println("2) Medium- 2 slice per person");
        System.out.println("3) Ravenous- 4 slice per person");

    }

}
