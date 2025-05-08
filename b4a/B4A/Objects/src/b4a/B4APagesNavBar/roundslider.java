package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.roundslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.roundslider.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _mvalue = 0;
public int _mmin = 0;
public int _mmax = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _thumb = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _circlerect = null;
public int _valuecolor = 0;
public int _stroke = 0;
public int _thumbsize = 0;
public Object _tag = null;
public int _mthumbbordercolor = 0;
public int _mthumbinnercolor = 0;
public int _mcirclefillcolor = 0;
public int _mcirclenonvaluecolor = 0;
public boolean _mrollover = false;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.B4APagesNavBar.roundslider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
__ref._createthumb /*String*/ (null);};
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (_width-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ),(float) (_height-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ));
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
RDebugUtils.currentLine=40370182;
 //BA.debugLineNum = 40370182;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="End Sub";
return "";
}
public String  _createthumb(b4a.B4APagesNavBar.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "createthumb", true))
	 {return ((String) Debug.delegate(ba, "createthumb", null));}
b4a.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4a.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Private Sub CreateThumb";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="Dim p As BCPath";
_p = new b4a.example.bcpath();
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=40304643;
 //BA.debugLineNum = 40304643;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=40304644;
 //BA.debugLineNum = 40304644;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
RDebugUtils.currentLine=40304645;
 //BA.debugLineNum = 40304645;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=40304646;
 //BA.debugLineNum = 40304646;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
RDebugUtils.currentLine=40304647;
 //BA.debugLineNum = 40304647;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=40304648;
 //BA.debugLineNum = 40304648;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=40304649;
 //BA.debugLineNum = 40304649;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
RDebugUtils.currentLine=40304650;
 //BA.debugLineNum = 40304650;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=40304651;
 //BA.debugLineNum = 40304651;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
