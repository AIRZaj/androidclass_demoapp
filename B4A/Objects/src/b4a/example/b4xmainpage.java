package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnupdate = null;
public b4a.example.httpjob _xhttp = null;
public anywheresoftware.b4a.objects.collections.List _personslist = null;
public b4a.example.details _details = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _addclickevent(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "addclickevent", false))
	 {return ((String) Debug.delegate(ba, "addclickevent", new Object[] {_v}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub AddClickEvent(v As B4XView)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim jo As JavaObject = v";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_v.getObject()));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="jo.RunMethod(\"setOnClickListener\", Array As Objec";
_jo.RunMethod("setOnClickListener",new Object[]{this,(Object)("HandleClick")});
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
b4a.example.b4xpagesmanager._b4amenuitem _mi = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _svpanel = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.Color = xui.Color_White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("btnUpdate"));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="mi.Tag = \"btnUpdate\"";
_mi.Tag /*String*/  = "btnUpdate";
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Details.Initialize";
__ref._details /*b4a.example.details*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="B4XPages.AddPageAndCreate(\"Details\", Details)";
_b4xpages._addpageandcreate /*String*/ (ba,"Details",(Object)(__ref._details /*b4a.example.details*/ ));
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="btn.Initialize(\"btnUpdate\")";
_btn.Initialize(ba,"btnUpdate");
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="btn.Text = \"🔄 Aktualizujjjj\"";
_btn.setText(BA.ObjectToCharSequence("🔄 Aktualizujjjj"));
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="btn.TextColor = xui.Color_White";
_btn.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="btn.Color = xui.Color_RGB(0,150,1)";
_btn.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (150),(int) (1)));
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="btnUpdate = btn";
__ref._btnupdate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="Root.AddView(btnUpdate, 10dip, 10dip, 150dip, 50d";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._btnupdate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="Dim svPanel As ScrollView";
_svpanel = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="svPanel.Initialize(100%y)";
_svpanel.Initialize(ba,__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="sv = svPanel";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/  = _svpanel;
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="Root.AddView(sv, 0, 70dip, 100%x, 100%y - 70dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (100),ba),(int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (70))));
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="personsList.Initialize";
__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="FetchData";
__ref._fetchdata /*String*/ (null);
RDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="End Sub";
return "";
}
public String  _fetchdata(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "fetchdata", false))
	 {return ((String) Debug.delegate(ba, "fetchdata", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub FetchData";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="xHttp.Initialize(\"Job1\", Me)";
__ref._xhttp /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"Job1",this);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="xHttp.Download(\"https://api.android.mzelent.pl/pe";
__ref._xhttp /*b4a.example.httpjob*/ ._download /*String*/ (null,"https://api.android.mzelent.pl/persons/");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
public String  _btnupdate_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnupdate_click", false))
	 {return ((String) Debug.delegate(ba, "btnupdate_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub btnUpdate_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="FetchData";
__ref._fetchdata /*String*/ (null);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="ToastMessageShow(\"siema\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("siema"),__c.False);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
return "";
}
public String  _card_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "card_click", false))
	 {return ((String) Debug.delegate(ba, "card_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _clickedpanel = null;
anywheresoftware.b4a.objects.collections.Map _persondata = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub card_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim clickedPanel As Panel = Sender";
_clickedpanel = new anywheresoftware.b4a.objects.PanelWrapper();
_clickedpanel = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim personData As Map = clickedPanel.Tag";
_persondata = new anywheresoftware.b4a.objects.collections.Map();
_persondata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_clickedpanel.getTag()));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="B4XPages.ShowPage(\"Details\")";
_b4xpages._showpage /*String*/ (ba,"Details");
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="B4XPages.GetPage(\"Details\").As(details).LoadPerso";
((b4a.example.details)(_b4xpages._getpage /*Object*/ (ba,"Details")))._loadperson /*String*/ (null,_persondata);
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private btnUpdate As B4XView";
_btnupdate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private xHttp As HttpJob";
_xhttp = new b4a.example.httpjob();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private personsList As List";
_personslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Private Details As details";
_details = new b4a.example.details();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createcard(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item,int _idx) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createcard", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createcard", new Object[] {_item,_idx}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl3 = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub CreateCard(item As Map, idx As Int) As";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="pnl.Color = xui.Color_White";
_pnl.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="pnl.Tag = idx";
_pnl.setTag((Object)(_idx));
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="AddClickEvent(pnl)";
__ref._addclickevent /*String*/ (null,_pnl);
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="cd.Initialize(xui.Color_White, 10dip)";
_cd.Initialize(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="pnl.SetColorAndBorder(Colors.Black, 0, 0, 10dip)";
_pnl.SetColorAndBorder(__c.Colors.Black,(int) (0),(int) (0),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Dim lbl1 As Label";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="lbl1.Initialize(\"\")";
_lbl1.Initialize(ba,"");
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="lbl1.Text = item.Get(\"tytul\") & \" \" & item.Get(\"i";
_lbl1.setText(BA.ObjectToCharSequence(BA.ObjectToString(_item.Get((Object)("tytul")))+" "+BA.ObjectToString(_item.Get((Object)("imie")))+" "+BA.ObjectToString(_item.Get((Object)("nazwisko")))));
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="lbl1.TextSize = 18";
_lbl1.setTextSize((float) (18));
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="lbl1.TextColor = Colors.Black";
_lbl1.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
_lbl1.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="pnl.AddView(lbl1, 10dip, 10dip, 80%x, 30dip)";
_pnl.AddView((android.view.View)(_lbl1.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="Dim lbl2 As Label";
_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="lbl2.Initialize(\"\")";
_lbl2.Initialize(ba,"");
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="lbl2.Text = \"Pokój: \" & item.Get(\"pokoj\") & \" | Z";
_lbl2.setText(BA.ObjectToCharSequence("Pokój: "+BA.ObjectToString(_item.Get((Object)("pokoj")))+" | Zakład: "+BA.ObjectToString(_item.Get((Object)("zaklad")))));
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="lbl2.TextSize = 14";
_lbl2.setTextSize((float) (14));
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="lbl2.TextColor = Colors.Gray";
_lbl2.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="pnl.AddView(lbl2, 10dip, 45dip, 80%x, 20dip)";
_pnl.AddView((android.view.View)(_lbl2.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (45)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="Dim lbl3 As Label";
_lbl3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="lbl3.Initialize(\"\")";
_lbl3.Initialize(ba,"");
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="lbl3.Text = \"📞 \" & item.Get(\"numer_telefonu\")";
_lbl3.setText(BA.ObjectToCharSequence("📞 "+BA.ObjectToString(_item.Get((Object)("numer_telefonu")))));
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="lbl3.TextSize = 14";
_lbl3.setTextSize((float) (14));
RDebugUtils.currentLine=1245214;
 //BA.debugLineNum = 1245214;BA.debugLine="lbl3.TextColor = Colors.Blue";
_lbl3.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1245215;
 //BA.debugLineNum = 1245215;BA.debugLine="pnl.AddView(lbl3, 10dip, 70dip, 80%x, 20dip)";
_pnl.AddView((android.view.View)(_lbl3.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1245217;
 //BA.debugLineNum = 1245217;BA.debugLine="Return pnl";
if (true) return _pnl;
RDebugUtils.currentLine=1245218;
 //BA.debugLineNum = 1245218;BA.debugLine="End Sub";
return null;
}
public String  _handleclick(b4a.example.b4xmainpage __ref,Object _viewtag) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleclick", false))
	 {return ((String) Debug.delegate(ba, "handleclick", new Object[] {_viewtag}));}
int _idx = 0;
anywheresoftware.b4a.objects.collections.Map _person = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub HandleClick (ViewTag As Object)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="If ViewTag = \"update\" Then";
if ((_viewtag).equals((Object)("update"))) { 
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="FetchData";
__ref._fetchdata /*String*/ (null);
 }else {
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Dim idx As Int = ViewTag";
_idx = (int)(BA.ObjectToNumber(_viewtag));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Dim person As Map = personsList.Get(idx)";
_person = new anywheresoftware.b4a.objects.collections.Map();
_person = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_idx)));
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Details";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"DetailsPage");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="B4XPages.GetPage(\"Details\").As(details).LoadPers";
((b4a.example.details)(_b4xpages._getpage /*Object*/ (ba,"Details")))._loadperson /*String*/ (null,_person);
 };
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.example.b4xmainpage __ref,b4a.example.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "jobdone", false))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="ParseJSON(Job.GetString)";
__ref._parsejson /*String*/ (null,_job._getstring /*String*/ (null));
 }else {
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="xui.MsgboxAsync(\"Błąd: \" & Job.ErrorMessage, \"Bł";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Błąd: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Błąd"));
 };
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return "";
}
public String  _parsejson(b4a.example.b4xmainpage __ref,String _jsonstring) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "parsejson", false))
	 {return ((String) Debug.delegate(ba, "parsejson", new Object[] {_jsonstring}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.PanelWrapper _card = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
anywheresoftware.b4a.objects.LabelWrapper _lbldetails = null;
anywheresoftware.b4a.objects.LabelWrapper _lblphone = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub ParseJSON(jsonString As String)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="personsList = parser.NextArray";
__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/  = _parser.NextArray();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="sv.Panel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="sv.Panel.Height = personsList.Size * 130dip";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__c.DipToCurrent((int) (130))));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="For i = 0 To personsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dim item As Map = personsList.Get(i)";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="Dim card As Panel";
_card = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="card.Initialize(\"card\")";
_card.Initialize(ba,"card");
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="card.Tag = item ' Cały map przekazujemy do szcz";
_card.setTag((Object)(_item.getObject()));
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="card.Color = Colors.White";
_card.setColor(__c.Colors.White);
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="sv.Panel.AddView(card, 5%x, i * 130dip, 90%x, 1";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_card.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (_i*__c.DipToCurrent((int) (130))),__c.PerXToCurrent((float) (90),ba),__c.DipToCurrent((int) (120)));
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="lblName.Text = item.Get(\"tytul\") & \" \" & item.G";
_lblname.setText(BA.ObjectToCharSequence(BA.ObjectToString(_item.Get((Object)("tytul")))+" "+BA.ObjectToString(_item.Get((Object)("imie")))+" "+BA.ObjectToString(_item.Get((Object)("nazwisko")))));
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="lblName.TextSize = 18";
_lblname.setTextSize((float) (18));
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="lblName.TextColor = Colors.Black";
_lblname.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="lblName.Typeface = Typeface.DEFAULT_BOLD";
_lblname.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="card.AddView(lblName, 10dip, 10dip, 80%x, 30dip";
_card.AddView((android.view.View)(_lblname.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=1114139;
 //BA.debugLineNum = 1114139;BA.debugLine="Dim lblDetails As Label";
_lbldetails = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="lblDetails.Initialize(\"\")";
_lbldetails.Initialize(ba,"");
RDebugUtils.currentLine=1114141;
 //BA.debugLineNum = 1114141;BA.debugLine="lblDetails.Text = \"Pokój: \" & item.Get(\"pokoj\")";
_lbldetails.setText(BA.ObjectToCharSequence("Pokój: "+BA.ObjectToString(_item.Get((Object)("pokoj")))+" | Zakład: "+BA.ObjectToString(_item.Get((Object)("zaklad")))));
RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="lblDetails.TextSize = 14";
_lbldetails.setTextSize((float) (14));
RDebugUtils.currentLine=1114143;
 //BA.debugLineNum = 1114143;BA.debugLine="lblDetails.TextColor = Colors.Gray";
_lbldetails.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=1114144;
 //BA.debugLineNum = 1114144;BA.debugLine="card.AddView(lblDetails, 10dip, 45dip, 80%x, 20";
_card.AddView((android.view.View)(_lbldetails.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (45)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="Dim lblPhone As Label";
_lblphone = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1114147;
 //BA.debugLineNum = 1114147;BA.debugLine="lblPhone.Initialize(\"phoneLabel\")";
_lblphone.Initialize(ba,"phoneLabel");
RDebugUtils.currentLine=1114148;
 //BA.debugLineNum = 1114148;BA.debugLine="lblPhone.Text = \"📞 \" & item.Get(\"numer_telefon";
_lblphone.setText(BA.ObjectToCharSequence("📞 "+BA.ObjectToString(_item.Get((Object)("numer_telefonu")))));
RDebugUtils.currentLine=1114149;
 //BA.debugLineNum = 1114149;BA.debugLine="lblPhone.TextSize = 14";
_lblphone.setTextSize((float) (14));
RDebugUtils.currentLine=1114150;
 //BA.debugLineNum = 1114150;BA.debugLine="lblPhone.TextColor = Colors.Blue";
_lblphone.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1114151;
 //BA.debugLineNum = 1114151;BA.debugLine="lblPhone.Tag = item.Get(\"numer_telefonu\")";
_lblphone.setTag(_item.Get((Object)("numer_telefonu")));
RDebugUtils.currentLine=1114152;
 //BA.debugLineNum = 1114152;BA.debugLine="card.AddView(lblPhone, 10dip, 70dip, 80%x, 20di";
_card.AddView((android.view.View)(_lblphone.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1114155;
 //BA.debugLineNum = 1114155;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="cd.Initialize(Colors.White, 10dip)";
_cd.Initialize(__c.Colors.White,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1114157;
 //BA.debugLineNum = 1114157;BA.debugLine="card.Background = cd";
_card.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=1114158;
 //BA.debugLineNum = 1114158;BA.debugLine="card.Elevation = 5dip";
_card.setElevation((float) (__c.DipToCurrent((int) (5))));
 }
};
 } 
       catch (Exception e40) {
			ba.setLastException(e40);RDebugUtils.currentLine=1114161;
 //BA.debugLineNum = 1114161;BA.debugLine="xui.MsgboxAsync(\"Błąd przetwarzania JSON!\", \"Błą";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Błąd przetwarzania JSON!"),BA.ObjectToCharSequence("Błąd"));
 };
RDebugUtils.currentLine=1114163;
 //BA.debugLineNum = 1114163;BA.debugLine="End Sub";
return "";
}
}