package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.b4xfloattextfield");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.b4xfloattextfield.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mtextfield = null;
public int _animationduration = 0;
public float _largelabeltextsize = 0f;
public float _smalllabeltextsize = 0f;
public boolean _largelabel = false;
public anywheresoftware.b4a.objects.B4XCanvas _measuringcanvas = null;
public int _hintcolor = 0;
public int _nonfocusedhintcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _hintimageview = null;
public String _hinttext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _hintfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largefocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largenotfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallnotfocused = null;
public boolean _focused = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblv = null;
public anywheresoftware.b4a.objects.collections.Map _mprops = null;
public Object _tag = null;
public String _keyboardtype = "";
public boolean _multiline = false;
public b4a.B4APagesNavBar.b4xfloattextfield _mnexttextfield = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public int _hintlabellargeoffsetx = 0;
public int _hintlabelsmalloffsety = 0;
public int _hintlabelsmalloffsetx = 0;
public long _lastswitchtextfieldtime = 0L;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.B4APagesNavBar.b4xfloattextfield __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _firstdistance = 0;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (__ref._multiline /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="If lblV.IsInitialized Then";
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__c.DipToCurrent((int) (2)));
 };
RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="If lblClear.IsInitialized Then";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=28966921;
 //BA.debugLineNum = 28966921;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
 };
RDebugUtils.currentLine=28966923;
 //BA.debugLineNum = 28966923;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=28966924;
 //BA.debugLineNum = 28966924;BA.debugLine="End Sub";
return "";
}
public String  _updatelabel(b4a.B4APagesNavBar.b4xfloattextfield __ref,String _txt,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "updatelabel", true))
	 {return ((String) Debug.delegate(ba, "updatelabel", new Object[] {_txt,_force}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ };
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(__ref._focused /*boolean*/  && _txt.length()>0);};
 }
};
RDebugUtils.currentLine=29032453;
 //BA.debugLineNum = 29032453;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==__ref._largelabel /*boolean*/  && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=29032455;
 //BA.debugLineNum = 29032455;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=29032456;
 //BA.debugLineNum = 29032456;BA.debugLine="If Focused Then";
