package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.b4xmainpage.class).invoke(this, new Object[] {null});
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
public b4a.B4APagesNavBar.b4xpage2 _page2 = null;
public b4a.B4APagesNavBar.details _details = null;
public b4a.B4APagesNavBar.b4xpage4 _page4 = null;
public b4a.B4APagesNavBar.navbar _navbar1 = null;
public Object _currentpage = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlmainpage = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(b4a.B4APagesNavBar.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Page2.Initialize";
__ref._page2 /*b4a.B4APagesNavBar.b4xpage2*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="B4XPages.AddPage(\"Page 2\", Page2)";
_b4xpages._addpage /*String*/ (ba,"Page 2",(Object)(__ref._page2 /*b4a.B4APagesNavBar.b4xpage2*/ ));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Details.Initialize";
__ref._details /*b4a.B4APagesNavBar.details*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="B4XPages.AddPage(\"Details\", Details)";
_b4xpages._addpage /*String*/ (ba,"Details",(Object)(__ref._details /*b4a.B4APagesNavBar.details*/ ));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Page4.Initialize";
__ref._page4 /*b4a.B4APagesNavBar.b4xpage4*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="B4XPages.AddPage(\"Page 4\", Page4)";
_b4xpages._addpage /*String*/ (ba,"Page 4",(Object)(__ref._page4 /*b4a.B4APagesNavBar.b4xpage4*/ ));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="NavBar1.Initialize(Root)";
__ref._navbar1 /*b4a.B4APagesNavBar.navbar*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="CurrentPage = B4XPages.MainPage";
__ref._currentpage /*Object*/  = (Object)(_b4xpages._mainpage /*b4a.B4APagesNavBar.b4xmainpage*/ (ba));
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(b4a.B4APagesNavBar.b4xmainpage __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_resize", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.b4xmainpage __ref) throws Exception{
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
 //BA.debugLineNum = 589827;BA.debugLine="Public Page2 As B4XPage2";
_page2 = new b4a.B4APagesNavBar.b4xpage2();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Public Details As details";
_details = new b4a.B4APagesNavBar.details();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Public Page4 As B4XPage4";
_page4 = new b4a.B4APagesNavBar.b4xpage4();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Private NavBar1 As NavBar";
_navbar1 = new b4a.B4APagesNavBar.navbar();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Public CurrentPage As Object";
_currentpage = new Object();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Private pnlMainPage As B4XView";
_pnlmainpage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.B4APagesNavBar.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="rp.CheckAndRequest(\"android.permission.CALL_PHONE";
__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(ba,"android.permission.CALL_PHONE");
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.B4APagesNavBar.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return "";
}
}