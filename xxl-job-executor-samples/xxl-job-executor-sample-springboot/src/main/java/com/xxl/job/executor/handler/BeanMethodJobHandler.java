package com.xxl.job.executor.handler;

import com.xxl.job.core.handler.IJobHandler;
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
        System.out.println("hello XXL_JOB2");
    }
}
