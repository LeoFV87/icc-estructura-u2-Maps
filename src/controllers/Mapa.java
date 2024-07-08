package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {

       HashMap<String, Integer> mapita= new HashMap<>();
       mapita.put("Manzana", 20);
       mapita.put("Pera", 25);
       mapita.put("Mandarina", 20);
       mapita.put("Pera", 23);

       mapita.remove("Pera");

       System.out.println(mapita);

       System.out.println("Existe Mandarina?"+ mapita.containsKey("Mandarina"));
       System.out.println("Existe Pera?"+mapita.containsKey("Pera"));


       int valorManzana= mapita.get("Manzana");
       System.out.println("El valor de manzana es "+valorManzana);


       System.out.println("Tamaño: "+mapita.size());
       System.out.println("Esta vacio? "+mapita.isEmpty());


       //CLAVES
       System.out.println("\nClaves del mapa");
       for (String clave: mapita.keySet()){
        System.out.println("-"+clave);
       }

        //VALORES
        System.out.println("Valores del mapa");
        for (Integer value: mapita.values()){
            System.out.println("-"+value);
        }


        System.out.println();
        System.out.println(mapita);
        //REEMPLAZAR
        mapita.replaceAll((k,v) -> v *2);
        System.out.println(mapita);


        mapita.clear();
        System.out.println(mapita);




       

    }
}
