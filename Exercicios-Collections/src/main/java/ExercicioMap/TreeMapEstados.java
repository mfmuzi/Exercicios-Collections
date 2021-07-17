package ExercicioMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEstados {

          public static void main (String[] args){

            TreeMap<String,String> Estados = new TreeMap<>();

            Estados.put("SP","São Paulo");
            Estados.put("RJ","Rio de Janeiro");
            Estados.put("MG","Minas Gerais");
            Estados.put("BA","Bahia");
            Estados.put("RN","Rio Grande no Norte");
            Estados.put("RS","Rio Grande do Sul");
            Estados.put("TO","Tocantins");
            Estados.put("AM","Amazonas");
            Estados.put("MA","Maranhão");
            Estados.put("PE","Pernambuco");
            Estados.put("SE","Sergipe");
            Estados.put("SC","Santa Catarina");
            Estados.put("PR","Paraná");
            Estados.put("MT","Mato Grosso");
            Estados.put("MS","Mato Grosso do sul");
            Estados.put("PI","Piauí");
            Estados.put("AC","Acre");
            Estados.put("ES","Espirito Santo");
            Estados.put("GO","Goiás");
            Estados.put("AL","Alagoas");
            Estados.put("PA","Pará");
            Estados.put("CE","Ceará");
            Estados.put("PB","Paraiba");
            Estados.put("RO","Rondônia");
            Estados.put("RR","Roraima");
            Estados.put("AP","Amapá");

            System.out.println(Estados);

            Estados.remove("MG", "Minas Gerais");
            System.out.println(Estados);

            Estados.put("DF","Distrito Federal");
            System.out.println(Estados);

            System.out.println(Estados.size());

            Estados.values().remove("Mato Grosso do sul");
            System.out.println(Estados);

            for(Map.Entry<String,String> estados : Estados.entrySet()){
              System.out.println(estados.getValue() + " (" + estados.getKey() + ")");
            }

            System.out.println(Estados.containsKey("SC"));

            System.out.println(Estados.containsValue("Maranhão"));
        }
}
