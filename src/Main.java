public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    int veight = 71;
    double bodyMassIndex = service.calculate(veight);

    System.out.println(bodyMassIndex);
    }
}
