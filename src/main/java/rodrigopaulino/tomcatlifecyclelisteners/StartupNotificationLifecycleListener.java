package rodrigopaulino.tomcatlifecyclelisteners;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

import java.io.IOException;

/**
 * @author Rodrigo Paulino
 */
public class StartupNotificationLifecycleListener implements LifecycleListener {

    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        if (Lifecycle.AFTER_START_EVENT.equals(event.getType())) {
            String osName = System.getProperty("os.name").toLowerCase();

            if (osName.startsWith("mac")) {
                ProcessBuilder builder = new ProcessBuilder(
                        "osascript", "-e",
                        "display notification \"Your app is running\""
                                + " with title \"Tomcat\"");
                try {
                    builder.inheritIO().start();
                } catch (IOException e) {
                   System.out.println(e);
                }
            }
            else if (osName.startsWith("windows")) {
            }
            else {
            }
        }
    }
}