if (__ref._focused /*boolean*/ ) { 
RDebugUtils.currentLine=29032457;
 //BA.debugLineNum = 29032457;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = __ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 }else {
RDebugUtils.currentLine=29032459;
 //BA.debugLineNum = 29032459;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = __ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 };
RDebugUtils.currentLine=29032461;
 //BA.debugLineNum = 29032461;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=29032462;
 //BA.debugLineNum = 29032462;BA.debugLine="HintImageView.SetBitmap(b)";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=29032463;
 //BA.debugLineNum = 29032463;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
RDebugUtils.currentLine=29032464;
 //BA.debugLineNum = 29032464;BA.debugLine="HintImageView.SetLayoutAnimated (AnimationDurati";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabellargeoffsetx /*int*/ ,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_b.getHeight()/(double)2),(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=29032465;
 //BA.debugLineNum = 29032465;BA.debugLine="LargeLabel = True";
__ref._largelabel /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=29032467;
 //BA.debugLineNum = 29032467;BA.debugLine="HintImageView.SetLayoutAnimated(AnimationDuratio";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabelsmalloffsetx /*int*/ ,__ref._hintlabelsmalloffsety /*int*/ ,(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=29032468;
 //BA.debugLineNum = 29032468;BA.debugLine="LargeLabel = False";
__ref._largelabel /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=29032470;
 //BA.debugLineNum = 29032470;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=28377093;
 //BA.debugLineNum = 28377093;BA.debugLine="Private mTextField As B4XView";
_mtextfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="Public AnimationDuration As Int = 200";
_animationduration = (int) (200);
RDebugUtils.currentLine=28377095;
 //BA.debugLineNum = 28377095;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_largelabeltextsize = (float) (18);
_smalllabeltextsize = (float) (14);
RDebugUtils.currentLine=28377096;
 //BA.debugLineNum = 28377096;BA.debugLine="Private LargeLabel As Boolean";
_largelabel = false;
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_measuringcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=28377098;
 //BA.debugLineNum = 28377098;BA.debugLine="Public HintColor As Int";
_hintcolor = 0;
RDebugUtils.currentLine=28377099;
 //BA.debugLineNum = 28377099;BA.debugLine="Public NonFocusedHintColor As Int";
_nonfocusedhintcolor = 0;
RDebugUtils.currentLine=28377100;
 //BA.debugLineNum = 28377100;BA.debugLine="Private HintImageView As B4XView";
_hintimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28377101;
 //BA.debugLineNum = 28377101;BA.debugLine="Public HintText As String";
_hinttext = "";
RDebugUtils.currentLine=28377102;
 //BA.debugLineNum = 28377102;BA.debugLine="Public HintFont As B4XFont";
_hintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=28377103;
 //BA.debugLineNum = 28377103;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_largefocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_largenotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallnotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=28377104;
 //BA.debugLineNum = 28377104;BA.debugLine="Public Focused As Boolean";
_focused = false;
RDebugUtils.currentLine=28377105;
 //BA.debugLineNum = 28377105;BA.debugLine="Public lblClear As B4XView";
_lblclear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28377106;
 //BA.debugLineNum = 28377106;BA.debugLine="Public lblV As B4XView";
_lblv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28377107;
 //BA.debugLineNum = 28377107;BA.debugLine="Private mProps As Map";
_mprops = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28377108;
 //BA.debugLineNum = 28377108;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=28377109;
 //BA.debugLineNum = 28377109;BA.debugLine="Private KeyboardType As String 'ignore";
_keyboardtype = "";
RDebugUtils.currentLine=28377110;
 //BA.debugLineNum = 28377110;BA.debugLine="Private Multiline As Boolean";
_multiline = false;
RDebugUtils.currentLine=28377111;
 //BA.debugLineNum = 28377111;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_mnexttextfield = new b4a.B4APagesNavBar.b4xfloattextfield();
RDebugUtils.currentLine=28377113;
 //BA.debugLineNum = 28377113;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=28377118;
 //BA.debugLineNum = 28377118;BA.debugLine="Public HintLabelLargeOffsetX, HintLabelSmallOffse";
_hintlabellargeoffsetx = 0;
_hintlabelsmalloffsety = __c.DipToCurrent((int) (2));
_hintlabelsmalloffsetx = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=28377119;
 //BA.debugLineNum = 28377119;BA.debugLine="Private LastSwitchTextFieldTime As Long";
_lastswitchtextfieldtime = 0L;
RDebugUtils.currentLine=28377120;
 //BA.debugLineNum = 28377120;BA.debugLine="End Sub";
return "";
}
public String  _createacceptbutton(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createacceptbutton", true))
	 {return ((String) Debug.delegate(ba, "createacceptbutton", null));}
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub CreateAcceptButton";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe5ca))));
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="lblV.Tag = \"v\"";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("v"));
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createbutton(b4a.B4APagesNavBar.b4xfloattextfield __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createbutton", new Object[] {_text}));}
anywheresoftware.b4a.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="x = lc";
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=28901381;
 //BA.debugLineNum = 28901381;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (20)));
RDebugUtils.currentLine=28901382;
 //BA.debugLineNum = 28901382;BA.debugLine="x.Text = Text";
_x.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=28901383;
 //BA.debugLineNum = 28901383;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=28901384;
 //BA.debugLineNum = 28901384;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
RDebugUtils.currentLine=28901385;
 //BA.debugLineNum = 28901385;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=28901386;
 //BA.debugLineNum = 28901386;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_x.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=28901387;
 //BA.debugLineNum = 28901387;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=28901388;
 //BA.debugLineNum = 28901388;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(b4a.B4APagesNavBar.b4xfloattextfield __ref,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_r,_color,_fnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2)))),(int) (__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2)))));
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=29229060;
 //BA.debugLineNum = 29229060;BA.debugLine="c.Initialize(p)";
_c.Initialize(_p);
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=29229062;
 //BA.debugLineNum = 29229062;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(ba,__ref._hinttext /*String*/ ,(float) (_p.getWidth()/(double)2),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=29229063;
 //BA.debugLineNum = 29229063;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
RDebugUtils.currentLine=29229064;
 //BA.debugLineNum = 29229064;BA.debugLine="c.Release";
_c.Release();
RDebugUtils.currentLine=29229065;
 //BA.debugLineNum = 29229065;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=29229066;
 //BA.debugLineNum = 29229066;BA.debugLine="End Sub";
return null;
}
public String  _createclearbutton(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createclearbutton", true))
	 {return ((String) Debug.delegate(ba, "createclearbutton", null));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub CreateClearButton";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe14c))));
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="lblClear.Tag = \"clear\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("clear"));
RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="End Sub";
return "";
}
public String  _createrevealbutton(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createrevealbutton", true))
	 {return ((String) Debug.delegate(ba, "createrevealbutton", null));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub CreateRevealButton";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextfield(b4a.B4APagesNavBar.b4xfloattextfield __ref,boolean _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextfield", new Object[] {_password}));}
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
RDebugUtils.currentLine=29818896;
 //BA.debugLineNum = 29818896;BA.debugLine="Dim tf As EditText";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=29818897;
 //BA.debugLineNum = 29818897;BA.debugLine="tf.Initialize(\"tf\")";
