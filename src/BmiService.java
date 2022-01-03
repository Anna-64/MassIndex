public class BmiService {
    public double calculate(double computation) {
        double height = 1.76 * 1.76;
        double massIndex = computation / height;
        return massIndex;
    }
}

