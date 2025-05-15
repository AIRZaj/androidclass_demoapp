package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.bbcodeparser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bbcodeparser.class).invoke(this, new Object[] {null});
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
public b4a.example.b4xset _allowedtags = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public int _start = 0;
public b4a.example.bctextengine _mtextengine = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _urlcolor = 0;
public anywheresoftware.b4a.objects.collections.Map _colorsmap = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstring = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.example.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Type BBCodeTextNode (Text As String, Tags As List";
;
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="Type BBCodeTagNode (Tag As String, Extra As Map,";
;
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Type BBCodeParseData (Text As String, URLs As Map";
;
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Private AllowedTags As B4XSet";
_allowedtags = new b4a.example.b4xset();
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Private Stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="Private Start As Int";
_start = 0;
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.example.bctextengine();
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Public UrlColor As Int = 0xFF003FFF";
_urlcolor = ((int)0xff003fff);
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="Public ColorsMap As Map";
_colorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="Public ErrorString As StringBuilder";
_errorstring = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createruns(b4a.example.bbcodeparser __ref,anywheresoftware.b4a.objects.collections.List _texts,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createruns", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createruns", new Object[] {_texts,_data}));}
anywheresoftware.b4a.objects.collections.List _runs = null;
b4a.example.bbcodeparser._bbcodetextnode _textnode = null;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub CreateRuns (Texts As List, Data As BBCo";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Dim Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Runs.Initialize";
_runs.Initialize();
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="For Each TextNode As BBCodeTextNode In Texts";
{
final anywheresoftware.b4a.BA.IterableList group3 = _texts;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_textnode = (b4a.example.bbcodeparser._bbcodetextnode)(group3.Get(index3));
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="TextToRun(TextNode, Runs, Data)";
__ref._texttorun /*String*/ (null,_textnode,_runs,_data);
 }
};
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Return Runs";
if (true) return _runs;
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="End Sub";
return null;
}
public String  _texttorun(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetextnode _text,anywheresoftware.b4a.objects.collections.List _runslist,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "texttorun", true))
	 {return ((String) Debug.delegate(ba, "texttorun", new Object[] {_text,_runslist,_data}));}
anywheresoftware.b4a.objects.collections.List _list = null;
b4a.example.bctextengine._bctextrun _run = null;
boolean _customfont = false;
int _fontsize = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _currentfont = null;
boolean _islistelement = false;
int _i = 0;
b4a.example.bbcodeparser._bbcodetagnode _tag = null;
b4a.example.bctextengine._bcstyledunderline _uu = null;
String _url = "";
String _clr = "";
String _name = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _newfont = null;
b4a.example.bctextengine._bctextrun _parent = null;
b4a.example.bctextengine._bcconnectedruns _cr = null;
String _dir = "";
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub TextToRun (Text As BBCodeTextNode, Run";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim list As List = RunsList";
_list = new anywheresoftware.b4a.objects.collections.List();
_list = _runslist;
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim Run As BCTextRun = mTextEngine.CreateRun(Text";
_run = __ref._mtextengine /*b4a.example.bctextengine*/ ._createrun /*b4a.example.bctextengine._bctextrun*/ (null,_text.Text /*String*/ );
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Run.TextColor = Data.DefaultColor";
_run.TextColor /*int*/  = _data.DefaultColor /*int*/ ;
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="Run.TextFont = Data.DefaultFont";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Dim customfont As Boolean";
_customfont = false;
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Dim FontSize As Int = Data.DefaultFont.Size";
_fontsize = (int) (_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize());
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Dim CurrentFont As B4XFont = Data.DefaultFont";
_currentfont = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="Dim IsListElement As Boolean";
_islistelement = false;
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="For i = 0 To Text.Tags.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.example.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"u","b","url","color","img","view","vertical","textsize","font","alignment","span","indent","list","*","e","direction","fontawesome","materialicons","a")) {
case 0: {
RDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="Run.Underline = True";
_run.Underline /*boolean*/  = __c.True;
RDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="Dim uu As BCStyledUnderline";
_uu = new b4a.example.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="uu.Initialize";
_uu.Initialize();
RDebugUtils.currentLine=11272209;
 //BA.debugLineNum = 11272209;BA.debugLine="uu.Style = tag.Extra.GetDefault(\"style\", mTex";
_uu.Style /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ .Style /*String*/ )));
RDebugUtils.currentLine=11272210;
 //BA.debugLineNum = 11272210;BA.debugLine="uu.Style = uu.Style.ToLowerCase";
_uu.Style /*String*/  = _uu.Style /*String*/ .toLowerCase();
RDebugUtils.currentLine=11272211;
 //BA.debugLineNum = 11272211;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then uu.Clr";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_uu.Clr /*int*/  = __ref._parsecolorstring /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color"))));}
