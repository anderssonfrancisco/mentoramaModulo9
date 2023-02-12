package companhia;



import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Ferdinando", true, "123", 90);
		Cliente cli2 = new Cliente("Samara", true, "abc", 50);
		Cliente cli3 = new Cliente("Luna", true, "sache", 10);
		Cliente cli4 = new Cliente("Saori", true, "rato", 25);
		Cliente cli5 = new Cliente("Frederico", true, "Sucuri", 70);
		Cliente cli6 = new Cliente("Matilda", true, "bolo", 80);
		Cliente cli7 = new Cliente("Kiito", true, "passeio", 110);
		Cliente cli8 = new Cliente("Jade", true, "carne", 40);
		Cliente cli9 = new Cliente("Nina", true, "stress", 4);
		Cliente cli10 = new Cliente("Joyce", true, "pessego", 45);

		cli1.autentica("123");
		List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10);
//        Consumer<Cliente> consumer = (Cliente cli) -> System.out.println(cli.getNome());
//        clientes.forEach(cli -> System.out.println(cli.getCompras()));
//		clientes.forEach(Cliente :: getNome);

		OptionalDouble clienteStream = clientes.stream().mapToInt(Cliente::getCompras).average();

		Optional<Cliente> clienteRico = clientes.stream().max(Comparator.comparingInt(Cliente::getCompras));
		Optional<Cliente> clientePobre= clientes.stream().min(Comparator.comparingInt(Cliente::getCompras));

		System.out.println("O cliente com mais compras é " + clienteRico);
		System.out.println("Cliente com menos compras é " + clientePobre);
		System.out.println("A média de compras é " + clienteStream);

	}
}


