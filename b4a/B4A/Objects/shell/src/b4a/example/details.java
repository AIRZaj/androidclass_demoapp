
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
public static RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _info = RemoteObject.createImmutable("");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbldept = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblroom = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblphone = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblmail = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _imgavatar = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _imgview1 = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _imgview2 = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _imgview3 = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _phonenumber = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"ImgAvatar",_ref.getField(false, "_imgavatar"),"ImgView1",_ref.getField(false, "_imgview1"),"ImgView2",_ref.getField(false, "_imgview2"),"ImgView3",_ref.getField(false, "_imgview3"),"info",_ref.getField(false, "_info"),"lbl",_ref.getField(false, "_lbl"),"lblDept",_ref.getField(false, "_lbldept"),"lblMail",_ref.getField(false, "_lblmail"),"lblName",_ref.getField(false, "_lblname"),"lblPhone",_ref.getField(false, "_lblphone"),"lblRoom",_ref.getField(false, "_lblroom"),"lblTitle",_ref.getField(false, "_lbltitle"),"Panel1",_ref.getField(false, "_panel1"),"phoneNumber",_ref.getField(false, "_phonenumber"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}