else {
_uu.Clr /*int*/  = (int) (0);};
RDebugUtils.currentLine=11272212;
 //BA.debugLineNum = 11272212;BA.debugLine="uu.Thickness = DipToCurrent(tag.Extra.GetDefa";
_uu.Thickness /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("thickness"),(Object)(1))))));
RDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.E";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=11272214;
 //BA.debugLineNum = 11272214;BA.debugLine="Run.Extra.Put(mTextEngine.EXTRA_STYLEDUNDERLI";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_styledunderline /*String*/ ),(Object)(_uu));
 };
 break; }
case 1: {
RDebugUtils.currentLine=11272217;
 //BA.debugLineNum = 11272217;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=11272218;
 //BA.debugLineNum = 11272218;BA.debugLine="CurrentFont = Data.DefaultBoldFont";
_currentfont = _data.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=11272220;
 //BA.debugLineNum = 11272220;BA.debugLine="Dim url As String";
_url = "";
RDebugUtils.currentLine=11272221;
 //BA.debugLineNum = 11272221;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=11272222;
 //BA.debugLineNum = 11272222;BA.debugLine="url = tag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
 }else {
RDebugUtils.currentLine=11272224;
 //BA.debugLineNum = 11272224;BA.debugLine="url = Text.Text";
_url = _text.Text /*String*/ ;
RDebugUtils.currentLine=11272225;
 //BA.debugLineNum = 11272225;BA.debugLine="Run.TextDirection = mTextEngine.TextDirection";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionltr /*int*/ ;
 };
RDebugUtils.currentLine=11272227;
 //BA.debugLineNum = 11272227;BA.debugLine="If Data.URLs.IsInitialized Then Data.URLs.Put(";
if (_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_run),(Object)(_url));};
RDebugUtils.currentLine=11272228;
 //BA.debugLineNum = 11272228;BA.debugLine="Run.AutoUnderline = True";
_run.AutoUnderline /*boolean*/  = __c.True;
RDebugUtils.currentLine=11272229;
 //BA.debugLineNum = 11272229;BA.debugLine="Run.TextColor = Bit.Or(0xff000000, UrlColor)";
_run.TextColor /*int*/  = __c.Bit.Or(((int)0xff000000),__ref._urlcolor /*int*/ );
 break; }
case 3: {
RDebugUtils.currentLine=11272231;
 //BA.debugLineNum = 11272231;BA.debugLine="Dim clr As String = tag.Extra.Get(\"color\")";
_clr = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")));
RDebugUtils.currentLine=11272232;
 //BA.debugLineNum = 11272232;BA.debugLine="Run.TextColor = ParseColorString(clr)";
_run.TextColor /*int*/  = __ref._parsecolorstring /*int*/ (null,_clr);
 break; }
case 4: {
RDebugUtils.currentLine=11272234;
 //BA.debugLineNum = 11272234;BA.debugLine="SetImageView(tag, Run, Data)";
__ref._setimageview /*void*/ (null,_tag,_run,_data);
RDebugUtils.currentLine=11272235;
 //BA.debugLineNum = 11272235;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
RDebugUtils.currentLine=11272236;
 //BA.debugLineNum = 11272236;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 };
RDebugUtils.currentLine=11272238;
 //BA.debugLineNum = 11272238;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 5: {
RDebugUtils.currentLine=11272240;
 //BA.debugLineNum = 11272240;BA.debugLine="Run.View = GetView(tag, Data)";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._getview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_tag,_data);
RDebugUtils.currentLine=11272241;
 //BA.debugLineNum = 11272241;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=11272242;
 //BA.debugLineNum = 11272242;BA.debugLine="If tag.Extra.ContainsKey(\"width\") Then Run.Vie";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data));};
RDebugUtils.currentLine=11272243;
 //BA.debugLineNum = 11272243;BA.debugLine="If tag.Extra.ContainsKey(\"height\") Then Run.Vi";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data));};
RDebugUtils.currentLine=11272244;
 //BA.debugLineNum = 11272244;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 6: {
RDebugUtils.currentLine=11272246;
 //BA.debugLineNum = 11272246;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 break; }
case 7: {
RDebugUtils.currentLine=11272248;
 //BA.debugLineNum = 11272248;BA.debugLine="FontSize = tag.Extra.Get(\"textsize\")";
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
 break; }
case 8: {
RDebugUtils.currentLine=11272250;
 //BA.debugLineNum = 11272250;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=11272251;
 //BA.debugLineNum = 11272251;BA.debugLine="Dim name As String = tag.Extra.Get(tag.Tag)";
_name = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )));
RDebugUtils.currentLine=11272252;
 //BA.debugLineNum = 11272252;BA.debugLine="If mTextEngine.CustomFonts.ContainsKey(name) =";
