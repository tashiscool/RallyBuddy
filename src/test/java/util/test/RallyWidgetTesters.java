/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util.test;

import com.pearson.rallybuddy.RallyWidgetMainFrame;
import org.junit.Test;

/**
 *
 * @author Tash
 */
public class RallyWidgetTesters {
    @Test
    public void testGetTime()
    {
        RallyWidgetMainFrame rwmf = new RallyWidgetMainFrame();
        rwmf.loadTime(42.890);
        System.out.println(rwmf.getTime()) ;
    }
}
