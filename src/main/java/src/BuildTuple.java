package src;

import javafx.util.Pair;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class BuildTuple {
    public ArrayList<Pair<Integer, Integer>> createListOfTuples(int lengt){
        //Pair<Integer, Integer> listOfTuple = new MutablePair<Integer, Integer>(1,5); ten ma settera
//        Pair<Integer, Integer> listOfTuple = new Pair<Integer, Integer>(1,5);  //ten nie ma settera

        ArrayList<Pair<Integer, Integer>> listOfTuples = new ArrayList<Pair<Integer, Integer>>();
        for(int i=0; i<lengt; i++ ){
            listOfTuples.add(new Pair<Integer,Integer>(new Random().nextInt(2),Integer.valueOf(i)));
        }
//        listOfTuples.stream().forEach((i)-> System.out.println(i.getKey()+","+i.getValue()));
        
        return listOfTuples;
    }
}