_bc._drawpath(_p,__ref._mthumbbordercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=40304652;
 //BA.debugLineNum = 40304652;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbinnercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=40304653;
 //BA.debugLineNum = 40304653;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbbordercolor /*int*/ ,__c.False,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=40304654;
 //BA.debugLineNum = 40304654;BA.debugLine="thumb = bc.Bitmap";
__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bc._getbitmap();
RDebugUtils.currentLine=40304655;
 //BA.debugLineNum = 40304655;BA.debugLine="ThumbSize = thumb.Height / 4";
__ref._thumbsize /*int*/  = (int) (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=40304656;
 //BA.debugLineNum = 40304656;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=40304657;
 //BA.debugLineNum = 40304657;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.B4APagesNavBar.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Public Sub Draw";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2);
RDebugUtils.currentLine=40435715;
 //BA.debugLineNum = 40435715;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._mcirclenonvaluecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=40435716;
 //BA.debugLineNum = 40435716;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=40435717;
 //BA.debugLineNum = 40435717;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((__ref._mvalue /*int*/ -__ref._mmin /*int*/ )/(double)(__ref._mmax /*int*/ -__ref._mmin /*int*/ )*360);
RDebugUtils.currentLine=40435718;
 //BA.debugLineNum = 40435718;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
RDebugUtils.currentLine=40435719;
 //BA.debugLineNum = 40435719;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_b4jstrokeoffset = (int) (__ref._stroke /*int*/ /(double)2);};
RDebugUtils.currentLine=40435720;
 //BA.debugLineNum = 40435720;BA.debugLine="If mValue = mMax Then";
if (__ref._mvalue /*int*/ ==__ref._mmax /*int*/ ) { 
RDebugUtils.currentLine=40435721;
 //BA.debugLineNum = 40435721;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Ce";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 }else {
RDebugUtils.currentLine=40435723;
 //BA.debugLineNum = 40435723;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.C";
_p.InitializeArc(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
RDebugUtils.currentLine=40435724;
 //BA.debugLineNum = 40435724;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 };
RDebugUtils.currentLine=40435726;
 //BA.debugLineNum = 40435726;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius-_b4jstrokeoffset),__ref._mcirclefillcolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=40435727;
 //BA.debugLineNum = 40435727;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=40435728;
 //BA.debugLineNum = 40435728;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+__ref._thumbsize /*int*/ /(double)2+__ref._stroke /*int*/ /(double)2);
RDebugUtils.currentLine=40435729;
 //BA.debugLineNum = 40435729;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX()+_r*__c.CosD(_angle-90));
RDebugUtils.currentLine=40435730;
 //BA.debugLineNum = 40435730;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY()+_r*__c.SinD(_angle-90));
RDebugUtils.currentLine=40435731;
 //BA.debugLineNum = 40435731;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy-__ref._thumbsize /*int*/ /(double)2),(float) (_cx+__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy+__ref._thumbsize /*int*/ /(double)2));
RDebugUtils.currentLine=40435732;
 //BA.debugLineNum = 40435732;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawBitmapRotated((android.graphics.Bitmap)(__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_dest,(float) (_angle));
RDebugUtils.currentLine=40435733;
 //BA.debugLineNum = 40435733;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=40435734;
 //BA.debugLineNum = 40435734;BA.debugLine="xlbl.Text = mValue";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._mvalue /*int*/ ));
RDebugUtils.currentLine=40435735;
 //BA.debugLineNum = 40435735;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=39976963;
 //BA.debugLineNum = 39976963;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39976964;
 //BA.debugLineNum = 39976964;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=39976965;
 //BA.debugLineNum = 39976965;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="Private mValue As Int = 75";
_mvalue = (int) (75);
RDebugUtils.currentLine=39976967;
 //BA.debugLineNum = 39976967;BA.debugLine="Private mMin, mMax As Int";
_mmin = 0;
_mmax = 0;
RDebugUtils.currentLine=39976968;
 //BA.debugLineNum = 39976968;BA.debugLine="Private thumb As B4XBitmap";
_thumb = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=39976969;
 //BA.debugLineNum = 39976969;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39976970;
 //BA.debugLineNum = 39976970;BA.debugLine="Private xlbl As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39976971;
 //BA.debugLineNum = 39976971;BA.debugLine="Private CircleRect As B4XRect";
_circlerect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=39976972;
 //BA.debugLineNum = 39976972;BA.debugLine="Private ValueColor As Int";
_valuecolor = 0;
RDebugUtils.currentLine=39976973;
 //BA.debugLineNum = 39976973;BA.debugLine="Private stroke As Int";
_stroke = 0;
RDebugUtils.currentLine=39976974;
 //BA.debugLineNum = 39976974;BA.debugLine="Private ThumbSize As Int";
_thumbsize = 0;
RDebugUtils.currentLine=39976975;
 //BA.debugLineNum = 39976975;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=39976976;
 //BA.debugLineNum = 39976976;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
_mthumbbordercolor = ((int)0xff5b5b5b);
RDebugUtils.currentLine=39976977;
 //BA.debugLineNum = 39976977;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
_mthumbinnercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=39976978;
 //BA.debugLineNum = 39976978;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
_mcirclefillcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=39976979;
 //BA.debugLineNum = 39976979;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
_mcirclenonvaluecolor = ((int)0xffb6b6b6);
RDebugUtils.currentLine=39976980;
 //BA.debugLineNum = 39976980;BA.debugLine="Private mRollOver As Boolean";
_mrollover = false;
RDebugUtils.currentLine=39976981;
 //BA.debugLineNum = 39976981;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.B4APagesNavBar.roundslider __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=40108035;
 //BA.debugLineNum = 40108035;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=40108036;
 //BA.debugLineNum = 40108036;BA.debugLine="mMin = Props.Get(\"Min\")";
__ref._mmin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=40108037;
 //BA.debugLineNum = 40108037;BA.debugLine="mMax = Props.Get(\"Max\")";
__ref._mmax /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=40108038;
 //BA.debugLineNum = 40108038;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
RDebugUtils.currentLine=40108039;
 //BA.debugLineNum = 40108039;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=40108040;
 //BA.debugLineNum = 40108040;BA.debugLine="xlbl = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=40108041;
 //BA.debugLineNum = 40108041;BA.debugLine="xlbl.Visible = True";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=40108042;
 //BA.debugLineNum = 40108042;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=40108043;
 //BA.debugLineNum = 40108043;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=40108044;
 //BA.debugLineNum = 40108044;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
__ref._valuecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ValueColor")));
RDebugUtils.currentLine=40108045;
 //BA.debugLineNum = 40108045;BA.debugLine="mRollOver = Props.GetDefault(\"RollOver\", False)";
__ref._mrollover /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("RollOver"),(Object)(__c.False)));
RDebugUtils.currentLine=40108046;
 //BA.debugLineNum = 40108046;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=40108047;
 //BA.debugLineNum = 40108047;BA.debugLine="stroke = 8dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (8));
 }else 
{RDebugUtils.currentLine=40108048;
 //BA.debugLineNum = 40108048;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=40108049;
 //BA.debugLineNum = 40108049;BA.debugLine="stroke = 6dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (6));
 }}
;
RDebugUtils.currentLine=40108051;
 //BA.debugLineNum = 40108051;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=40108052;
 //BA.debugLineNum = 40108052;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.B4APagesNavBar.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.B4APagesNavBar.roundslider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=40042499;
 //BA.debugLineNum = 40042499;BA.debugLine="End Sub";
return "";
}
public String  _pnl_touch(b4a.B4APagesNavBar.roundslider __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_touch", true))
	 {return ((String) Debug.delegate(ba, "pnl_touch", new Object[] {_action,_x,_y}));}
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX());
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY());
RDebugUtils.currentLine=40501252;
 //BA.debugLineNum = 40501252;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
