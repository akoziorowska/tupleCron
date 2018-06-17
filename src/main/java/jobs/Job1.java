package jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class Job1 implements Job {
    public void execute(JobExecutionContext var1) throws JobExecutionException{
        System.out.println("jestem job1"+ new Date());
    }

}
