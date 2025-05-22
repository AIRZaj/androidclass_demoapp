
package b4a.B4APagesNavBar;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class navbar {
    public static RemoteObject myClass;
	public navbar() {
	}
    public static PCBA staticBA = new PCBA(null, navbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _pnlparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnmainpage = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mp = RemoteObject.declareNull("b4a.B4APagesNavBar.b4xmainpage");
public static RemoteObject _btnpage2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnpage3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnpage4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.B4APagesNavBar.main _main = null;
public static b4a.B4APagesNavBar.starter _starter = null;
public static b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public static b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public static b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public static b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnMainPage",_ref.getField(false, "_btnmainpage"),"btnPage2",_ref.getField(false, "_btnpage2"),"btnPage3",_ref.getField(false, "_btnpage3"),"btnPage4",_ref.getField(false, "_btnpage4"),"DateUtils",_ref.getField(false, "_dateutils"),"MP",_ref.getField(false, "_mp"),"pnlParent",_ref.getField(false, "_pnlparent"),"xui",_ref.getField(false, "_xui")};
}
}