package cn.xmqq.spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xmqq.spring.demo2.AccountService;


/**
 * 声明方式事务管理 xml配置  aop思想
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext2.xml"})
public class TestDemo2 {

	
	
	/**
	 * 注入代理类，因为代理类进行了增强操作
	 */
//	@Resource(name="accountService")
	@Resource(name="accountServiceProxy") //替换
	AccountService accountService;
	
	@Test
	public void testTran(){
		accountService.transfer("aaa", "bbb", 300d);
	}
}
