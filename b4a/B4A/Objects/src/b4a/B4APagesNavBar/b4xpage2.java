package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.b4xpage2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.b4xpage2.class).invoke(this, new Object[] {null});
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
public b4a.B4APagesNavBar.navbar _navbar1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltest = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnupdate = null;
public b4a.B4APagesNavBar.httpjob _xhttp = null;
public anywheresoftware.b4a.objects.collections.List _personslist = null;
public b4a.B4APagesNavBar.details _details = null;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.B4APagesNavBar.b4xpage2 __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return null;
}
public String  _addclickevent(b4a.B4APagesNavBar.b4xpage2 __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "addclickevent", false))
	 {return ((String) Debug.delegate(ba, "addclickevent", new Object[] {_v}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub AddClickEvent(v As B4XView)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim jo As JavaObject = v";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_v.getObject()));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="jo.RunMethod(\"setOnClickListener\", Array As Objec";
_jo.RunMethod("setOnClickListener",new Object[]{this,(Object)("HandleClick")});
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.B4APagesNavBar.b4xpage2 __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.ScrollViewWrapper _svpanel = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Root.LoadLayout(\"Page2\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Page2",ba);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="NavBar1.Initialize(Root)";
__ref._navbar1 /*b4a.B4APagesNavBar.navbar*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Root.Color = xui.Color_White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="B4XPages.AddMenuItem(Me, \"Aktualizuj\")";
_b4xpages._addmenuitem /*b4a.B4APagesNavBar.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Aktualizuj"));
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Dim svPanel As ScrollView";
_svpanel = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="svPanel.Initialize(80%y)";
_svpanel.Initialize(ba,__c.PerYToCurrent((float) (80),ba));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="sv = svPanel";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/  = _svpanel;
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Root.AddView(sv, 0, 70dip, 100%x, 80%y - 70dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (100),ba),(int) (__c.PerYToCurrent((float) (80),ba)-__c.DipToCurrent((int) (70))));
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="personsList.Initialize";
__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="FetchData";
__ref._fetchdata /*String*/ (null);
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="End Sub";
return "";
}
public String  _fetchdata(b4a.B4APagesNavBar.b4xpage2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "fetchdata", false))
	 {return ((String) Debug.delegate(ba, "fetchdata", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub FetchData";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="xHttp.Initialize(\"Job1\", Me)";
__ref._xhttp /*b4a.B4APagesNavBar.httpjob*/ ._initialize /*String*/ (null,ba,"Job1",this);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="xHttp.Download(\"https://grupa2.android.mzelent.pl";
__ref._xhttp /*b4a.B4APagesNavBar.httpjob*/ ._download /*String*/ (null,"https://grupa2.android.mzelent.pl/persons/");
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(b4a.B4APagesNavBar.b4xpage2 __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "b4xpage_menuclick", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_menuclick", new Object[] {_tag}));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Sub B4XPage_MenuClick(Tag As String)";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="If Tag=\"Aktualizuj\" Then";
if ((_tag).equals("Aktualizuj")) { 
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="FetchData";
__ref._fetchdata /*String*/ (null);
 };
RDebugUtils.currentLine=44695556;
 //BA.debugLineNum = 44695556;BA.debugLine="End Sub";
return "";
}
public String  _card_click(b4a.B4APagesNavBar.b4xpage2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "card_click", false))
	 {return ((String) Debug.delegate(ba, "card_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _clickedpanel = null;
anywheresoftware.b4a.objects.collections.Map _persondata = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub card_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim clickedPanel As Panel = Sender";
_clickedpanel = new anywheresoftware.b4a.objects.PanelWrapper();
_clickedpanel = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim personData As Map = clickedPanel.Tag";
_persondata = new anywheresoftware.b4a.objects.collections.Map();
_persondata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_clickedpanel.getTag()));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="B4XPages.ShowPage(\"Details\")";
_b4xpages._showpage /*String*/ (ba,"Details");
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="B4XPages.GetPage(\"Details\").As(Details).LoadPerso";
((b4a.B4APagesNavBar.details)(_b4xpages._getpage /*Object*/ (ba,"Details")))._loadperson /*String*/ (null,_persondata);
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.b4xpage2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private NavBar1 As NavBar";
_navbar1 = new b4a.B4APagesNavBar.navbar();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Public lblTest As B4XView	'used to show how to ac";
_lbltest = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Private sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Private btnUpdate As B4XView";
_btnupdate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Private xHttp As HttpJob";
_xhttp = new b4a.B4APagesNavBar.httpjob();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private personsList As List";
_personslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private Details As Details";
_details = new b4a.B4APagesNavBar.details();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createcard(b4a.B4APagesNavBar.b4xpage2 __ref,anywheresoftware.b4a.objects.collections.Map _item,int _idx) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "createcard", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createcard", new Object[] {_item,_idx}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl3 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl4 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl5 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl6 = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub CreateCard(item As Map, idx As Int) As";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="pnl.Color = xui.Color_White";
_pnl.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="pnl.Tag = idx";
_pnl.setTag((Object)(_idx));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="AddClickEvent(pnl)";
__ref._addclickevent /*String*/ (null,_pnl);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="cd.Initialize(xui.Color_White, 10dip)";
_cd.Initialize(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="pnl.SetColorAndBorder(Colors.Black, 0, 0, 10dip)";
_pnl.SetColorAndBorder(__c.Colors.Black,(int) (0),(int) (0),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Dim lbl1 As Label";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="lbl1.Initialize(\"\")";
_lbl1.Initialize(ba,"");
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="lbl1.Text = item.Get(\"tytul\") & \" \" & item.Get(\"i";
_lbl1.setText(BA.ObjectToCharSequence(BA.ObjectToString(_item.Get((Object)("tytul")))+" "+BA.ObjectToString(_item.Get((Object)("imie")))+" "+BA.ObjectToString(_item.Get((Object)("nazwisko")))));
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="lbl1.TextSize = 18";
_lbl1.setTextSize((float) (18));
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="lbl1.TextColor = Colors.Black";
_lbl1.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
_lbl1.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="pnl.AddView(lbl1, 10dip, 10dip, 80%x, 30dip)";
_pnl.AddView((android.view.View)(_lbl1.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="Dim lbl2 As Label";
_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="lbl2.Initialize(\"\")";
_lbl2.Initialize(ba,"");
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="lbl2.Text = \"Pokój: \" & item.Get(\"pokoj\") & \" | B";
_lbl2.setText(BA.ObjectToCharSequence("Pokój: "+BA.ObjectToString(_item.Get((Object)("pokoj")))+" | Budynek: "+BA.ObjectToString(_item.Get((Object)("budynek")))));
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="lbl2.TextSize = 14";
_lbl2.setTextSize((float) (14));
RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="lbl2.TextColor = Colors.Gray";
_lbl2.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="pnl.AddView(lbl2, 10dip, 45dip, 80%x, 20dip)";
_pnl.AddView((android.view.View)(_lbl2.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (45)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="Dim lbl3 As Label";
_lbl3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1441819;
 //BA.debugLineNum = 1441819;BA.debugLine="lbl3.Initialize(\"\")";
_lbl3.Initialize(ba,"");
RDebugUtils.currentLine=1441820;
 //BA.debugLineNum = 1441820;BA.debugLine="lbl3.Text = \"📞 \" & item.Get(\"telefon\")";
_lbl3.setText(BA.ObjectToCharSequence("📞 "+BA.ObjectToString(_item.Get((Object)("telefon")))));
RDebugUtils.currentLine=1441821;
 //BA.debugLineNum = 1441821;BA.debugLine="lbl3.TextSize = 14";
_lbl3.setTextSize((float) (14));
RDebugUtils.currentLine=1441822;
 //BA.debugLineNum = 1441822;BA.debugLine="lbl3.TextColor = Colors.Blue";
_lbl3.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1441823;
 //BA.debugLineNum = 1441823;BA.debugLine="pnl.AddView(lbl3, 10dip, 70dip, 80%x, 20dip)";
_pnl.AddView((android.view.View)(_lbl3.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1441825;
 //BA.debugLineNum = 1441825;BA.debugLine="Dim lbl4 As Label";
_lbl4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1441826;
 //BA.debugLineNum = 1441826;BA.debugLine="lbl4.Initialize(\"\")";
_lbl4.Initialize(ba,"");
RDebugUtils.currentLine=1441827;
 //BA.debugLineNum = 1441827;BA.debugLine="lbl4.Text =\"📧 \" & item.Get(\"mail\")";
_lbl4.setText(BA.ObjectToCharSequence("📧 "+BA.ObjectToString(_item.Get((Object)("mail")))));
RDebugUtils.currentLine=1441830;
 //BA.debugLineNum = 1441830;BA.debugLine="lbl4.TextSize = 14";
_lbl4.setTextSize((float) (14));
RDebugUtils.currentLine=1441831;
 //BA.debugLineNum = 1441831;BA.debugLine="lbl4.TextColor = Colors.Blue";
_lbl4.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1441832;
 //BA.debugLineNum = 1441832;BA.debugLine="pnl.AddView(lbl4, 10dip, 70dip, 80%x, 20dip)";
_pnl.AddView((android.view.View)(_lbl4.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1441834;
 //BA.debugLineNum = 1441834;BA.debugLine="Dim lbl5 As Label";
_lbl5 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1441835;
 //BA.debugLineNum = 1441835;BA.debugLine="lbl5.Initialize(\"\")";
_lbl5.Initialize(ba,"");
RDebugUtils.currentLine=1441836;
 //BA.debugLineNum = 1441836;BA.debugLine="lbl5.Text = \"🧑‍🤝‍🧑 \" & item.Get(\"konsultacje\")";
_lbl5.setText(BA.ObjectToCharSequence("🧑‍🤝‍🧑 "+BA.ObjectToString(_item.Get((Object)("konsultacje")))));
RDebugUtils.currentLine=1441838;
 //BA.debugLineNum = 1441838;BA.debugLine="lbl5.TextSize = 14";
_lbl5.setTextSize((float) (14));
RDebugUtils.currentLine=1441839;
 //BA.debugLineNum = 1441839;BA.debugLine="lbl5.TextColor = Colors.Blue";
_lbl5.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1441840;
 //BA.debugLineNum = 1441840;BA.debugLine="pnl.AddView(lbl5, 10dip, 70dip, 80%x, 20dip)";
_pnl.AddView((android.view.View)(_lbl5.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1441842;
 //BA.debugLineNum = 1441842;BA.debugLine="Dim lbl6 As Label";
_lbl6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1441843;
 //BA.debugLineNum = 1441843;BA.debugLine="lbl6.Initialize(\"\")";
_lbl6.Initialize(ba,"");
RDebugUtils.currentLine=1441844;
 //BA.debugLineNum = 1441844;BA.debugLine="lbl6.Text = \"💼 \" & item.Get(\"link_do_serwisu_uso";
_lbl6.setText(BA.ObjectToCharSequence("💼 "+BA.ObjectToString(_item.Get((Object)("link_do_serwisu_usos")))));
RDebugUtils.currentLine=1441845;
 //BA.debugLineNum = 1441845;BA.debugLine="lbl6.TextSize = 14";
_lbl6.setTextSize((float) (14));
RDebugUtils.currentLine=1441846;
 //BA.debugLineNum = 1441846;BA.debugLine="lbl6.TextColor = Colors.Blue";
_lbl6.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1441847;
 //BA.debugLineNum = 1441847;BA.debugLine="pnl.AddView(lbl6, 10dip, 70dip, 80%x, 20dip)";
_pnl.AddView((android.view.View)(_lbl6.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (70)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1441850;
 //BA.debugLineNum = 1441850;BA.debugLine="Return pnl";
if (true) return _pnl;
RDebugUtils.currentLine=1441851;
 //BA.debugLineNum = 1441851;BA.debugLine="End Sub";
return null;
}
public String  _handleclick(b4a.B4APagesNavBar.b4xpage2 __ref,Object _viewtag) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "handleclick", false))
	 {return ((String) Debug.delegate(ba, "handleclick", new Object[] {_viewtag}));}
int _idx = 0;
anywheresoftware.b4a.objects.collections.Map _person = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub HandleClick (ViewTag As Object)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If ViewTag = \"update\" Then";
if ((_viewtag).equals((Object)("update"))) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="FetchData";
__ref._fetchdata /*String*/ (null);
 }else {
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Dim idx As Int = ViewTag";
_idx = (int)(BA.ObjectToNumber(_viewtag));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Dim person As Map = personsList.Get(idx)";
_person = new anywheresoftware.b4a.objects.collections.Map();
_person = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_idx)));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Details";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"DetailsPage");
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="B4XPages.GetPage(\"Details\").As(Details).LoadPers";
((b4a.B4APagesNavBar.details)(_b4xpages._getpage /*Object*/ (ba,"Details")))._loadperson /*String*/ (null,_person);
 };
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.B4APagesNavBar.b4xpage2 __ref,b4a.B4APagesNavBar.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "jobdone", false))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="ParseJSON(Job.GetString)";
__ref._parsejson /*String*/ (null,_job._getstring /*String*/ (null));
 }else {
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="xui.MsgboxAsync(\"Błąd: \" & Job.ErrorMessage, \"Bł";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Błąd: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Błąd"));
 };
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="End Sub";
return "";
}
public String  _parsejson(b4a.B4APagesNavBar.b4xpage2 __ref,String _jsonstring) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "parsejson", false))
	 {return ((String) Debug.delegate(ba, "parsejson", new Object[] {_jsonstring}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.PanelWrapper _card = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
anywheresoftware.b4a.objects.LabelWrapper _lbldetails = null;
anywheresoftware.b4a.objects.LabelWrapper _lblphone = null;
anywheresoftware.b4a.objects.LabelWrapper _lblmail = null;
anywheresoftware.b4a.objects.LabelWrapper _lblkon = null;
anywheresoftware.b4a.objects.LabelWrapper _lblusos = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub ParseJSON(jsonString As String)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Try";
try {RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="personsList = parser.NextArray";
__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/  = _parser.NextArray();
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="sv.Panel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="sv.Panel.Height = personsList.Size * 130dip";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__c.DipToCurrent((int) (130))));
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="For i = 0 To personsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Dim item As Map = personsList.Get(i)";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._personslist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Dim card As Panel";
_card = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="card.Initialize(\"card\")";
_card.Initialize(ba,"card");
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="card.Tag = item ' Cały map przekazujemy do szcz";
_card.setTag((Object)(_item.getObject()));
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="card.Color = Colors.White";
_card.setColor(__c.Colors.White);
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="sv.Panel.AddView(card, 10%x, i * 130dip, 90%x,";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_card.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (_i*__c.DipToCurrent((int) (130))),__c.PerXToCurrent((float) (90),ba),__c.DipToCurrent((int) (120)));
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="lblName.Text = item.Get(\"tytul\") & \" \" & item.G";
_lblname.setText(BA.ObjectToCharSequence(BA.ObjectToString(_item.Get((Object)("tytul")))+" "+BA.ObjectToString(_item.Get((Object)("imie")))+" "+BA.ObjectToString(_item.Get((Object)("nazwisko")))));
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="lblName.TextSize = 18";
_lblname.setTextSize((float) (18));
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="lblName.TextColor = Colors.Black";
_lblname.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="lblName.Typeface = Typeface.DEFAULT_BOLD";
_lblname.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="card.AddView(lblName, 10dip, 10dip, 80%x, 30dip";
_card.AddView((android.view.View)(_lblname.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="Dim lblDetails As Label";
_lbldetails = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="lblDetails.Initialize(\"\")";
_lbldetails.Initialize(ba,"");
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="lblDetails.Text = \"Pokój: \" & item.Get(\"pokoj\")";
_lbldetails.setText(BA.ObjectToCharSequence("Pokój: "+BA.ObjectToString(_item.Get((Object)("pokoj")))+" | Budynek: "+BA.ObjectToString(_item.Get((Object)("budynek")))));
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="lblDetails.TextSize = 14";
_lbldetails.setTextSize((float) (14));
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="lblDetails.TextColor = Colors.Gray";
_lbldetails.setTextColor(__c.Colors.Gray);
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="card.AddView(lblDetails, 10dip, 35dip, 80%x, 20";
_card.AddView((android.view.View)(_lbldetails.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (35)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1310754;
 //BA.debugLineNum = 1310754;BA.debugLine="Dim lblPhone As Label";
_lblphone = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1310755;
 //BA.debugLineNum = 1310755;BA.debugLine="lblPhone.Initialize(\"\")";
_lblphone.Initialize(ba,"");
RDebugUtils.currentLine=1310756;
 //BA.debugLineNum = 1310756;BA.debugLine="lblPhone.Text = \"📞 \" & item.Get(\"telefon\")";
_lblphone.setText(BA.ObjectToCharSequence("📞 "+BA.ObjectToString(_item.Get((Object)("telefon")))));
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="lblPhone.TextSize = 14";
_lblphone.setTextSize((float) (14));
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="lblPhone.TextColor = Colors.Blue";
_lblphone.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1310760;
 //BA.debugLineNum = 1310760;BA.debugLine="card.AddView(lblPhone, 10dip, 50dip, 80%x, 20di";
_card.AddView((android.view.View)(_lblphone.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (50)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1310762;
 //BA.debugLineNum = 1310762;BA.debugLine="Dim lblMail As Label";
_lblmail = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="lblMail.Initialize(\"\")";
_lblmail.Initialize(ba,"");
RDebugUtils.currentLine=1310764;
 //BA.debugLineNum = 1310764;BA.debugLine="lblMail.Text = \"📧 \" & item.Get(\"mail\")";
_lblmail.setText(BA.ObjectToCharSequence("📧 "+BA.ObjectToString(_item.Get((Object)("mail")))));
RDebugUtils.currentLine=1310765;
 //BA.debugLineNum = 1310765;BA.debugLine="lblMail.TextSize = 14";
_lblmail.setTextSize((float) (14));
RDebugUtils.currentLine=1310766;
 //BA.debugLineNum = 1310766;BA.debugLine="lblMail.TextColor = Colors.Blue";
_lblmail.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1310768;
 //BA.debugLineNum = 1310768;BA.debugLine="card.AddView(lblMail, 10dip, 65dip, 80%x, 20dip";
_card.AddView((android.view.View)(_lblmail.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (65)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1310770;
 //BA.debugLineNum = 1310770;BA.debugLine="Dim lblKon As Label";
_lblkon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1310771;
 //BA.debugLineNum = 1310771;BA.debugLine="lblKon.Initialize(\"\")";
_lblkon.Initialize(ba,"");
RDebugUtils.currentLine=1310772;
 //BA.debugLineNum = 1310772;BA.debugLine="lblKon.Text = \"🧑‍🤝‍🧑 \" & item.Get(\"konsultac";
_lblkon.setText(BA.ObjectToCharSequence("🧑‍🤝‍🧑 "+BA.ObjectToString(_item.Get((Object)("konsultacje")))));
RDebugUtils.currentLine=1310773;
 //BA.debugLineNum = 1310773;BA.debugLine="lblKon.TextSize = 14";
_lblkon.setTextSize((float) (14));
RDebugUtils.currentLine=1310774;
 //BA.debugLineNum = 1310774;BA.debugLine="lblKon.TextColor = Colors.Blue";
_lblkon.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1310776;
 //BA.debugLineNum = 1310776;BA.debugLine="card.AddView(lblKon, 10dip, 80dip, 80%x, 20dip)";
_card.AddView((android.view.View)(_lblkon.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (80)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1310778;
 //BA.debugLineNum = 1310778;BA.debugLine="Dim lblUSOS As Label";
_lblusos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1310779;
 //BA.debugLineNum = 1310779;BA.debugLine="lblUSOS.Initialize(\"\")";
_lblusos.Initialize(ba,"");
RDebugUtils.currentLine=1310780;
 //BA.debugLineNum = 1310780;BA.debugLine="lblUSOS.Text = \"💼 \" & item.Get(\"link_do_serwis";
_lblusos.setText(BA.ObjectToCharSequence("💼 "+BA.ObjectToString(_item.Get((Object)("link_do_serwisu_usos")))));
RDebugUtils.currentLine=1310781;
 //BA.debugLineNum = 1310781;BA.debugLine="lblUSOS.TextSize = 14";
_lblusos.setTextSize((float) (14));
RDebugUtils.currentLine=1310782;
 //BA.debugLineNum = 1310782;BA.debugLine="lblUSOS.TextColor = Colors.Blue";
_lblusos.setTextColor(__c.Colors.Blue);
RDebugUtils.currentLine=1310783;
 //BA.debugLineNum = 1310783;BA.debugLine="lblUSOS.Tag = item.Get(\"link_do_serwisu_usos\")";
_lblusos.setTag(_item.Get((Object)("link_do_serwisu_usos")));
RDebugUtils.currentLine=1310784;
 //BA.debugLineNum = 1310784;BA.debugLine="card.AddView(lblUSOS , 10dip, 95dip, 80%x, 20di";
_card.AddView((android.view.View)(_lblusos.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (95)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1310787;
 //BA.debugLineNum = 1310787;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1310788;
 //BA.debugLineNum = 1310788;BA.debugLine="cd.Initialize(Colors.White, 20dip)";
_cd.Initialize(__c.Colors.White,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1310789;
 //BA.debugLineNum = 1310789;BA.debugLine="card.Background = cd";
_card.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=1310790;
 //BA.debugLineNum = 1310790;BA.debugLine="card.Elevation = 5dip";
_card.setElevation((float) (__c.DipToCurrent((int) (5))));
 }
};
 } 
       catch (Exception e58) {
			ba.setLastException(e58);RDebugUtils.currentLine=1310793;
 //BA.debugLineNum = 1310793;BA.debugLine="xui.MsgboxAsync(\"Błąd przetwarzania JSON!\", \"Błą";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Błąd przetwarzania JSON!"),BA.ObjectToCharSequence("Błąd"));
 };
RDebugUtils.currentLine=1310795;
 //BA.debugLineNum = 1310795;BA.debugLine="End Sub";
return "";
}
}