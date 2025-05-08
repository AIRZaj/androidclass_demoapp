package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.bbcodeparser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.bbcodeparser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bbcodetextnode{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.List Tags;
public void Initialize() {
IsInitialized = true;
Text = "";
Tags = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bbcodetagnode{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public boolean CanHaveNestedTags;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
CanHaveNestedTags = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bbcodeparsedata{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.Map URLs;
public int Width;
public anywheresoftware.b4a.objects.B4XViewWrapper ViewsPanel;
public anywheresoftware.b4a.objects.collections.Map Views;
public boolean NeedToReparseWhenResize;
public anywheresoftware.b4a.objects.collections.Map ImageCache;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont DefaultBoldFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont DefaultFont;
public int DefaultColor;
public int UrlColor;
public void Initialize() {
IsInitialized = true;
Text = "";
URLs = new anywheresoftware.b4a.objects.collections.Map();
Width = 0;
ViewsPanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
Views = new anywheresoftware.b4a.objects.collections.Map();
NeedToReparseWhenResize = false;
ImageCache = new anywheresoftware.b4a.objects.collections.Map();
DefaultBoldFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
DefaultFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
DefaultColor = 0;
UrlColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.B4APagesNavBar.b4xset _allowedtags = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public int _start = 0;
public b4a.B4APagesNavBar.bctextengine _mtextengine = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _urlcolor = 0;
public anywheresoftware.b4a.objects.collections.Map _colorsmap = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstring = null;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.B4APagesNavBar.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Type BBCodeTextNode (Text As String, Tags As List";
;
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Type BBCodeTagNode (Tag As String, Extra As Map,";
;
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Type BBCodeParseData (Text As String, URLs As Map";
;
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Private AllowedTags As B4XSet";
_allowedtags = new b4a.B4APagesNavBar.b4xset();
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="Private Stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Private Start As Int";
_start = 0;
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.B4APagesNavBar.bctextengine();
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="Public UrlColor As Int = 0xFF003FFF";
_urlcolor = ((int)0xff003fff);
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="Public ColorsMap As Map";
_colorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="Public ErrorString As StringBuilder";
_errorstring = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createruns(b4a.B4APagesNavBar.bbcodeparser __ref,anywheresoftware.b4a.objects.collections.List _texts,b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createruns", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createruns", new Object[] {_texts,_data}));}
anywheresoftware.b4a.objects.collections.List _runs = null;
b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode _textnode = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub CreateRuns (Texts As List, Data As BBCo";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Dim Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Runs.Initialize";
_runs.Initialize();
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="For Each TextNode As BBCodeTextNode In Texts";
{
final anywheresoftware.b4a.BA.IterableList group3 = _texts;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_textnode = (b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode)(group3.Get(index3));
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="TextToRun(TextNode, Runs, Data)";
__ref._texttorun /*String*/ (null,_textnode,_runs,_data);
 }
};
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Return Runs";
if (true) return _runs;
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="End Sub";
return null;
}
public String  _texttorun(b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode _text,anywheresoftware.b4a.objects.collections.List _runslist,b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "texttorun", true))
	 {return ((String) Debug.delegate(ba, "texttorun", new Object[] {_text,_runslist,_data}));}
anywheresoftware.b4a.objects.collections.List _list = null;
b4a.B4APagesNavBar.bctextengine._bctextrun _run = null;
boolean _customfont = false;
int _fontsize = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _currentfont = null;
boolean _islistelement = false;
int _i = 0;
b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag = null;
b4a.B4APagesNavBar.bctextengine._bcstyledunderline _uu = null;
String _url = "";
String _clr = "";
String _name = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _newfont = null;
b4a.B4APagesNavBar.bctextengine._bctextrun _parent = null;
b4a.B4APagesNavBar.bctextengine._bcconnectedruns _cr = null;
String _dir = "";
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub TextToRun (Text As BBCodeTextNode, Run";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Dim list As List = RunsList";
_list = new anywheresoftware.b4a.objects.collections.List();
_list = _runslist;
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Dim Run As BCTextRun = mTextEngine.CreateRun(Text";
_run = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createrun /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ (null,_text.Text /*String*/ );
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Run.TextColor = Data.DefaultColor";
_run.TextColor /*int*/  = _data.DefaultColor /*int*/ ;
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="Run.TextFont = Data.DefaultFont";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Dim customfont As Boolean";
_customfont = false;
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="Dim FontSize As Int = Data.DefaultFont.Size";
_fontsize = (int) (_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize());
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="Dim CurrentFont As B4XFont = Data.DefaultFont";
_currentfont = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="Dim IsListElement As Boolean";
_islistelement = false;
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="For i = 0 To Text.Tags.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"u","b","url","color","img","view","vertical","textsize","font","alignment","span","indent","list","*","e","direction","fontawesome","materialicons","a")) {
case 0: {
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="Run.Underline = True";
_run.Underline /*boolean*/  = __c.True;
RDebugUtils.currentLine=12255246;
 //BA.debugLineNum = 12255246;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=12255247;
 //BA.debugLineNum = 12255247;BA.debugLine="Dim uu As BCStyledUnderline";
_uu = new b4a.B4APagesNavBar.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="uu.Initialize";
_uu.Initialize();
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="uu.Style = tag.Extra.GetDefault(\"style\", mTex";
_uu.Style /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)(__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._defaultunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ .Style /*String*/ )));
RDebugUtils.currentLine=12255250;
 //BA.debugLineNum = 12255250;BA.debugLine="uu.Style = uu.Style.ToLowerCase";
_uu.Style /*String*/  = _uu.Style /*String*/ .toLowerCase();
RDebugUtils.currentLine=12255251;
 //BA.debugLineNum = 12255251;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then uu.Clr";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_uu.Clr /*int*/  = __ref._parsecolorstring /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color"))));}
else {
_uu.Clr /*int*/  = (int) (0);};
RDebugUtils.currentLine=12255252;
 //BA.debugLineNum = 12255252;BA.debugLine="uu.Thickness = DipToCurrent(tag.Extra.GetDefa";
_uu.Thickness /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("thickness"),(Object)(1))))));
RDebugUtils.currentLine=12255253;
 //BA.debugLineNum = 12255253;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.E";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=12255254;
 //BA.debugLineNum = 12255254;BA.debugLine="Run.Extra.Put(mTextEngine.EXTRA_STYLEDUNDERLI";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._extra_styledunderline /*String*/ ),(Object)(_uu));
 };
 break; }
