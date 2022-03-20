package beast.app.postprocessor;

import beast.app.beastapp.BeastLauncher;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class PostProcessorLauncher extends BeastLauncher {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        if (javaVersionCheck("PostProcessor")) {
            String classpath = getPath(false, null);
            run(classpath, "beast.app.postprocessor.PostProcessor", args);
        }
    } // main

}
