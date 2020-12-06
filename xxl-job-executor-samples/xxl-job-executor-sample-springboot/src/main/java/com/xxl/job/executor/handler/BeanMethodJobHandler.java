package com.xxl.job.executor.handler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class BeanMethodJobHandler { //extends IJobHandler {
    @XxlJob(value = "xxx", init = "myInit")
//    @Override
    public void execute() throws Exception {
        System.out.println("hello XXL_JOB");
    }

    public void myInit() {
        System.out.println("我是自定義的 init 方法");
    }

    @XxlJob(value = "ooo")
    public void execute2() throws Exception {
        String jobParam = XxlJobHelper.getJobParam();
        System.out.println("hello XXL_JOB2" + jobParam);
    }

    @XxlJob(value = "task1")
    public void task1() throws Exception {
        System.out.println("I'm task1");
    }

    @XxlJob(value = "task2")
    public void task2() throws Exception {
        System.out.println("I'm task2");
    }

    @XxlJob(value = "task3")
    public void task3() throws Exception {
        System.out.println("I'm task3");
    }
}
