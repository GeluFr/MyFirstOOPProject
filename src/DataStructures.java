import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructures {
    public static void main(String[] args) {
        ArrayList<String> listaCumparaturi= new ArrayList<>();
        listaCumparaturi.add("oua");
        listaCumparaturi.add("lapte");
        listaCumparaturi.add("paine");
        listaCumparaturi.add("detergent");
        listaCumparaturi.set(1,"lapte vegetal");
        listaCumparaturi.remove(0);
        System.out.println(listaCumparaturi.get(1));
        for (String element:listaCumparaturi){
            System.out.println(element);
        }
        System.out.println(listaCumparaturi.size());
        System.out.println(listaCumparaturi.contains("oua"));
        System.out.println(listaCumparaturi.contains("paine"));

        HashMap<Integer, String> hashMapList= new HashMap<>();
        hashMapList.put(1,"Luni");
        hashMapList.put(2,"Marti");
        hashMapList.put(3,"Miercuri");
        hashMapList.put(5,"Vineri");
        hashMapList.remove(5);
        System.out.println(hashMapList.get(3));
        System.out.println(hashMapList.keySet());
        System.out.println(hashMapList.values());
        hashMapList.replace(1,"Luni-modificat");
        System.out.println(hashMapList.values());
        System.out.println(hashMapList.entrySet() );



        //tema 2
        //partea 1

        ArrayList<String>  listaCursuri = new ArrayList<>();
        listaCursuri.add("Testare Manuala");
        listaCursuri.add("Testare Automata");
        listaCursuri.add("Front-End");
        listaCursuri.add("Java");
        System.out.println("Elementul de pe pozitia 2 este: "+listaCursuri.get(1));
        System.out.println("Lungimea listei este: "+listaCursuri.size());
        for (String afiseazaCurs:listaCursuri){
            System.out.println(afiseazaCurs);
        }

        //partea 2

        String nume;
        Boolean treceExamenul;

        HashMap<String, Boolean> listaExamen= new HashMap<>();
        listaExamen.put("Gelu", true);
        listaExamen.put("Sami",true);
        listaExamen.put("Catalin", false);
        listaExamen.put("Marius",false);
        listaExamen.put("Andreea",true);
        System.out.println(listaExamen.values());
        System.out.println(listaExamen.entrySet());
        System.out.println(listaExamen.keySet());
        for(HashMap.Entry<String,Boolean> treceExamen:listaExamen.entrySet()){
            if (treceExamen.getValue()){
                System.out.println("Studentii care trec examenul sunt: "+ treceExamen.getKey());
            }
            //for(String student:listaExamen.keySet()){
                //if(listaExamen.get(student)){
                    //System.out.println(student);
                //}
            //}
        }






    }
}
