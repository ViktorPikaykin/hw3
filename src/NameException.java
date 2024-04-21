public class NameException extends Exception{
    public NameException() {
    }

    public void nameException(String i) {
        System.out.println("Exception: NameNotCorrectFormat");
        System.out.printf("Это неправильный формат: %s", i);
        System.out.println();
    }
}