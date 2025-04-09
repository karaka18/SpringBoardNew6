package com.itwillbs.controller;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class DataSourceTest {
	
	// DataSource 객체를 사용 => 객체를 주입해서 사용
	@Inject
	private DataSource ds;
	
	@Inject
	private BoardDAO bDAO;
	
	//@Test
	public void ds_test() {
		System.out.println(" 디비 연결정보 확인테스트! ");
		System.out.println("ds : " + ds);	
	}
	
	// mylog
	private static final org.slf4j.Logger logger
		= LoggerFactory.getLogger(DataSourceTest.class);
	
	@Test
	public void getServerTime_test() {
		String time = bDAO.getServerTime();
		logger.info("time :{}", time);
	}
	
	
	
}
