package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpage2_subs_0 {


public static RemoteObject  _addclickevent(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("AddClickEvent (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("addclickevent")) { return __ref.runUserSub(false, "b4xpage2","addclickevent", __ref, _v);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("v", _v);
 BA.debugLineNum = 49;BA.debugLine="Private Sub AddClickEvent(v As B4XView)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim jo As JavaObject = v";
Debug.ShouldStop(131072);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _v.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 51;BA.debugLine="jo.RunMethod(\"setOnClickListener\", Array As Objec";
Debug.ShouldStop(262144);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnClickListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref,(RemoteObject.createImmutable("HandleClick"))})));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("B4XPage_Created (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpage2","b4xpage_created", __ref, _root1);}
RemoteObject _svpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"Page2\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Page2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="NavBar1.Initialize(Root)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_navbar1" /*RemoteObject*/ ).runClassMethod (b4a.example.navbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="Root = Root1";
Debug.ShouldStop(268435456);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 30;BA.debugLine="Root.Color = xui.Color_White";
Debug.ShouldStop(536870912);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.AddMenuItem(Me, \"Aktualizuj\")";
Debug.ShouldStop(1);
b4xpage2._b4xpages.runVoidMethod ("_addmenuitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Aktualizuj"))));
 BA.debugLineNum = 35;BA.debugLine="Dim svPanel As ScrollView";
Debug.ShouldStop(4);
_svpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("svPanel", _svpanel);
 BA.debugLineNum = 36;BA.debugLine="svPanel.Initialize(80%y)";
Debug.ShouldStop(8);
_svpanel.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(b4xpage2.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 37;BA.debugLine="sv = svPanel";
Debug.ShouldStop(16);
__ref.setField ("_sv" /*RemoteObject*/ ,_svpanel);
 BA.debugLineNum = 38;BA.debugLine="Root.AddView(sv, 0, 70dip, 100%x, 80%y - 70dip)";
Debug.ShouldStop(32);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {b4xpage2.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba")),b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)));
 BA.debugLineNum = 40;BA.debugLine="personsList.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_personslist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="FetchData";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.b4xpage2.class, "_fetchdata" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_menuclick(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_MenuClick (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("b4xpage_menuclick")) { return __ref.runUserSub(false, "b4xpage2","b4xpage_menuclick", __ref, _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 44;BA.debugLine="Sub B4XPage_MenuClick(Tag As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If Tag=\"Aktualizuj\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_tag,BA.ObjectToString("Aktualizuj"))) { 
 BA.debugLineNum = 46;BA.debugLine="FetchData";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.b4xpage2.class, "_fetchdata" /*RemoteObject*/ );
 };
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
public static RemoteObject  _card_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("card_Click (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("card_click")) { return __ref.runUserSub(false, "b4xpage2","card_click", __ref);}
RemoteObject _clickedpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _persondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 157;BA.debugLine="Sub card_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Dim clickedPanel As Panel = Sender";
Debug.ShouldStop(536870912);
_clickedpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_clickedpanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), b4xpage2.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("clickedPanel", _clickedpanel);Debug.locals.put("clickedPanel", _clickedpanel);
 BA.debugLineNum = 159;BA.debugLine="Dim personData As Map = clickedPanel.Tag";
Debug.ShouldStop(1073741824);
_persondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_persondata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _clickedpanel.runMethod(false,"getTag"));Debug.locals.put("personData", _persondata);Debug.locals.put("personData", _persondata);
 BA.debugLineNum = 160;BA.debugLine="B4XPages.ShowPage(\"Details\")";
Debug.ShouldStop(-2147483648);
b4xpage2._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Details")));
 BA.debugLineNum = 161;BA.debugLine="B4XPages.GetPage(\"Details\").As(Details).LoadPerso";