case 1: {
RDebugUtils.currentLine=12255257;
 //BA.debugLineNum = 12255257;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=12255258;
 //BA.debugLineNum = 12255258;BA.debugLine="CurrentFont = Data.DefaultBoldFont";
_currentfont = _data.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=12255260;
 //BA.debugLineNum = 12255260;BA.debugLine="Dim url As String";
_url = "";
RDebugUtils.currentLine=12255261;
 //BA.debugLineNum = 12255261;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=12255262;
 //BA.debugLineNum = 12255262;BA.debugLine="url = tag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
 }else {
RDebugUtils.currentLine=12255264;
 //BA.debugLineNum = 12255264;BA.debugLine="url = Text.Text";
_url = _text.Text /*String*/ ;
RDebugUtils.currentLine=12255265;
 //BA.debugLineNum = 12255265;BA.debugLine="Run.TextDirection = mTextEngine.TextDirection";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._textdirectionltr /*int*/ ;
 };
RDebugUtils.currentLine=12255267;
 //BA.debugLineNum = 12255267;BA.debugLine="If Data.URLs.IsInitialized Then Data.URLs.Put(";
if (_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_run),(Object)(_url));};
RDebugUtils.currentLine=12255268;
 //BA.debugLineNum = 12255268;BA.debugLine="Run.AutoUnderline = True";
_run.AutoUnderline /*boolean*/  = __c.True;
RDebugUtils.currentLine=12255269;
 //BA.debugLineNum = 12255269;BA.debugLine="Run.TextColor = Bit.Or(0xff000000, UrlColor)";
_run.TextColor /*int*/  = __c.Bit.Or(((int)0xff000000),__ref._urlcolor /*int*/ );
 break; }
case 3: {
RDebugUtils.currentLine=12255271;
 //BA.debugLineNum = 12255271;BA.debugLine="Dim clr As String = tag.Extra.Get(\"color\")";
_clr = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")));
RDebugUtils.currentLine=12255272;
 //BA.debugLineNum = 12255272;BA.debugLine="Run.TextColor = ParseColorString(clr)";
_run.TextColor /*int*/  = __ref._parsecolorstring /*int*/ (null,_clr);
 break; }
case 4: {
RDebugUtils.currentLine=12255274;
 //BA.debugLineNum = 12255274;BA.debugLine="SetImageView(tag, Run, Data)";
__ref._setimageview /*void*/ (null,_tag,_run,_data);
RDebugUtils.currentLine=12255275;
 //BA.debugLineNum = 12255275;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
RDebugUtils.currentLine=12255276;
 //BA.debugLineNum = 12255276;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 };
RDebugUtils.currentLine=12255278;
 //BA.debugLineNum = 12255278;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 5: {
RDebugUtils.currentLine=12255280;
 //BA.debugLineNum = 12255280;BA.debugLine="Run.View = GetView(tag, Data)";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._getview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_tag,_data);
RDebugUtils.currentLine=12255281;
 //BA.debugLineNum = 12255281;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=12255282;
 //BA.debugLineNum = 12255282;BA.debugLine="If tag.Extra.ContainsKey(\"width\") Then Run.Vie";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data));};
RDebugUtils.currentLine=12255283;
 //BA.debugLineNum = 12255283;BA.debugLine="If tag.Extra.ContainsKey(\"height\") Then Run.Vi";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data));};
RDebugUtils.currentLine=12255284;
 //BA.debugLineNum = 12255284;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 6: {
RDebugUtils.currentLine=12255286;
 //BA.debugLineNum = 12255286;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 break; }
case 7: {
RDebugUtils.currentLine=12255288;
 //BA.debugLineNum = 12255288;BA.debugLine="FontSize = tag.Extra.Get(\"textsize\")";
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
 break; }
case 8: {
RDebugUtils.currentLine=12255290;
 //BA.debugLineNum = 12255290;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=12255291;
 //BA.debugLineNum = 12255291;BA.debugLine="Dim name As String = tag.Extra.Get(tag.Tag)";
_name = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )));
RDebugUtils.currentLine=12255292;
 //BA.debugLineNum = 12255292;BA.debugLine="If mTextEngine.CustomFonts.ContainsKey(name) =";
