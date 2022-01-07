public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massIndex = service.calculate(60, 1.76);
        double massIndex1 = service.calculate(62, 1.75);
        System.out.println("Индекс массы тела: " + massIndex);
        System.out.println("Индекс массы тела: " + massIndex1);
    }
}

