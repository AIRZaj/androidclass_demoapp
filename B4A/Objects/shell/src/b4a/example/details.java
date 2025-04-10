
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class details {
    public static RemoteObject myClass;
	public details() {
	}
    public static PCBA staticBA = new PCBA(null, details.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _info = RemoteObject.createImmutable("");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"info",_ref.getField(false, "_info"),"lbl",_ref.getField(false, "_lbl"),"lblInfo",_ref.getField(false, "_lblinfo"),"Panel1",_ref.getField(false, "_panel1"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}