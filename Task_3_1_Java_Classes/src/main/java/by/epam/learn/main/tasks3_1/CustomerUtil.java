package by.epam.learn.main.tasks3_1;

import java.util.*;

public class CustomerUtil {

    public static void alphabetCustomerFilter(Customer[] customers) {

        Comparator<Customer> customersSurnameComparator = Comparator.comparing(Customer::getSurname);
        Arrays.sort(customers, customersSurnameComparator);

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static void creditCardNumberSearch(Customer[] customers) {
        InputUtil.input();

        List<Customer> creditCardsInInterval = new ArrayList();

        for (int i = 0; i < customers.length; i++) {
            if (InputUtil.getStartOfInterval() <= customers[i].getCreditCardNumber() && customers[i].getCreditCardNumber() <= InputUtil.getEndOfInterval()) {
                creditCardsInInterval.add(customers[i]);
            }
        }

        if (creditCardsInInterval.size() > 0) {
            for (int i = 0; i < creditCardsInInterval.size(); i++) {
                System.out.println(creditCardsInInterval.get(i));
            }
        } else {
            System.out.println("In this interval " + creditCardsInInterval.size() + " customers");
        }
    }
}
