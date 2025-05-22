package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class navbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.navbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.navbar.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlparent = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnmainpage = null;
public b4a.B4APagesNavBar.b4xmainpage _mp = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnpage2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnpage3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnpage4 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.B4APagesNavBar.navbar __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="navbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Initialize(Parent As B4XView)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="pnlParent = Parent";
__ref._pnlparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="MP = B4XPages.MainPage";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/  = _b4xpages._mainpage /*b4a.B4APagesNavBar.b4xmainpage*/ (ba);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="pnlParent.LoadLayout(\"NavBar\")";
__ref._pnlparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("NavBar",ba);
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="End Sub";
return "";
}
public String  _btnnavbar_click(b4a.B4APagesNavBar.navbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navbar";
if (Debug.shouldDelegate(ba, "btnnavbar_click", false))
	 {return ((String) Debug.delegate(ba, "btnnavbar_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _btn = null;
int _index = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _labelborderdefault = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _labelborder = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub btnNavBar_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Private btn As Panel";
_btn = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Private Index As Int";
_index = 0;
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="btn = Sender";
_btn = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Index = btn.Tag";
_index = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Dim LabelBorderDefault As ColorDrawable";
_labelborderdefault = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Dim LabelBorder As ColorDrawable";
_labelborder = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="LabelBorderDefault.initialize2(Colors.Transparent";
_labelborderdefault.Initialize2(__c.Colors.Transparent,__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.Colors.Transparent);
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="btnMainPage.Background=LabelBorderDefault";
__ref._btnmainpage /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_labelborderdefault.getObject()));
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="btnPage2.Background=LabelBorderDefault";
__ref._btnpage2 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_labelborderdefault.getObject()));
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="btnPage3.Background=LabelBorderDefault";
__ref._btnpage3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_labelborderdefault.getObject()));
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="btnPage4.Background=LabelBorderDefault";
__ref._btnpage4 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_labelborderdefault.getObject()));
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="Select Index";
switch (_index) {
case 0: {
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="MP.CurrentPage = MP";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ );
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPa";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"MainPage");
 break; }
case 1: {
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="MP.CurrentPage = MP.Page2";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._page2 /*b4a.B4APagesNavBar.b4xpage2*/ );
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 2";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Page 2");
 break; }
case 2: {
 break; }
case 3: {
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="MP.CurrentPage = MP.Page4";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._page4 /*b4a.B4APagesNavBar.b4xpage4*/ );
RDebugUtils.currentLine=2359324;
 //BA.debugLineNum = 2359324;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 4";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Page 4");
 break; }
}
;
RDebugUtils.currentLine=2359326;
 //BA.debugLineNum = 2359326;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.navbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navbar";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Private pnlParent As B4XView";
_pnlparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Public btnMainPage As Panel";
_btnmainpage = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Private MP As B4XMainPage";
_mp = new b4a.B4APagesNavBar.b4xmainpage();
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Public btnPage2 As Panel";
_btnpage2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="Public btnPage3 As Panel";
_btnpage3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Public btnPage4 As Panel";
_btnpage4 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="End Sub";
return "";
}
}