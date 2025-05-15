package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class navbar_subs_0 {


public static RemoteObject  _btnnavbar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnNavBar_Click (navbar) ","navbar",6,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("btnnavbar_click")) { return __ref.runUserSub(false, "navbar","btnnavbar_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
 BA.debugLineNum = 18;BA.debugLine="Private Sub btnNavBar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Private btn As B4XView";
Debug.ShouldStop(262144);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 20;BA.debugLine="Private Index As Int";
Debug.ShouldStop(524288);
_index = RemoteObject.createImmutable(0);Debug.locals.put("Index", _index);
 BA.debugLineNum = 22;BA.debugLine="btn = Sender";
Debug.ShouldStop(2097152);
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), navbar.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 23;BA.debugLine="Index = btn.Tag";
Debug.ShouldStop(4194304);
_index = BA.numberCast(int.class, _btn.runMethod(false,"getTag"));Debug.locals.put("Index", _index);
 BA.debugLineNum = 27;BA.debugLine="Select Index";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_index,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 29;BA.debugLine="MP.CurrentPage = MP";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mp" /*RemoteObject*/ ).setField ("_currentpage" /*RemoteObject*/ ,(__ref.getField(false,"_mp" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPa";
Debug.ShouldStop(536870912);
navbar._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 break; }
case 1: {
 BA.debugLineNum = 32;BA.debugLine="MP.CurrentPage = MP.Page2";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mp" /*RemoteObject*/ ).setField ("_currentpage" /*RemoteObject*/ ,(__ref.getField(false,"_mp" /*RemoteObject*/ ).getField(false,"_page2" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 2";
Debug.ShouldStop(1);
navbar._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Page 2")));
 break; }
case 2: {
 BA.debugLineNum = 35;BA.debugLine="MP.CurrentPage = MP.Page4";
Debug.ShouldStop(4);
__ref.getField(false,"_mp" /*RemoteObject*/ ).setField ("_currentpage" /*RemoteObject*/ ,(__ref.getField(false,"_mp" /*RemoteObject*/ ).getField(false,"_page4" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 4";
Debug.ShouldStop(8);
navbar._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Page 4")));
 break; }
}
;
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
navbar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",navbar._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private pnlParent As B4XView";
navbar._pnlparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlparent",navbar._pnlparent);
 //BA.debugLineNum = 6;BA.debugLine="Private btnMainPage As B4XView";
navbar._btnmainpage = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnmainpage",navbar._btnmainpage);
 //BA.debugLineNum = 7;BA.debugLine="Private MP As B4XMainPage";
navbar._mp = RemoteObject.createNew ("b4a.example.b4xmainpage");__ref.setField("_mp",navbar._mp);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (navbar) ","navbar",6,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "navbar","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(Parent As B4XView)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="pnlParent = Parent";
Debug.ShouldStop(2048);
__ref.setField ("_pnlparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 14;BA.debugLine="MP = B4XPages.MainPage";
Debug.ShouldStop(8192);
__ref.setField ("_mp" /*RemoteObject*/ ,navbar._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 15;BA.debugLine="pnlParent.LoadLayout(\"NavBar\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnlparent" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("NavBar")),__ref.getField(false, "ba"));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}