if (__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_name))==__c.False) { 
RDebugUtils.currentLine=12255293;
 //BA.debugLineNum = 12255293;BA.debugLine="Log(\"Font missing from TextEngine.CustomFonts";
__c.LogImpl("912255293","Font missing from TextEngine.CustomFonts: "+_name,0);
 }else {
RDebugUtils.currentLine=12255295;
 //BA.debugLineNum = 12255295;BA.debugLine="Dim NewFont As B4XFont =  mTextEngine.CustomF";
_newfont = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont)(__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name)));
RDebugUtils.currentLine=12255296;
 //BA.debugLineNum = 12255296;BA.debugLine="CurrentFont = NewFont";
_currentfont = _newfont;
RDebugUtils.currentLine=12255297;
 //BA.debugLineNum = 12255297;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSiz";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 };
 break; }
case 9: {
RDebugUtils.currentLine=12255300;
 //BA.debugLineNum = 12255300;BA.debugLine="Run.HorizontalAlignment = tag.Extra.Get(\"align";
_run.HorizontalAlignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment")));
 break; }
case 10: {
RDebugUtils.currentLine=12255302;
 //BA.debugLineNum = 12255302;BA.debugLine="If tag.Extra.ContainsKey(\"run\") = False Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("run"))==__c.False) { 
RDebugUtils.currentLine=12255303;
 //BA.debugLineNum = 12255303;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateC";
_parent = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createconnectedparent /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=12255304;
 //BA.debugLineNum = 12255304;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(";
_cr = (b4a.B4APagesNavBar.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=12255305;
 //BA.debugLineNum = 12255305;BA.debugLine="cr.ConnectedWidth = GetDimensionFromTag(tag,";
_cr.ConnectedWidth /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"minwidth",_data);
RDebugUtils.currentLine=12255306;
 //BA.debugLineNum = 12255306;BA.debugLine="cr.Alignment = tag.Extra.GetDefault(\"alignmen";
_cr.Alignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("alignment"),(Object)("left")));
RDebugUtils.currentLine=12255307;
 //BA.debugLineNum = 12255307;BA.debugLine="RunsList.Add(parent)";
_runslist.Add((Object)(_parent));
RDebugUtils.currentLine=12255308;
 //BA.debugLineNum = 12255308;BA.debugLine="tag.Extra.Put(\"run\", parent)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("run"),(Object)(_parent));
 };
RDebugUtils.currentLine=12255310;
 //BA.debugLineNum = 12255310;BA.debugLine="Dim parent As BCTextRun = tag.Extra.Get(\"run\")";
_parent = (b4a.B4APagesNavBar.bctextengine._bctextrun)(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("run")));
RDebugUtils.currentLine=12255311;
 //BA.debugLineNum = 12255311;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.B4APagesNavBar.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=12255312;
 //BA.debugLineNum = 12255312;BA.debugLine="list = cr.Runs";
_list = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
 break; }
case 11: {
RDebugUtils.currentLine=12255314;
 //BA.debugLineNum = 12255314;BA.debugLine="Run.IndentLevel = tag.Extra.Get(\"indent\")";
_run.IndentLevel /*int*/  = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("indent"))));
 break; }
case 12: {
RDebugUtils.currentLine=12255316;
 //BA.debugLineNum = 12255316;BA.debugLine="Run.IndentLevel = Run.IndentLevel + 1";
_run.IndentLevel /*int*/  = (int) (_run.IndentLevel /*int*/ +1);
 break; }
case 13: {
RDebugUtils.currentLine=12255318;
 //BA.debugLineNum = 12255318;BA.debugLine="IsListElement = True";
_islistelement = __c.True;
 break; }
case 14: {
RDebugUtils.currentLine=12255320;
 //BA.debugLineNum = 12255320;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextChars(";
_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createbctextchars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,new String[]{BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))},(int) (0),(int) (1));
RDebugUtils.currentLine=12255321;
 //BA.debugLineNum = 12255321;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
 break; }
