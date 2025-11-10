//week 10 question 2
//Create class Edible.
//Within that define two static classes Fruit and Vegetable.
//Fruit class will have two methods- fruitDetails() is a static
//method and fruitPackaging() is a non-static method.
//Vegetable class also has similar methods - vegetableDetails() and vegetablePackaging().
//Call all the four methods from main method.

class Edible {

    static class Fruit {
        static void fruitDetails() {
            System.out.println("Fruit: Mango, rich in Vitamin A.");
        }

        void fruitPackaging() {
            System.out.println("Fruit Packaging: Packed in 1kg eco boxes.");
        }
    }

    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("Vegetable: Carrot, rich in Vitamin A.");
        }

        void vegetablePackaging() {
            System.out.println("Vegetable Packaging: Packed in mesh bags.");
        }
    }

    public static void main(String[] args) {
        Fruit.fruitDetails(); // static method
        Fruit fruit = new Fruit();
        fruit.fruitPackaging();

        Vegetable.vegetableDetails(); // static method
        Vegetable veg = new Vegetable();
        veg.vegetablePackaging();
    }
}
