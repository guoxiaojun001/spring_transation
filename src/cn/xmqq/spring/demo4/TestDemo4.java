package cn.xmqq.spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xmqq.spring.demo4.AccountService;


/**
 * spring �����������ʽ3 �� ����ע�ⷽʽ
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext4.xml"})
public class TestDemo4 {

	
	@Resource(name="accountService")
	AccountService accountService;
	
	@Test
	public void testTran(){
		accountService.transfer("aaa", "bbb", 300d);
	}
}
