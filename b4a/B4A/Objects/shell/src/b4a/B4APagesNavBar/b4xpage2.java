
package b4a.B4APagesNavBar;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpage2 {
    public static RemoteObject myClass;
	public b4xpage2() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpage2.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _navbar1 = RemoteObject.declareNull("b4a.B4APagesNavBar.navbar");
public static RemoteObject _lbltest = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _btnupdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xhttp = RemoteObject.declareNull("b4a.B4APagesNavBar.httpjob");
public static RemoteObject _personslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _details = RemoteObject.declareNull("b4a.B4APagesNavBar.details");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.B4APagesNavBar.main _main = null;
public static b4a.B4APagesNavBar.starter _starter = null;
public static b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public static b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public static b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public static b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnUpdate",_ref.getField(false, "_btnupdate"),"DateUtils",_ref.getField(false, "_dateutils"),"lblTest",_ref.getField(false, "_lbltest"),"NavBar1",_ref.getField(false, "_navbar1"),"personsList",_ref.getField(false, "_personslist"),"Root",_ref.getField(false, "_root"),"sv",_ref.getField(false, "_sv"),"xHttp",_ref.getField(false, "_xhttp"),"xui",_ref.getField(false, "_xui")};
}
}