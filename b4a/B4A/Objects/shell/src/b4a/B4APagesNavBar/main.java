
package b4a.B4APagesNavBar;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.B4APagesNavBar.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.B4APagesNavBar.starter _starter = null;
public static b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public static b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public static b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public static b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.B4APagesNavBar.b4xcollections.class),"B4XPages",Debug.moduleToString(b4a.B4APagesNavBar.b4xpages.class),"DateUtils",main.mostCurrent._dateutils,"HttpUtils2Service",Debug.moduleToString(b4a.B4APagesNavBar.httputils2service.class),"Starter",Debug.moduleToString(b4a.B4APagesNavBar.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.B4APagesNavBar.xuiviewsutils.class)};
}
}