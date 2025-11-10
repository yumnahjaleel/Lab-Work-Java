//Week 10 question 3
//3. Create three different minMaxAdd() methods
//to calculate minimum, maximum and addition of integers, real numbers and characters.

class MinMaxAdd {

    // for integers
    void minMaxAdd(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        System.out.println("Integers -> Min: " + min + ", Max: " + max + ", Sum: " + sum);
    }

    // for real numbers
    void minMaxAdd(double a, double b, double c) {
        double min = Math.min(a, Math.min(b, c));
        double max = Math.max(a, Math.max(b, c));
        double sum = a + b + c;
        System.out.println("Reals -> Min: " + min + ", Max: " + max + ", Sum: " + sum);
    }

    // for characters (based on ASCII values)
    void minMaxAdd(char a, char b, char c) {
        char min = (char) Math.min(a, Math.min(b, c));
        char max = (char) Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        System.out.println("Characters -> Min: " + min + ", Max: " + max + ", Sum(ASCII): " + sum);
    }
    public static void main(String[] args) {
        MinMaxAdd obj = new MinMaxAdd();
        obj.minMaxAdd(10, 20, 5);
        obj.minMaxAdd(3.2, 5.6, 2.1);
        obj.minMaxAdd('A', 'C', 'B');
    }
}
