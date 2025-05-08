package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class details extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.details");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.details.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
public String _info = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblname = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldept = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblroom = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblphone = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmail = null;
public b4a.B4APagesNavBar.b4ximageview _imgavatar = null;
public b4a.B4APagesNavBar.b4ximageview _imgview1 = null;
public b4a.B4APagesNavBar.b4ximageview _imgview2 = null;
public b4a.B4APagesNavBar.b4ximageview _imgview3 = null;
public String _phonenumber = "";
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.B4APagesNavBar.details __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _loadperson(b4a.B4APagesNavBar.details __ref,anywheresoftware.b4a.objects.collections.Map _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "loadperson", false))
	 {return ((String) Debug.delegate(ba, "loadperson", new Object[] {_p}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub LoadPerson(p As Map)";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="lblName.Text = $\"${p.Get(\"tytul\")}. ${p.Get(\"imie";
__ref._lblname /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("tytul")))+". "+__c.SmartStringFormatter("",_p.Get((Object)("imie")))+" "+__c.SmartStringFormatter("",_p.Get((Object)("nazwisko")))+"")));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="lblDept.Text = $\"${p.Get(\"zaklad\")}\"$";
__ref._lbldept /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("zaklad")))+"")));
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="lblRoom.Text = $\"${p.Get(\"pokoj\")}\"$";
__ref._lblroom /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("pokoj")))+"")));
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="lblMail.Text = $\"${p.Get(\"mail\")}\"$";
__ref._lblmail /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("mail")))+"")));
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="phoneNumber=p.Get(\"telefon\")";
__ref._phonenumber /*String*/  = BA.ObjectToString(_p.Get((Object)("telefon")));
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.B4APagesNavBar.details __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Root.Color = xui.Color_White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Root.LoadLayout(\"detail2\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("detail2",ba);
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="ImgAvatar.Load(File.DirAssets, \"avatar.png\")";
__ref._imgavatar /*b4a.B4APagesNavBar.b4ximageview*/ ._load /*String*/ (null,__c.File.getDirAssets(),"avatar.png");
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim info As String";
_info = "";
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Private Panel1 As B4XView";
_panel1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Private lblName As B4XView";
_lblname = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Private lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="Private lblDept As B4XView";
_lbldept = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Private lblRoom As B4XView";
_lblroom = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Private lblPhone As B4XView";
_lblphone = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="Private lblMail As B4XView";
_lblmail = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="Private ImgAvatar As B4XImageView";
_imgavatar = new b4a.B4APagesNavBar.b4ximageview();
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="Private ImgView1 As B4XImageView";
_imgview1 = new b4a.B4APagesNavBar.b4ximageview();
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="Private ImgView2 As B4XImageView";
_imgview2 = new b4a.B4APagesNavBar.b4ximageview();
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="Private ImgView3 As B4XImageView";
_imgview3 = new b4a.B4APagesNavBar.b4ximageview();
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="Private phoneNumber As String";
_phonenumber = "";
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="End Sub";
return "";
}
public String  _mailbutton_click(b4a.B4APagesNavBar.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "mailbutton_click", false))
	 {return ((String) Debug.delegate(ba, "mailbutton_click", null));}
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub MailButton_Click";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"mailto:\"";
_intent1.Initialize(_intent1.ACTION_VIEW,"mailto:"+__ref._lblmail /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="StartActivity(Intent1)";
__c.StartActivity(ba,(Object)(_intent1.getObject()));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="End Sub";
return "";
}
public String  _messagebutton_click(b4a.B4APagesNavBar.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "messagebutton_click", false))
	 {return ((String) Debug.delegate(ba, "messagebutton_click", null));}
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub MessageButton_Click";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"sms:\" &";
_intent1.Initialize(_intent1.ACTION_VIEW,"sms:"+__ref._phonenumber /*String*/ );
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="StartActivity(Intent1)";
__c.StartActivity(ba,(Object)(_intent1.getObject()));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
public String  _phone_click(b4a.B4APagesNavBar.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "phone_click", false))
	 {return ((String) Debug.delegate(ba, "phone_click", null));}
anywheresoftware.b4a.phone.Phone.PhoneCalls _p = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Phone_Click";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim p As PhoneCalls";
_p = new anywheresoftware.b4a.phone.Phone.PhoneCalls();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Log(phoneNumber)";
__c.LogImpl("81900546",__ref._phonenumber /*String*/ ,0);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="StartActivity(p.call(phoneNumber))";
__c.StartActivity(ba,(Object)(_p.Call(__ref._phonenumber /*String*/ )));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="End Sub";
return "";
}
}