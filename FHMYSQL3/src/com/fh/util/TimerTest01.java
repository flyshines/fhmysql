package com.fh.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class TimerTest01 {
	public static void exceTimeTask() {
		/**
		 * 每天晚上8点执行一次定时任务，也就是每隔一天执行一次
		 */
		long oneDay=1000*60*60*24;
		long initDelay=getTimeMillis("16:05:00")-System.currentTimeMillis();
		//过了这个时间点，只能在明天的这个时间点执行了
		initDelay=initDelay>0?initDelay:initDelay+oneDay;
		ScheduledExecutorService sec=Executors.newScheduledThreadPool(1);
		sec.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("定时任务开始执行。。"+new Date().toLocaleString());
			}
		}, initDelay, 1000, TimeUnit.MILLISECONDS);
	}
	/** 
	 * 获取指定时间对应的毫秒数 
	 * @param time "HH:mm:ss" 
	 * @return 
	 */  
	private static long getTimeMillis(String time) {  
	    try {  
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");  
	        SimpleDateFormat dayFormat = new SimpleDateFormat("yy-MM-dd"); 
	        // parse()解析字符串的文本，生成 Date。
	        Date curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);  
	        return curDate.getTime();  
	    } catch (ParseException e) {  
	        e.printStackTrace();  
	    }  
	    return 0;  
	}  
}
