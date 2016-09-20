package cn.xmqq.spring.demo;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AcountServiceImpl implements AccountService{
	
	private IAccountDao accountDao;
	private TransactionTemplate transactionTemplate;

	@Override
	//��̷�ʽ��������� ʵ��
	public void transfer(final String out, final String in, final Double money) {
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus tstatus) {
				//�����쳣��ع���Ҫô�ɹ� Ҫôʧ��
				accountDao.outMoney(out, money);
				int a = 1/0;//�����쳣 ��ʱǮ�۳� ���ǽ����û���û�н��յ�Ǯ
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
