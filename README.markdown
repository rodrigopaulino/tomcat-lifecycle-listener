StartupNotificationLifecycleListener: triggers an OS notification when the app starts running.

Tomcat's server.xml:

`<Listener className="rp.listeners.StartupNotificationLifecycleListener" />`

Run `gw build` and place jar inside tomcat's lib folder.