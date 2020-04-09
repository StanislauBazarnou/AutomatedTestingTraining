package by.epam.learn.main.tasks3_1;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer(1, "Ivanov", "Bivan", "Strasse 1/15", 1623, 22631976),
                new Customer(2, "Vano", "Diva", "Strasse 2/15", 274, 32631976),
                new Customer(3, "Pivano", "Reva", "Strasse 3/15", 456, 32631976),
                new Customer(4, "Avan", "Sivanap", "Strasse 4/15", 42, 32631976),
                new Customer(5, "Riva", "Manop", "Strasse 5/15", 7, 32631976),
        };

//        CustomerUtil.alphabetCustomerFilter(customers);

        CustomerUtil.creditCardNumberSearch(customers);
    }
}
