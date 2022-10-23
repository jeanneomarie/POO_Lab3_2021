public class ComparisonsOnStrings {
    public static void main(String[] args) {
        // CONDITION ? TRUE CASE : FALSE CASE
        System.out.println(2 == 2 ? "true" : "false");

        // == vs equals
        // == compares references
        // equals compares properties, in case of objects we must override it!
        String name1 = "POO"; // POO
        String name2 = "PO"; //  PO
        name2 += "O"; // POO

        String name3 = "POO";
        String name4 = new String("POO"); // see with the debugger the memory issue

        if (name1.equals(name2)) {
            System.out.println("1-2 equal"); // THIS
        } else {
            System.out.println("1-2 not equal");
        }

        if (name1 == name2) {
            System.out.println("1-2 ==");
        } else {
            System.out.println("1-2 !="); // THIS
        }

        if (name1 == name3) {
            System.out.println("1-3 =="); // THIS
        } else {
            System.out.println("1-3 !=");
        }

        if (name1 == name4) {
            System.out.println("1-4 ==");
        } else {
            System.out.println("1-4 !="); // THIS
        }
    }
}
