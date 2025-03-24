public class Main {
    public static void main(String[] args) {
        // Создаем 3 коробки с типами: String, Integer и Float
        Box<String, Integer, Float> box1 = new Box<>("Коробка 1", 10, 20.5f);
        Box<String, Integer, Float> box2 = new Box<>("Коробка 2", 30, 40.5f);
        Box<String, Integer, Float> box3 = new Box<>("Коробка 3", 50, 60.5f);

        // Считаем сумму чисел: берем значения Integer и Float из каждой коробки
        float sum = 0;
        sum += box1.getItem2() + box1.getItem3();
        sum += box2.getItem2() + box2.getItem3();
        sum += box3.getItem2() + box3.getItem3();

        System.out.println("Сумма всех чисел из коробок: " + sum);
    }
}