case 15: {
RDebugUtils.currentLine=12255323;
 //BA.debugLineNum = 12255323;BA.debugLine="Dim dir As String = tag.Extra.Get(\"direction\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("direction")));
RDebugUtils.currentLine=12255324;
 //BA.debugLineNum = 12255324;BA.debugLine="Select dir.ToLowerCase";
switch (BA.switchObjectToInt(_dir.toLowerCase(),"ltr","rtl","unknown")) {
case 0: {
RDebugUtils.currentLine=12255326;
 //BA.debugLineNum = 12255326;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._textdirectionltr /*int*/ ;
 break; }
case 1: {
RDebugUtils.currentLine=12255328;
 //BA.debugLineNum = 12255328;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._textdirectionrtl /*int*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=12255330;
 //BA.debugLineNum = 12255330;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._textdirectionunknown /*int*/ ;
 break; }
}
;
 break; }
case 16: 
case 17: {
RDebugUtils.currentLine=12255333;
 //BA.debugLineNum = 12255333;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=12255334;
 //BA.debugLineNum = 12255334;BA.debugLine="If tag.Tag = \"fontawesome\" Then";
if ((_tag.Tag /*String*/ ).equals("fontawesome")) { 
RDebugUtils.currentLine=12255335;
 //BA.debugLineNum = 12255335;BA.debugLine="CurrentFont = xui.CreateFontAwesome(FontSize)";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome((float) (_fontsize));
 }else {
RDebugUtils.currentLine=12255337;
 //BA.debugLineNum = 12255337;BA.debugLine="CurrentFont = xui.CreateMaterialIcons(FontSiz";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (_fontsize));
 };
RDebugUtils.currentLine=12255339;
 //BA.debugLineNum = 12255339;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createbctextcharsfromstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr(__ref._parsecodepoint /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))))));
RDebugUtils.currentLine=12255340;
 //BA.debugLineNum = 12255340;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=12255341;
 //BA.debugLineNum = 12255341;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSize";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 break; }
case 18: {
RDebugUtils.currentLine=12255343;
 //BA.debugLineNum = 12255343;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.Ex";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=12255344;
 //BA.debugLineNum = 12255344;BA.debugLine="Run.Extra.Put(\"a\", tag.Extra.Get(\"a\"))";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("a"),_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("a")));
 break; }
}
;
 }
};
RDebugUtils.currentLine=12255347;
 //BA.debugLineNum = 12255347;BA.debugLine="If IsListElement Then";
if (_islistelement) { 
RDebugUtils.currentLine=12255348;
 //BA.debugLineNum = 12255348;BA.debugLine="Run = HandleListElement(Text, Run)";
_run = __ref._handlelistelement /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ (null,_text,_run);
 };
RDebugUtils.currentLine=12255350;
 //BA.debugLineNum = 12255350;BA.debugLine="If customfont Or FontSize <> Data.DefaultFont.Siz";
if (_customfont || _fontsize!=_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize()) { 
RDebugUtils.currentLine=12255363;
 //BA.debugLineNum = 12255363;BA.debugLine="Run.TextFont = xui.CreateFont2(CurrentFont, Font";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(_currentfont,(float) (_fontsize));
 };
RDebugUtils.currentLine=12255366;
 //BA.debugLineNum = 12255366;BA.debugLine="list.Add(Run)";
_list.Add((Object)(_run));
RDebugUtils.currentLine=12255367;
 //BA.debugLineNum = 12255367;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode  _createtagnode(b4a.B4APagesNavBar.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtagnode", true))
	 {return ((b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "createtagnode", new Object[] {_tag}));}
b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Private Sub CreateTagNode (Tag As String) As BBCod";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Dim n As BBCodeTagNode";
_n = new b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode  _createtextnode(b4a.B4APagesNavBar.bbcodeparser __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtextnode", true))
	 {return ((b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode) Debug.delegate(ba, "createtextnode", new Object[] {_text}));}
b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode _n = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Private Sub CreateTextNode(Text As String) As BBCo";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Dim n As BBCodeTextNode";
_n = new b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode();
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="End Sub";
return null;
}
public String  _error(b4a.B4APagesNavBar.bbcodeparser __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "error", true))
	 {return ((String) Debug.delegate(ba, "error", new Object[] {_msg}));}
