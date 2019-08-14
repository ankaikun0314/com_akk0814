/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: akk-0814
 * @Package: com.akk.common.utils 
 * @Description: TODO
 * @author: 安开琨的电脑   
 * @date: 2019年8月14日 上午10:04:02 
 * @version: V1.0   
 */
package com.akk.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: 安开琨的电脑
 * @date: 2019年8月14日 上午10:04:02  
 */
public class DateUtilTest
{
       /**
        * 
        * @Title: testage 
        * @Description:通过日期获取年龄
        * @return: void
        */
	@Test
	public void testage()
	{        
		     Date date = new Date();
		    
		    DateUtil.getAge(date);
	}
	/**
	 * 
	 * @Title: testgetDateByMonthInit 
	 * @Description: 通过一个日期获取第一天的日期
	 * @return: void
	 */
	@Test 
	public void testgetDateByMonthInit() {
		   Date src = new Date();
		   
		  Date dateByInitMonth = DateUtil.getDateByInitMonth(src);
		  
		  System.out.println(dateByInitMonth);
		    
	}
	/**
	 * 
	 * @Title: testgetDateByMonthLast 
	 * @Description:通过一个日期获取最后一天的日期
	 * @return: void
	 */
	@Test 
	public void testgetDateByMonthLast() {
		   Date src = new Date();
		   
		  Date dateByInitMonth = DateUtil.getDateByFullMonth(src);
		  
		  System.out.println(dateByInitMonth);
		    
	}
}
