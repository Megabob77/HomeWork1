package Exercise4;

public class Address {
    public static void main(String[] args) {
        Address address1 = new Address();
        Address1.setIndex(2222);
        Address1.setCountry("Ukreine");
        Address1.setCity("Kyiv");
        Address1.setStreet("Mayakovskogo.str");
        Address1.setHouse(67);
        Address1.setApartments(44);
    }
    
    class Address1 {
        private static int index;
        private static String country;
        private static String city;
        private static String street;
        private static int house;
        private static int apartments;


        public static int getIndex() {
            return index;
        }

        public static void setIndex(int userIndex) {
            index = userIndex;
        }


        public static String getCountry() {
            return country;
        }

        public static void setCountry(String userCountry) {
            country = userCountry;
        }


        public static String getCity() {
            return city;
        }

        public static void setCity(String userCity) {
            city = userCity;
        }


        public static String getStreet() {
            return street;
        }

        public static void setStreet(String userStreet) {
            street = userStreet;
        }


        public static int getHouse() {
            return house;
        }

        public static void setHouse(int userHouse) {
            house = userHouse;
        }


        public static int getApartments() {
            return apartments;
        }

        public static void setApartments(int userApartments) {
            apartments = userApartments;

            System.out.println("Индекс: " + getIndex() + "  Страна: " +
                    getCountry() + "  Город: " +
                    getCity() + "  Улица: " +
                    getStreet() + "  Дом: " +
                    getHouse() + "  Квартира: " +
                    getApartments());
        }

    }
}







