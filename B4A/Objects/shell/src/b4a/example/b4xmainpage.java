
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _btnupdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xhttp = RemoteObject.declareNull("b4a.example.httpjob");
public static RemoteObject _personslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _details = RemoteObject.declareNull("b4a.example.details");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnUpdate",_ref.getField(false, "_btnupdate"),"personsList",_ref.getField(false, "_personslist"),"Root",_ref.getField(false, "_root"),"sv",_ref.getField(false, "_sv"),"xHttp",_ref.getField(false, "_xhttp"),"xui",_ref.getField(false, "_xui")};
}
}