if (__ref._mtextengine /*b4a.example.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_name))==__c.False) { 
RDebugUtils.currentLine=11272253;
 //BA.debugLineNum = 11272253;BA.debugLine="Log(\"Font missing from TextEngine.CustomFonts";
__c.LogImpl("911272253","Font missing from TextEngine.CustomFonts: "+_name,0);
 }else {
RDebugUtils.currentLine=11272255;
 //BA.debugLineNum = 11272255;BA.debugLine="Dim NewFont As B4XFont =  mTextEngine.CustomF";
_newfont = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont)(__ref._mtextengine /*b4a.example.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name)));
RDebugUtils.currentLine=11272256;
 //BA.debugLineNum = 11272256;BA.debugLine="CurrentFont = NewFont";
_currentfont = _newfont;
RDebugUtils.currentLine=11272257;
 //BA.debugLineNum = 11272257;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSiz";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 };
 break; }
case 9: {
RDebugUtils.currentLine=11272260;
 //BA.debugLineNum = 11272260;BA.debugLine="Run.HorizontalAlignment = tag.Extra.Get(\"align";
_run.HorizontalAlignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment")));
 break; }
case 10: {
RDebugUtils.currentLine=11272262;
 //BA.debugLineNum = 11272262;BA.debugLine="If tag.Extra.ContainsKey(\"run\") = False Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("run"))==__c.False) { 
RDebugUtils.currentLine=11272263;
 //BA.debugLineNum = 11272263;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateC";
_parent = __ref._mtextengine /*b4a.example.bctextengine*/ ._createconnectedparent /*b4a.example.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=11272264;
 //BA.debugLineNum = 11272264;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=11272265;
 //BA.debugLineNum = 11272265;BA.debugLine="cr.ConnectedWidth = GetDimensionFromTag(tag,";
_cr.ConnectedWidth /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"minwidth",_data);
RDebugUtils.currentLine=11272266;
 //BA.debugLineNum = 11272266;BA.debugLine="cr.Alignment = tag.Extra.GetDefault(\"alignmen";
_cr.Alignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("alignment"),(Object)("left")));
RDebugUtils.currentLine=11272267;
 //BA.debugLineNum = 11272267;BA.debugLine="RunsList.Add(parent)";
_runslist.Add((Object)(_parent));
RDebugUtils.currentLine=11272268;
 //BA.debugLineNum = 11272268;BA.debugLine="tag.Extra.Put(\"run\", parent)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("run"),(Object)(_parent));
 };
RDebugUtils.currentLine=11272270;
 //BA.debugLineNum = 11272270;BA.debugLine="Dim parent As BCTextRun = tag.Extra.Get(\"run\")";
_parent = (b4a.example.bctextengine._bctextrun)(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("run")));
RDebugUtils.currentLine=11272271;
 //BA.debugLineNum = 11272271;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=11272272;
 //BA.debugLineNum = 11272272;BA.debugLine="list = cr.Runs";
_list = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
 break; }
case 11: {
RDebugUtils.currentLine=11272274;
 //BA.debugLineNum = 11272274;BA.debugLine="Run.IndentLevel = tag.Extra.Get(\"indent\")";
_run.IndentLevel /*int*/  = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("indent"))));
 break; }
case 12: {
RDebugUtils.currentLine=11272276;
 //BA.debugLineNum = 11272276;BA.debugLine="Run.IndentLevel = Run.IndentLevel + 1";
_run.IndentLevel /*int*/  = (int) (_run.IndentLevel /*int*/ +1);
 break; }
case 13: {
RDebugUtils.currentLine=11272278;
 //BA.debugLineNum = 11272278;BA.debugLine="IsListElement = True";
_islistelement = __c.True;
 break; }
case 14: {
RDebugUtils.currentLine=11272280;
 //BA.debugLineNum = 11272280;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextChars(";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextchars /*b4a.example.bctextengine._bctextchars*/ (null,new String[]{BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))},(int) (0),(int) (1));
RDebugUtils.currentLine=11272281;
 //BA.debugLineNum = 11272281;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
 break; }
case 15: {
RDebugUtils.currentLine=11272283;
 //BA.debugLineNum = 11272283;BA.debugLine="Dim dir As String = tag.Extra.Get(\"direction\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("direction")));
RDebugUtils.currentLine=11272284;
 //BA.debugLineNum = 11272284;BA.debugLine="Select dir.ToLowerCase";
switch (BA.switchObjectToInt(_dir.toLowerCase(),"ltr","rtl","unknown")) {
case 0: {
RDebugUtils.currentLine=11272286;
 //BA.debugLineNum = 11272286;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionltr /*int*/ ;
 break; }
case 1: {
RDebugUtils.currentLine=11272288;
 //BA.debugLineNum = 11272288;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionrtl /*int*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=11272290;
 //BA.debugLineNum = 11272290;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionunknown /*int*/ ;
 break; }
}
;
 break; }
