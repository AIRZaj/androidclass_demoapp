package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _addclickevent(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("AddClickEvent (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("addclickevent")) { return __ref.runUserSub(false, "b4xmainpage","addclickevent", __ref, _v);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("v", _v);
 BA.debugLineNum = 53;BA.debugLine="Private Sub AddClickEvent(v As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Dim jo As JavaObject = v";
Debug.ShouldStop(2097152);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _v.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 55;BA.debugLine="jo.RunMethod(\"setOnClickListener\", Array As Objec";
Debug.ShouldStop(4194304);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnClickListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref,(RemoteObject.createImmutable("HandleClick"))})));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _mi = RemoteObject.declareNull("b4a.example.b4xpagesmanager._b4amenuitem");
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _svpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Public Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 25;BA.debugLine="Root.Color = xui.Color_White";
Debug.ShouldStop(16777216);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 27;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
Debug.ShouldStop(67108864);
_mi = b4xmainpage._b4xpages.runMethod(false,"_addmenuitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("btnUpdate"))));Debug.locals.put("mi", _mi);Debug.locals.put("mi", _mi);
 BA.debugLineNum = 28;BA.debugLine="mi.AddToBar = True";
Debug.ShouldStop(134217728);
_mi.setField ("AddToBar" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 29;BA.debugLine="mi.Tag = \"btnUpdate\"";
Debug.ShouldStop(268435456);
_mi.setField ("Tag" /*RemoteObject*/ ,BA.ObjectToString("btnUpdate"));
 BA.debugLineNum = 31;BA.debugLine="Details.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_details" /*RemoteObject*/ ).runClassMethod (b4a.example.details.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="B4XPages.AddPageAndCreate(\"Details\", Details)";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Details")),(Object)((__ref.getField(false,"_details" /*RemoteObject*/ ))));
 BA.debugLineNum = 35;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(4);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 36;BA.debugLine="btn.Initialize(\"btnUpdate\")";
Debug.ShouldStop(8);
_btn.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnUpdate")));
 BA.debugLineNum = 37;BA.debugLine="btn.Text = \"🔄 Aktualizujjjj\"";
Debug.ShouldStop(16);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence("🔄 Aktualizujjjj"));
 BA.debugLineNum = 38;BA.debugLine="btn.TextColor = xui.Color_White";
Debug.ShouldStop(32);
_btn.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 39;BA.debugLine="btn.Color = xui.Color_RGB(0,150,1)";
Debug.ShouldStop(64);
_btn.runVoidMethod ("setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 40;BA.debugLine="btnUpdate = btn";
Debug.ShouldStop(128);
__ref.getField(false,"_btnupdate" /*RemoteObject*/ ).setObject (_btn.getObject());
 BA.debugLineNum = 41;BA.debugLine="Root.AddView(btnUpdate, 10dip, 10dip, 150dip, 50d";
Debug.ShouldStop(256);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnupdate" /*RemoteObject*/ ).getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 43;BA.debugLine="Dim svPanel As ScrollView";
Debug.ShouldStop(1024);
_svpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("svPanel", _svpanel);
 BA.debugLineNum = 44;BA.debugLine="svPanel.Initialize(100%y)";
Debug.ShouldStop(2048);
_svpanel.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(b4xmainpage.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 45;BA.debugLine="sv = svPanel";
Debug.ShouldStop(4096);
__ref.setField ("_sv" /*RemoteObject*/ ,_svpanel);
 BA.debugLineNum = 46;BA.debugLine="Root.AddView(sv, 0, 70dip, 100%x, 100%y - 70dip)";
Debug.ShouldStop(8192);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)));
 BA.debugLineNum = 48;BA.debugLine="personsList.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_personslist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="FetchData";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_fetchdata" /*RemoteObject*/ );
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
public static RemoteObject  _btnupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("btnupdate_click")) { return __ref.runUserSub(false, "b4xmainpage","btnupdate_click", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Sub btnUpdate_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="FetchData";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_fetchdata" /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="ToastMessageShow(\"siema\", False)";
Debug.ShouldStop(134217728);
b4xmainpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("siema")),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _card_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("card_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("card_click")) { return __ref.runUserSub(false, "b4xmainpage","card_click", __ref);}
RemoteObject _clickedpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _persondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 143;BA.debugLine="Sub card_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Dim clickedPanel As Panel = Sender";
Debug.ShouldStop(32768);
_clickedpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_clickedpanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), b4xmainpage.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("clickedPanel", _clickedpanel);Debug.locals.put("clickedPanel", _clickedpanel);
 BA.debugLineNum = 145;BA.debugLine="Dim personData As Map = clickedPanel.Tag";
Debug.ShouldStop(65536);
_persondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_persondata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _clickedpanel.runMethod(false,"getTag"));Debug.locals.put("personData", _persondata);Debug.locals.put("personData", _persondata);
 BA.debugLineNum = 146;BA.debugLine="B4XPages.ShowPage(\"Details\")";
Debug.ShouldStop(131072);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Details")));
 BA.debugLineNum = 147;BA.debugLine="B4XPages.GetPage(\"Details\").As(details).LoadPerso";
Debug.ShouldStop(262144);
((b4xmainpage._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Details"))))).runClassMethod (b4a.example.details.class, "_loadperson" /*RemoteObject*/ ,(Object)(_persondata));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 11;BA.debugLine="Private sv As ScrollView";
b4xmainpage._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_sv",b4xmainpage._sv);
 //BA.debugLineNum = 12;BA.debugLine="Private btnUpdate As B4XView";
b4xmainpage._btnupdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnupdate",b4xmainpage._btnupdate);
 //BA.debugLineNum = 13;BA.debugLine="Private xHttp As HttpJob";
b4xmainpage._xhttp = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_xhttp",b4xmainpage._xhttp);
 //BA.debugLineNum = 14;BA.debugLine="Private personsList As List";
b4xmainpage._personslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_personslist",b4xmainpage._personslist);
 //BA.debugLineNum = 15;BA.debugLine="Private Details As details";
b4xmainpage._details = RemoteObject.createNew ("b4a.example.details");__ref.setField("_details",b4xmainpage._details);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcard(RemoteObject __ref,RemoteObject _item,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("CreateCard (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("createcard")) { return __ref.runUserSub(false, "b4xmainpage","createcard", __ref, _item, _idx);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("item", _item);
Debug.locals.put("idx", _idx);
 BA.debugLineNum = 151;BA.debugLine="Private Sub CreateCard(item As Map, idx As Int) As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8388608);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 153;BA.debugLine="pnl.Color = xui.Color_White";
Debug.ShouldStop(16777216);
_pnl.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 154;BA.debugLine="pnl.Tag = idx";
Debug.ShouldStop(33554432);
_pnl.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 155;BA.debugLine="AddClickEvent(pnl)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_addclickevent" /*RemoteObject*/ ,(Object)(_pnl));
 BA.debugLineNum = 157;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(268435456);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 158;BA.debugLine="cd.Initialize(xui.Color_White, 10dip)";
Debug.ShouldStop(536870912);
_cd.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 160;BA.debugLine="pnl.SetColorAndBorder(Colors.Black, 0, 0, 10dip)";
Debug.ShouldStop(-2147483648);
_pnl.runVoidMethod ("SetColorAndBorder",(Object)(b4xmainpage.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 162;BA.debugLine="Dim lbl1 As Label";
Debug.ShouldStop(2);
_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl1", _lbl1);
 BA.debugLineNum = 163;BA.debugLine="lbl1.Initialize(\"\")";
Debug.ShouldStop(4);
_lbl1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 164;BA.debugLine="lbl1.Text = item.Get(\"tytul\") & \" \" & item.Get(\"i";
Debug.ShouldStop(8);
_lbl1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tytul")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imie")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nazwisko")))))));
 BA.debugLineNum = 165;BA.debugLine="lbl1.TextSize = 18";
Debug.ShouldStop(16);
_lbl1.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 166;BA.debugLine="lbl1.TextColor = Colors.Black";
Debug.ShouldStop(32);
_lbl1.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 167;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
_lbl1.runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 168;BA.debugLine="pnl.AddView(lbl1, 10dip, 10dip, 80%x, 30dip)";
Debug.ShouldStop(128);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 170;BA.debugLine="Dim lbl2 As Label";
Debug.ShouldStop(512);
_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl2", _lbl2);
 BA.debugLineNum = 171;BA.debugLine="lbl2.Initialize(\"\")";
Debug.ShouldStop(1024);
_lbl2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 172;BA.debugLine="lbl2.Text = \"Pokój: \" & item.Get(\"pokoj\") & \" | Z";
Debug.ShouldStop(2048);
_lbl2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Pokój: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pokoj")))),RemoteObject.createImmutable(" | Zakład: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaklad")))))));
 BA.debugLineNum = 173;BA.debugLine="lbl2.TextSize = 14";
Debug.ShouldStop(4096);
_lbl2.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 174;BA.debugLine="lbl2.TextColor = Colors.Gray";
Debug.ShouldStop(8192);
_lbl2.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 175;BA.debugLine="pnl.AddView(lbl2, 10dip, 45dip, 80%x, 20dip)";
Debug.ShouldStop(16384);
_pnl.runVoidMethod ("AddView",(Object)((_lbl2.getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 177;BA.debugLine="Dim lbl3 As Label";
Debug.ShouldStop(65536);
_lbl3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl3", _lbl3);
 BA.debugLineNum = 178;BA.debugLine="lbl3.Initialize(\"\")";
Debug.ShouldStop(131072);
_lbl3.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 179;BA.debugLine="lbl3.Text = \"📞 \" & item.Get(\"numer_telefonu\")";
Debug.ShouldStop(262144);
_lbl3.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("📞 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("numer_telefonu")))))));
 BA.debugLineNum = 180;BA.debugLine="lbl3.TextSize = 14";
Debug.ShouldStop(524288);
_lbl3.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 181;BA.debugLine="lbl3.TextColor = Colors.Blue";
Debug.ShouldStop(1048576);
_lbl3.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 182;BA.debugLine="pnl.AddView(lbl3, 10dip, 70dip, 80%x, 20dip)";
Debug.ShouldStop(2097152);
_pnl.runVoidMethod ("AddView",(Object)((_lbl3.getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 184;BA.debugLine="Return pnl";
Debug.ShouldStop(8388608);
if (true) return _pnl;
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fetchdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FetchData (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("fetchdata")) { return __ref.runUserSub(false, "b4xmainpage","fetchdata", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Sub FetchData";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="xHttp.Initialize(\"Job1\", Me)";
Debug.ShouldStop(2048);
__ref.getField(false,"_xhttp" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Job1")),(Object)(__ref));
 BA.debugLineNum = 77;BA.debugLine="xHttp.Download(\"https://api.android.mzelent.pl/pe";
Debug.ShouldStop(4096);
__ref.getField(false,"_xhttp" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("https://api.android.mzelent.pl/persons/")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleclick(RemoteObject __ref,RemoteObject _viewtag) throws Exception{
try {
		Debug.PushSubsStack("HandleClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("handleclick")) { return __ref.runUserSub(false, "b4xmainpage","handleclick", __ref, _viewtag);}
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _person = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ViewTag", _viewtag);
 BA.debugLineNum = 63;BA.debugLine="Sub HandleClick (ViewTag As Object)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="If ViewTag = \"update\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_viewtag,RemoteObject.createImmutable(("update")))) { 
 BA.debugLineNum = 65;BA.debugLine="FetchData";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_fetchdata" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 68;BA.debugLine="Dim idx As Int = ViewTag";
Debug.ShouldStop(8);
_idx = BA.numberCast(int.class, _viewtag);Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 69;BA.debugLine="Dim person As Map = personsList.Get(idx)";
Debug.ShouldStop(16);
_person = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_person = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_idx)));Debug.locals.put("person", _person);Debug.locals.put("person", _person);
 BA.debugLineNum = 70;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Details";
Debug.ShouldStop(32);
b4xmainpage._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DetailsPage")));
 BA.debugLineNum = 71;BA.debugLine="B4XPages.GetPage(\"Details\").As(details).LoadPers";
Debug.ShouldStop(64);
((b4xmainpage._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Details"))))).runClassMethod (b4a.example.details.class, "_loadperson" /*RemoteObject*/ ,(Object)(_person));
 };
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
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
public static RemoteObject  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "b4xmainpage","jobdone", __ref, _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 80;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(65536);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 82;BA.debugLine="ParseJSON(Job.GetString)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_parsejson" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 84;BA.debugLine="xui.MsgboxAsync(\"Błąd: \" & Job.ErrorMessage, \"Bł";
Debug.ShouldStop(524288);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Błąd: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Błąd"))));
 };
 BA.debugLineNum = 86;BA.debugLine="Job.Release";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsejson(RemoteObject __ref,RemoteObject _jsonstring) throws Exception{
try {
		Debug.PushSubsStack("ParseJSON (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("parsejson")) { return __ref.runUserSub(false, "b4xmainpage","parsejson", __ref, _jsonstring);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _card = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbldetails = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblphone = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 89;BA.debugLine="Sub ParseJSON(jsonString As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 91;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 92;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 93;BA.debugLine="personsList = parser.NextArray";
Debug.ShouldStop(268435456);
__ref.setField ("_personslist" /*RemoteObject*/ ,_parser.runMethod(false,"NextArray"));
 BA.debugLineNum = 94;BA.debugLine="sv.Panel.RemoveAllViews";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 95;BA.debugLine="sv.Panel.Height = personsList.Size * 130dip";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(true,"getSize"),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "*",0, 1));
 BA.debugLineNum = 97;BA.debugLine="For i = 0 To personsList.Size - 1";
Debug.ShouldStop(1);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 98;BA.debugLine="Dim item As Map = personsList.Get(i)";
Debug.ShouldStop(2);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 101;BA.debugLine="Dim card As Panel";
Debug.ShouldStop(16);
_card = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("card", _card);
 BA.debugLineNum = 102;BA.debugLine="card.Initialize(\"card\")";
Debug.ShouldStop(32);
_card.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("card")));
 BA.debugLineNum = 103;BA.debugLine="card.Tag = item ' Cały map przekazujemy do szcz";
Debug.ShouldStop(64);
_card.runMethod(false,"setTag",(_item.getObject()));
 BA.debugLineNum = 104;BA.debugLine="card.Color = Colors.White";
Debug.ShouldStop(128);
_card.runVoidMethod ("setColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 105;BA.debugLine="sv.Panel.AddView(card, 5%x, i * 130dip, 90%x, 1";
Debug.ShouldStop(256);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_card.getObject())),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "*",0, 1)),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 108;BA.debugLine="Dim lblName As Label";
Debug.ShouldStop(2048);
_lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblName", _lblname);
 BA.debugLineNum = 109;BA.debugLine="lblName.Initialize(\"\")";
Debug.ShouldStop(4096);
_lblname.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 110;BA.debugLine="lblName.Text = item.Get(\"tytul\") & \" \" & item.G";
Debug.ShouldStop(8192);
_lblname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tytul")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imie")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nazwisko")))))));
 BA.debugLineNum = 111;BA.debugLine="lblName.TextSize = 18";
Debug.ShouldStop(16384);
_lblname.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 112;BA.debugLine="lblName.TextColor = Colors.Black";
Debug.ShouldStop(32768);
_lblname.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 113;BA.debugLine="lblName.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
_lblname.runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 114;BA.debugLine="card.AddView(lblName, 10dip, 10dip, 80%x, 30dip";
Debug.ShouldStop(131072);
_card.runVoidMethod ("AddView",(Object)((_lblname.getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 116;BA.debugLine="Dim lblDetails As Label";
Debug.ShouldStop(524288);
_lbldetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblDetails", _lbldetails);
 BA.debugLineNum = 117;BA.debugLine="lblDetails.Initialize(\"\")";
Debug.ShouldStop(1048576);
_lbldetails.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 118;BA.debugLine="lblDetails.Text = \"Pokój: \" & item.Get(\"pokoj\")";
Debug.ShouldStop(2097152);
_lbldetails.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Pokój: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pokoj")))),RemoteObject.createImmutable(" | Zakład: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaklad")))))));
 BA.debugLineNum = 119;BA.debugLine="lblDetails.TextSize = 14";
Debug.ShouldStop(4194304);
_lbldetails.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 120;BA.debugLine="lblDetails.TextColor = Colors.Gray";
Debug.ShouldStop(8388608);
_lbldetails.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 121;BA.debugLine="card.AddView(lblDetails, 10dip, 45dip, 80%x, 20";
Debug.ShouldStop(16777216);
_card.runVoidMethod ("AddView",(Object)((_lbldetails.getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 123;BA.debugLine="Dim lblPhone As Label";
Debug.ShouldStop(67108864);
_lblphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblPhone", _lblphone);
 BA.debugLineNum = 124;BA.debugLine="lblPhone.Initialize(\"phoneLabel\")";
Debug.ShouldStop(134217728);
_lblphone.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("phoneLabel")));
 BA.debugLineNum = 125;BA.debugLine="lblPhone.Text = \"📞 \" & item.Get(\"numer_telefon";
Debug.ShouldStop(268435456);
_lblphone.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("📞 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("numer_telefonu")))))));
 BA.debugLineNum = 126;BA.debugLine="lblPhone.TextSize = 14";
Debug.ShouldStop(536870912);
_lblphone.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 127;BA.debugLine="lblPhone.TextColor = Colors.Blue";
Debug.ShouldStop(1073741824);
_lblphone.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 128;BA.debugLine="lblPhone.Tag = item.Get(\"numer_telefonu\")";
Debug.ShouldStop(-2147483648);
_lblphone.runMethod(false,"setTag",_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("numer_telefonu")))));
 BA.debugLineNum = 129;BA.debugLine="card.AddView(lblPhone, 10dip, 70dip, 80%x, 20di";
Debug.ShouldStop(1);
_card.runVoidMethod ("AddView",(Object)((_lblphone.getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 132;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(8);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 133;BA.debugLine="cd.Initialize(Colors.White, 10dip)";
Debug.ShouldStop(16);
_cd.runVoidMethod ("Initialize",(Object)(b4xmainpage.__c.getField(false,"Colors").getField(true,"White")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 134;BA.debugLine="card.Background = cd";
Debug.ShouldStop(32);
_card.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 135;BA.debugLine="card.Elevation = 5dip";
Debug.ShouldStop(64);
_card.runMethod(true,"setElevation",BA.numberCast(float.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e40) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e40.toString()); BA.debugLineNum = 138;BA.debugLine="xui.MsgboxAsync(\"Błąd przetwarzania JSON!\", \"Błą";
Debug.ShouldStop(512);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Błąd przetwarzania JSON!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Błąd"))));
 };
 BA.debugLineNum = 140;BA.debugLine="End Sub";
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