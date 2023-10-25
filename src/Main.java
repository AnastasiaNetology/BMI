public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 98;
        int bmi = service.calculate(height, weight); //должно получиться 28
        System.out.println();
        System.out.println("Индекс массы тела:");
        System.out.println(bmi);

        System.out.println("ИМТ:");
        System.out.println(service.calculate(1.53,51));
    }
}


