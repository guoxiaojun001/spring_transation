package cn.xmqq.spring.demo2;

public interface IAccountDao {
	
	public void outMoney(String out,Double money);
	
	public void inMoney(String in,Double money);

}
