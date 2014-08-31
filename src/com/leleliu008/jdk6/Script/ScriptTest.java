package com.leleliu008.jdk6.Script;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 脚本支持测试
 * @author leleliu008
 * @date 2012.09.08
 */

public class ScriptTest {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		//根据后缀名查找引擎
		ScriptEngine jsEngine = scriptEngineManager.getEngineByExtension("js");

		
		Reader reader = null;
		try {
			//从文件中读取javaScript脚本
			InputStream is = ScriptTest.class.getResourceAsStream("test.js");
			reader = new InputStreamReader(is);
			
			//执行脚本
			jsEngine.eval(reader);
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != reader) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