RDebugUtils.currentLine=40501253;
 //BA.debugLineNum = 40501253;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2) { 
RDebugUtils.currentLine=40501254;
 //BA.debugLineNum = 40501254;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
RDebugUtils.currentLine=40501255;
 //BA.debugLineNum = 40501255;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
RDebugUtils.currentLine=40501256;
 //BA.debugLineNum = 40501256;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
RDebugUtils.currentLine=40501257;
 //BA.debugLineNum = 40501257;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (__ref._mmin /*int*/ +_angle/(double)360*(__ref._mmax /*int*/ -__ref._mmin /*int*/ ));
RDebugUtils.currentLine=40501258;
 //BA.debugLineNum = 40501258;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_newvalue)));
RDebugUtils.currentLine=40501259;
 //BA.debugLineNum = 40501259;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=40501260;
 //BA.debugLineNum = 40501260;BA.debugLine="If mRollOver = False Then";
if (__ref._mrollover /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=40501261;
 //BA.debugLineNum = 40501261;BA.debugLine="If Abs(NewValue - mValue) > (mMax - mMin) / 2";
if (__c.Abs(_newvalue-__ref._mvalue /*int*/ )>(__ref._mmax /*int*/ -__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=40501262;
 //BA.debugLineNum = 40501262;BA.debugLine="If mValue >= (mMax + mMin) / 2 Then";
if (__ref._mvalue /*int*/ >=(__ref._mmax /*int*/ +__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=40501263;
 //BA.debugLineNum = 40501263;BA.debugLine="mValue = mMax";
__ref._mvalue /*int*/  = __ref._mmax /*int*/ ;
 }else {
RDebugUtils.currentLine=40501265;
 //BA.debugLineNum = 40501265;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
 };
 }else {
RDebugUtils.currentLine=40501268;
 //BA.debugLineNum = 40501268;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
 }else {
RDebugUtils.currentLine=40501271;
 //BA.debugLineNum = 40501271;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
RDebugUtils.currentLine=40501273;
 //BA.debugLineNum = 40501273;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Valu";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=40501274;
 //BA.debugLineNum = 40501274;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChange";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=40501277;
 //BA.debugLineNum = 40501277;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
RDebugUtils.currentLine=40501279;
 //BA.debugLineNum = 40501279;BA.debugLine="End Sub";
return "";
}
public String  _setcirclecolor(b4a.B4APagesNavBar.roundslider __ref,int _nonvaluecolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setcirclecolor", true))
	 {return ((String) Debug.delegate(ba, "setcirclecolor", new Object[] {_nonvaluecolor,_innercolor}));}
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="mCircleNonValueColor = NonValueColor";
__ref._mcirclenonvaluecolor /*int*/  = _nonvaluecolor;
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="mCircleFillColor = InnerColor";
__ref._mcirclefillcolor /*int*/  = _innercolor;
RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="End Sub";
return "";
}
public String  _setrange(b4a.B4APagesNavBar.roundslider __ref,int _newmin,int _newmax) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setrange", true))
	 {return ((String) Debug.delegate(ba, "setrange", new Object[] {_newmin,_newmax}));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Public Sub SetRange(NewMin As Int, NewMax As Int)";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="mMin = NewMin";
__ref._mmin /*int*/  = _newmin;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="mMax = NewMax";
__ref._mmax /*int*/  = _newmax;
RDebugUtils.currentLine=40632323;
 //BA.debugLineNum = 40632323;BA.debugLine="setValue(mValue)";
__ref._setvalue /*String*/ (null,__ref._mvalue /*int*/ );
RDebugUtils.currentLine=40632324;
 //BA.debugLineNum = 40632324;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.B4APagesNavBar.roundslider __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_v)));
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=40566787;
 //BA.debugLineNum = 40566787;BA.debugLine="End Sub";
return "";
}
public String  _setthumbcolor(b4a.B4APagesNavBar.roundslider __ref,int _bordercolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setthumbcolor", true))
	 {return ((String) Debug.delegate(ba, "setthumbcolor", new Object[] {_bordercolor,_innercolor}));}
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="mThumbBorderColor = BorderColor";
__ref._mthumbbordercolor /*int*/  = _bordercolor;
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="mThumbInnerColor = InnerColor";
__ref._mthumbinnercolor /*int*/  = _innercolor;
RDebugUtils.currentLine=40173571;
 //BA.debugLineNum = 40173571;BA.debugLine="CreateThumb";
__ref._createthumb /*String*/ (null);
RDebugUtils.currentLine=40173572;
 //BA.debugLineNum = 40173572;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=40173573;
 //BA.debugLineNum = 40173573;BA.debugLine="End Sub";
return "";
}
}