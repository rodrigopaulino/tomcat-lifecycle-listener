package rodrigopaulino.tomcatlifecyclelisteners;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;
import oshi.PlatformEnum;
import oshi.SystemInfo;

/**
 * @author Rodrigo Paulino
 */
public class StartupNotificationLifecycleListener implements LifecycleListener {

    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        if (Lifecycle.AFTER_START_EVENT.equals(event.getType())) {
            if (SystemInfo.getCurrentPlatform() == PlatformEnum.MACOS) {
                System.out.println("Rodrigo's Lifecycle Event");
            }
            else if (SystemInfo.getCurrentPlatform() == PlatformEnum.WINDOWS) {
            }
            else {
            }
        }
    }
}