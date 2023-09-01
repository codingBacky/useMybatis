package kr.co.backy.repository;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.backy.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberTest {
	@Autowired
	ApplicationContext context;
	

	@Autowired DataSource ds;
	
	@Autowired
	MemberDAO dao;

	
	@Test
	public void contextTest() { //설정 정보를 잘 읽어왔는가
		assertNotNull(context);
		for( String createBeanName : context.getBeanDefinitionNames()) {
			System.out.println(createBeanName);
		}
		//스트링으로 등록된 빈 목록 보기	
	}

	@Test
	public void connectionTest() {//커넥션 풀을 이용한 DB연결이 잘 되는가?
		assertNotNull(ds);
		
	}
	
	@Test
	public void getMemberTest() {
		assertNotNull(dao.getMember("aaa"));
		System.out.println(dao.getMember("aaa") + "--------------");
	}
	
	@Test
	public void lecFoareachMapTest() {
		List<String> list = new ArrayList<String>();
		list.add("23456"); list.add("11111"); list.add("12345");
		List<MemberVO> result = dao.getMemberForEach(list);
		assertNotNull(result);
		/*
		 * for( MemberVO vo : result) { System.out.println("---------" + vo); }
		 */
	}
}
