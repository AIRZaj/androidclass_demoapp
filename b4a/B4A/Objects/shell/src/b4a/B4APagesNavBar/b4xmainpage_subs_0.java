package b4a.B4APagesNavBar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 28;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Root = Root1";
Debug.ShouldStop(268435456);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="Page2.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_page2" /*RemoteObject*/ ).runClassMethod (b4a.B4APagesNavBar.b4xpage2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.AddPage(\"Page 2\", Page2)";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Page 2")),(Object)((__ref.getField(false,"_page2" /*RemoteObject*/ ))));
 BA.debugLineNum = 34;BA.debugLine="Details.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_details" /*RemoteObject*/ ).runClassMethod (b4a.B4APagesNavBar.details.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="B4XPages.AddPage(\"Details\", Details)";
Debug.ShouldStop(4);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Details")),(Object)((__ref.getField(false,"_details" /*RemoteObject*/ ))));
 BA.debugLineNum = 36;BA.debugLine="Page4.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_page4" /*RemoteObject*/ ).runClassMethod (b4a.B4APagesNavBar.b4xpage4.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 37;BA.debugLine="B4XPages.AddPage(\"Page 4\", Page4)";
Debug.ShouldStop(16);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Page 4")),(Object)((__ref.getField(false,"_page4" /*RemoteObject*/ ))));
 BA.debugLineNum = 39;BA.debugLine="NavBar1.Initialize(Root)";
Debug.ShouldStop(64);
__ref.getField(false,"_navbar1" /*RemoteObject*/ ).runClassMethod (b4a.B4APagesNavBar.navbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="CurrentPage = B4XPages.MainPage";
Debug.ShouldStop(128);
__ref.setField ("_currentpage" /*RemoteObject*/ ,(b4xmainpage._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba"))));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Resize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("b4xpage_resize")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 48;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public Page2 As B4XPage2";
b4xmainpage._page2 = RemoteObject.createNew ("b4a.B4APagesNavBar.b4xpage2");__ref.setField("_page2",b4xmainpage._page2);
 //BA.debugLineNum = 12;BA.debugLine="Public Details As details";
b4xmainpage._details = RemoteObject.createNew ("b4a.B4APagesNavBar.details");__ref.setField("_details",b4xmainpage._details);
 //BA.debugLineNum = 13;BA.debugLine="Public Page4 As B4XPage4";
b4xmainpage._page4 = RemoteObject.createNew ("b4a.B4APagesNavBar.b4xpage4");__ref.setField("_page4",b4xmainpage._page4);
 //BA.debugLineNum = 15;BA.debugLine="Private NavBar1 As NavBar";
b4xmainpage._navbar1 = RemoteObject.createNew ("b4a.B4APagesNavBar.navbar");__ref.setField("_navbar1",b4xmainpage._navbar1);
 //BA.debugLineNum = 16;BA.debugLine="Public CurrentPage As Object";
b4xmainpage._currentpage = RemoteObject.createNew ("Object");__ref.setField("_currentpage",b4xmainpage._currentpage);
 //BA.debugLineNum = 17;BA.debugLine="Private pnlMainPage As B4XView";
b4xmainpage._pnlmainpage = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlmainpage",b4xmainpage._pnlmainpage);
 //BA.debugLineNum = 18;BA.debugLine="Dim rp As RuntimePermissions";
b4xmainpage._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",b4xmainpage._rp);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="rp.CheckAndRequest(\"android.permission.CALL_PHONE";
Debug.ShouldStop(2097152);
__ref.getField(false,"_rp" /*RemoteObject*/ ).runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("android.permission.CALL_PHONE")));
 BA.debugLineNum = 24;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
Debug.ShouldStop(8388608);
b4xmainpage._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_transitionanimationduration" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}