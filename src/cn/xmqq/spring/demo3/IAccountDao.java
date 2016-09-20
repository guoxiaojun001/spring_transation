package cn.xmqq.spring.demo3;

public interface IAccountDao {
	
	public void outMoney(String out,Double money);
	
	public void inMoney(String in,Double money);

}
