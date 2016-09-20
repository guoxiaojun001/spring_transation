package cn.xmqq.spring.demo3;

import javax.annotation.Resource;

public class AcountServiceImpl implements AccountService{

	private IAccountDao accountDao;
	
	@Resource(name="accountService")
	private AccountService accountService;

	@Override
	//
	public void transfer(String out, String in, Double money) {

		//�����쳣��ع���Ҫô�ɹ� Ҫôʧ��
		accountDao.outMoney(out, money);
		int a = 1/0;//�����쳣 ��ʱǮ�۳� ���ǽ����û���û�н��յ�Ǯ�����Բ���������
		accountDao.inMoney(in, money);

	}


	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}


}
