package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bblabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.bblabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.bblabel.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _runs = null;
public b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _style = null;
public b4a.B4APagesNavBar.bctextengine _mtextengine = null;
public String _mtext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview = null;
public b4a.B4APagesNavBar.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _disableresizeevent = false;
public boolean _wordwrap = false;
public boolean _rtl = false;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _settext(b4a.B4APagesNavBar.bblabel __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.B4APagesNavBar.bblabel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="If DisableResizeEvent Then Return";
if (__ref._disableresizeevent /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="If Runs.IsInitialized Then";
if (__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/ ) { 
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
 }else {
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
 };
 };
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw(b4a.B4APagesNavBar.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "parseanddraw", true))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
int _i = 0;
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="For i = mBase.NumberOfViews - 1 To 1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="mBase.GetView(i).RemoveViewFromParent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (__ref._rtl /*boolean*/ ) { 
__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._rtlaware /*boolean*/  = __c.True;};
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._tagparser /*b4a.B4APagesNavBar.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Parse";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._tagparser /*b4a.B4APagesNavBar.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="End Sub";
return "";
}
public String  _redraw(b4a.B4APagesNavBar.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "redraw", true))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
int _dx = 0;
int _dy = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createstyle /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Style.Padding = Padding";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Style.HorizontalAlignment = \"left\"";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/  = "left";
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="Style.WordWrap = WordWrap";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/  = __ref._wordwrap /*boolean*/ ;
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Style.RTL = RTL";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, For";
__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._drawtext /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ ,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null)));
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="Dim dx As Int = mBase.Width / 2 - ForegroundImage";
_dx = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="Dim dy As Int = mBase.Height / 2 - ForegroundImag";
_dy = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group10 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group10.Get(index10)));
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="v.Left = v.Left + dx";
_v.setLeft((int) (_v.getLeft()+_dx));
RDebugUtils.currentLine=14876684;
 //BA.debugLineNum = 14876684;BA.debugLine="v.Top = v.Top + dy";
_v.setTop((int) (_v.getTop()+_dy));
 }
};
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="ForegroundImageView.Visible = Paragraph.Height >";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ .Height /*int*/ >0);
RDebugUtils.currentLine=14876687;
 //BA.debugLineNum = 14876687;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4a.B4APagesNavBar.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.B4APagesNavBar.bctextengine();
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4a.B4APagesNavBar.bctextengine._bcparagraph();
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=14286860;
 //BA.debugLineNum = 14286860;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=14286862;
 //BA.debugLineNum = 14286862;BA.debugLine="Public DisableResizeEvent As Boolean";
_disableresizeevent = false;
RDebugUtils.currentLine=14286863;
 //BA.debugLineNum = 14286863;BA.debugLine="Public WordWrap As Boolean = True";
_wordwrap = __c.True;
RDebugUtils.currentLine=14286864;
 //BA.debugLineNum = 14286864;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=14286865;
 //BA.debugLineNum = 14286865;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.B4APagesNavBar.bblabel __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="mBase.AddView(ForegroundImageView, 0, 0, mBase.Wi";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="ParseData.ViewsPanel = mBase";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=14417934;
 //BA.debugLineNum = 14417934;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
RDebugUtils.currentLine=14417938;
 //BA.debugLineNum = 14417938;BA.debugLine="End Sub";
return "";
}
public String  _gettext(b4a.B4APagesNavBar.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine  _gettextengine(b4a.B4APagesNavBar.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "gettextengine", true))
	 {return ((b4a.B4APagesNavBar.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.B4APagesNavBar.bblabel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="ForegroundImageView = iv";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="Padding.Initialize(2dip, 2dip, 2dip, 2dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4a.B4APagesNavBar.bblabel __ref,b4a.B4APagesNavBar.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "settextengine", true))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/  = _b;
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="End Sub";
return "";
}
}