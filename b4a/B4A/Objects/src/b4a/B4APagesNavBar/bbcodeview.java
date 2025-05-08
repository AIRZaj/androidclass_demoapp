package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.bbcodeview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.bbcodeview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _internalbbviewurl{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List Lines;
public void Initialize() {
IsInitialized = true;
Lines = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
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
public anywheresoftware.b4a.objects.B4XViewWrapper _backgroundimageview = null;
public b4a.B4APagesNavBar.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _lazyloading = false;
public anywheresoftware.b4a.objects.collections.List _imageviewscache = null;
public b4a.B4APagesNavBar.b4xorderedmap _usedimageviews = null;
public anywheresoftware.b4a.objects.collections.List _externalruns = null;
public boolean _disableautomaticdrawingsinlazymode = false;
public boolean _rtl = false;
public anywheresoftware.b4a.objects.collections.Map _urltolines = null;
public boolean _autounderlineurls = false;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.B4APagesNavBar.bbcodeview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="sv.ScrollViewContentWidth = Width";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_width));
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="If Runs.IsInitialized Then";
if (__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/ ) { 
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
 }else {
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
 };
 };
RDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "parseanddraw", true))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="ParseData.URLs.Clear";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (__ref._rtl /*boolean*/ ) { 
__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._rtlaware /*boolean*/  = __c.True;};
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._tagparser /*b4a.B4APagesNavBar.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="sv.ScrollViewInnerPanel.AddView(TouchPanel, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="sv.ScrollViewInnerPanel.AddView(ForegroundImageVi";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (__ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="Runs = ExternalRuns";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ ;
 }else {
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._tagparser /*b4a.B4APagesNavBar.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ );
 };
RDebugUtils.currentLine=13828114;
 //BA.debugLineNum = 13828114;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=13828115;
 //BA.debugLineNum = 13828115;BA.debugLine="End Sub";
return "";
}
public String  _redraw(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "redraw", true))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createstyle /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Style.Padding = Padding";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Style.ResizeHeightAutomatically = True";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  = __c.True;
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Style.RTL = RTL";
__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="URLToLines.Clear";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Ke";
__ref._cleanexistingimageviews /*String*/ (null,__c.False,__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null),(int) (0),(int) (0));
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="UsedImageViews.Clear";
__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Ru";
__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._prepareforlazydrawing /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="ForegroundImageView.SetLayoutAnimated(0, Style.P";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (__ref._autounderlineurls /*boolean*/  && __ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="CollectURLs";
__ref._collecturls /*String*/ (null);
 };
RDebugUtils.currentLine=13893647;
 //BA.debugLineNum = 13893647;BA.debugLine="DrawVisibleRegion";
__ref._drawvisibleregion /*String*/ (null);
 }else {
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, Fo";
__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._drawtext /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ ,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 };
RDebugUtils.currentLine=13893651;
 //BA.debugLineNum = 13893651;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=13893652;
 //BA.debugLineNum = 13893652;BA.debugLine="TouchPanel.SetLayoutAnimated(0, ForegroundImageV";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=13893654;
 //BA.debugLineNum = 13893654;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4a.B4APagesNavBar.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.B4APagesNavBar.bctextengine();
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="Public BackgroundImageView As B4XView";
_backgroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12779532;
 //BA.debugLineNum = 12779532;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4a.B4APagesNavBar.bctextengine._bcparagraph();
RDebugUtils.currentLine=12779533;
 //BA.debugLineNum = 12779533;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12779534;
 //BA.debugLineNum = 12779534;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12779535;
 //BA.debugLineNum = 12779535;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=12779536;
 //BA.debugLineNum = 12779536;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=12779537;
 //BA.debugLineNum = 12779537;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=12779538;
 //BA.debugLineNum = 12779538;BA.debugLine="Public LazyLoading As Boolean";
_lazyloading = false;
RDebugUtils.currentLine=12779539;
 //BA.debugLineNum = 12779539;BA.debugLine="Private ImageViewsCache As List";
_imageviewscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12779540;
 //BA.debugLineNum = 12779540;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new b4a.B4APagesNavBar.b4xorderedmap();
RDebugUtils.currentLine=12779541;
 //BA.debugLineNum = 12779541;BA.debugLine="Public ExternalRuns As List";
_externalruns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12779542;
 //BA.debugLineNum = 12779542;BA.debugLine="Public DisableAutomaticDrawingsInLazyMode As Bool";
_disableautomaticdrawingsinlazymode = false;
RDebugUtils.currentLine=12779543;
 //BA.debugLineNum = 12779543;BA.debugLine="Type InternalBBViewURL (Lines As List)";