case 16: 
case 17: {
RDebugUtils.currentLine=11272293;
 //BA.debugLineNum = 11272293;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=11272294;
 //BA.debugLineNum = 11272294;BA.debugLine="If tag.Tag = \"fontawesome\" Then";
if ((_tag.Tag /*String*/ ).equals("fontawesome")) { 
RDebugUtils.currentLine=11272295;
 //BA.debugLineNum = 11272295;BA.debugLine="CurrentFont = xui.CreateFontAwesome(FontSize)";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome((float) (_fontsize));
 }else {
RDebugUtils.currentLine=11272297;
 //BA.debugLineNum = 11272297;BA.debugLine="CurrentFont = xui.CreateMaterialIcons(FontSiz";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (_fontsize));
 };
RDebugUtils.currentLine=11272299;
 //BA.debugLineNum = 11272299;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr(__ref._parsecodepoint /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))))));
RDebugUtils.currentLine=11272300;
 //BA.debugLineNum = 11272300;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=11272301;
 //BA.debugLineNum = 11272301;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSize";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 break; }
case 18: {
RDebugUtils.currentLine=11272303;
 //BA.debugLineNum = 11272303;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.Ex";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=11272304;
 //BA.debugLineNum = 11272304;BA.debugLine="Run.Extra.Put(\"a\", tag.Extra.Get(\"a\"))";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("a"),_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("a")));
 break; }
}
;
 }
};
RDebugUtils.currentLine=11272307;
 //BA.debugLineNum = 11272307;BA.debugLine="If IsListElement Then";
if (_islistelement) { 
RDebugUtils.currentLine=11272308;
 //BA.debugLineNum = 11272308;BA.debugLine="Run = HandleListElement(Text, Run)";
_run = __ref._handlelistelement /*b4a.example.bctextengine._bctextrun*/ (null,_text,_run);
 };
RDebugUtils.currentLine=11272310;
 //BA.debugLineNum = 11272310;BA.debugLine="If customfont Or FontSize <> Data.DefaultFont.Siz";
if (_customfont || _fontsize!=_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize()) { 
RDebugUtils.currentLine=11272323;
 //BA.debugLineNum = 11272323;BA.debugLine="Run.TextFont = xui.CreateFont2(CurrentFont, Font";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(_currentfont,(float) (_fontsize));
 };
RDebugUtils.currentLine=11272326;
 //BA.debugLineNum = 11272326;BA.debugLine="list.Add(Run)";
_list.Add((Object)(_run));
RDebugUtils.currentLine=11272327;
 //BA.debugLineNum = 11272327;BA.debugLine="End Sub";
return "";
}
public b4a.example.bbcodeparser._bbcodetagnode  _createtagnode(b4a.example.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtagnode", true))
	 {return ((b4a.example.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "createtagnode", new Object[] {_tag}));}
b4a.example.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub CreateTagNode (Tag As String) As BBCod";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim n As BBCodeTagNode";
_n = new b4a.example.bbcodeparser._bbcodetagnode();
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="End Sub";
return null;
}
public b4a.example.bbcodeparser._bbcodetextnode  _createtextnode(b4a.example.bbcodeparser __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtextnode", true))
	 {return ((b4a.example.bbcodeparser._bbcodetextnode) Debug.delegate(ba, "createtextnode", new Object[] {_text}));}
b4a.example.bbcodeparser._bbcodetextnode _n = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub CreateTextNode(Text As String) As BBCo";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Dim n As BBCodeTextNode";
_n = new b4a.example.bbcodeparser._bbcodetextnode();
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="End Sub";
return null;
}
public String  _error(b4a.example.bbcodeparser __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "error", true))
	 {return ((String) Debug.delegate(ba, "error", new Object[] {_msg}));}
