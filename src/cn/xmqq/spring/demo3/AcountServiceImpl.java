package cn.xmqq.spring.demo3;

import javax.annotation.Resource;

public class AcountServiceImpl implements AccountService{

	private IAccountDao accountDao;
	
	@Resource(name="accountService")
	private AccountService accountService;

	@Override
	//
	public void transfer(String out, String in, Double money) {

		//出现异常后回滚，要么成功 要么失败
		accountDao.outMoney(out, money);
		int a = 1/0;//出现异常 到时钱扣除 但是接收用户并没有接收到钱，所以采用事务处理
		accountDao.inMoney(in, money);

	}


	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}


}
