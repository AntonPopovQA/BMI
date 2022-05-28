public class BmiService {
    public double calculate(int veight) {
        double growth = 1.78;
        double bodyMassIndex = veight / (growth * growth);

        return bodyMassIndex;
    }
}
