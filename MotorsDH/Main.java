import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("De um nome para a loja");
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();
        loja.setNome(scanner.next());


        FuncionarioHora func1 = new FuncionarioHora("Ezer", 15, 10);
        FuncionarioHora func2 = new FuncionarioHora("Moises", 30, 12);
        FuncionarioHora func3 = new FuncionarioHora("Vitor", 23, 6);

        FuncionarioMes func4 = new FuncionarioMes("Marcos");
        FuncionarioMes func5 = new FuncionarioMes("Marino");
        FuncionarioMes func6 = new FuncionarioMes("Duda");

        func1.calcPagamento(60);
        func2.calcPagamento(40);
        func3.calcPagamento(35);

        func4.calcPagamento(25);
        func5.calcPagamento(80);
        func6.calcPagamento(50);

        Moto moto1 = new Moto(2020, "Y-BR", "yamaha", "Flex", 12500, 200);
        Moto moto2 = new Moto(2021, "CG", "HONDA", "Flex", 15000, 230);

        Carro carro1 = new Carro(2019, "HB-20", "hyundai", "Flex", 57600);
        Carro carro2 = new Carro(2022, "Cruze", "Chevrolet", "Flex", 98600);

        Caminhao caminhao1 = new Caminhao(2010, "FH-440", "Volvo", "Diesel", 234990);
        Caminhao caminhao2 = new Caminhao(2017, "FH-540", "Volvo", "Diesel", 380500);

        moto1.valorEntrega(35);
        moto2.valorEntrega(40);

        carro1.locar(7);
        carro2.locar(5);

        caminhao1.locar(15);
        caminhao2.locar(10);

        loja.addFunc(func1);
        loja.addFunc(func2);
        loja.addFunc(func3);
        loja.addFunc(func4);
        loja.addFunc(func5);
        loja.addFunc(func6);
        loja.calcCustoFunc();
        loja.quantiFunc();

        try{
        loja.statusFunc("Marino");
        //loja.statusFunc("Bruno");
        }catch (ExcecaoLoja e){
            System.out.println(e.getMessage());
        }

        loja.addVeiculo(moto1);
        loja.addVeiculo(moto2);
        loja.addVeiculo(carro1);
        loja.addVeiculo(carro2);
        loja.addVeiculo(caminhao1);
        loja.addVeiculo(caminhao2);
        loja.calcValorVeiculos();
        loja.calcRendimento();
    }
}