;
RDebugUtils.currentLine=12779544;
 //BA.debugLineNum = 12779544;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=12779545;
 //BA.debugLineNum = 12779545;BA.debugLine="Private URLToLines As Map";
_urltolines = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12779546;
 //BA.debugLineNum = 12779546;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_autounderlineurls = false;
RDebugUtils.currentLine=12779547;
 //BA.debugLineNum = 12779547;BA.debugLine="End Sub";
return "";
}
public String  _cleanexistingimageviews(b4a.B4APagesNavBar.bbcodeview __ref,boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "cleanexistingimageviews", true))
	 {return ((String) Debug.delegate(ba, "cleanexistingimageviews", new Object[] {_invisibleonly,_existing,_offset,_height}));}
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || __ref._lineisvisible /*boolean*/ (null,_line,_offset,_height)==__c.False) { 
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line))));
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="ImageViewsCache.Add(xiv)";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_xiv.getObject()));
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_line));};
 };
 }
};
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="End Sub";
return "";
}
public boolean  _lineisvisible(b4a.B4APagesNavBar.bbcodeview __ref,b4a.B4APagesNavBar.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "lineisvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "lineisvisible", new Object[] {_line,_offset,_height}));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="End Sub";
return false;
}
public String  _collecturls(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "collecturls", true))
	 {return ((String) Debug.delegate(ba, "collecturls", null));}
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _st = null;
b4a.B4APagesNavBar.bbcodeview._internalbbviewurl _extra = null;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Private Sub CollectURLs";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(group3.Get(index3));
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ ))) { 
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new b4a.B4APagesNavBar.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ ))==__c.False) { 
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="extra = CreateBCURLExtraData";
_extra = __ref._createbcurlextradata /*b4a.B4APagesNavBar.bbcodeview._internalbbviewurl*/ (null);
RDebugUtils.currentLine=14155784;
 //BA.debugLineNum = 14155784;BA.debugLine="URLToLines.Put(st.Run, extra)";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_st.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (b4a.B4APagesNavBar.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_st.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ )));
 };
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
RDebugUtils.currentLine=14155789;
 //BA.debugLineNum = 14155789;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=14155795;
 //BA.debugLineNum = 14155795;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bbcodeview._internalbbviewurl  _createbcurlextradata(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "createbcurlextradata", true))
	 {return ((b4a.B4APagesNavBar.bbcodeview._internalbbviewurl) Debug.delegate(ba, "createbcurlextradata", null));}
b4a.B4APagesNavBar.bbcodeview._internalbbviewurl _t1 = null;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new b4a.B4APagesNavBar.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4a.B4APagesNavBar.bbcodeview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ScrollViewWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="Dim sp As ScrollView";
_sp = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="sp.Initialize2(50dip, \"sv\")";
_sp.Initialize2(ba,__c.DipToCurrent((int) (50)),"sv");
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="LazyLoading = Props.GetDefault(\"LazyLoading\", Tru";
__ref._lazyloading /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.True)));
RDebugUtils.currentLine=13041681;
 //BA.debugLineNum = 13041681;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
__ref._autounderlineurls /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
RDebugUtils.currentLine=13041682;
 //BA.debugLineNum = 13041682;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=13041683;
 //BA.debugLineNum = 13041683;BA.debugLine="ImageViewsCache.Initialize";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=13041684;
 //BA.debugLineNum = 13041684;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/  = _b4xcollections._createorderedmap /*b4a.B4APagesNavBar.b4xorderedmap*/ (ba);
 };
RDebugUtils.currentLine=13041686;
 //BA.debugLineNum = 13041686;BA.debugLine="sv = sp";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
RDebugUtils.currentLine=13041687;
 //BA.debugLineNum = 13041687;BA.debugLine="sv.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=13041688;
 //BA.debugLineNum = 13041688;BA.debugLine="sv.ScrollViewInnerPanel.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=13041689;
 //BA.debugLineNum = 13041689;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=13041690;
 //BA.debugLineNum = 13041690;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=13041691;
 //BA.debugLineNum = 13041691;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=13041692;
 //BA.debugLineNum = 13041692;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=13041693;
 //BA.debugLineNum = 13041693;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=13041694;
 //BA.debugLineNum = 13041694;BA.debugLine="ParseData.ViewsPanel = sv.ScrollViewInnerPanel";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel();
RDebugUtils.currentLine=13041695;
 //BA.debugLineNum = 13041695;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_linkclicked",(int) (1))) { 
RDebugUtils.currentLine=13041696;
 //BA.debugLineNum = 13041696;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
 };