Debug.ShouldStop(1);
((b4xpage2._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Details"))))).runClassMethod (b4a.example.details.class, "_loadperson" /*RemoteObject*/ ,(Object)(_persondata));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
b4xpage2._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpage2._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpage2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpage2._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private NavBar1 As NavBar";
b4xpage2._navbar1 = RemoteObject.createNew ("b4a.example.navbar");__ref.setField("_navbar1",b4xpage2._navbar1);
 //BA.debugLineNum = 6;BA.debugLine="Public lblTest As B4XView	'used to show how to ac";
b4xpage2._lbltest = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltest",b4xpage2._lbltest);
 //BA.debugLineNum = 7;BA.debugLine="Private Root As B4XView";
b4xpage2._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpage2._root);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
b4xpage2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpage2._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private sv As ScrollView";
b4xpage2._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_sv",b4xpage2._sv);
 //BA.debugLineNum = 10;BA.debugLine="Private btnUpdate As B4XView";
b4xpage2._btnupdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnupdate",b4xpage2._btnupdate);
 //BA.debugLineNum = 11;BA.debugLine="Private xHttp As HttpJob";
b4xpage2._xhttp = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_xhttp",b4xpage2._xhttp);
 //BA.debugLineNum = 12;BA.debugLine="Private personsList As List";
b4xpage2._personslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_personslist",b4xpage2._personslist);
 //BA.debugLineNum = 13;BA.debugLine="Private Details As details";
b4xpage2._details = RemoteObject.createNew ("b4a.example.details");__ref.setField("_details",b4xpage2._details);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcard(RemoteObject __ref,RemoteObject _item,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("CreateCard (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("createcard")) { return __ref.runUserSub(false, "b4xpage2","createcard", __ref, _item, _idx);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("item", _item);
Debug.locals.put("idx", _idx);
 BA.debugLineNum = 166;BA.debugLine="Private Sub CreateCard(item As Map, idx As Int) As";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(64);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 168;BA.debugLine="pnl.Color = xui.Color_White";
Debug.ShouldStop(128);
_pnl.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 169;BA.debugLine="pnl.Tag = idx";
Debug.ShouldStop(256);
_pnl.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 170;BA.debugLine="AddClickEvent(pnl)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.b4xpage2.class, "_addclickevent" /*RemoteObject*/ ,(Object)(_pnl));
 BA.debugLineNum = 172;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(2048);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 173;BA.debugLine="cd.Initialize(xui.Color_White, 10dip)";
Debug.ShouldStop(4096);
_cd.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 175;BA.debugLine="pnl.SetColorAndBorder(Colors.Black, 0, 0, 10dip)";
Debug.ShouldStop(16384);
_pnl.runVoidMethod ("SetColorAndBorder",(Object)(b4xpage2.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 177;BA.debugLine="Dim lbl1 As Label";
Debug.ShouldStop(65536);
_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl1", _lbl1);
 BA.debugLineNum = 178;BA.debugLine="lbl1.Initialize(\"\")";
Debug.ShouldStop(131072);
_lbl1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 179;BA.debugLine="lbl1.Text = item.Get(\"tytul\") & \" \" & item.Get(\"i";
Debug.ShouldStop(262144);
_lbl1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tytul")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imie")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nazwisko")))))));
 BA.debugLineNum = 180;BA.debugLine="lbl1.TextSize = 18";
Debug.ShouldStop(524288);
_lbl1.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 181;BA.debugLine="lbl1.TextColor = Colors.Black";
Debug.ShouldStop(1048576);
_lbl1.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 182;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
_lbl1.runMethod(false,"setTypeface",b4xpage2.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 183;BA.debugLine="pnl.AddView(lbl1, 10dip, 10dip, 80%x, 30dip)";
Debug.ShouldStop(4194304);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 185;BA.debugLine="Dim lbl2 As Label";
Debug.ShouldStop(16777216);
_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl2", _lbl2);
 BA.debugLineNum = 186;BA.debugLine="lbl2.Initialize(\"\")";
Debug.ShouldStop(33554432);
_lbl2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 187;BA.debugLine="lbl2.Text = \"Pokój: \" & item.Get(\"pokoj\") & \" | B";
Debug.ShouldStop(67108864);
_lbl2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Pokój: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pokoj")))),RemoteObject.createImmutable(" | Budynek: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("budynek")))))));
 BA.debugLineNum = 188;BA.debugLine="lbl2.TextSize = 14";
