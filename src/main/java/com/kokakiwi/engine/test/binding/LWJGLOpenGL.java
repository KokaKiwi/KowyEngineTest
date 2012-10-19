package com.kokakiwi.engine.test.binding;

import com.kokakiwi.engine.binding.IOpenGL;
import static org.lwjgl.opengl.GL11.*;

public class LWJGLOpenGL implements IOpenGL
{
    public void rotate(float angle, float x, float y, float z)
    {
        glRotatef(angle, x, y, z);
    }
    
    public void translate(float x, float y, float z)
    {
        glTranslatef(x, y, z);
    }
    
    public void viewport(int x, int y, int width, int height)
    {
        glViewport(x, y, width, height);
    }
    
    public void loadIdentity()
    {
        glLoadIdentity();
    }
    
    public void setProjectionMatrixMode()
    {
        glMatrixMode(GL_PROJECTION);
    }
    
    public void setModelViewMatrixMode()
    {
        glMatrixMode(GL_MODELVIEW);
    }
    
    public void clearColorBuffer()
    {
        glClear(GL_COLOR_BUFFER_BIT);
    }
    
    public void clearDepthBuffer()
    {
        glClear(GL_DEPTH_BUFFER_BIT);
    }
}
