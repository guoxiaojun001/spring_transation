package cn.xmqq.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xmqq.spring.demo3.AccountService;


/**
 * spring 事务管理声明式2 ： aspectJ的xml方式
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext3.xml"})
public class TestDemo3 {

	
	
	@Resource(name="accountService")
	AccountService accountService;
	
	@Test
	public void testTran(){
		accountService.transfer("aaa", "bbb", 300d);
	}
}
