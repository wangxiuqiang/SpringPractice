package com.Test;

public abstract class AbstractLookupBean { //bean 类　变为　抽象类
	
	
	public abstract HelperBean getMyHelperBean();//实现一个抽象类的方法
	
	
	public HelperBean getHelperBean(){
		return getMyHelperBean();
	}
	
	public void dosomething(){
		getMyHelperBean().dosomehelp();
	}
}