String _s = "";
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub Error (msg As String)";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(__ref._start /*int*/ ))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="LogColor(s, Colors.Red)";
__c.LogImpl("911993091",_s,__c.Colors.Red);
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_s).Append(__c.CRLF);
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="End Sub";
return "";
}
public int  _getdimensionfromtag(b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag,String _key,b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getdimensionfromtag", true))
	 {return ((Integer) Debug.delegate(ba, "getdimensionfromtag", new Object[] {_tag,_key,_data}));}
String _s = "";
int _i = 0;
float _v = 0f;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub GetDimensionFromTag (Tag As BBCodeTagN";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Dim s As String = Tag.Extra.GetDefault(Key, \"\")";
_s = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="If s = \"\" Then Return -1";
if ((_s).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Dim i As Int = s.IndexOf(\"%\")";
_i = _s.indexOf("%");
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="Dim v As Float = s.SubString2(0, i) / 100";
_v = (float) ((double)(Double.parseDouble(_s.substring((int) (0),_i)))/(double)100);
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="If s.EndsWith(\"%x\") Then";
if (_s.endsWith("%x")) { 
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="Data.NeedToReparseWhenResize = True";
_data.NeedToReparseWhenResize /*boolean*/  = __c.True;
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="Return v * Data.Width";
if (true) return (int) (_v*_data.Width /*int*/ );
 };
 };
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="Return DipToCurrent(s)";
if (true) return __c.DipToCurrent((int)(Double.parseDouble(_s)));
RDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getview(b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag,b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getview", new Object[] {_tag,_data}));}
String _id = "";
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub GetView (Tag As BBCodeTagNode, Data As";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Dim id As String = Tag.Extra.Get(\"view\")";
_id = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("view")));
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="If Data.Views.ContainsKey(id) = False Then";
if (_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_id))==__c.False) { 
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Error(\"Missing view: \" & id)";
__ref._error /*String*/ (null,"Missing view: "+_id);
 };
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="Dim v As B4XView = Data.Views.Get(id)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_id))));
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="Return v";
if (true) return _v;
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bctextrun  _handlelistelement(b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode _text,b4a.B4APagesNavBar.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextrun) Debug.delegate(ba, "handlelistelement", new Object[] {_text,_run}));}
int _i = 0;
b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag = null;
String _liststyle = "";
int _count = 0;
b4a.B4APagesNavBar.bctextengine._bctextrun _parent = null;
b4a.B4APagesNavBar.bctextengine._bcconnectedruns _cr = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Private Sub HandleListElement (Text As BBCodeTextN";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="For i = Text.Tags.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="If tag.Tag = \"list\" Then";
if ((_tag.Tag /*String*/ ).equals("list")) { 
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="Dim liststyle As String";
_liststyle = "";
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="If tag.extra.IsInitialized Then liststyle = tag";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_liststyle = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)("unordered")));};
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="If liststyle = \"\" Or liststyle.ToLowerCase = \"u";
if ((_liststyle).equals("") || (_liststyle.toLowerCase()).equals("unordered")) { 
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="Run.TextChars =  mTextEngine.CreateBCTextChars";
_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createbctextcharsfromstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr(((int)0x2022)))+" ");
 }else {
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="Dim count As Int = tag.Extra.GetDefault(\"count";
_count = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("count"),(Object)(1))));
RDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateCo";
_parent = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createconnectedparent /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=12451851;
 //BA.debugLineNum = 12451851;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._createbctextcharsfromstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,BA.NumberToString((_count))+". ");
RDebugUtils.currentLine=12451852;
 //BA.debugLineNum = 12451852;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.B4APagesNavBar.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=12451853;
 //BA.debugLineNum = 12451853;BA.debugLine="cr.Runs.Add(Run)";
_cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_run));
RDebugUtils.currentLine=12451854;
 //BA.debugLineNum = 12451854;BA.debugLine="cr.Alignment = \"right\"";
_cr.Alignment /*String*/  = "right";
RDebugUtils.currentLine=12451855;
 //BA.debugLineNum = 12451855;BA.debugLine="cr.ConnectedWidth = mTextEngine.GetFontMetrics";
_cr.ConnectedWidth /*int*/  = (int) (__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._getfontmetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ ).xWidth /*int*/ *3/(double)__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/ ._mscale /*float*/ );
RDebugUtils.currentLine=12451856;
 //BA.debugLineNum = 12451856;BA.debugLine="parent.IndentLevel = Run.IndentLevel";
_parent.IndentLevel /*int*/  = _run.IndentLevel /*int*/ ;
RDebugUtils.currentLine=12451857;
 //BA.debugLineNum = 12451857;BA.debugLine="Run = parent";
_run = _parent;
RDebugUtils.currentLine=12451858;
 //BA.debugLineNum = 12451858;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=12451859;
 //BA.debugLineNum = 12451859;BA.debugLine="tag.Extra.Put(\"count\", count)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("count"),(Object)(_count));
 };
RDebugUtils.currentLine=12451861;
 //BA.debugLineNum = 12451861;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=12451864;
 //BA.debugLineNum = 12451864;BA.debugLine="Return Run";
if (true) return _run;
RDebugUtils.currentLine=12451865;
 //BA.debugLineNum = 12451865;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.B4APagesNavBar.bbcodeparser __ref,anywheresoftware.b4a.BA _ba,b4a.B4APagesNavBar.bctextengine _textengine) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_textengine}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub Initialize (TextEngine As BCTextEngine)";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"b\"";