RDebugUtils.currentLine=13041703;
 //BA.debugLineNum = 13041703;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
RDebugUtils.currentLine=13041707;
 //BA.debugLineNum = 13041707;BA.debugLine="End Sub";
return "";
}
public String  _drawvisibleregion(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "drawvisibleregion", true))
	 {return ((String) Debug.delegate(ba, "drawvisibleregion", null));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub DrawVisibleRegion";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="UpdateVisibleRegion(sv.ScrollViewOffsetY * mTextE";
__ref._updatevisibleregion /*String*/ (null,(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY()*__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._mscale /*float*/ ),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._mscale /*float*/ ));
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="End Sub";
return "";
}
public String  _updatevisibleregion(b4a.B4APagesNavBar.bbcodeview __ref,int _offsety,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "updatevisibleregion", true))
	 {return ((String) Debug.delegate(ba, "updatevisibleregion", new Object[] {_offsety,_height}));}
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub UpdateVisibleRegion (OffsetY As Int, He";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Existing.Initialize";
_existing.Initialize();
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null));
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
__ref._cleanexistingimageviews /*String*/ (null,__c.True,_existing,_offsety,_height);
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group6.Get(index6));
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (__ref._lineisvisible /*boolean*/ (null,_line,_offsety,_height)) { 
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="foundFirst = True";
_foundfirst = __c.True;
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=13500426;
 //BA.debugLineNum = 13500426;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13500429;
 //BA.debugLineNum = 13500429;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=13500430;
 //BA.debugLineNum = 13500430;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=13500432;
 //BA.debugLineNum = 13500432;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
RDebugUtils.currentLine=13500434;
 //BA.debugLineNum = 13500434;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=13500435;
 //BA.debugLineNum = 13500435;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=13500437;
 //BA.debugLineNum = 13500437;BA.debugLine="sv.ScrollViewInnerPanel.AddView(xiv, 0, 0, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_xiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=13500438;
 //BA.debugLineNum = 13500438;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
RDebugUtils.currentLine=13500439;
 //BA.debugLineNum = 13500439;BA.debugLine="mTextEngine.DrawSingleLine(Line, xiv, Paragraph";
__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._drawsingleline /*String*/ (null,_line,_xiv,__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ );
RDebugUtils.currentLine=13500440;
 //BA.debugLineNum = 13500440;BA.debugLine="UsedImageViews.Put(Line, xiv)";
__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_line),(Object)(_xiv.getObject()));
 }else {
RDebugUtils.currentLine=13500442;
 //BA.debugLineNum = 13500442;BA.debugLine="If foundFirst Then Exit";
if (_foundfirst) { 
if (true) break;};
 };
 }
};
RDebugUtils.currentLine=13500445;
 //BA.debugLineNum = 13500445;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bctextrun  _findtouchedrun(b4a.B4APagesNavBar.bbcodeview __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "findtouchedrun", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextrun) Debug.delegate(ba, "findtouchedrun", new Object[] {_x,_y}));}
int _offsetx = 0;
int _offsety = 0;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._findsinglestylesection /*b4a.B4APagesNavBar.bctextengine._bcsinglestylesection*/ (null,__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ ,(int) (_x+_offsetx),(int) (_y+_offsety));
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="Return single.Run";
if (true) return _single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
RDebugUtils.currentLine=14024713;
 //BA.debugLineNum = 14024713;BA.debugLine="Return Null";
