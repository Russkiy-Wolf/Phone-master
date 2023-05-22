public class Main {

    public static void main(String[] args) {
        long number = 0;
        String str = "";
        Phone ph1 = new Phone();

        Phone ph2 = new Phone();

        Phone ph3 = new Phone();

        Phone ph = new Phone();

        System.out.print("Введите 1 телефона: ");

        ph1.Number = ph1.setNumber(number);

        System.out.print("Введите модель: ");

        ph1.model = ph1.setModel();

        System.out.print("Вес: ");

        ph1.weight = ph1.setNumber();

        System.out.print("Введите 2 телефона: ");

        ph2.Number = ph2.setNumber();

        System.out.print("Введите модель: ");

        ph2.model = ph2.getModel();

        System.out.print("Вес: ");

        ph2.weight = ph2.getNumber();

        System.out.print("Введите 3 телефона: ");

        ph3.Number = ph3.getNumber();

        System.out.print("Введите модель: ");

        ph3.model = ph3.getModel();

        System.out.print("Вес: ");

        ph3.weight = ph3.getNumber();

        System.out.println(ph1.Number + "   " + ph1.model + "   " + ph1.weight);   //3

        System.out.println(ph2.Number + "   " + ph2.model + "   " + ph2.weight);   //3

        System.out.println(ph3.Number + "   " + ph3.model + "   " + ph3.weight);   //3

        System.out.println();

        ph1.receiveCall();

        ph1.getNumber();

        System.out.println();

        ph2.receiveCall();

        ph2.getNumber();

        System.out.println();

        ph3.receiveCall();

        ph3.getNumber();

        System.out.println();

        ph1 = new Phone(ph1.Number, ph1.model, ph1.weight);

        ph2 = new Phone(ph2.Number, ph2.model);

        ph.receiveCall(ph1.name, ph1.Number);

        ph.sendMessage(ph2.Number, ph3.Number);
    }
}