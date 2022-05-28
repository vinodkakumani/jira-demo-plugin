package ut.org.padahsolutions.plugin.demo;

import org.junit.Test;
import org.padahsolutions.plugin.demo.api.MyPluginComponent;
import org.padahsolutions.plugin.demo.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}