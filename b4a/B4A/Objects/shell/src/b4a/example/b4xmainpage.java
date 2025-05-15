
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
public static RemoteObject _page2 = RemoteObject.declareNull("b4a.example.b4xpage2");
public static RemoteObject _details = RemoteObject.declareNull("b4a.example.details");
public static RemoteObject _page4 = RemoteObject.declareNull("b4a.example.b4xpage4");
public static RemoteObject _navbar1 = RemoteObject.declareNull("b4a.example.navbar");
public static RemoteObject _currentpage = RemoteObject.declareNull("Object");
public static RemoteObject _pnlmainpage = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _news = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _newsdsc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _newsimage = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _newstitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CurrentPage",_ref.getField(false, "_currentpage"),"DateUtils",_ref.getField(false, "_dateutils"),"NavBar1",_ref.getField(false, "_navbar1"),"news",_ref.getField(false, "_news"),"newsDsc",_ref.getField(false, "_newsdsc"),"newsImage",_ref.getField(false, "_newsimage"),"newsTitle",_ref.getField(false, "_newstitle"),"Page2",_ref.getField(false, "_page2"),"Page4",_ref.getField(false, "_page4"),"pnlMainPage",_ref.getField(false, "_pnlmainpage"),"Root",_ref.getField(false, "_root"),"rp",_ref.getField(false, "_rp"),"xui",_ref.getField(false, "_xui")};
}
}