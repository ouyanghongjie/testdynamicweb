package com.joy.pipeline.test;

public class Util {

	public String constructResponse(){
		StringBuffer response = new StringBuffer();
		response.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		response.append("<HTML>");
		response.append("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		response.append("  <BODY>");
		response.append("hello world!  This is ");
		response.append("sing the GET method!");
		response.append("</BODY>");
		response.append("</HTML>");
		
		return response.toString();
	}
}
