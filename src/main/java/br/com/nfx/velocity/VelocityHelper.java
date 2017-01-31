package br.com.nfx.velocity;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;

public class VelocityHelper
{
  private final VelocityEngine ve;

  public VelocityHelper()
  {
    Properties prop = new Properties();
    prop.setProperty("resource.loader", "classpath");
    prop.setProperty("classpath.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
    prop.setProperty("classpath.resource.loader.cache", "false");
    this.ve = new VelocityEngine(prop);
  }

  public String parseFromTemplate(Map<String, Object> values, String template) {
    if ((values == null) || (values.isEmpty()))
      return null;
    if (template == null)
      throw new IllegalArgumentException("template nao pode ser nula");
    try
    {
      StringWriter result = new StringWriter();
      values = new HashMap(values);
      VelocityContext velocityContext = new VelocityContext(values);
      this.ve.mergeTemplate(template, "UTF-8", velocityContext, result);
      String resultStr = result.toString();
      return resultStr.replaceAll(">+\\s+<", "><");
    } catch (RuntimeException ex) {
      throw ex; 
    } catch (Exception ex) {
    	throw new VelocityException(ex.toString());
    }
  }
}
