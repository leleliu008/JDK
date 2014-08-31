package com.leleliu008.jdk6.Script;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

/**
 * 查找JVM支持的所有的脚本引擎信息
 * @author leleliu008
 * @date 2012.12.16
 */

public class Test1 {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		
		List<ScriptEngineFactory> ScriptEngineFactorys = scriptEngineManager.getEngineFactories();
		for (ScriptEngineFactory scriptEngineFactory : ScriptEngineFactorys) {
			System.out.println("EngineName:" + scriptEngineFactory.getEngineName());
			System.out.println("EngineVersion" + scriptEngineFactory.getEngineVersion());
			System.out.println("LanguageName:" + scriptEngineFactory.getLanguageName());
			System.out.println("LanguageVersion:" + scriptEngineFactory.getLanguageVersion());
			
			System.out.print("names: ");
			List<String> names = scriptEngineFactory.getNames();
			for (String name : names) {
				System.out.print(name + " ");
			}
			System.out.println("");
			
			System.out.print("extension:");
			List<String> extensions = scriptEngineFactory.getExtensions();
			for (String extension : extensions) {
				System.out.print(extension + " ");
			}
			System.out.println("");
			
			System.out.print("mimeTypes:");
			List<String> mimeTypes = scriptEngineFactory.getMimeTypes();
			for (String mimeType : mimeTypes) {
				System.out.print(mimeType + " ");
			}
			
			System.out.println("\n-------------------------------------------------");
		}
	}
}
