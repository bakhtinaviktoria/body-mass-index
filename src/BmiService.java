public class BmiService {
    public int calculate(double heightInMeters, int weightInKilograms) {
        double index = weightInKilograms / (heightInMeters * heightInMeters); // расчет индекса тела
        return (int) index;
    }
}