_tf.Initialize(ba,"tf");
RDebugUtils.currentLine=29818898;
 //BA.debugLineNum = 29818898;BA.debugLine="tf.SingleLine = Not(Multiline)";
_tf.setSingleLine(__c.Not(__ref._multiline /*boolean*/ ));
RDebugUtils.currentLine=29818899;
 //BA.debugLineNum = 29818899;BA.debugLine="tf.PasswordMode = Password";
_tf.setPasswordMode(_password);
RDebugUtils.currentLine=29818900;
 //BA.debugLineNum = 29818900;BA.debugLine="If Password Then";
if (_password) { 
RDebugUtils.currentLine=29818901;
 //BA.debugLineNum = 29818901;BA.debugLine="If KeyboardType <> \"Text\" Then";
if ((__ref._keyboardtype /*String*/ ).equals("Text") == false) { 
RDebugUtils.currentLine=29818902;
 //BA.debugLineNum = 29818902;BA.debugLine="tf.InputType = Bit.Or(tf.INPUT_TYPE_NUMBERS, 16";
_tf.setInputType(__c.Bit.Or(_tf.INPUT_TYPE_NUMBERS,(int) (16)));
 }else {
RDebugUtils.currentLine=29818904;
 //BA.debugLineNum = 29818904;BA.debugLine="tf.InputType = Bit.Or(0x00000080, 0x00080000) '";
_tf.setInputType(__c.Bit.Or(((int)0x00000080),((int)0x00080000)));
 };
 }else {
RDebugUtils.currentLine=29818907;
 //BA.debugLineNum = 29818907;BA.debugLine="Select KeyboardType";
switch (BA.switchObjectToInt(__ref._keyboardtype /*String*/ ,"Numbers","Decimal")) {
case 0: {
RDebugUtils.currentLine=29818909;
 //BA.debugLineNum = 29818909;BA.debugLine="tf.InputType = tf.INPUT_TYPE_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_NUMBERS);
 break; }
case 1: {
RDebugUtils.currentLine=29818911;
 //BA.debugLineNum = 29818911;BA.debugLine="tf.InputType = tf.INPUT_TYPE_DECIMAL_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_DECIMAL_NUMBERS);
 break; }
}
;
 };
RDebugUtils.currentLine=29818914;
 //BA.debugLineNum = 29818914;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
