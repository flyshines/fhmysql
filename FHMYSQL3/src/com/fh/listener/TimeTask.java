package com.fh.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.fh.util.TimerTest01;

/**
 * 执行定时任务
 * @author admin
 *
 */
public class TimeTask implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed...................");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized..............");
		//执行定时任务。。。。
		TimerTest01.exceTimeTask();
	}
	
}
