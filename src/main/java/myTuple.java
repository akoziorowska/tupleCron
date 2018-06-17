import javafx.util.Pair;
import jobs.Job1;
import jobs.Job2;
import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import src.BuildTuple;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.boot.SpringApplication;

public class myTuple {

    @Autowired
    public static BuildTuple buildTuple;

    static void printTuple(){
        ArrayList<Pair<Integer, Integer>> offsetPartit = buildTuple.createListOfTuples(10);
        offsetPartit.stream().forEach((i)-> System.out.println(i.getKey()+","+i.getValue()));
    }

    public static void main(String ...args) throws SchedulerException {
        printTuple();

//        ArrayList<Pair<Integer, Integer>> offsetPartit = buildTuple.createListOfTuples(10);  czemu buildTuple==null?!?!?!?!?!?
//        BuildTuple buildTuple = new BuildTuple();
//        ArrayList<Pair<Integer, Integer>> offsetPartit = buildTuple.createListOfTuples(10);
//        offsetPartit.stream().forEach((i)-> System.out.println(i.getKey()+","+i.getValue()));

//        ArrayList<Pair<Integer, Integer>> listOfTuplesError = buildTuple.createListOfTuples(4);
//        listOfTuplesError.stream().forEach((i)-> System.out.println(i.getKey()+","+i.getValue()));


//---------------------------------------------------------------------------------------
//        JobDetail job1 = JobBuilder.newJob(Job1.class).withIdentity("job1", "group1").build();
//        Trigger trigger1 = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build(); //co 5 sekund
//        Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
//        scheduler1.start();
//        scheduler1.scheduleJob(job1, trigger1);

//        JobDetail job2 = JobBuilder.newJob(Job2.class).withIdentity("job2", "group2").build();
//        Trigger trigger2 = TriggerBuilder.newTrigger().withIdentity("trigger2", "group2")
//                .withSchedule(CronScheduleBuilder.cronSchedule(("0/5 * * * * ?"))).build();
//        Scheduler scheduler2 = new StdSchedulerFactory().getScheduler();
//        scheduler2.getContext().put("oneTuple",offsetPartit.get(3) );
//        scheduler2.start();
//        scheduler2.scheduleJob(job2, trigger2);
    }
}
