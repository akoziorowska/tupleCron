package jobs;

import javafx.util.Pair;
import org.quartz.*;
import src.BuildTuple;

import java.util.ArrayList;
import java.util.Date;

public class Job2 implements Job {
    public void execute(JobExecutionContext var1) throws JobExecutionException{
        try {
            SchedulerContext schedulerContext = var1.getScheduler().getContext();
            Pair<Integer, Integer> oneTuple = (Pair<Integer, Integer>) schedulerContext.get("oneTuple");
            System.out.println("jestem job2"+ new Date()+oneTuple.getKey()+","+oneTuple.getValue());

        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }

}