RDebugUtils.currentLine=29818938;
 //BA.debugLineNum = 29818938;BA.debugLine="End Sub";
return null;
}
public String  _createtextfieldall(b4a.B4APagesNavBar.b4xfloattextfield __ref,boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfieldall", true))
	 {return ((String) Debug.delegate(ba, "createtextfieldall", new Object[] {_passwordmode,_font1,_textcolor}));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_passwordmode);
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="mTextField.Font = Font1";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_font1);
RDebugUtils.currentLine=28573699;
 //BA.debugLineNum = 28573699;BA.debugLine="mTextField.TextColor = TextColor";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=28573700;
 //BA.debugLineNum = 28573700;BA.debugLine="setNextField(mNextTextField)";
__ref._setnextfield /*String*/ (null,__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ );
RDebugUtils.currentLine=28573701;
 //BA.debugLineNum = 28573701;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=28573702;
 //BA.debugLineNum = 28573702;BA.debugLine="End Sub";
return "";
}
public String  _setnextfield(b4a.B4APagesNavBar.b4xfloattextfield __ref,b4a.B4APagesNavBar.b4xfloattextfield _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "setnextfield", true))
	 {return ((String) Debug.delegate(ba, "setnextfield", new Object[] {_field}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
Object _o = null;
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="If Multiline = False Then";
if (__ref._multiline /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="If Field <> Me Then";
if ((_field).equals((b4a.B4APagesNavBar.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=29622277;
 //BA.debugLineNum = 29622277;BA.debugLine="IME.AddHandleActionEvent(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .AddHandleActionEvent((android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),ba);
 };
RDebugUtils.currentLine=29622279;
 //BA.debugLineNum = 29622279;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=29622280;
 //BA.debugLineNum = 29622280;BA.debugLine="et.ForceDoneButton = True";
_et.setForceDoneButton(__c.True);
 };
RDebugUtils.currentLine=29622283;
 //BA.debugLineNum = 29622283;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="mNextTextField = o";
__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/  = (b4a.B4APagesNavBar.b4xfloattextfield)(_o);
RDebugUtils.currentLine=29622285;
 //BA.debugLineNum = 29622285;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.B4APagesNavBar.b4xfloattextfield __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="mProps = Props";
__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/  = _props;
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=28508167;
 //BA.debugLineNum = 28508167;BA.debugLine="iv.Initialize(\"HintImageView\")";
_iv.Initialize(ba,"HintImageView");
RDebugUtils.currentLine=28508168;
 //BA.debugLineNum = 28508168;BA.debugLine="HintImageView = iv";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
__ref._keyboardtype /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
RDebugUtils.currentLine=28508175;
 //BA.debugLineNum = 28508175;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
__ref._hintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HintColor")));
RDebugUtils.currentLine=28508176;
 //BA.debugLineNum = 28508176;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
__ref._nonfocusedhintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
RDebugUtils.currentLine=28508178;
 //BA.debugLineNum = 28508178;BA.debugLine="HintText = Props.Get(\"Hint\")";
__ref._hinttext /*String*/  = BA.ObjectToString(_props.Get((Object)("Hint")));
RDebugUtils.currentLine=28508179;
 //BA.debugLineNum = 28508179;BA.debugLine="HintFont = PassedLabel.Font";
__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _passedlabel.getFont();
RDebugUtils.currentLine=28508180;
 //BA.debugLineNum = 28508180;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
RDebugUtils.currentLine=28508181;
 //BA.debugLineNum = 28508181;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
__ref._multiline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
RDebugUtils.currentLine=28508182;
 //BA.debugLineNum = 28508182;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && __ref._multiline /*boolean*/ ) { 
RDebugUtils.currentLine=28508183;
 //BA.debugLineNum = 28508183;BA.debugLine="Multiline = False";
__ref._multiline /*boolean*/  = __c.False;
RDebugUtils.currentLine=28508184;
 //BA.debugLineNum = 28508184;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.LogImpl("928508184","Multiline not supported with password mode.",0);
 };
RDebugUtils.currentLine=28508186;
 //BA.debugLineNum = 28508186;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
__ref._createtextfieldall /*String*/ (null,_passwordmode,_passedlabel.getFont(),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor())));
RDebugUtils.currentLine=28508188;
 //BA.debugLineNum = 28508188;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=28508189;
 //BA.debugLineNum = 28508189;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=28508190;
 //BA.debugLineNum = 28508190;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=28508191;
 //BA.debugLineNum = 28508191;BA.debugLine="MeasuringCanvas.Initialize(p)";
__ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=28508192;
 //BA.debugLineNum = 28508192;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=28508193;
 //BA.debugLineNum = 28508193;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=28508194;
 //BA.debugLineNum = 28508194;BA.debugLine="CreateRevealButton";
__ref._createrevealbutton /*String*/ (null);
 }else {
RDebugUtils.currentLine=28508196;
 //BA.debugLineNum = 28508196;BA.debugLine="CreateClearButton";
__ref._createclearbutton /*String*/ (null);
 };
RDebugUtils.currentLine=28508198;
 //BA.debugLineNum = 28508198;BA.debugLine="CreateAcceptButton";
__ref._createacceptbutton /*String*/ (null);
RDebugUtils.currentLine=28508199;
 //BA.debugLineNum = 28508199;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=28508200;
 //BA.debugLineNum = 28508200;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._largelabeltextsize /*float*/ );
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
__ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29163524;
 //BA.debugLineNum = 29163524;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29163525;
 //BA.debugLineNum = 29163525;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._smalllabeltextsize /*float*/ );
RDebugUtils.currentLine=29163526;
 //BA.debugLineNum = 29163526;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=29163527;
 //BA.debugLineNum = 29163527;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
__ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29163528;
 //BA.debugLineNum = 29163528;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29163529;
 //BA.debugLineNum = 29163529;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=29163530;
 //BA.debugLineNum = 29163530;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.b4xfloattextfield  _getnextfield(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "getnextfield", true))
	 {return ((b4a.B4APagesNavBar.b4xfloattextfield) Debug.delegate(ba, "getnextfield", null));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Return mNextTextField";
if (true) return __ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ ;
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="End Sub";
return null;
}
public String  _gettext(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Return mTextField.Text";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _gettextfield(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "gettextfield", null));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Public Sub getTextField As B4XView";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="Return mTextField";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "ime_handleaction", true))
	 {return ((Boolean) Debug.delegate(ba, "ime_handleaction", null));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Private Sub ime_HandleAction As Boolean";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=29687812;
 //BA.debugLineNum = 29687812;BA.debugLine="End Sub";
return false;
}
public String  _tf_enterpressed(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tf_enterpressed", null));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Private Sub tf_EnterPressed";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="tf_Action";
__ref._tf_action /*String*/ (null);
RDebugUtils.currentLine=29753350;
 //BA.debugLineNum = 29753350;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.B4APagesNavBar.b4xfloattextfield __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=28442628;
 //BA.debugLineNum = 28442628;BA.debugLine="HintLabelLargeOffsetX = 6dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (6));
 }else {
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="HintLabelLargeOffsetX = 12dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (12));
 };
