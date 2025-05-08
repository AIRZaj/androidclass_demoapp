package b4a.B4APagesNavBar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpage4_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpage4) ","b4xpage4",4,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpage4","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 14;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Root = Root1";
Debug.ShouldStop(16384);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"Page4\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Page4")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="NavBar1.Initialize(Root)";
Debug.ShouldStop(262144);
__ref.getField(false,"_navbar1" /*RemoteObject*/ ).runClassMethod (b4a.B4APagesNavBar.navbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpage4._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpage4._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpage4._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpage4._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private NavBar1 As NavBar";
b4xpage4._navbar1 = RemoteObject.createNew ("b4a.B4APagesNavBar.navbar");__ref.setField("_navbar1",b4xpage4._navbar1);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpage4) ","b4xpage4",4,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpage4","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Return Me";
Debug.ShouldStop(512);
if (true) return __ref;
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}