__ref._allowedtags /*b4a.B4APagesNavBar.b4xset*/  = _b4xcollections._createset2 /*b4a.B4APagesNavBar.b4xset*/ (ba,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("b"),(Object)("u"),(Object)("url"),(Object)("plain"),(Object)("color"),(Object)("img"),(Object)("view"),(Object)("vertical"),(Object)("textsize"),(Object)("alignment"),(Object)("span"),(Object)("indent"),(Object)("list"),(Object)("*"),(Object)("fontawesome"),(Object)("materialicons"),(Object)("e"),(Object)("font"),(Object)("direction"),(Object)("a")}));
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="ColorsMap = CreateMap(\"black\": xui.Color_Black, _";
__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black),(Object)("darkgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray),(Object)("gray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray),(Object)("lightgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_LightGray),(Object)("white"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White),(Object)("red"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),(Object)("green"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green),(Object)("blue"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue),(Object)("yellow"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Yellow),(Object)("cyan"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan),(Object)("magenta"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta),(Object)("transparent"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent)});
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="mTextEngine = TextEngine";
__ref._mtextengine /*b4a.B4APagesNavBar.bctextengine*/  = _textengine;
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _parse(b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "parse", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _parsedelements = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
int _lastmatchend = 0;
boolean _skipuntilendtag = false;
String _tag = "";
boolean _closedtag = false;
b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _t = null;
b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub Parse (Data As BBCodeParseData) As List";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Stack.Initialize";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createtagnode /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null,"noop")));
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_data.Text /*String*/ );
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="Start = matcher.GetStart(0)";
__ref._start /*int*/  = _matcher.GetStart((int) (0));
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (__ref._start /*int*/ >_lastmatchend && _skipuntilendtag==__c.False) { 
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.Sub";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
RDebugUtils.currentLine=11665424;
 //BA.debugLineNum = 11665424;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
RDebugUtils.currentLine=11665425;
 //BA.debugLineNum = 11665425;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((__ref._stackpeek /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null).Tag /*String*/ ).equals(_tag) == false) { 
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (__ref._stackpeek /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11665427;
 //BA.debugLineNum = 11665427;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=11665429;
 //BA.debugLineNum = 11665429;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
__ref._error /*String*/ (null,"Closing tag does not match: "+_tag);
RDebugUtils.currentLine=11665430;
 //BA.debugLineNum = 11665430;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=11665432;
 //BA.debugLineNum = 11665432;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
RDebugUtils.currentLine=11665433;
 //BA.debugLineNum = 11665433;BA.debugLine="If Start > LastMatchEnd Then";
if (__ref._start /*int*/ >_lastmatchend) { 
RDebugUtils.currentLine=11665434;
 //BA.debugLineNum = 11665434;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.S";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
 };
RDebugUtils.currentLine=11665437;
 //BA.debugLineNum = 11665437;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
RDebugUtils.currentLine=11665438;
 //BA.debugLineNum = 11665438;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
RDebugUtils.currentLine=11665440;
 //BA.debugLineNum = 11665440;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (__ref._stackpeek /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=11665441;
 //BA.debugLineNum = 11665441;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
RDebugUtils.currentLine=11665442;
 //BA.debugLineNum = 11665442;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
RDebugUtils.currentLine=11665443;
 //BA.debugLineNum = 11665443;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
RDebugUtils.currentLine=11665444;
 //BA.debugLineNum = 11665444;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else 
{RDebugUtils.currentLine=11665445;
 //BA.debugLineNum = 11665445;BA.debugLine="Else If tag = \"*\" Then";
if ((_tag).equals("*")) { 
RDebugUtils.currentLine=11665446;
 //BA.debugLineNum = 11665446;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 }}
;
RDebugUtils.currentLine=11665448;
 //BA.debugLineNum = 11665448;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
RDebugUtils.currentLine=11665449;
 //BA.debugLineNum = 11665449;BA.debugLine="Dim t As BBCodeTagNode = ParseTag(tag)";
_t = __ref._parsetag /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null,_tag);
RDebugUtils.currentLine=11665450;
 //BA.debugLineNum = 11665450;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (__ref._allowedtags /*b4a.B4APagesNavBar.b4xset*/ ._contains /*boolean*/ (null,(Object)(_t.Tag /*String*/ ))==__c.False) { 
RDebugUtils.currentLine=11665451;
 //BA.debugLineNum = 11665451;BA.debugLine="Error(\"Invalid tag: \" & tag)";
__ref._error /*String*/ (null,"Invalid tag: "+_tag);
RDebugUtils.currentLine=11665452;
 //BA.debugLineNum = 11665452;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=11665454;
 //BA.debugLineNum = 11665454;BA.debugLine="StackPush(t)";
__ref._stackpush /*String*/ (null,_t);
RDebugUtils.currentLine=11665455;
 //BA.debugLineNum = 11665455;BA.debugLine="If t.Tag = \"plain\" Then";
if ((_t.Tag /*String*/ ).equals("plain")) { 
RDebugUtils.currentLine=11665456;
 //BA.debugLineNum = 11665456;BA.debugLine="Dim n As BBCodeTagNode = StackPeek";
_n = __ref._stackpeek /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null);
RDebugUtils.currentLine=11665457;
 //BA.debugLineNum = 11665457;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
RDebugUtils.currentLine=11665458;
 //BA.debugLineNum = 11665458;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
RDebugUtils.currentLine=11665460;
 //BA.debugLineNum = 11665460;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
RDebugUtils.currentLine=11665461;
 //BA.debugLineNum = 11665461;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode*/ (null,"")));
RDebugUtils.currentLine=11665462;
 //BA.debugLineNum = 11665462;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
 };
 };
RDebugUtils.currentLine=11665465;
 //BA.debugLineNum = 11665465;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=11665467;
 //BA.debugLineNum = 11665467;BA.debugLine="If Data.Text.Length > LastMatchEnd Then";
if (_data.Text /*String*/ .length()>_lastmatchend) { 
RDebugUtils.currentLine=11665468;
 //BA.debugLineNum = 11665468;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.SubS";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.B4APagesNavBar.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,_data.Text /*String*/ .length()))));
 };
RDebugUtils.currentLine=11665470;
 //BA.debugLineNum = 11665470;BA.debugLine="Return ParsedElements";
if (true) return _parsedelements;
RDebugUtils.currentLine=11665471;
 //BA.debugLineNum = 11665471;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode  _stackpeek(b4a.B4APagesNavBar.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpeek", true))
	 {return ((b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "stackpeek", null));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub StackPeek As BBCodeTagNode";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode)(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="End Sub";
return null;
}
public String  _stackpop(b4a.B4APagesNavBar.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpop", true))
	 {return ((String) Debug.delegate(ba, "stackpop", null));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub StackPop";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode  _parsetag(b4a.B4APagesNavBar.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsetag", true))
	 {return ((b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "parsetag", new Object[] {_tag}));}
b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub ParseTag (tag As String) As BBCodeTagN";
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return __ref._createtagnode /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null,_tag.toLowerCase());};
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Dim res As BBCodeTagNode = CreateTagNode(\"\")";
_res = __ref._createtagnode /*b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode*/ (null,"");
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="Dim i2 As Int";
_i2 = 0;
RDebugUtils.currentLine=11730961;
 //BA.debugLineNum = 11730961;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
RDebugUtils.currentLine=11730962;
 //BA.debugLineNum = 11730962;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
RDebugUtils.currentLine=11730963;
 //BA.debugLineNum = 11730963;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
RDebugUtils.currentLine=11730965;
 //BA.debugLineNum = 11730965;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
RDebugUtils.currentLine=11730967;
 //BA.debugLineNum = 11730967;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
RDebugUtils.currentLine=11730969;
 //BA.debugLineNum = 11730969;BA.debugLine="i = i2";
_i = _i2;
RDebugUtils.currentLine=11730970;
 //BA.debugLineNum = 11730970;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=11730972;
 //BA.debugLineNum = 11730972;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=11730973;
 //BA.debugLineNum = 11730973;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=11730974;
 //BA.debugLineNum = 11730974;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
RDebugUtils.currentLine=11730975;
 //BA.debugLineNum = 11730975;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=11730977;
 //BA.debugLineNum = 11730977;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=11730979;
 //BA.debugLineNum = 11730979;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=11730981;
 //BA.debugLineNum = 11730981;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=11730982;
 //BA.debugLineNum = 11730982;BA.debugLine="End Sub";
return null;
}
public String  _stackpush(b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpush", true))
	 {return ((String) Debug.delegate(ba, "stackpush", new Object[] {_tag}));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub StackPush (Tag As BBCodeTagNode)";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Stack.Add(Tag)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tag));
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return "";
}
public int  _parsecodepoint(b4a.B4APagesNavBar.bbcodeparser __ref,String _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecodepoint", true))
	 {return ((Integer) Debug.delegate(ba, "parsecodepoint", new Object[] {_raw}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Private Sub ParseCodepoint (raw As String) As Int";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="If raw.StartsWith(\"0x\") Then raw = raw.SubString(";
if (_raw.startsWith("0x")) { 
_raw = _raw.substring((int) (2));};
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Return Bit.ParseInt(raw, 16)";
if (true) return __c.Bit.ParseInt(_raw,(int) (16));
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="End Sub";
return 0;
}
public int  _parsecolorstring(b4a.B4APagesNavBar.bbcodeparser __ref,String _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecolorstring", true))
	 {return ((Integer) Debug.delegate(ba, "parsecolorstring", new Object[] {_clr}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Private Sub ParseColorString(clr As String) As Int";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or(((int)0xff000000),__c.Bit.ParseInt(_clr.substring((int) (1)),(int) (16)));
 }else 
{RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
if (_clr.startsWith("0x")) { 
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or(((int)0xff000000),__c.Bit.ParseInt(_clr.substring((int) (4)),(int) (16)));
 }else 
{RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
if (__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Return ColorsMap.Get(clr)";
if (true) return (int)(BA.ObjectToNumber(__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr))));
 }else {
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="Error(\"Invalid color value: \" & clr)";
__ref._error /*String*/ (null,"Invalid color value: "+_clr);
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="Return xui.Color_Black";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
 }}}
;
RDebugUtils.currentLine=12386316;
 //BA.debugLineNum = 12386316;BA.debugLine="End Sub";
return 0;
}
public void  _setimageview(b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag,b4a.B4APagesNavBar.bctextengine._bctextrun _run,b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data) throws Exception{
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "setimageview", true))
	 {Debug.delegate(ba, "setimageview", new Object[] {_tag,_run,_data}); return;}
ResumableSub_SetImageView rsub = new ResumableSub_SetImageView(this,__ref,_tag,_run,_data);
rsub.resume(ba, null);
}
public static class ResumableSub_SetImageView extends BA.ResumableSub {
public ResumableSub_SetImageView(b4a.B4APagesNavBar.bbcodeparser parent,b4a.B4APagesNavBar.bbcodeparser __ref,b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag,b4a.B4APagesNavBar.bctextengine._bctextrun _run,b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data) {
this.parent = parent;
this.__ref = __ref;
this._tag = _tag;
this._run = _run;
this._data = _data;
this.__ref = parent;
}
b4a.B4APagesNavBar.bbcodeparser __ref;
b4a.B4APagesNavBar.bbcodeparser parent;
b4a.B4APagesNavBar.bbcodeparser._bbcodetagnode _tag;
b4a.B4APagesNavBar.bctextengine._bctextrun _run;
b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata _data;
String _url = "";
String _dir = "";
String _filename = "";
int _width = 0;
int _height = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
b4a.B4APagesNavBar.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bbcodeparser";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Dim url As String = Tag.Extra.GetDefault(\"url\", \"";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("url"),(Object)("")));
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim dir As String = Tag.Extra.GetDefault(\"dir\", F";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("dir"),(Object)(parent.__c.File.getDirAssets())));
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Dim filename As String = Tag.Extra.GetDefault(\"fi";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("filename"),(Object)("")));
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Dim width As Int = GetDimensionFromTag(Tag, \"widt";
_width = __ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data);
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="Dim height As Int = GetDimensionFromTag(Tag, \"hei";
_height = __ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data);
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="Dim xiv As B4XView = iv";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="run.View = xiv";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xiv;
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="If url <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 26;
if ((_url).equals("") == false) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, width, height)";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="If data.ImageCache.ContainsKey(url) Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_url))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="xiv.SetBitmap(data.ImageCache.Get(url))";
_xiv.SetBitmap((android.graphics.Bitmap)(_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_url))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="Dim j As HttpJob";
_j = new b4a.B4APagesNavBar.httpjob();
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=12582933;
 //BA.debugLineNum = 12582933;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=12582934;
 //BA.debugLineNum = 12582934;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bbcodeparser", "setimageview"), (Object)(_j));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_j = (b4a.B4APagesNavBar.httpjob) result[1];
