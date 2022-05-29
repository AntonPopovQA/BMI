public class BmiService {
    public double calculate(int veight, double growth) {
        double bodyMassIndex = veight / (growth * growth);

        return bodyMassIndex;
    }
}
