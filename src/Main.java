public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    int veight = 71;
    double growth = 1.78;
    double bodyMassIndex = service.calculate(veight, growth);

    System.out.println(bodyMassIndex);
    }
}
