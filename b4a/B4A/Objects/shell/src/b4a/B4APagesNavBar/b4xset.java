
package b4a.B4APagesNavBar;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xset {
    public static RemoteObject myClass;
	public b4xset() {
	}
    public static PCBA staticBA = new PCBA(null, b4xset.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _map = RemoteObject.declareNull("b4a.B4APagesNavBar.b4xorderedmap");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.B4APagesNavBar.main _main = null;
public static b4a.B4APagesNavBar.starter _starter = null;
public static b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public static b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public static b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public static b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"map",_ref.getField(false, "_map")};
}
}