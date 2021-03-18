package com.demo.entity;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchApplication {

	public static void main(String[] args) throws Exception {
		String[] springConfig = { "/jobConfig.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLaucher = (JobLauncher) context.getBean("jobLaucher");
		Job job = (Job) context.getBean("importPersonJob");
		JobExecution execution = jobLaucher.run(job, new JobParameters());
		System.out.println(execution.getStatus());
	}
}