if (true) return (b4a.B4APagesNavBar.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=14024714;
 //BA.debugLineNum = 14024714;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bctextline  _getanchorline(b4a.B4APagesNavBar.bbcodeview __ref,String _anchor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "getanchorline", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextline) Debug.delegate(ba, "getanchorline", new Object[] {_anchor}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub GetAnchorLine (Anchor As String) As BC";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="If Paragraph.Anchors.IsInitialized = False Then R";
if (__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ .Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (b4a.B4APagesNavBar.bctextengine._bctextline)(__c.Null);};
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Return Paragraph.Anchors.Get(Anchor)";
if (true) return (b4a.B4APagesNavBar.bctextengine._bctextline)(__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ .Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_anchor)));
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="End Sub";
return null;
}
public String  _gettext(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine  _gettextengine(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettextengine", true))
	 {return ((b4a.B4APagesNavBar.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ;
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getviews(b4a.B4APagesNavBar.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "getviews", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getviews", null));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub getViews As Map";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Return ParseData.Views";
if (true) return __ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.B4APagesNavBar.bbcodeview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="ForegroundImageView = iv";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="ParseData.Views.Initialize";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="ParseData.URLs.Initialize";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="Padding.Initialize(5dip, 5dip, 20dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (20))),(float) (__c.DipToCurrent((int) (5))));
 }else {
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
 };
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="ParseData.ImageCache.Initialize";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="URLToLines.Initialize";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12845072;
 //BA.debugLineNum = 12845072;BA.debugLine="End Sub";
return "";
}
public String  _markurl(b4a.B4APagesNavBar.bbcodeview __ref,b4a.B4APagesNavBar.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "markurl", true))
	 {return ((String) Debug.delegate(ba, "markurl", new Object[] {_run}));}
b4a.B4APagesNavBar.bctextengine._bctextrun _r = null;
b4a.B4APagesNavBar.bbcodeview._internalbbviewurl _extra = null;
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
RDebugUtils.currentLine=14090250;
 //BA.debugLineNum = 14090250;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_r = (b4a.B4APagesNavBar.bctextengine._bctextrun)(group1.Get(index1));
RDebugUtils.currentLine=14090251;
 //BA.debugLineNum = 14090251;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
RDebugUtils.currentLine=14090253;
 //BA.debugLineNum = 14090253;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (b4a.B4APagesNavBar.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_r)));
RDebugUtils.currentLine=14090254;
 //BA.debugLineNum = 14090254;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group5 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group5.Get(index5));
RDebugUtils.currentLine=14090255;
 //BA.debugLineNum = 14090255;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=14090256;
 //BA.debugLineNum = 14090256;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._drawsingleline /*String*/ (null,_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4a.B4APagesNavBar.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line)))),__ref._paragraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ );
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=14090261;
 //BA.debugLineNum = 14090261;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoanchor(b4a.B4APagesNavBar.bbcodeview __ref,String _anchor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "scrolltoanchor", true))
	 {return ((String) Debug.delegate(ba, "scrolltoanchor", new Object[] {_anchor}));}
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
int _top = 0;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub ScrollToAnchor(Anchor As String)";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim line As BCTextLine = GetAnchorLine(Anchor)";
_line = __ref._getanchorline /*b4a.B4APagesNavBar.bctextengine._bctextline*/ (null,_anchor);
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="If line <> Null Then";
if (_line!= null) { 
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Dim top As Int = line.BaselineY - line.MaxHeight";
_top = (int) (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=13565964;
 //BA.debugLineNum = 13565964;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_nsv = (anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=13565965;
 //BA.debugLineNum = 13565965;BA.debugLine="nsv.ScrollPosition = top";
_nsv.setScrollPosition(_top);
 };
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.B4APagesNavBar.bbcodeview __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4a.B4APagesNavBar.bbcodeview __ref,b4a.B4APagesNavBar.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settextengine", true))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/  = _b;
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="End Sub";
return "";
}
public String  _setviews(b4a.B4APagesNavBar.bbcodeview __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "setviews", true))
	 {return ((String) Debug.delegate(ba, "setviews", new Object[] {_m}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub setViews (m As Map)";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="ParseData.Views = m";
__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(b4a.B4APagesNavBar.bbcodeview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="If LazyLoading Then DrawVisibleRegion";
if (__ref._lazyloading /*boolean*/ ) { 
__ref._drawvisibleregion /*String*/ (null);};
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4a.B4APagesNavBar.bbcodeview __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "touchpanel_touch", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
b4a.B4APagesNavBar.bctextengine._bctextrun _run = null;
String _url = "";
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Dim run As BCTextRun = Null";
_run = (b4a.B4APagesNavBar.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0 || _action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = __ref._findtouchedrun /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ (null,_x,_y);
 };
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && __ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
RDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(__ref._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
RDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LinkClicked",(Object)(_url));
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4a.B4APagesNavBar.bctextengine._bctextrun)(__c.Null));
 }else 
{RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="Else If (xui.IsB4i And Action = 4) Or (xui.IsB4A";
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && _action==4) || (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && _action==3)) { 
RDebugUtils.currentLine=13959179;
 //BA.debugLineNum = 13959179;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4a.B4APagesNavBar.bctextengine._bctextrun)(__c.Null));
 }else {
RDebugUtils.currentLine=13959182;
 //BA.debugLineNum = 13959182;BA.debugLine="MarkURL(run)";
__ref._markurl /*String*/ (null,_run);
 }}
;
RDebugUtils.currentLine=13959184;
 //BA.debugLineNum = 13959184;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13959186;
 //BA.debugLineNum = 13959186;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4a.B4APagesNavBar.bctextengine._bctextrun)(__c.Null));
RDebugUtils.currentLine=13959187;
 //BA.debugLineNum = 13959187;BA.debugLine="End Sub";
return "";
}
}