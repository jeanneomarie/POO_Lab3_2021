public class ComparisonsOnObjects {
    public static void main(String[] args) {

        Book book1 = new Book("Title1", 50);
        Book book2 = new Book("Title1", 50);
        Book book3 = book1;

        if(book1.equals(book2)){
            System.out.println("Books 1-2 equal"); // THIS
        }
        else {
            System.out.println("Books 1-2 not equal");
        }

        if(book1 == book2){
            System.out.println("Books 1-2 ==");
        }
        else {
            System.out.println("Books 1-2 !="); // THIS
        }


        if(book1.equals(book3)){
            System.out.println("Books 1-3 equal"); // THIS
        }
        else {
            System.out.println("Books 1-3 not equal");
        }

        if(book1 == book3){
            System.out.println("Books 1-3 ==");; // THIS
        }
        else {
            System.out.println("Books 1-3 !=");
        }
    }
}
