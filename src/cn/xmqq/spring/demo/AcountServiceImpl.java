package cn.xmqq.spring.demo;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AcountServiceImpl implements AccountService{
	
	private IAccountDao accountDao;
	private TransactionTemplate transactionTemplate;

	@Override
	//编程方式的事务管理 实现
	public void transfer(final String out, final String in, final Double money) {
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus tstatus) {
				//出现异常后回滚，要么成功 要么失败
				accountDao.outMoney(out, money);
				int a = 1/0;//出现异常 到时钱扣除 但是接收用户并没有接收到钱
				accountDao.inMoney(in, money);
			}
		});
		
		
		
	}


	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}


	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

}
