package com.nowcoder.community.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 此包用于 任务执行与调度 todo 定时发布任务
 * /**
 *  * 当帖子分数改变时，此贴暂存入redis    之后定时按分数展示
 *  *  什么算分数改变？
 *  *      discussPostController的add，加精
 *  *      commentController的add
 *  *      likeController的like
 *  * */

public class AlphaJob implements Job {


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(Thread.currentThread().getName() + ": execute a quartz job.");
    }
}