String _s = "";
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub Error (msg As String)";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(__ref._start /*int*/ ))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="LogColor(s, Colors.Red)";
__c.LogImpl("911010051",_s,__c.Colors.Red);
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_s).Append(__c.CRLF);
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="End Sub";
return "";
}
public int  _getdimensionfromtag(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,String _key,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getdimensionfromtag", true))
	 {return ((Integer) Debug.delegate(ba, "getdimensionfromtag", new Object[] {_tag,_key,_data}));}
String _s = "";
int _i = 0;
float _v = 0f;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub GetDimensionFromTag (Tag As BBCodeTagN";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim s As String = Tag.Extra.GetDefault(Key, \"\")";
_s = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="If s = \"\" Then Return -1";
if ((_s).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Dim i As Int = s.IndexOf(\"%\")";
_i = _s.indexOf("%");
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Dim v As Float = s.SubString2(0, i) / 100";
_v = (float) ((double)(Double.parseDouble(_s.substring((int) (0),_i)))/(double)100);
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="If s.EndsWith(\"%x\") Then";
if (_s.endsWith("%x")) { 
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Data.NeedToReparseWhenResize = True";
_data.NeedToReparseWhenResize /*boolean*/  = __c.True;
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="Return v * Data.Width";
if (true) return (int) (_v*_data.Width /*int*/ );
 };
 };
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="Return DipToCurrent(s)";
if (true) return __c.DipToCurrent((int)(Double.parseDouble(_s)));
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getview(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getview", new Object[] {_tag,_data}));}
String _id = "";
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub GetView (Tag As BBCodeTagNode, Data As";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim id As String = Tag.Extra.Get(\"view\")";
_id = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("view")));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="If Data.Views.ContainsKey(id) = False Then";
if (_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_id))==__c.False) { 
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="Error(\"Missing view: \" & id)";
__ref._error /*String*/ (null,"Missing view: "+_id);
 };
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Dim v As B4XView = Data.Views.Get(id)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_id))));
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Return v";
if (true) return _v;
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextrun  _handlelistelement(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetextnode _text,b4a.example.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((b4a.example.bctextengine._bctextrun) Debug.delegate(ba, "handlelistelement", new Object[] {_text,_run}));}
int _i = 0;
b4a.example.bbcodeparser._bbcodetagnode _tag = null;
String _liststyle = "";
int _count = 0;
b4a.example.bctextengine._bctextrun _parent = null;
b4a.example.bctextengine._bcconnectedruns _cr = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub HandleListElement (Text As BBCodeTextN";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="For i = Text.Tags.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.example.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="If tag.Tag = \"list\" Then";
if ((_tag.Tag /*String*/ ).equals("list")) { 
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Dim liststyle As String";
_liststyle = "";
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="If tag.extra.IsInitialized Then liststyle = tag";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_liststyle = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)("unordered")));};
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="If liststyle = \"\" Or liststyle.ToLowerCase = \"u";
if ((_liststyle).equals("") || (_liststyle.toLowerCase()).equals("unordered")) { 
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="Run.TextChars =  mTextEngine.CreateBCTextChars";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr(((int)0x2022)))+" ");
 }else {
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Dim count As Int = tag.Extra.GetDefault(\"count";
_count = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("count"),(Object)(1))));
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateCo";
_parent = __ref._mtextengine /*b4a.example.bctextengine*/ ._createconnectedparent /*b4a.example.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,BA.NumberToString((_count))+". ");
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="cr.Runs.Add(Run)";
_cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_run));
RDebugUtils.currentLine=11468814;
 //BA.debugLineNum = 11468814;BA.debugLine="cr.Alignment = \"right\"";
_cr.Alignment /*String*/  = "right";
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="cr.ConnectedWidth = mTextEngine.GetFontMetrics";
_cr.ConnectedWidth /*int*/  = (int) (__ref._mtextengine /*b4a.example.bctextengine*/ ._getfontmetrics /*b4a.example.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ ).xWidth /*int*/ *3/(double)__ref._mtextengine /*b4a.example.bctextengine*/ ._mscale /*float*/ );
RDebugUtils.currentLine=11468816;
 //BA.debugLineNum = 11468816;BA.debugLine="parent.IndentLevel = Run.IndentLevel";
_parent.IndentLevel /*int*/  = _run.IndentLevel /*int*/ ;
RDebugUtils.currentLine=11468817;
 //BA.debugLineNum = 11468817;BA.debugLine="Run = parent";
_run = _parent;
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=11468819;
 //BA.debugLineNum = 11468819;BA.debugLine="tag.Extra.Put(\"count\", count)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("count"),(Object)(_count));
 };
RDebugUtils.currentLine=11468821;
 //BA.debugLineNum = 11468821;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=11468824;
 //BA.debugLineNum = 11468824;BA.debugLine="Return Run";
if (true) return _run;
RDebugUtils.currentLine=11468825;
 //BA.debugLineNum = 11468825;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.bbcodeparser __ref,anywheresoftware.b4a.BA _ba,b4a.example.bctextengine _textengine) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_textengine}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub Initialize (TextEngine As BCTextEngine)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"b\"";
