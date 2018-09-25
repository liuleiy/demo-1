package com.demo.admin.demo;

//import com.chuanglan.sms.response.SmsBalanceResponse;

public class Demo {
	//SendMages.sendMessage(url, content, phone, "true");
	public static void main(String[] args) {
		
		String url = "http://smssh1.253.com/msg/send/json";
		//String content = "【欢斗娱乐互动文化传播有限公司】" + "实验的一条消息";
		String content = "【欢斗娱乐】"+ "实验的一条消息";
		String phone = "17707270361";
		SendMages.sendMessage(url, content, phone, "true");
		
		/*String url = "http://smssh1.253.com/msg/balance/json";
		SmsBalanceResponse money = SendMages.getMoney(url);
		String code = money.getCode();
		String balance = money.getBalance();
		System.out.println("code:"+code);
		System.out.println("balance:"+balance);*/
	}
	public void demo() {
		System.out.println("niyouma");
	}
}
