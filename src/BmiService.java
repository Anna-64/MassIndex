public class BmiService {
    public double calculate(double weight, double height) {
        double heightSquared = Math.pow(height, 2);
        double massIndex = weight / heightSquared;
        return massIndex;
    }
}

