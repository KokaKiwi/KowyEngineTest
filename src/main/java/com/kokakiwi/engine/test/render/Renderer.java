package com.kokakiwi.engine.test.render;

import com.kokakiwi.engine.IScene;

public class Renderer implements Runnable
{
    private final IScene scene;
    private boolean      running = true;
    
    public Renderer(IScene scene)
    {
        this.scene = scene;
    }
    
    public void run()
    {
        scene.init();
        
        while (running)
        {
            scene.loop();
        }
    }
    
    public boolean isRunning()
    {
        return running;
    }
    
    public void setRunning(boolean running)
    {
        this.running = running;
    }
    
    public IScene getScene()
    {
        return scene;
    }
    
}
