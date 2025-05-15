package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class navbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.navbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.navbar.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmainpage = null;
public b4a.example.b4xmainpage _mp = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.navbar __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="navbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Public Sub Initialize(Parent As B4XView)";
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="pnlParent = Parent";
__ref._pnlparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=42795011;
 //BA.debugLineNum = 42795011;BA.debugLine="MP = B4XPages.MainPage";
__ref._mp /*b4a.example.b4xmainpage*/  = _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba);
RDebugUtils.currentLine=42795012;
 //BA.debugLineNum = 42795012;BA.debugLine="pnlParent.LoadLayout(\"NavBar\")";
__ref._pnlparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("NavBar",ba);
RDebugUtils.currentLine=42795013;
 //BA.debugLineNum = 42795013;BA.debugLine="End Sub";
return "";
}
public String  _btnnavbar_click(b4a.example.navbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navbar";
if (Debug.shouldDelegate(ba, "btnnavbar_click", false))
	 {return ((String) Debug.delegate(ba, "btnnavbar_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _index = 0;
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Private Sub btnNavBar_Click";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="Private btn As B4XView";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="Private Index As Int";
_index = 0;
RDebugUtils.currentLine=42860548;
 //BA.debugLineNum = 42860548;BA.debugLine="btn = Sender";
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=42860549;
 //BA.debugLineNum = 42860549;BA.debugLine="Index = btn.Tag";
_index = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=42860553;
 //BA.debugLineNum = 42860553;BA.debugLine="Select Index";
switch (_index) {
case 1: {
RDebugUtils.currentLine=42860555;
 //BA.debugLineNum = 42860555;BA.debugLine="MP.CurrentPage = MP";
__ref._mp /*b4a.example.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.example.b4xmainpage*/ );
RDebugUtils.currentLine=42860556;
 //BA.debugLineNum = 42860556;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPa";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"MainPage");
 break; }
case 2: {
RDebugUtils.currentLine=42860558;
 //BA.debugLineNum = 42860558;BA.debugLine="MP.CurrentPage = MP.Page2";
__ref._mp /*b4a.example.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.example.b4xmainpage*/ ._page2 /*b4a.example.b4xpage2*/ );
RDebugUtils.currentLine=42860559;
 //BA.debugLineNum = 42860559;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 2";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Page 2");
 break; }
case 4: {
RDebugUtils.currentLine=42860561;
 //BA.debugLineNum = 42860561;BA.debugLine="MP.CurrentPage = MP.Page4";
__ref._mp /*b4a.example.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.example.b4xmainpage*/ ._page4 /*b4a.example.b4xpage4*/ );
RDebugUtils.currentLine=42860562;
 //BA.debugLineNum = 42860562;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 4";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Page 4");
 break; }
}
;
RDebugUtils.currentLine=42860564;
 //BA.debugLineNum = 42860564;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.navbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navbar";
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=42729476;
 //BA.debugLineNum = 42729476;BA.debugLine="Private pnlParent As B4XView";
_pnlparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=42729477;
 //BA.debugLineNum = 42729477;BA.debugLine="Private btnMainPage As B4XView";
_btnmainpage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=42729478;
 //BA.debugLineNum = 42729478;BA.debugLine="Private MP As B4XMainPage";
_mp = new b4a.example.b4xmainpage();
RDebugUtils.currentLine=42729479;
 //BA.debugLineNum = 42729479;BA.debugLine="End Sub";
return "";
}
}