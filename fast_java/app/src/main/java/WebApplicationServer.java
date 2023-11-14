/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebApplicationServer {
    private static final Logger log = LoggerFactory.getLogger(WebApplicationServer.class);

    public static void main(String[] args) {
        File webappDir = new File("app/webapps/WEB-INF");
        String contextPath = "/myapp";

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        System.out.println(webappDir.getAbsolutePath()); 
        tomcat.addWebapp(contextPath,webappDir.getAbsolutePath());
        // log.info("config with baseDir : {}",new File("/" + webappDir).getAbsolutePath());

        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            throw new Error(e);
        }
    }
}
