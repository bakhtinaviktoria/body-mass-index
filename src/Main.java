public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int index = service.calculate(1.67, 50); // должно получиться 17
        System.out.println(index);
    }
}