Debug.ShouldStop(134217728);
_lbl2.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 189;BA.debugLine="lbl2.TextColor = Colors.Gray";
Debug.ShouldStop(268435456);
_lbl2.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 190;BA.debugLine="pnl.AddView(lbl2, 10dip, 45dip, 80%x, 20dip)";
Debug.ShouldStop(536870912);
_pnl.runVoidMethod ("AddView",(Object)((_lbl2.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 192;BA.debugLine="Dim lbl3 As Label";
Debug.ShouldStop(-2147483648);
_lbl3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl3", _lbl3);
 BA.debugLineNum = 193;BA.debugLine="lbl3.Initialize(\"\")";
Debug.ShouldStop(1);
_lbl3.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 194;BA.debugLine="lbl3.Text = \"📞 \" & item.Get(\"telefon\")";
Debug.ShouldStop(2);
_lbl3.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("📞 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefon")))))));
 BA.debugLineNum = 195;BA.debugLine="lbl3.TextSize = 14";
Debug.ShouldStop(4);
_lbl3.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 196;BA.debugLine="lbl3.TextColor = Colors.Blue";
Debug.ShouldStop(8);
_lbl3.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 197;BA.debugLine="pnl.AddView(lbl3, 10dip, 70dip, 80%x, 20dip)";
Debug.ShouldStop(16);
_pnl.runVoidMethod ("AddView",(Object)((_lbl3.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 199;BA.debugLine="Dim lbl4 As Label";
Debug.ShouldStop(64);
_lbl4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl4", _lbl4);
 BA.debugLineNum = 200;BA.debugLine="lbl4.Initialize(\"\")";
Debug.ShouldStop(128);
_lbl4.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 201;BA.debugLine="lbl4.Text =\"📧 \" & item.Get(\"mail\")";
Debug.ShouldStop(256);
_lbl4.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("📧 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mail")))))));
 BA.debugLineNum = 204;BA.debugLine="lbl4.TextSize = 14";