__ref._allowedtags /*b4a.example.b4xset*/  = _b4xcollections._createset2 /*b4a.example.b4xset*/ (ba,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("b"),(Object)("u"),(Object)("url"),(Object)("plain"),(Object)("color"),(Object)("img"),(Object)("view"),(Object)("vertical"),(Object)("textsize"),(Object)("alignment"),(Object)("span"),(Object)("indent"),(Object)("list"),(Object)("*"),(Object)("fontawesome"),(Object)("materialicons"),(Object)("e"),(Object)("font"),(Object)("direction"),(Object)("a")}));
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="ColorsMap = CreateMap(\"black\": xui.Color_Black, _";
__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black),(Object)("darkgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray),(Object)("gray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray),(Object)("lightgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_LightGray),(Object)("white"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White),(Object)("red"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),(Object)("green"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green),(Object)("blue"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue),(Object)("yellow"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Yellow),(Object)("cyan"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan),(Object)("magenta"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta),(Object)("transparent"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent)});
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="mTextEngine = TextEngine";
__ref._mtextengine /*b4a.example.bctextengine*/  = _textengine;
RDebugUtils.currentLine=10616848;
 //BA.debugLineNum = 10616848;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=10616849;
 //BA.debugLineNum = 10616849;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _parse(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
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
b4a.example.bbcodeparser._bbcodetagnode _t = null;
b4a.example.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub Parse (Data As BBCodeParseData) As List";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Stack.Initialize";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createtagnode /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,"noop")));
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_data.Text /*String*/ );
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="Start = matcher.GetStart(0)";
__ref._start /*int*/  = _matcher.GetStart((int) (0));
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (__ref._start /*int*/ >_lastmatchend && _skipuntilendtag==__c.False) { 
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.Sub";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((__ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null).Tag /*String*/ ).equals(_tag) == false) { 
RDebugUtils.currentLine=10682386;
 //BA.debugLineNum = 10682386;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (__ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=10682387;
 //BA.debugLineNum = 10682387;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=10682389;
 //BA.debugLineNum = 10682389;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
__ref._error /*String*/ (null,"Closing tag does not match: "+_tag);
RDebugUtils.currentLine=10682390;
 //BA.debugLineNum = 10682390;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=10682392;
 //BA.debugLineNum = 10682392;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
RDebugUtils.currentLine=10682393;
 //BA.debugLineNum = 10682393;BA.debugLine="If Start > LastMatchEnd Then";
if (__ref._start /*int*/ >_lastmatchend) { 
RDebugUtils.currentLine=10682394;
 //BA.debugLineNum = 10682394;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.S";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
 };
RDebugUtils.currentLine=10682397;
 //BA.debugLineNum = 10682397;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
RDebugUtils.currentLine=10682398;
 //BA.debugLineNum = 10682398;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
RDebugUtils.currentLine=10682400;
 //BA.debugLineNum = 10682400;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (__ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=10682401;
 //BA.debugLineNum = 10682401;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
RDebugUtils.currentLine=10682402;
 //BA.debugLineNum = 10682402;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
RDebugUtils.currentLine=10682403;
 //BA.debugLineNum = 10682403;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
RDebugUtils.currentLine=10682404;
 //BA.debugLineNum = 10682404;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else 
{RDebugUtils.currentLine=10682405;
 //BA.debugLineNum = 10682405;BA.debugLine="Else If tag = \"*\" Then";
if ((_tag).equals("*")) { 
RDebugUtils.currentLine=10682406;
 //BA.debugLineNum = 10682406;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 }}
;
RDebugUtils.currentLine=10682408;
 //BA.debugLineNum = 10682408;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
RDebugUtils.currentLine=10682409;
 //BA.debugLineNum = 10682409;BA.debugLine="Dim t As BBCodeTagNode = ParseTag(tag)";
_t = __ref._parsetag /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,_tag);
RDebugUtils.currentLine=10682410;
 //BA.debugLineNum = 10682410;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (__ref._allowedtags /*b4a.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_t.Tag /*String*/ ))==__c.False) { 
RDebugUtils.currentLine=10682411;
 //BA.debugLineNum = 10682411;BA.debugLine="Error(\"Invalid tag: \" & tag)";
__ref._error /*String*/ (null,"Invalid tag: "+_tag);
RDebugUtils.currentLine=10682412;
 //BA.debugLineNum = 10682412;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=10682414;
 //BA.debugLineNum = 10682414;BA.debugLine="StackPush(t)";
__ref._stackpush /*String*/ (null,_t);
RDebugUtils.currentLine=10682415;
 //BA.debugLineNum = 10682415;BA.debugLine="If t.Tag = \"plain\" Then";
if ((_t.Tag /*String*/ ).equals("plain")) { 
RDebugUtils.currentLine=10682416;
 //BA.debugLineNum = 10682416;BA.debugLine="Dim n As BBCodeTagNode = StackPeek";
_n = __ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null);
RDebugUtils.currentLine=10682417;
 //BA.debugLineNum = 10682417;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
RDebugUtils.currentLine=10682418;
 //BA.debugLineNum = 10682418;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
RDebugUtils.currentLine=10682420;
 //BA.debugLineNum = 10682420;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
RDebugUtils.currentLine=10682421;
 //BA.debugLineNum = 10682421;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,"")));
RDebugUtils.currentLine=10682422;
 //BA.debugLineNum = 10682422;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
 };
 };
