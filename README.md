StartupNotificationLifecycleListener: triggers an OS notification when the app starts running.

Tomcat's server.xml:

`<Listener className="rodrigopaulino.tomcatlifecyclelisteners.StartupNotificationLifecycleListener" />`

Run `gw build` and place jar inside tomcat's lib folder.