Debug.ShouldStop(2048);
_lbl4.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 205;BA.debugLine="lbl4.TextColor = Colors.Blue";
Debug.ShouldStop(4096);
_lbl4.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 206;BA.debugLine="pnl.AddView(lbl4, 10dip, 70dip, 80%x, 20dip)";
Debug.ShouldStop(8192);
_pnl.runVoidMethod ("AddView",(Object)((_lbl4.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 208;BA.debugLine="Dim lbl5 As Label";
Debug.ShouldStop(32768);
_lbl5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl5", _lbl5);
 BA.debugLineNum = 209;BA.debugLine="lbl5.Initialize(\"\")";
Debug.ShouldStop(65536);
_lbl5.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 210;BA.debugLine="lbl5.Text = \"🧑‍🤝‍🧑 \" & item.Get(\"konsultacje\")";
Debug.ShouldStop(131072);
_lbl5.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("🧑‍🤝‍🧑 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("konsultacje")))))));
 BA.debugLineNum = 212;BA.debugLine="lbl5.TextSize = 14";
Debug.ShouldStop(524288);
_lbl5.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 213;BA.debugLine="lbl5.TextColor = Colors.Blue";
Debug.ShouldStop(1048576);
_lbl5.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 214;BA.debugLine="pnl.AddView(lbl5, 10dip, 70dip, 80%x, 20dip)";
Debug.ShouldStop(2097152);
_pnl.runVoidMethod ("AddView",(Object)((_lbl5.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 216;BA.debugLine="Dim lbl6 As Label";
Debug.ShouldStop(8388608);
_lbl6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl6", _lbl6);
 BA.debugLineNum = 217;BA.debugLine="lbl6.Initialize(\"\")";
Debug.ShouldStop(16777216);
_lbl6.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 218;BA.debugLine="lbl6.Text = \"💼 \" & item.Get(\"link_do_serwisu_uso";
Debug.ShouldStop(33554432);
_lbl6.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("💼 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("link_do_serwisu_usos")))))));
 BA.debugLineNum = 219;BA.debugLine="lbl6.TextSize = 14";
Debug.ShouldStop(67108864);
_lbl6.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 220;BA.debugLine="lbl6.TextColor = Colors.Blue";
Debug.ShouldStop(134217728);
_lbl6.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 221;BA.debugLine="pnl.AddView(lbl6, 10dip, 70dip, 80%x, 20dip)";
Debug.ShouldStop(268435456);
_pnl.runVoidMethod ("AddView",(Object)((_lbl6.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 224;BA.debugLine="Return pnl";
Debug.ShouldStop(-2147483648);
if (true) return _pnl;
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("FetchData (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("fetchdata")) { return __ref.runUserSub(false, "b4xpage2","fetchdata", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Sub FetchData";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="xHttp.Initialize(\"Job1\", Me)";
Debug.ShouldStop(4);
__ref.getField(false,"_xhttp" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Job1")),(Object)(__ref));
 BA.debugLineNum = 68;BA.debugLine="xHttp.Download(\"https://grupa2.android.mzelent.pl";
Debug.ShouldStop(8);
__ref.getField(false,"_xhttp" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("https://grupa2.android.mzelent.pl/persons/")));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("HandleClick (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("handleclick")) { return __ref.runUserSub(false, "b4xpage2","handleclick", __ref, _viewtag);}
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _person = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ViewTag", _viewtag);
 BA.debugLineNum = 54;BA.debugLine="Sub HandleClick (ViewTag As Object)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="If ViewTag = \"update\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_viewtag,RemoteObject.createImmutable(("update")))) { 
 BA.debugLineNum = 56;BA.debugLine="FetchData";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.b4xpage2.class, "_fetchdata" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 59;BA.debugLine="Dim idx As Int = ViewTag";
Debug.ShouldStop(67108864);
_idx = BA.numberCast(int.class, _viewtag);Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 60;BA.debugLine="Dim person As Map = personsList.Get(idx)";
Debug.ShouldStop(134217728);
_person = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_person = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_idx)));Debug.locals.put("person", _person);Debug.locals.put("person", _person);
 BA.debugLineNum = 61;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Details";
Debug.ShouldStop(268435456);
b4xpage2._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DetailsPage")));
 BA.debugLineNum = 62;BA.debugLine="B4XPages.GetPage(\"Details\").As(Details).LoadPers";
Debug.ShouldStop(536870912);
((b4xpage2._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Details"))))).runClassMethod (b4a.example.details.class, "_loadperson" /*RemoteObject*/ ,(Object)(_person));
 };
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Initialize (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpage2","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Return Me";
Debug.ShouldStop(131072);
if (true) return __ref;
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "b4xpage2","jobdone", __ref, _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 71;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(128);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="ParseJSON(Job.GetString)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.b4xpage2.class, "_parsejson" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 75;BA.debugLine="xui.MsgboxAsync(\"Błąd: \" & Job.ErrorMessage, \"Bł";
Debug.ShouldStop(1024);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Błąd: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Błąd"))));
 };
 BA.debugLineNum = 77;BA.debugLine="Job.Release";
Debug.ShouldStop(4096);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
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
public static RemoteObject  _parsejson(RemoteObject __ref,RemoteObject _jsonstring) throws Exception{
try {
		Debug.PushSubsStack("ParseJSON (b4xpage2) ","b4xpage2",4,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("parsejson")) { return __ref.runUserSub(false, "b4xpage2","parsejson", __ref, _jsonstring);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _card = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbldetails = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblphone = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblmail = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblkon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblusos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 80;BA.debugLine="Sub ParseJSON(jsonString As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(65536);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 82;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(131072);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 83;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 84;BA.debugLine="personsList = parser.NextArray";
Debug.ShouldStop(524288);
__ref.setField ("_personslist" /*RemoteObject*/ ,_parser.runMethod(false,"NextArray"));
 BA.debugLineNum = 85;BA.debugLine="sv.Panel.RemoveAllViews";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 86;BA.debugLine="sv.Panel.Height = personsList.Size * 130dip";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(true,"getSize"),b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "*",0, 1));
 BA.debugLineNum = 88;BA.debugLine="For i = 0 To personsList.Size - 1";
Debug.ShouldStop(8388608);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 89;BA.debugLine="Dim item As Map = personsList.Get(i)";
Debug.ShouldStop(16777216);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_personslist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 92;BA.debugLine="Dim card As Panel";
Debug.ShouldStop(134217728);
_card = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("card", _card);
 BA.debugLineNum = 93;BA.debugLine="card.Initialize(\"card\")";
Debug.ShouldStop(268435456);
_card.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("card")));
 BA.debugLineNum = 94;BA.debugLine="card.Tag = item ' Cały map przekazujemy do szcz";
Debug.ShouldStop(536870912);
_card.runMethod(false,"setTag",(_item.getObject()));
 BA.debugLineNum = 95;BA.debugLine="card.Color = Colors.White";
Debug.ShouldStop(1073741824);
_card.runVoidMethod ("setColor",b4xpage2.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 96;BA.debugLine="sv.Panel.AddView(card, 10%x, i * 130dip, 90%x,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_card.getObject())),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "*",0, 1)),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 99;BA.debugLine="Dim lblName As Label";
Debug.ShouldStop(4);
_lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblName", _lblname);
 BA.debugLineNum = 100;BA.debugLine="lblName.Initialize(\"\")";
Debug.ShouldStop(8);
_lblname.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 101;BA.debugLine="lblName.Text = item.Get(\"tytul\") & \" \" & item.G";
Debug.ShouldStop(16);
_lblname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tytul")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imie")))),RemoteObject.createImmutable(" "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nazwisko")))))));
 BA.debugLineNum = 102;BA.debugLine="lblName.TextSize = 18";
Debug.ShouldStop(32);
_lblname.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 103;BA.debugLine="lblName.TextColor = Colors.Black";
Debug.ShouldStop(64);
_lblname.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 104;BA.debugLine="lblName.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(128);
_lblname.runMethod(false,"setTypeface",b4xpage2.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 105;BA.debugLine="card.AddView(lblName, 10dip, 10dip, 80%x, 30dip";
Debug.ShouldStop(256);
_card.runVoidMethod ("AddView",(Object)((_lblname.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 107;BA.debugLine="Dim lblDetails As Label";
Debug.ShouldStop(1024);
_lbldetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblDetails", _lbldetails);
 BA.debugLineNum = 108;BA.debugLine="lblDetails.Initialize(\"\")";
Debug.ShouldStop(2048);
_lbldetails.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 109;BA.debugLine="lblDetails.Text = \"Pokój: \" & item.Get(\"pokoj\")";
Debug.ShouldStop(4096);
_lbldetails.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Pokój: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pokoj")))),RemoteObject.createImmutable(" | Budynek: "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("budynek")))))));
 BA.debugLineNum = 110;BA.debugLine="lblDetails.TextSize = 14";
Debug.ShouldStop(8192);
_lbldetails.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 111;BA.debugLine="lblDetails.TextColor = Colors.Gray";
Debug.ShouldStop(16384);
_lbldetails.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 112;BA.debugLine="card.AddView(lblDetails, 10dip, 35dip, 80%x, 20";
Debug.ShouldStop(32768);
_card.runVoidMethod ("AddView",(Object)((_lbldetails.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 114;BA.debugLine="Dim lblPhone As Label";
Debug.ShouldStop(131072);
_lblphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblPhone", _lblphone);
 BA.debugLineNum = 115;BA.debugLine="lblPhone.Initialize(\"\")";
Debug.ShouldStop(262144);
_lblphone.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 116;BA.debugLine="lblPhone.Text = \"📞 \" & item.Get(\"telefon\")";
Debug.ShouldStop(524288);
_lblphone.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("📞 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefon")))))));
 BA.debugLineNum = 117;BA.debugLine="lblPhone.TextSize = 14";
Debug.ShouldStop(1048576);
_lblphone.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 118;BA.debugLine="lblPhone.TextColor = Colors.Blue";
Debug.ShouldStop(2097152);
_lblphone.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 120;BA.debugLine="card.AddView(lblPhone, 10dip, 50dip, 80%x, 20di";
Debug.ShouldStop(8388608);
_card.runVoidMethod ("AddView",(Object)((_lblphone.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 122;BA.debugLine="Dim lblMail As Label";
Debug.ShouldStop(33554432);
_lblmail = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblMail", _lblmail);
 BA.debugLineNum = 123;BA.debugLine="lblMail.Initialize(\"\")";
Debug.ShouldStop(67108864);
_lblmail.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 124;BA.debugLine="lblMail.Text = \"📧 \" & item.Get(\"mail\")";
Debug.ShouldStop(134217728);
_lblmail.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("📧 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mail")))))));
 BA.debugLineNum = 125;BA.debugLine="lblMail.TextSize = 14";
Debug.ShouldStop(268435456);
_lblmail.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 126;BA.debugLine="lblMail.TextColor = Colors.Blue";
Debug.ShouldStop(536870912);
_lblmail.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 128;BA.debugLine="card.AddView(lblMail, 10dip, 65dip, 80%x, 20dip";
Debug.ShouldStop(-2147483648);
_card.runVoidMethod ("AddView",(Object)((_lblmail.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 65)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 130;BA.debugLine="Dim lblKon As Label";
Debug.ShouldStop(2);
_lblkon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblKon", _lblkon);
 BA.debugLineNum = 131;BA.debugLine="lblKon.Initialize(\"\")";
Debug.ShouldStop(4);
_lblkon.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 132;BA.debugLine="lblKon.Text = \"🧑‍🤝‍🧑 \" & item.Get(\"konsultac";
Debug.ShouldStop(8);
_lblkon.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("🧑‍🤝‍🧑 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("konsultacje")))))));
 BA.debugLineNum = 133;BA.debugLine="lblKon.TextSize = 14";
Debug.ShouldStop(16);
_lblkon.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 134;BA.debugLine="lblKon.TextColor = Colors.Blue";
Debug.ShouldStop(32);
_lblkon.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 136;BA.debugLine="card.AddView(lblKon, 10dip, 80dip, 80%x, 20dip)";
Debug.ShouldStop(128);
_card.runVoidMethod ("AddView",(Object)((_lblkon.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 138;BA.debugLine="Dim lblUSOS As Label";
Debug.ShouldStop(512);
_lblusos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblUSOS", _lblusos);
 BA.debugLineNum = 139;BA.debugLine="lblUSOS.Initialize(\"\")";
Debug.ShouldStop(1024);
_lblusos.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 140;BA.debugLine="lblUSOS.Text = \"💼 \" & item.Get(\"link_do_serwis";
Debug.ShouldStop(2048);
_lblusos.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("💼 "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("link_do_serwisu_usos")))))));
 BA.debugLineNum = 141;BA.debugLine="lblUSOS.TextSize = 14";
Debug.ShouldStop(4096);
_lblusos.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 142;BA.debugLine="lblUSOS.TextColor = Colors.Blue";
Debug.ShouldStop(8192);
_lblusos.runMethod(true,"setTextColor",b4xpage2.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 143;BA.debugLine="lblUSOS.Tag = item.Get(\"link_do_serwisu_usos\")";
Debug.ShouldStop(16384);
_lblusos.runMethod(false,"setTag",_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("link_do_serwisu_usos")))));
 BA.debugLineNum = 144;BA.debugLine="card.AddView(lblUSOS , 10dip, 95dip, 80%x, 20di";
Debug.ShouldStop(32768);
_card.runVoidMethod ("AddView",(Object)((_lblusos.getObject())),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95)))),(Object)(b4xpage2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 147;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(262144);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 148;BA.debugLine="cd.Initialize(Colors.White, 20dip)";
Debug.ShouldStop(524288);
_cd.runVoidMethod ("Initialize",(Object)(b4xpage2.__c.getField(false,"Colors").getField(true,"White")),(Object)(b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 149;BA.debugLine="card.Background = cd";
Debug.ShouldStop(1048576);
_card.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 150;BA.debugLine="card.Elevation = 5dip";
Debug.ShouldStop(2097152);
_card.runMethod(true,"setElevation",BA.numberCast(float.class, b4xpage2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e58) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e58.toString()); BA.debugLineNum = 153;BA.debugLine="xui.MsgboxAsync(\"Błąd przetwarzania JSON!\", \"Błą";
Debug.ShouldStop(16777216);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Błąd przetwarzania JSON!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Błąd"))));
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}