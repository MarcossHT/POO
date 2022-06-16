public class Main {
    public static void main(String[] args) {
        Veleiro veleiro1 = new Veleiro("Queen Mary",2000.00, 10, 2019, 2);
        Veleiro veleiro2 = new Veleiro("Imperator",4000.00, 25, 2021, 5);
        Veleiro veleiro3 = new Veleiro("The journey",1500.00, 9.5, 2017, 2);

        Iate iate1 = new Iate("Happines",5000.00, 25.00, 2020, 5);
        Iate iate2 = new Iate("Fortune",10000.50, 35, 2021, 10);
        Iate iate3 = new Iate("Endurance",3000.00, 18.5, 2017, 4);

        Capitao capitao = new Capitao("Johny", "Maverick", 535);

        capitao.addIate(iate1);
        capitao.addIate(iate2);
        capitao.addIate(iate3);

        capitao.addVeleiro(veleiro1);
        capitao.addVeleiro(veleiro2);
        capitao.addVeleiro(veleiro3);

        veleiro2.setValorAdc(550.50);
        iate2.setValorAdc(750.25);

        capitao.fullName();
        capitao.showVeleiros();
        capitao.iatesLux();

    }
}