RDebugUtils.currentLine=28442633;
 //BA.debugLineNum = 28442633;BA.debugLine="IME.Initialize(\"ime\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("ime");
RDebugUtils.currentLine=28442639;
 //BA.debugLineNum = 28442639;BA.debugLine="End Sub";
return "";
}
public String  _lc_click(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_click", true))
	 {return ((String) Debug.delegate(ba, "lc_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Private Sub lc_Click";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
RDebugUtils.currentLine=30015492;
 //BA.debugLineNum = 30015492;BA.debugLine="setText(\"\")";
__ref._settext /*String*/ (null,"");
 break; }
case 1: {
RDebugUtils.currentLine=30015494;
 //BA.debugLineNum = 30015494;BA.debugLine="SwitchFromPasswordToRegular (True)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=30015496;
 //BA.debugLineNum = 30015496;BA.debugLine="SwitchFromPasswordToRegular(False)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=30015498;
 //BA.debugLineNum = 30015498;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=30015499;
 //BA.debugLineNum = 30015499;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()==__c.False || (__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ ).equals((b4a.B4APagesNavBar.b4xfloattextfield)(this))) { 
RDebugUtils.currentLine=30015501;
 //BA.debugLineNum = 30015501;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
 };
 break; }
}
;
RDebugUtils.currentLine=30015507;
 //BA.debugLineNum = 30015507;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.B4APagesNavBar.b4xfloattextfield __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_s}));}
String _old = "";
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Public Sub setText(s As String)";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="mTextField.Text = s";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_s));
RDebugUtils.currentLine=29949956;
 //BA.debugLineNum = 29949956;BA.debugLine="If IsPaused(Me) Then tf_TextChanged(old, s)";
if (__c.IsPaused(ba,this)) { 
__ref._tf_textchanged /*String*/ (null,_old,_s);};
RDebugUtils.currentLine=29949960;
 //BA.debugLineNum = 29949960;BA.debugLine="End Sub";
return "";
}
public void  _switchfrompasswordtoregular(b4a.B4APagesNavBar.b4xfloattextfield __ref,boolean _toregular) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "switchfrompasswordtoregular", true))
	 {Debug.delegate(ba, "switchfrompasswordtoregular", new Object[] {_toregular}); return;}
