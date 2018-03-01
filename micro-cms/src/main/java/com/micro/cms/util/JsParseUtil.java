package com.micro.cms.util;


import org.apache.log4j.Logger;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileReader;


/**
 * js解析类
 */
public class JsParseUtil {

    private Logger logger =  Logger.getLogger(JsParseUtil.class);
    private static JsParseUtil jsParseUtil = null;

    private JsParseUtil(){

    }
    synchronized public static JsParseUtil getInstance (){
        if(jsParseUtil == null){
            jsParseUtil = new JsParseUtil();
        }
        return jsParseUtil;
    }
    public static Object executeByJsFile(File jsFile , String functionName, Object... params) throws Exception {

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        Object obj = null;
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("javascript");
        scriptEngine.eval(new FileReader(jsFile));
        if(scriptEngine instanceof Invocable){
            Invocable invoke = (Invocable)scriptEngine;
            obj = invoke.invokeFunction(functionName,params);


        }
        return obj;
    }
    public static void execute (){
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("javascript");

        try {
            scriptEngine.eval("print(1)");

        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
