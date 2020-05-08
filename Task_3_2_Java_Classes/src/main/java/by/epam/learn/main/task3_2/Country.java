package by.epam.learn.main.task3_2;

public enum Country {
    CANADA ("Dollar", 30) {
        @Override
        void sayHello() {

        }
    },
    POLAND ("Zloty", 38) {
        @Override
        void sayHello() {

        }
    },
    BELARUS ("Rubles") {
        @Override
        void sayHello() {

        }
    },
    USA ("USD", 350) {
        @Override
        void sayHello() {

        }
    },
    GERMANY ("EUR", 90) {
        @Override
        void sayHello() {

        }
    },
    MONACO {
        @Override
        void sayHello() {
            System.out.println("Bon jur");
        }
    };

    String currency;
    int population;

    Country(String currency, int population) {
        this.currency = currency;
        this.population = population;
    }

    Country(String currency) {
        this.currency = currency;
    }

    Country() {
    }

//    boolean hasPopulation() {
//        return population != 0;
//    }

    abstract void sayHello();

    public static void main(String[] args) {

//        Set<Country> countries = EnumSet.allOf(Country.class);
//        for (Country country : Country.values()) {
//            System.out.println(country + " " + country.population);
//        }

//        EnumSet.of(CANADA, POLAND, BELARUS, USA, GERMANY,MONACO);
//        for (Country country : Country.values()) {
//            System.out.println(country + " " + country.currency);
//        }

        
    }
}
