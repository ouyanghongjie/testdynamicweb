package com.joy.pipeline.test;

public class Util {

	public String constructResponse(){
		StringBuffer response = new StringBuffer();
		response.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		response.append("<HTML>");
		response.append("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		response.append("  <BODY>");
		response.append("hello world ");
		response.append("it is using the Post method!");
		response.append("</BODY>");
		response.append("</HTML>");
		
		return response.toString();
	}
}
