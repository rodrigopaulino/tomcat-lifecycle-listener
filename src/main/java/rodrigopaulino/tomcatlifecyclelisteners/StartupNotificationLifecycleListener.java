package rodrigopaulino.tomcatlifecyclelisteners;

import java.io.IOException;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

/**
 * @author Rodrigo Paulino
 */
public class StartupNotificationLifecycleListener implements LifecycleListener {

	@Override
	public void lifecycleEvent(LifecycleEvent event) {
		if (Lifecycle.AFTER_START_EVENT.equals(event.getType())) {
			String osName = System.getProperty("os.name");

			osName = osName.toLowerCase();

			if (osName.startsWith("mac")) {
				ProcessBuilder processBuilder = new ProcessBuilder(
					"osascript", "-e",
					"display notification \"Your app is running\" with title " +
						"\"Tomcat\"");

				try {
					ProcessBuilder inheritIO = processBuilder.inheritIO();

					inheritIO.start();
				}
				catch (IOException ioException) {
					System.out.println(ioException.getMessage());
				}
			}
			else if (osName.startsWith("windows")) {
			}
			else {
			}
		}
	}

}