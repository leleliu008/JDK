package com.leleliu008.jdk6.Script;

import java.io.Reader;
import java.util.List;

import javax.script.AbstractScriptEngine;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 硬编码方式实现
 * @author leleliu008
 * @date 2012.12.16
 */

public class Test3 {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		scriptEngineManager.registerEngineExtension("aaa", new ScriptEngineFactory() {
			
			@Override
			public ScriptEngine getScriptEngine() {
				
				return new AbstractScriptEngine() {
					
					@Override
					public ScriptEngineFactory getFactory() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Object eval(Reader reader, ScriptContext context)
							throws ScriptException {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Object eval(String script, ScriptContext context)
							throws ScriptException {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Bindings createBindings() {
						// TODO Auto-generated method stub
						return null;
					}
				};
			}
			
			@Override
			public String getProgram(String... statements) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getParameter(String key) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getOutputStatement(String toDisplay) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<String> getNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<String> getMimeTypes() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getMethodCallSyntax(String obj, String m, String... args) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLanguageVersion() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLanguageName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<String> getExtensions() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getEngineVersion() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getEngineName() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByExtension("aaa");
		System.out.println(scriptEngine);
	}
}
