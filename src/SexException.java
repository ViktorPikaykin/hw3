public class SexException extends Exception{
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Это неправильный формат имени: %s", i);
        System.out.println();
    }
}