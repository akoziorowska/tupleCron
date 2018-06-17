package jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class Job3 implements Job {
    public void execute(JobExecutionContext var1) throws JobExecutionException{
        System.out.println("jestem job3"+ new Date());
    }

}
