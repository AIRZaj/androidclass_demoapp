
package b4a.B4APagesNavBar;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bbcodeparser {
    public static RemoteObject myClass;
	public bbcodeparser() {
	}
    public static PCBA staticBA = new PCBA(null, bbcodeparser.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _allowedtags = RemoteObject.declareNull("b4a.B4APagesNavBar.b4xset");
public static RemoteObject _stack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _start = RemoteObject.createImmutable(0);
public static RemoteObject _mtextengine = RemoteObject.declareNull("b4a.B4APagesNavBar.bctextengine");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _urlcolor = RemoteObject.createImmutable(0);
public static RemoteObject _colorsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _errorstring = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.B4APagesNavBar.main _main = null;
public static b4a.B4APagesNavBar.starter _starter = null;
public static b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public static b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public static b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public static b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AllowedTags",_ref.getField(false, "_allowedtags"),"ColorsMap",_ref.getField(false, "_colorsmap"),"DateUtils",_ref.getField(false, "_dateutils"),"ErrorString",_ref.getField(false, "_errorstring"),"mTextEngine",_ref.getField(false, "_mtextengine"),"Stack",_ref.getField(false, "_stack"),"Start",_ref.getField(false, "_start"),"UrlColor",_ref.getField(false, "_urlcolor"),"xui",_ref.getField(false, "_xui")};
}
}