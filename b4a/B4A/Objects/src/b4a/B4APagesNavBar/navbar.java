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
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmainpage = null;
public b4a.B4APagesNavBar.b4xmainpage _mp = null;
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
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub Initialize(Parent As B4XView)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="pnlParent = Parent";
__ref._pnlparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="MP = B4XPages.MainPage";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/  = _b4xpages._mainpage /*b4a.B4APagesNavBar.b4xmainpage*/ (ba);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="pnlParent.LoadLayout(\"NavBar\")";
__ref._pnlparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("NavBar",ba);
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="End Sub";
return "";
}
public String  _btnnavbar_click(b4a.B4APagesNavBar.navbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navbar";
if (Debug.shouldDelegate(ba, "btnnavbar_click", false))
	 {return ((String) Debug.delegate(ba, "btnnavbar_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _index = 0;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub btnNavBar_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Private btn As B4XView";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Private Index As Int";
_index = 0;
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="btn = Sender";
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Index = btn.Tag";
_index = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Select Index";
switch (_index) {
case 1: {
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="MP.CurrentPage = MP";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ );
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPa";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"MainPage");
 break; }
case 2: {
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="MP.CurrentPage = MP.Page2";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._page2 /*b4a.B4APagesNavBar.b4xpage2*/ );
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 2";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Page 2");
 break; }
case 4: {
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="MP.CurrentPage = MP.Page4";
__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._currentpage /*Object*/  = (Object)(__ref._mp /*b4a.B4APagesNavBar.b4xmainpage*/ ._page4 /*b4a.B4APagesNavBar.b4xpage4*/ );
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Page 4";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Page 4");
 break; }
}
;
RDebugUtils.currentLine=2228244;
 //BA.debugLineNum = 2228244;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.navbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navbar";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Private pnlParent As B4XView";
_pnlparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Private btnMainPage As B4XView";
_btnmainpage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Private MP As B4XMainPage";
_mp = new b4a.B4APagesNavBar.b4xmainpage();
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="End Sub";
return "";
}
}