RDebugUtils.currentLine=10682425;
 //BA.debugLineNum = 10682425;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=10682427;
 //BA.debugLineNum = 10682427;BA.debugLine="If Data.Text.Length > LastMatchEnd Then";
if (_data.Text /*String*/ .length()>_lastmatchend) { 
RDebugUtils.currentLine=10682428;
 //BA.debugLineNum = 10682428;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.SubS";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,_data.Text /*String*/ .length()))));
 };
RDebugUtils.currentLine=10682430;
 //BA.debugLineNum = 10682430;BA.debugLine="Return ParsedElements";
if (true) return _parsedelements;
RDebugUtils.currentLine=10682431;
 //BA.debugLineNum = 10682431;BA.debugLine="End Sub";
return null;
}
public b4a.example.bbcodeparser._bbcodetagnode  _stackpeek(b4a.example.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpeek", true))
	 {return ((b4a.example.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "stackpeek", null));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub StackPeek As BBCodeTagNode";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (b4a.example.bbcodeparser._bbcodetagnode)(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return null;
}
public String  _stackpop(b4a.example.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpop", true))
	 {return ((String) Debug.delegate(ba, "stackpop", null));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub StackPop";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="End Sub";
return "";
}
public b4a.example.bbcodeparser._bbcodetagnode  _parsetag(b4a.example.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsetag", true))
	 {return ((b4a.example.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "parsetag", new Object[] {_tag}));}
b4a.example.bbcodeparser._bbcodetagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub ParseTag (tag As String) As BBCodeTagN";
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return __ref._createtagnode /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,_tag.toLowerCase());};
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="Dim res As BBCodeTagNode = CreateTagNode(\"\")";
_res = __ref._createtagnode /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,"");
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
RDebugUtils.currentLine=10747916;
 //BA.debugLineNum = 10747916;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="Dim i2 As Int";
_i2 = 0;
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
RDebugUtils.currentLine=10747927;
 //BA.debugLineNum = 10747927;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
RDebugUtils.currentLine=10747929;
 //BA.debugLineNum = 10747929;BA.debugLine="i = i2";
_i = _i2;
RDebugUtils.currentLine=10747930;
 //BA.debugLineNum = 10747930;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=10747932;
 //BA.debugLineNum = 10747932;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=10747933;
 //BA.debugLineNum = 10747933;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=10747934;
 //BA.debugLineNum = 10747934;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
RDebugUtils.currentLine=10747935;
 //BA.debugLineNum = 10747935;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=10747937;
 //BA.debugLineNum = 10747937;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=10747939;
 //BA.debugLineNum = 10747939;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=10747941;
 //BA.debugLineNum = 10747941;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=10747942;
 //BA.debugLineNum = 10747942;BA.debugLine="End Sub";
