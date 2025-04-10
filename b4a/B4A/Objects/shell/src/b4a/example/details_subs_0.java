package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class details_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (details) ","details",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "details","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 14;BA.debugLine="Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Root = Root1";
Debug.ShouldStop(16384);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 16;BA.debugLine="Root.Color = xui.Color_White";
Debug.ShouldStop(32768);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"detail2\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("detail2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(262144);
details._lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl",details._lbl);
 BA.debugLineNum = 20;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="lbl.TextSize = 16";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 22;BA.debugLine="lbl.TextColor = xui.Color_White";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 23;BA.debugLine="lbl.Text = \"Szczegóły osoby...\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Szczegóły osoby..."));
 BA.debugLineNum = 24;BA.debugLine="lbl.Color = xui.Color_Black";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 27;BA.debugLine="lblInfo = lbl";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).setObject (__ref.getField(false,"_lbl" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 28;BA.debugLine="lblInfo.SetTextAlignment(\"TOP\", \"LEFT\") ' Ustawie";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("TOP")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 31;BA.debugLine="Root.AddView(lblInfo, 10dip, 10dip, 90%x, 100dip)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).getObject())),(Object)(details.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(details.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(details.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(details.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
 //BA.debugLineNum = 4;BA.debugLine="Private lblInfo As B4XView";
details._lblinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblinfo",details._lblinfo);
 //BA.debugLineNum = 5;BA.debugLine="Dim lbl As Label";
details._lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl",details._lbl);
 //BA.debugLineNum = 6;BA.debugLine="Dim info As String";
details._info = RemoteObject.createImmutable("");__ref.setField("_info",details._info);
 //BA.debugLineNum = 7;BA.debugLine="Private Panel1 As B4XView";
details._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel1",details._panel1);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (details) ","details",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "details","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("LoadPerson (details) ","details",2,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("loadperson")) { return __ref.runUserSub(false, "details","loadperson", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 34;BA.debugLine="Public Sub LoadPerson(p As Map)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim info As String";
Debug.ShouldStop(4);
details._info = RemoteObject.createImmutable("");__ref.setField("_info",details._info);
 BA.debugLineNum = 36;BA.debugLine="info = $\"Imię: ${p.Get(\"imie\")} Nazwisko: ${p.Get";
Debug.ShouldStop(8);
__ref.setField ("_info" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Imię: "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imie")))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Nazwisko: "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nazwisko")))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Tytuł: "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tytul")))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Zakład: "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaklad")))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Pokój: "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pokoj")))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Telefon: "),details.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("numer_telefonu")))))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 43;BA.debugLine="lblInfo.Text = info";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_info" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
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