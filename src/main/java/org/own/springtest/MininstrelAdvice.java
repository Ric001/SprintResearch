package org.own.springtest;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public class MininstrelAdvice implements MethodBeforeAdvice {

    private final static Logger LOG = Logger.getLogger(Mininstrel.class.getName());
    
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        
        final IKnight Knight = (IKnight) target;
        final Logger song = Logger.getLogger(target.getClass().getName());
        song.info("Brave " + Knight.getName() + " did " + method.getName());

    }

}