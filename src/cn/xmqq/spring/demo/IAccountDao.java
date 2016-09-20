package cn.xmqq.spring.demo;

public interface IAccountDao {
	
	public void outMoney(String out,Double money);
	
	public void inMoney(String in,Double money);

}
