package com.lanccj.util;

import java.util.regex.Pattern;

/**
 * 正则表达式	
 * @author LancCJ
 *
 */
public class RegexUtil {
	
	/**
	 * 传入 字符串 返回匹配该字符串的 正则表达式
	 * @param str
	 * @return
	 */
	public static Pattern getStringPattern(String str){
		String skipedUrlRegx="."+str+".";
		return Pattern.compile(skipedUrlRegx);
	}
	
	public static void main(String[] args) {
//		//测试匹配字符串
		String target="http://localhost/CJServices/services/getCurrentTime";
		if (getStringPattern("/services/").matcher(target).find()){
			System.out.println("匹配字符串成功!");
		}else{
			System.out.println("匹配字符串失败!");
		}
	}
}
