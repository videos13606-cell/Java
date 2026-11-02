package zad6;

public class Main {
    public static void main(String[] args) {
        Property[] properties = new Property[6];
        properties[0] = new Apartment("ул. Иван Вазов 10, София", 75.5, 3);
        properties[1] = new Apartment("бул. България 45, Пловдив", 110.0, 5);
        properties[2] = new Apartment("ул. Морска 3, Варна", 62.0, 1);
        properties[3] = new House("ул. Кокиче 5, Банкя", 150.0, 450.0);
        properties[4] = new House("ул. Роза 12, Панчарево", 220.5, 600.0);
        properties[5] = new House("ул. Зелена 1, Бояна", 310.0, 800.5);

        for (Property property : properties) {
            System.out.println("Address: " + property.address + " -- Tax: " + property.calculateTax(2.5));
        }

        // Прехвърляне чрез класически for цикъл
        Rentable[] rentableProperties = new Rentable[6];

        for (int i = 0; i < properties.length; i++) {
            rentableProperties[i] = (Rentable) properties[i];
        }

        rentableProperties[0].rentOut();
        rentableProperties[1].rentOut();
        rentableProperties[2].rentOut();
        rentableProperties[2].freeUp();

        System.out.println("\nAvailable properties: ");
        for (Rentable rentable : rentableProperties) {
            if (rentable.isRented() == false) {
                System.out.println("Property: " + ((Property) rentable).address);
            }
        }
    }
}