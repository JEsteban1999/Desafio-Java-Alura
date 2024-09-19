package com.aluracursos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("\n*********************************");
        System.out.println("BIENVENIDO AL CONVERSOR DE MONEDA");
        System.out.println("*********************************");
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\nElija una opción válida: \n");
            System.out.println("1) Dolar ==> Peso colombiano");
            System.out.println("2) Dolar ==> Euro");
            System.out.println("3) Peso colombiano ==> Dolar");
            System.out.println("4) Peso colombiano ==> Euro");
            System.out.println("5) Euro ==> Dolar");
            System.out.println("6) Euro ==> Peso colombiano");
            System.out.println("7) Salir\n");
            System.out.println("Elija una opcion válida:");
            opcion = lectura.nextInt();
            ConsultaTasas consulta = new ConsultaTasas();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("\nIngrese la cantidad de dolares a convertir a pesos colombianos:");
                        double dolares = lectura.nextDouble();
                        Tasa tasaDolar = consulta.buscarTasa("USD");
                        System.out.println("\n" + dolares + " dolares equivalen a " + dolares * tasaDolar.COP() + " pesos colombianos");
                        break;
                    case 2:
                        System.out.println("\nIngrese la cantidad de dolares a convertir a euros");
                        dolares = lectura.nextDouble();
                        tasaDolar = consulta.buscarTasa("USD");
                        System.out.println("\n" + dolares + " dolares equivalen a " + dolares * tasaDolar.EUR() + " euros");
                        break;
                    case 3:
                        System.out.println("\nIngrese la cantidad de pesos colombianos a convertir a dolares");
                        double pesos = lectura.nextDouble();
                        Tasa tasaPeso = consulta.buscarTasa("COP");
                        System.out.println("\n" + pesos + " pesos colombianos equivalen a " + pesos / tasaPeso.COP() + " dolares");
                        break;
                    case 4:
                        System.out.println("\nIngrese la cantidad de pesos colombianos a convertir a euros");
                        pesos = lectura.nextDouble();
                        tasaPeso = consulta.buscarTasa("COP");
                        System.out.println("\n" + pesos + " pesos colombianos equivalen a " + pesos / tasaPeso.COP() * tasaPeso.EUR() + " euros");
                        break;
                    case 5:
                        System.out.println("\nIngrese la cantidad de euros a convertir a dolares");
                        double euros = lectura.nextDouble();
                        Tasa tasaEuro = consulta.buscarTasa("EUR");
                        System.out.println("\n" + euros + " euros equivalen a " + euros * tasaEuro.USD() + " dolares");
                        break;
                    case 6:
                        System.out.println("\nIngrese la cantidad de euros a convertir a pesos colombianos");
                        euros = lectura.nextDouble();
                        tasaEuro = consulta.buscarTasa("EUR");
                        System.out.println("\n" + euros + " euros equivalen a " + euros * tasaEuro.COP() + " pesos colombianos");
                        break;
                    case 7:
                        System.out.println("\nGracias por usar el conversor de moneda\n");
                        break;
                    default:
                        System.out.println("\nOpción no valida\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error al ejecutar");
            }
        }
    }
}