return null;
}
public String  _stackpush(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpush", true))
	 {return ((String) Debug.delegate(ba, "stackpush", new Object[] {_tag}));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub StackPush (Tag As BBCodeTagNode)";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Stack.Add(Tag)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tag));
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return "";
}
public int  _parsecodepoint(b4a.example.bbcodeparser __ref,String _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecodepoint", true))
	 {return ((Integer) Debug.delegate(ba, "parsecodepoint", new Object[] {_raw}));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub ParseCodepoint (raw As String) As Int";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="If raw.StartsWith(\"0x\") Then raw = raw.SubString(";
if (_raw.startsWith("0x")) { 
_raw = _raw.substring((int) (2));};
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Return Bit.ParseInt(raw, 16)";
if (true) return __c.Bit.ParseInt(_raw,(int) (16));
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="End Sub";
return 0;
}
public int  _parsecolorstring(b4a.example.bbcodeparser __ref,String _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecolorstring", true))
	 {return ((Integer) Debug.delegate(ba, "parsecolorstring", new Object[] {_clr}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub ParseColorString(clr As String) As Int";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or(((int)0xff000000),__c.Bit.ParseInt(_clr.substring((int) (1)),(int) (16)));
 }else 
{RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
if (_clr.startsWith("0x")) { 
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or(((int)0xff000000),__c.Bit.ParseInt(_clr.substring((int) (4)),(int) (16)));
 }else 
{RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
if (__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="Return ColorsMap.Get(clr)";
if (true) return (int)(BA.ObjectToNumber(__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr))));
 }else {
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="Error(\"Invalid color value: \" & clr)";
__ref._error /*String*/ (null,"Invalid color value: "+_clr);
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="Return xui.Color_Black";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
 }}}
;
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="End Sub";
return 0;
}
public void  _setimageview(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bctextengine._bctextrun _run,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "setimageview", true))
	 {Debug.delegate(ba, "setimageview", new Object[] {_tag,_run,_data}); return;}
ResumableSub_SetImageView rsub = new ResumableSub_SetImageView(this,__ref,_tag,_run,_data);
rsub.resume(ba, null);
}
public static class ResumableSub_SetImageView extends BA.ResumableSub {
public ResumableSub_SetImageView(b4a.example.bbcodeparser parent,b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bctextengine._bctextrun _run,b4a.example.bbcodeparser._bbcodeparsedata _data) {
this.parent = parent;
this.__ref = __ref;
this._tag = _tag;
this._run = _run;
this._data = _data;
this.__ref = parent;
}
b4a.example.bbcodeparser __ref;
b4a.example.bbcodeparser parent;
b4a.example.bbcodeparser._bbcodetagnode _tag;
b4a.example.bctextengine._bctextrun _run;
b4a.example.bbcodeparser._bbcodeparsedata _data;
String _url = "";
String _dir = "";
String _filename = "";
int _width = 0;
int _height = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
b4a.example.httpjob _j = null;

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
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Dim url As String = Tag.Extra.GetDefault(\"url\", \"";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("url"),(Object)("")));
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Dim dir As String = Tag.Extra.GetDefault(\"dir\", F";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("dir"),(Object)(parent.__c.File.getDirAssets())));
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Dim filename As String = Tag.Extra.GetDefault(\"fi";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("filename"),(Object)("")));
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Dim width As Int = GetDimensionFromTag(Tag, \"widt";
_width = __ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data);
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Dim height As Int = GetDimensionFromTag(Tag, \"hei";
_height = __ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data);
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Dim xiv As B4XView = iv";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="run.View = xiv";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xiv;
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="If url <> \"\" Then";
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
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, width, height)";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="If data.ImageCache.ContainsKey(url) Then";
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
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="xiv.SetBitmap(data.ImageCache.Get(url))";
_xiv.SetBitmap((android.graphics.Bitmap)(_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_url))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=11599891;
 //BA.debugLineNum = 11599891;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=11599894;
 //BA.debugLineNum = 11599894;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bbcodeparser", "setimageview"), (Object)(_j));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="bmp = j.GetBitmap";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null).getObject()));
RDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="bmp = bmp.Resize(width, height, True)";
_bmp = _bmp.Resize(_width,_height,parent.__c.True);
RDebugUtils.currentLine=11599898;
 //BA.debugLineNum = 11599898;BA.debugLine="data.ImageCache.Put(url, bmp)";
_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_url),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=11599899;
 //BA.debugLineNum = 11599899;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=11599901;
 //BA.debugLineNum = 11599901;BA.debugLine="j.Release";
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
RDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="If width = -1 And height = -1 Then";
if (true) break;

case 16:
//if
this.state = 25;
if (_width==-1 && _height==-1) { 
this.state = 18;
}else 
{RDebugUtils.currentLine=11599906;
 //BA.debugLineNum = 11599906;BA.debugLine="Else if width > -1 And height > -1 Then";
if (_width>-1 && _height>-1) { 
this.state = 20;
}else 
{RDebugUtils.currentLine=11599908;
 //BA.debugLineNum = 11599908;BA.debugLine="Else if width > -1 Then";
if (_width>-1) { 
this.state = 22;
}else {
this.state = 24;
}}}
if (true) break;

case 18:
//C
this.state = 25;
RDebugUtils.currentLine=11599905;
 //BA.debugLineNum = 11599905;BA.debugLine="bmp = xui.LoadBitmap(dir, filename)";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename);
 if (true) break;

case 20:
//C
this.state = 25;
RDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,_height,parent.__c.False);
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=11599909;
 //BA.debugLineNum = 11599909;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,(int) (10000),parent.__c.True);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=11599911;
 //BA.debugLineNum = 11599911;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, 10000";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,(int) (10000),_height,parent.__c.True);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=11599913;
 //BA.debugLineNum = 11599913;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=11599914;
 //BA.debugLineNum = 11599914;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, bmp.Width, bmp.He";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=11599916;
 //BA.debugLineNum = 11599916;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}