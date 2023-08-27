public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetres = 1.87;
        int weightKg = 98;
        int result_myIndex = service.calculate(heightMetres, weightKg); // должно получиться 28
        System.out.println(result_myIndex);
    }
}
