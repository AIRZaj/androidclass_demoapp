package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class details_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (details) ","details",2,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "details","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 27;BA.debugLine="Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Root = Root1";
Debug.ShouldStop(134217728);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 29;BA.debugLine="Root.Color = xui.Color_White";
Debug.ShouldStop(268435456);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"detail2\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("detail2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="ImgAvatar.Load(File.DirAssets, \"avatar.png\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_imgavatar" /*RemoteObject*/ ).runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(details.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("avatar.png")));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView";
details._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",details._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
details._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",details._xui);
 //BA.debugLineNum = 5;BA.debugLine="Dim lbl As Label";
details._lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl",details._lbl);
 //BA.debugLineNum = 6;BA.debugLine="Dim info As String";
details._info = RemoteObject.createImmutable("");__ref.setField("_info",details._info);
 //BA.debugLineNum = 7;BA.debugLine="Private Panel1 As B4XView";
details._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel1",details._panel1);
 //BA.debugLineNum = 8;BA.debugLine="Private lblName As B4XView";
details._lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblname",details._lblname);
 //BA.debugLineNum = 9;BA.debugLine="Private lblTitle As B4XView";
details._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitle",details._lbltitle);
 //BA.debugLineNum = 10;BA.debugLine="Private lblDept As B4XView";
details._lbldept = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbldept",details._lbldept);
 //BA.debugLineNum = 11;BA.debugLine="Private lblRoom As B4XView";
details._lblroom = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblroom",details._lblroom);
 //BA.debugLineNum = 12;BA.debugLine="Private lblPhone As B4XView";
details._lblphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblphone",details._lblphone);
 //BA.debugLineNum = 13;BA.debugLine="Private lblMail As B4XView";
details._lblmail = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblmail",details._lblmail);
 //BA.debugLineNum = 14;BA.debugLine="Private ImgAvatar As B4XImageView";
details._imgavatar = RemoteObject.createNew ("b4a.example.b4ximageview");__ref.setField("_imgavatar",details._imgavatar);
 //BA.debugLineNum = 15;BA.debugLine="Private ImgView1 As B4XImageView";
details._imgview1 = RemoteObject.createNew ("b4a.example.b4ximageview");__ref.setField("_imgview1",details._imgview1);
 //BA.debugLineNum = 16;BA.debugLine="Private ImgView2 As B4XImageView";
details._imgview2 = RemoteObject.createNew ("b4a.example.b4ximageview");__ref.setField("_imgview2",details._imgview2);
 //BA.debugLineNum = 17;BA.debugLine="Private ImgView3 As B4XImageView";
details._imgview3 = RemoteObject.createNew ("b4a.example.b4ximageview");__ref.setField("_imgview3",details._imgview3);
 //BA.debugLineNum = 18;BA.debugLine="Private phoneNumber As String";
details._phonenumber = RemoteObject.createImmutable("");__ref.setField("_phonenumber",details._phonenumber);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (details) ","details",2,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "details","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadperson(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("LoadPerson (details) ","details",2,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("loadperson")) { return __ref.runUserSub(false, "details","loadperson", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 52;BA.debugLine="Public Sub LoadPerson(p As Map)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="lblName.Text = $\"${p.Get(\"tytul\")}. ${p.Get(\"imie";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblname" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tytul")))))),RemoteObject.createImmutable(". "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imie")))))),RemoteObject.createImmutable(" "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nazwisko")))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 55;BA.debugLine="lblDept.Text = $\"${p.Get(\"zaklad\")}\"$";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbldept" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaklad")))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 56;BA.debugLine="lblRoom.Text = $\"${p.Get(\"pokoj\")}\"$";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblroom" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pokoj")))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 57;BA.debugLine="lblMail.Text = $\"${p.Get(\"mail\")}\"$";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblmail" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mail")))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 58;BA.debugLine="phoneNumber=p.Get(\"telefon\")";
Debug.ShouldStop(33554432);
__ref.setField ("_phonenumber" /*RemoteObject*/ ,BA.ObjectToString(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefon"))))));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mailbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MailButton_Click (details) ","details",2,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("mailbutton_click")) { return __ref.runUserSub(false, "details","mailbutton_click", __ref);}
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 61;BA.debugLine="Sub MailButton_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(536870912);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 63;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"mailto:\"";
Debug.ShouldStop(1073741824);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("mailto:"),__ref.getField(false,"_lblmail" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 64;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(-2147483648);
details.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_intent1.getObject())));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _messagebutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MessageButton_Click (details) ","details",2,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("messagebutton_click")) { return __ref.runUserSub(false, "details","messagebutton_click", __ref);}
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 67;BA.debugLine="Sub MessageButton_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(8);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 69;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"sms:\" &";
Debug.ShouldStop(16);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("sms:"),__ref.getField(true,"_phonenumber" /*RemoteObject*/ ))));
 BA.debugLineNum = 70;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(32);
details.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_intent1.getObject())));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _phone_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Phone_Click (details) ","details",2,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("phone_click")) { return __ref.runUserSub(false, "details","phone_click", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneCalls");
 BA.debugLineNum = 72;BA.debugLine="Sub Phone_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Dim p As PhoneCalls";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneCalls");Debug.locals.put("p", _p);
 BA.debugLineNum = 74;BA.debugLine="Log(phoneNumber)";
Debug.ShouldStop(512);
details.__c.runVoidMethod ("LogImpl","81245186",__ref.getField(true,"_phonenumber" /*RemoteObject*/ ),0);
 BA.debugLineNum = 75;BA.debugLine="StartActivity(p.call(phoneNumber))";
Debug.ShouldStop(1024);
details.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_p.runMethod(false,"Call",(Object)(__ref.getField(true,"_phonenumber" /*RemoteObject*/ ))))));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}