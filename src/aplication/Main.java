package aplication;
import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10]; // esse é um vetor do tipo Rent.

        System.out.println("How many rooms will be rentend? ");
        int n = sc.nextInt(); // solicita quantos quartos irá ser alugado pelo usuário;

        for (int i = 1; i <= n; i++){ //"for" para percorrer as entradas de dados dos clientes;
            System.out.println("Rent #" + i + ":");

            sc.nextLine(); //limpar buffer
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.println("Room");
            int roomNumber = sc.nextInt();

          Rent rent = new Rent(name, email); // instanciando o objeto e atribuindo a referência dele para a posição roomNumber
          vect[roomNumber] = rent;//E na posição do vetor "vect [roomNamber]"   vai receber o rent
        }
        //logica para imprimir os nomes e quartos que estão ocupados.
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++){
            if(vect[i] != null){
            System.out.println(i + ":" + vect[i]);
            }
        }

    sc.close();
    }

}