package org.example;

public class Main {
    public static void main(String[] args) {
        if (args==null || args.length==0){
            System.err.println("No se ha introducido el argumento que da el número de iteraciones en primos");
            System.exit(-1);
        }
        else{
            String primosIterados = args[0];
            listarPrimos.listarPrimos(Integer.valueOf(primosIterados));
            //System.out.println("Proceso 1 'Numeros_mjcp' finalizado");
        }
    }
}
