package b4a.B4APagesNavBar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class navbar_subs_0 {


public static RemoteObject  _btnnavbar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnNavBar_Click (navbar) ","navbar",5,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("btnnavbar_click")) { return __ref.runUserSub(false, "navbar","btnnavbar_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _labelborderdefault = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _labelborder = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 BA.debugLineNum = 21;BA.debugLine="Private Sub btnNavBar_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Private btn As Panel";
Debug.ShouldStop(2097152);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 23;BA.debugLine="Private Index As Int";
Debug.ShouldStop(4194304);
_index = RemoteObject.createImmutable(0);Debug.locals.put("Index", _index);
 BA.debugLineNum = 25;BA.debugLine="btn = Sender";
Debug.ShouldStop(16777216);
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), navbar.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 26;BA.debugLine="Index = btn.Tag";
Debug.ShouldStop(33554432);
_index = BA.numberCast(int.class, _btn.runMethod(false,"getTag"));Debug.locals.put("Index", _index);
 BA.debugLineNum = 28;BA.debugLine="Dim LabelBorderDefault As ColorDrawable";
Debug.ShouldStop(134217728);
_labelborderdefault = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("LabelBorderDefault", _labelborderdefault);
 BA.debugLineNum = 29;BA.debugLine="Dim LabelBorder As ColorDrawable";
Debug.ShouldStop(268435456);
_labelborder = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("LabelBorder", _labelborder);
 BA.debugLineNum = 30;BA.debugLine="LabelBorderDefault.initialize2(Colors.Transparent";
Debug.ShouldStop(536870912);
_labelborderdefault.runVoidMethod ("Initialize2",(Object)(navbar.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(navbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(navbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(navbar.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 31;BA.debugLine="btnMainPage.Background=LabelBorderDefault";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btnmainpage" /*RemoteObject*/ ).runMethod(false,"setBackground",(_labelborderdefault.getObject()));
 BA.debugLineNum = 32;BA.debugLine="btnPage2.Background=LabelBorderDefault";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btnpage2" /*RemoteObject*/ ).runMethod(false,"setBackground",(_labelborderdefault.getObject()));
 BA.debugLineNum = 33;BA.debugLine="btnPage3.Background=LabelBorderDefault";
Debug.ShouldStop(1);
__ref.getField(false,"_btnpage3" /*RemoteObject*/ ).runMethod(false,"setBackground",(_labelborderdefault.getObject()));
 BA.debugLineNum = 34;BA.debugLine="btnPage4.Background=LabelBorderDefault";
Debug.ShouldStop(2);
__ref.getField(false,"_btnpage4" /*RemoteObject*/ ).runMethod(false,"setBackground",(_labelborderdefault.getObject()));
 BA.debugLineNum = 37;BA.debugLine="Select Index";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_index,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 39;BA.debugLine="MP.CurrentPage = MP";
Debug.ShouldStop(64);
__ref.getField(false,"_mp" /*RemoteObject*/ ).setField ("_currentpage" /*RemoteObject*/ ,(__ref.getField(false,"_mp" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPa";
Debug.ShouldStop(128);
navbar._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 break; }
case 1: {
 BA.debugLineNum = 42;BA.debugLine="MP.CurrentPage = MP.Page2";
Debug.ShouldStop(512);
__ref.getField(false,"_mp" /*RemoteObject*/ ).setField ("_currentpage" /*RemoteObject*/ ,(__ref.getField(false,"_mp" /*RemoteObject*/ ).getField(false,"_page2" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 2";
Debug.ShouldStop(1024);
navbar._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Page 2")));
 break; }
case 2: {
 break; }
case 3: {
 BA.debugLineNum = 48;BA.debugLine="MP.CurrentPage = MP.Page4";
Debug.ShouldStop(32768);
__ref.getField(false,"_mp" /*RemoteObject*/ ).setField ("_currentpage" /*RemoteObject*/ ,(__ref.getField(false,"_mp" /*RemoteObject*/ ).getField(false,"_page4" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 4";
Debug.ShouldStop(65536);
navbar._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Page 4")));
 break; }
}
;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
 //BA.debugLineNum = 6;BA.debugLine="Public btnMainPage As Panel";
navbar._btnmainpage = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_btnmainpage",navbar._btnmainpage);
 //BA.debugLineNum = 7;BA.debugLine="Private MP As B4XMainPage";
navbar._mp = RemoteObject.createNew ("b4a.B4APagesNavBar.b4xmainpage");__ref.setField("_mp",navbar._mp);
 //BA.debugLineNum = 8;BA.debugLine="Public btnPage2 As Panel";
navbar._btnpage2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_btnpage2",navbar._btnpage2);
 //BA.debugLineNum = 9;BA.debugLine="Public btnPage3 As Panel";
navbar._btnpage3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_btnpage3",navbar._btnpage3);
 //BA.debugLineNum = 10;BA.debugLine="Public btnPage4 As Panel";
navbar._btnpage4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_btnpage4",navbar._btnpage4);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (navbar) ","navbar",5,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "navbar","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(Parent As B4XView)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="pnlParent = Parent";
Debug.ShouldStop(16384);
__ref.setField ("_pnlparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 17;BA.debugLine="MP = B4XPages.MainPage";
Debug.ShouldStop(65536);
__ref.setField ("_mp" /*RemoteObject*/ ,navbar._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 18;BA.debugLine="pnlParent.LoadLayout(\"NavBar\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlparent" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("NavBar")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}