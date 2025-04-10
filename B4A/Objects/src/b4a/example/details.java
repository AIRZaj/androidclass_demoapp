package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class details extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.details");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.details.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _lblinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
public String _info = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.details __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _loadperson(b4a.example.details __ref,anywheresoftware.b4a.objects.collections.Map _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "loadperson", false))
	 {return ((String) Debug.delegate(ba, "loadperson", new Object[] {_p}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub LoadPerson(p As Map)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim info As String";
_info = "";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="info = $\"Imię: ${p.Get(\"imie\")} Nazwisko: ${p.Get";
__ref._info /*String*/  = ("Imię: "+__c.SmartStringFormatter("",_p.Get((Object)("imie")))+"\n"+"Nazwisko: "+__c.SmartStringFormatter("",_p.Get((Object)("nazwisko")))+"\n"+"Tytuł: "+__c.SmartStringFormatter("",_p.Get((Object)("tytul")))+"\n"+"Zakład: "+__c.SmartStringFormatter("",_p.Get((Object)("zaklad")))+"\n"+"Pokój: "+__c.SmartStringFormatter("",_p.Get((Object)("pokoj")))+"\n"+"Telefon: "+__c.SmartStringFormatter("",_p.Get((Object)("numer_telefonu")))+"");
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="lblInfo.Text = info";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._info /*String*/ ));
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.details __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Root.Color = xui.Color_White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Root.LoadLayout(\"detail2\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("detail2",ba);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="lbl.Initialize(\"\")";
__ref._lbl /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="lbl.TextSize = 16";
__ref._lbl /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="lbl.TextColor = xui.Color_Black";
__ref._lbl /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="lbl.Text = \"Szczegóły osoby...\"";
__ref._lbl /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Szczegóły osoby..."));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="lblInfo = lbl";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._lbl /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="lblInfo.SetTextAlignment(\"TOP\", \"LEFT\") ' Ustawie";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="Root.AddView(lblInfo, 10dip, 10dip, 90%x, 100dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.PerXToCurrent((float) (90),ba),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.details __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="details";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim info As String";
_info = "";
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Private Panel1 As B4XView";
_panel1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="End Sub";
return "";
}
}