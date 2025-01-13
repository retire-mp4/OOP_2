public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор без параметров
    public Phone() {
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Перегруженный метод receiveCall
    public void receiveCall(String name, String callerNumber){
        System.out.println("Звонит " + name + " номер телефона: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.print("Отправить сообщение на номера:");
        for(String phoneNumber: phoneNumbers){
            System.out.print(phoneNumber+ " ");
        }
        System.out.println();
    }
}