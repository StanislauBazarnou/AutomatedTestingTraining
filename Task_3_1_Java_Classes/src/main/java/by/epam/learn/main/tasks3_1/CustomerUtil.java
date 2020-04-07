package by.epam.learn.main.tasks3_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerUtil {

    public static void alphabetCustomerFilter(Customer[] customers) {

        Comparator<Customer> customersSurnameComparator = Comparator.comparing(Customer::getSurname);
        Arrays.sort(customers, customersSurnameComparator);

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }

    public static void creditCardNumberSearch(Customer[] customers) {
        Scanner inputInterval = new Scanner(System.in);
        int startOfInterval = inputInterval.nextInt();
        int endOfInterval = inputInterval.nextInt();
//        inputInterval.close();

        for (int i = 0; i < customers.length; i++) {
                if (startOfInterval <= customers[i].getCreditCardNumber() && customers[i].getCreditCardNumber() <= endOfInterval) {
                    System.out.println(customers[i]);
                }
        }
//            System.out.println("There are no customers in this interval");
    }
}
