public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60;
        double massIndex = service.calculate(weight);
        System.out.println("Вес тела: " + weight);
        System.out.println("Индекс массы тела: " + massIndex);
    }
}

