package cn.xmqq.spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xmqq.spring.demo2.AccountService;


/**
 * ������ʽ������� xml����  aop˼��
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext2.xml"})
public class TestDemo2 {

	
	
	/**
	 * ע������࣬��Ϊ�������������ǿ����
	 */
//	@Resource(name="accountService")
	@Resource(name="accountServiceProxy") //�滻
	AccountService accountService;
	
	@Test
	public void testTran(){
		accountService.transfer("aaa", "bbb", 300d);
	}
}