ResumableSub_SwitchFromPasswordToRegular rsub = new ResumableSub_SwitchFromPasswordToRegular(this,__ref,_toregular);
rsub.resume(ba, null);
}
public static class ResumableSub_SwitchFromPasswordToRegular extends BA.ResumableSub {
public ResumableSub_SwitchFromPasswordToRegular(b4a.B4APagesNavBar.b4xfloattextfield parent,b4a.B4APagesNavBar.b4xfloattextfield __ref,boolean _toregular) {
this.parent = parent;
this.__ref = __ref;
this._toregular = _toregular;
this.__ref = parent;
}
b4a.B4APagesNavBar.b4xfloattextfield __ref;
b4a.B4APagesNavBar.b4xfloattextfield parent;
boolean _toregular;
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _oldfield = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Dim text As String = mTextField.Text";
_text = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="Dim oldfield As B4XView = mTextField";
_oldfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
_oldfield = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=28835846;
 //BA.debugLineNum = 28835846;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
__ref._createtextfieldall /*String*/ (null,parent.__c.Not(_toregular),_font1,_textcolor);
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="mTextField.Text = text";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="If lblClear.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=28835849;
 //BA.debugLineNum = 28835849;BA.debugLine="If ToRegular = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_toregular==parent.__c.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=28835850;
 //BA.debugLineNum = 28835850;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=28835851;
 //BA.debugLineNum = 28835851;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=28835853;
 //BA.debugLineNum = 28835853;BA.debugLine="lblClear.Tag = \"hide\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("hide"));
RDebugUtils.currentLine=28835854;
 //BA.debugLineNum = 28835854;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f5))));
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=28835856;
 //BA.debugLineNum = 28835856;BA.debugLine="lblClear.BringToFront";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
 if (true) break;
;
RDebugUtils.currentLine=28835858;
 //BA.debugLineNum = 28835858;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";

case 10:
//if
this.state = 15;
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=28835859;
 //BA.debugLineNum = 28835859;BA.debugLine="HintImageView.BringToFront";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=28835860;
 //BA.debugLineNum = 28835860;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=28835865;
 //BA.debugLineNum = 28835865;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=28835866;
 //BA.debugLineNum = 28835866;BA.debugLine="et.SelectionStart = mTextField.Text.Length";
_et.setSelectionStart(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length());
RDebugUtils.currentLine=28835868;
 //BA.debugLineNum = 28835868;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now";
__ref._lastswitchtextfieldtime /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=28835869;
 //BA.debugLineNum = 28835869;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=28835870;
 //BA.debugLineNum = 28835870;BA.debugLine="oldfield.RemoveViewFromParent";
_oldfield.RemoveViewFromParent();
RDebugUtils.currentLine=28835872;
 //BA.debugLineNum = 28835872;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now + 200";
__ref._lastswitchtextfieldtime /*long*/  = (long) (parent.__c.DateTime.getNow()+200);
RDebugUtils.currentLine=28835873;
 //BA.debugLineNum = 28835873;BA.debugLine="et.Enabled = False";
_et.setEnabled(parent.__c.False);
RDebugUtils.currentLine=28835874;
 //BA.debugLineNum = 28835874;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
RDebugUtils.currentLine=28835875;
 //BA.debugLineNum = 28835875;BA.debugLine="et.Enabled = True";
_et.setEnabled(parent.__c.True);
RDebugUtils.currentLine=28835876;
 //BA.debugLineNum = 28835876;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=28835877;
 //BA.debugLineNum = 28835877;BA.debugLine="et.RequestFocus";
_et.RequestFocus();
RDebugUtils.currentLine=28835878;
 //BA.debugLineNum = 28835878;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=28835880;
 //BA.debugLineNum = 28835880;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Passwo";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(int) (1))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=28835881;
 //BA.debugLineNum = 28835881;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Passwo";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(Object)(_toregular));
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=28835883;
 //BA.debugLineNum = 28835883;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _requestfocusandshowkeyboard(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "requestfocusandshowkeyboard", true))
	 {return ((String) Debug.delegate(ba, "requestfocusandshowkeyboard", null));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(b4a.B4APagesNavBar.b4xfloattextfield __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_textchanged", true))
	 {return ((String) Debug.delegate(ba, "tf_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="UpdateLabel(New, False)";
__ref._updatelabel /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(int) (2)) && __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(Object)(_old),(Object)(_new));
 };
RDebugUtils.currentLine=29491205;
 //BA.debugLineNum = 29491205;BA.debugLine="End Sub";
return "";
}
public String  _tf_action(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_action", true))
	 {return ((String) Debug.delegate(ba, "tf_action", null));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Private Sub tf_Action";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ .IsInitialized /*boolean*/ () && (__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ ).equals((b4a.B4APagesNavBar.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="mNextTextField.TextField.RequestFocus";
__ref._mnexttextfield /*b4a.B4APagesNavBar.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
 };
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed",(int) (0))) { 
RDebugUtils.currentLine=29425669;
 //BA.debugLineNum = 29425669;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed");
 };
RDebugUtils.currentLine=29425671;
 //BA.debugLineNum = 29425671;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_beginedit", true))
	 {return ((String) Debug.delegate(ba, "tf_beginedit", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Private Sub tf_BeginEdit";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="tf_FocusChanged(True)";
__ref._tf_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(b4a.B4APagesNavBar.b4xfloattextfield __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "tf_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Focused = HasFocus";
__ref._focused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_FocusC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="If LastSwitchTextFieldTime + 100 < DateTime.Now";
if (__ref._lastswitchtextfieldtime /*long*/ +100<__c.DateTime.getNow()) { 
RDebugUtils.currentLine=29097989;
 //BA.debugLineNum = 29097989;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Focus";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__ref._focused /*boolean*/ ));
 };
 };
RDebugUtils.currentLine=29097992;
 //BA.debugLineNum = 29097992;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit(b4a.B4APagesNavBar.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_endedit", true))
	 {return ((String) Debug.delegate(ba, "tf_endedit", null));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Private Sub tf_EndEdit";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="tf_FocusChanged(False)";
__ref._tf_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}