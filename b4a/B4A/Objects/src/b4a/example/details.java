package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class details extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.details");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.details.class).invoke(this, new Object[] {null});
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
public b4a.example.b4ximageview _imgavatar = null;
public b4a.example.b4ximageview _imgview1 = null;
public b4a.example.b4ximageview _imgview2 = null;
public b4a.example.b4ximageview _imgview3 = null;
public String _phonenumber = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.details __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.details __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Root.Color = xui.Color_White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Root.LoadLayout(\"detail2\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("detail2",ba);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="ImgAvatar.Load(File.DirAssets, \"avatar.png\")";
__ref._imgavatar /*b4a.example.b4ximageview*/ ._load /*String*/ (null,__c.File.getDirAssets(),"avatar.png");
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim info As String";
_info = "";
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private Panel1 As B4XView";
_panel1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Private lblName As B4XView";
_lblname = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Private lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Private lblDept As B4XView";
_lbldept = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Private lblRoom As B4XView";
_lblroom = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private lblPhone As B4XView";
_lblphone = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private lblMail As B4XView";
_lblmail = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Private ImgAvatar As B4XImageView";
_imgavatar = new b4a.example.b4ximageview();
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Private ImgView1 As B4XImageView";
_imgview1 = new b4a.example.b4ximageview();
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Private ImgView2 As B4XImageView";
_imgview2 = new b4a.example.b4ximageview();
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Private ImgView3 As B4XImageView";
_imgview3 = new b4a.example.b4ximageview();
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="Private phoneNumber As String";
_phonenumber = "";
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="End Sub";
return "";
}
public String  _loadperson(b4a.example.details __ref,anywheresoftware.b4a.objects.collections.Map _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "loadperson", false))
	 {return ((String) Debug.delegate(ba, "loadperson", new Object[] {_p}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub LoadPerson(p As Map)";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="lblName.Text = $\"${p.Get(\"tytul\")}. ${p.Get(\"imie";
__ref._lblname /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("tytul")))+". "+__c.SmartStringFormatter("",_p.Get((Object)("imie")))+" "+__c.SmartStringFormatter("",_p.Get((Object)("nazwisko")))+"")));
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="lblDept.Text = $\"${p.Get(\"zaklad\")}\"$";
__ref._lbldept /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("zaklad")))+"")));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="lblRoom.Text = $\"${p.Get(\"pokoj\")}\"$";
__ref._lblroom /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("pokoj")))+"")));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="lblMail.Text = $\"${p.Get(\"mail\")}\"$";
__ref._lblmail /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",_p.Get((Object)("mail")))+"")));
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="phoneNumber=p.Get(\"telefon\")";
__ref._phonenumber /*String*/  = BA.ObjectToString(_p.Get((Object)("telefon")));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return "";
}
public String  _mailbutton_click(b4a.example.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "mailbutton_click", false))
	 {return ((String) Debug.delegate(ba, "mailbutton_click", null));}
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub MailButton_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"mailto:\"";
_intent1.Initialize(_intent1.ACTION_VIEW,"mailto:"+__ref._lblmail /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="StartActivity(Intent1)";
__c.StartActivity(ba,(Object)(_intent1.getObject()));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public String  _messagebutton_click(b4a.example.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "messagebutton_click", false))
	 {return ((String) Debug.delegate(ba, "messagebutton_click", null));}
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub MessageButton_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"sms:\" &";
_intent1.Initialize(_intent1.ACTION_VIEW,"sms:"+__ref._phonenumber /*String*/ );
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="StartActivity(Intent1)";
__c.StartActivity(ba,(Object)(_intent1.getObject()));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="End Sub";
return "";
}
public String  _phone_click(b4a.example.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "phone_click", false))
	 {return ((String) Debug.delegate(ba, "phone_click", null));}
anywheresoftware.b4a.phone.Phone.PhoneCalls _p = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Phone_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim p As PhoneCalls";
_p = new anywheresoftware.b4a.phone.Phone.PhoneCalls();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Log(phoneNumber)";
__c.LogImpl("81245186",__ref._phonenumber /*String*/ ,0);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="StartActivity(p.call(phoneNumber))";
__c.StartActivity(ba,(Object)(_p.Call(__ref._phonenumber /*String*/ )));
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return "";
}
}