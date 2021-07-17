package ExercicioMap;

import java.util.HashMap;
import java.util.Map;

// Crie um Map e execute as seguintes operações:










public class HashMapEstados {

    public static void main (String[] args){

        Map<String,String> Estados = new HashMap<>();

//        Adicione os 26 estados brasileiros no map. A sigla será a chave e o nome do estado será o valor.
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

//        Remova o estado de Minas Gerais.
        Estados.remove("MG");
        System.out.println(Estados);

//        Adicione o Distrito Federal.
        Estados.put("DF","Distrito Federal");
        System.out.println(Estados);

//        Verifique o Tamanho do map.
        System.out.println(Estados.size());

//        Remova o estado de Mato Grosso do Sul usando o nome.
        Estados.values().remove("Mato Grosso do sul");
        System.out.println(Estados);

//        Navegue em rodos os registos do map, mostrando no console no seguinte formato: NOME (SIGLA).
        for(Map.Entry<String,String> estados : Estados.entrySet()){
            System.out.println(estados.getValue() + " (" + estados.getKey() + ")");
        }

//        Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC).
        System.out.println(Estados.containsKey("SC"));

//        Verifique se o estado do Maranhão existe no map buscando por seu nome.
        System.out.println(Estados.containsValue("Maranhão"));



    }
}
