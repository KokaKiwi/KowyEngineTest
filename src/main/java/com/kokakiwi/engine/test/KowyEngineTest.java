package com.kokakiwi.engine.test;

import java.io.File;

import com.kokakiwi.engine.base.DefaultScene;
import com.kokakiwi.engine.binding.IOpenGL;
import com.kokakiwi.engine.render.Camera;
import com.kokakiwi.engine.test.binding.LWJGLOpenGL;
import com.kokakiwi.engine.test.render.Renderer;
import com.kokakiwi.engine.utils.SystemUtils;

public class KowyEngineTest
{
    private final DefaultScene scene;
    private final IOpenGL      gl;
    private final Renderer     renderer;
    
    private final Thread       thread;
    
    public KowyEngineTest()
    {
        // Init LWJGL
        File nativesDir = new File("natives" + File.separator
                + SystemUtils.getSystemOS().name());
        System.setProperty("org.lwjgl.librarypath",
                nativesDir.getAbsolutePath());
        System.setProperty("net.java.games.input.librarypath",
                nativesDir.getAbsolutePath());
        
        gl = new LWJGLOpenGL();
        
        scene = new DefaultScene(gl);
        scene.addDefaultPhases();
        
        Camera camera = new Camera();
        scene.setCamera(camera);
        
        renderer = new Renderer(scene);
        
        thread = new Thread(renderer);
    }
    
    public void start()
    {
        thread.start();
    }
    
    public void stop()
    {
        renderer.setRunning(false);
    }
    
    public static void main(String[] args)
    {
        new KowyEngineTest().start();
    }
}