;
RDebugUtils.currentLine=12582935;
 //BA.debugLineNum = 12582935;BA.debugLine="If j.Success Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=12582936;
 //BA.debugLineNum = 12582936;BA.debugLine="bmp = j.GetBitmap";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null).getObject()));
RDebugUtils.currentLine=12582937;
 //BA.debugLineNum = 12582937;BA.debugLine="bmp = bmp.Resize(width, height, True)";
_bmp = _bmp.Resize(_width,_height,parent.__c.True);
RDebugUtils.currentLine=12582938;
 //BA.debugLineNum = 12582938;BA.debugLine="data.ImageCache.Put(url, bmp)";
_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_url),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=12582939;
 //BA.debugLineNum = 12582939;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=12582941;
 //BA.debugLineNum = 12582941;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 13:
//C
this.state = 26;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12582944;
 //BA.debugLineNum = 12582944;BA.debugLine="If width = -1 And height = -1 Then";
if (true) break;

case 16:
//if
this.state = 25;
if (_width==-1 && _height==-1) { 
this.state = 18;
}else 
{RDebugUtils.currentLine=12582946;
 //BA.debugLineNum = 12582946;BA.debugLine="Else if width > -1 And height > -1 Then";
if (_width>-1 && _height>-1) { 
this.state = 20;
}else 
{RDebugUtils.currentLine=12582948;
 //BA.debugLineNum = 12582948;BA.debugLine="Else if width > -1 Then";
if (_width>-1) { 
this.state = 22;
}else {
this.state = 24;
}}}
if (true) break;

case 18:
//C
this.state = 25;
RDebugUtils.currentLine=12582945;
 //BA.debugLineNum = 12582945;BA.debugLine="bmp = xui.LoadBitmap(dir, filename)";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename);
 if (true) break;

case 20:
//C
this.state = 25;
RDebugUtils.currentLine=12582947;
 //BA.debugLineNum = 12582947;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,_height,parent.__c.False);
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=12582949;
 //BA.debugLineNum = 12582949;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,(int) (10000),parent.__c.True);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=12582951;
 //BA.debugLineNum = 12582951;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, 10000";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,(int) (10000),_height,parent.__c.True);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=12582953;
 //BA.debugLineNum = 12582953;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=12582954;
 //BA.debugLineNum = 12582954;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, bmp.Width, bmp.He";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=12582956;
 //BA.debugLineNum = 12582956;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}