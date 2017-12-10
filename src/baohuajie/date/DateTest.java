package baohuajie.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) throws Exception {
		
		String dateStr="2017-11-12 23:12:30:200";
		String dateStr1="2017-11-11 23:12:30:200";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		Date date=sdf.parse(dateStr);
		Date date1=sdf.parse(dateStr1);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		/**
		 * 比较两个日期前后
		 */
		boolean before = date1.before(date);
		System.out.println("date1在date前："+before);
		boolean after = date1.after(date);
		System.out.println("date1在date后："+after);
		
		
		/**
		 * 获取毫秒值得方法
		 */
		//第一种
		long currentTimeMillis1 = System.currentTimeMillis();
		System.out.println("currentTimeMillis1:"+currentTimeMillis1);
		//第二种
		long currentTimeMillis2=calendar.getTimeInMillis();
		System.out.println("currentTimeMillis2:"+currentTimeMillis2);
		//毫秒值和日期之间的转换
		Date dateMillis=new Date(currentTimeMillis1);
		System.out.println("dateMillis:"+sdf.format(dateMillis));
		
		/**
		 * Calendar类中的字段
		 */
		int year=calendar.get(Calendar.YEAR);
		System.out.println("year:"+year);
		//从0开始
		int month=calendar.get(Calendar.MONTH)+1;
		System.out.println("month:"+month);
		int d=calendar.get(Calendar.DATE);
		System.out.println("date:"+d);
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour:"+hour);
		int minute=calendar.get(Calendar.MINUTE);
		System.out.println("minute:"+minute);
		int second=calendar.get(Calendar.SECOND);
		System.out.println("second:"+second);
		//毫秒
		int MILLISECOND=calendar.get(Calendar.MILLISECOND);
		System.out.println("MILLISECOND:"+MILLISECOND);
		//一年中的第几月
		int DAY_OF_MONTH=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("DAY_OF_MONTH:"+DAY_OF_MONTH);
		//一年中的第几天
		int DAY_OF_YEAR=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("DAY_OF_YEAR:"+DAY_OF_YEAR);
		//指示一个星期中的某天。该字段可取的值为 SUNDAY、MONDAY、TUESDAY、WEDNESDAY、THURSDAY、FRIDAY 和 SATURDAY。周日为第一天
		int DAY_OF_WEEK=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("DAY_OF_WEEK:"+DAY_OF_WEEK);
		int DAY_OF_WEEK_IN_MONTH=calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("DAY_OF_WEEK_IN_MONTH:"+DAY_OF_WEEK_IN_MONTH);

		
		
		/**
		 * 日期计算
		 */
		//2年后
		calendar.add(Calendar.YEAR, 2);
		System.out.println("两年后："+calendar.get(Calendar.YEAR));
		//2年前
		calendar.add(Calendar.YEAR, -2);
		System.out.println("两年前："+calendar.get(Calendar.YEAR));
		
		
	}

}
