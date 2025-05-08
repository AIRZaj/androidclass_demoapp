package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bctextengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.bctextengine");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.bctextengine.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bcfontmetrics{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.Map Glyphs;
public b4a.B4APagesNavBar.bctextengine._bcfontmetrics DefaultColorMetrics;
public int xWidth;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont Fnt;
public int Clr;
public anywheresoftware.b4a.objects.collections.Map KerningTable;
public void Initialize() {
IsInitialized = true;
Glyphs = new anywheresoftware.b4a.objects.collections.Map();
DefaultColorMetrics = new b4a.B4APagesNavBar.bctextengine._bcfontmetrics();
xWidth = 0;
Fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
Clr = 0;
KerningTable = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextchars{
public boolean IsInitialized;
public String[] Buffer;
public int StartIndex;
public int Length;
public void Initialize() {
IsInitialized = true;
Buffer = new String[0];
java.util.Arrays.fill(Buffer,"");
StartIndex = 0;
Length = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraphstyle{
public boolean IsInitialized;
public String HorizontalAlignment;
public float LineSpacingFactor;
public int MaxWidth;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect Padding;
public boolean WordWrap;
public boolean ResizeHeightAutomatically;
public boolean RTL;
public void Initialize() {
IsInitialized = true;
HorizontalAlignment = "";
LineSpacingFactor = 0f;
MaxWidth = 0;
Padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
WordWrap = false;
ResizeHeightAutomatically = false;
RTL = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextrun{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public int TextColor;
public String Text;
public b4a.B4APagesNavBar.bctextengine._bctextchars TextChars;
public float CharacterSpacingFactor;
public int VerticalOffset;
public boolean Underline;
public boolean AutoUnderline;
public int BackgroundColor;
public int IndentLevel;
public anywheresoftware.b4a.objects.B4XViewWrapper View;
public String HorizontalAlignment;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public int TextDirection;
public void Initialize() {
IsInitialized = true;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Text = "";
TextChars = new b4a.B4APagesNavBar.bctextengine._bctextchars();
CharacterSpacingFactor = 0f;
VerticalOffset = 0;
Underline = false;
AutoUnderline = false;
BackgroundColor = 0;
IndentLevel = 0;
View = new anywheresoftware.b4a.objects.B4XViewWrapper();
HorizontalAlignment = "";
Tag = new Object();
Extra = new anywheresoftware.b4a.objects.collections.Map();
TextDirection = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcconnectedruns{
public boolean IsInitialized;
public int ConnectedWidth;
public anywheresoftware.b4a.objects.collections.List Runs;
public String Alignment;
public void Initialize() {
IsInitialized = true;
ConnectedWidth = 0;
Runs = new anywheresoftware.b4a.objects.collections.List();
Alignment = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcstyledunderline{
public boolean IsInitialized;
public int Clr;
public String Style;
public float Thickness;
public void Initialize() {
IsInitialized = true;
Clr = 0;
Style = "";
Thickness = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraph{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List TextLines;
public b4a.B4APagesNavBar.bctextengine._bctextline CurrentLine;
public b4a.B4APagesNavBar.bctextengine._bcparagraphstyle Style;
public boolean TwoLayers;
public int Width;
public int Height;
public anywheresoftware.b4a.objects.collections.List Views;
public anywheresoftware.b4a.objects.collections.Map Anchors;
public void Initialize() {
IsInitialized = true;
TextLines = new anywheresoftware.b4a.objects.collections.List();
CurrentLine = new b4a.B4APagesNavBar.bctextengine._bctextline();
Style = new b4a.B4APagesNavBar.bctextengine._bcparagraphstyle();
TwoLayers = false;
Width = 0;
Height = 0;
Views = new anywheresoftware.b4a.objects.collections.List();
Anchors = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextline{
public boolean IsInitialized;
public int StartX;
public int BaselineY;
public int Height;
public anywheresoftware.b4a.objects.collections.List Unbreakables;
public int Width;
public boolean EndsWithSoftLineBreak;
public int MaxHeightAboveBaseLine;
public b4a.B4APagesNavBar.bctextengine._bcparagraph ParentParagraph;
public int MaxHeightBelowBaseLine;
public void Initialize() {
IsInitialized = true;
StartX = 0;
BaselineY = 0;
Height = 0;
Unbreakables = new anywheresoftware.b4a.objects.collections.List();
Width = 0;
EndsWithSoftLineBreak = false;
MaxHeightAboveBaseLine = 0;
ParentParagraph = new b4a.B4APagesNavBar.bctextengine._bcparagraph();
MaxHeightBelowBaseLine = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcunbreakabletext{
public boolean IsInitialized;
public int Width;
public int StartX;
public b4a.B4APagesNavBar.bctextengine._bctextchars NotFullTextChars;
public boolean IsMergable;
public anywheresoftware.b4a.objects.collections.List SingleStyleSections;
public b4a.B4APagesNavBar.bctextengine._bctextline ParentLine;
public boolean RTL;
public String Anchor;
public void Initialize() {
IsInitialized = true;
Width = 0;
StartX = 0;
NotFullTextChars = new b4a.B4APagesNavBar.bctextengine._bctextchars();
IsMergable = false;
SingleStyleSections = new anywheresoftware.b4a.objects.collections.List();
ParentLine = new b4a.B4APagesNavBar.bctextengine._bctextline();
RTL = false;
Anchor = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcsinglestylesection{
public boolean IsInitialized;
public int AbsoluteStartX;
public anywheresoftware.b4a.objects.collections.List GlyphsAndOffsets;
public b4a.B4APagesNavBar.bctextengine._bctextrun Run;
public int Width;
public int MaxHeightBelowBaseLine;
public int MaxHeightAboveBaseLine;
public b4a.B4APagesNavBar.bctextengine._bcunbreakabletext ParentUN;
public b4a.B4APagesNavBar.bctextengine._bcfontmetrics fm;
public void Initialize() {
IsInitialized = true;
AbsoluteStartX = 0;
GlyphsAndOffsets = new anywheresoftware.b4a.objects.collections.List();
Run = new b4a.B4APagesNavBar.bctextengine._bctextrun();
Width = 0;
MaxHeightBelowBaseLine = 0;
MaxHeightAboveBaseLine = 0;
ParentUN = new b4a.B4APagesNavBar.bctextengine._bcunbreakabletext();
fm = new b4a.B4APagesNavBar.bctextengine._bcfontmetrics();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyphandoffset{
public boolean IsInitialized;
public b4a.B4APagesNavBar.bctextengine._bcglyph Glyph;
public int SpaceBetweenThisAndNext;
public void Initialize() {
IsInitialized = true;
Glyph = new b4a.B4APagesNavBar.bctextengine._bcglyph();
SpaceBetweenThisAndNext = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyph{
public boolean IsInitialized;
public b4a.example.bitmapcreator._compressedbc cbc;
public int baseline;
public int Width;
public boolean Emoji;
public boolean Empty;
public void Initialize() {
IsInitialized = true;
cbc = new b4a.example.bitmapcreator._compressedbc();
baseline = 0;
Width = 0;
Emoji = false;
Empty = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public String _extra_connectedruns = "";
public String _extra_styledunderline = "";
public b4a.example.bitmapcreator _charbc = null;
public b4a.example.bitmapcreator._internalcompressedbccache _cbccache = null;
public b4a.B4APagesNavBar.bctextengine._bcstyledunderline _defaultunderlinestyle = null;
public float _mscale = 0f;
public float _mspacebetweencharacters = 0f;
public int _mspacebetweenlines = 0;
public anywheresoftware.b4a.objects.collections.Map _fontmetricscache = null;
public b4a.example.bitmapcreator _foregroundbc = null;
public b4a.example.bitmapcreator _backgroundbc = null;
public int _defaultcolor = 0;
public String _wordboundaries = "";
public String _wordboundariesthatcanconnecttoprevword = "";
public anywheresoftware.b4a.objects.collections.Map _brushes = null;
public b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _defaultstyle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaultfont = null;
public int _mmingapbetweenlines = 0;
public anywheresoftware.b4a.objects.PanelWrapper _stubforcontext = null;
public int _tabwidthmeasuredinx = 0;
public b4a.B4APagesNavBar.bbcodeparser _tagparser = null;
public b4a.B4APagesNavBar.bctextengine._bctextchars _emptytextchars = null;
public b4a.B4APagesNavBar.b4xset _emojis = null;
public String _charset = "";
public boolean _lookforcomplexcharacters = false;
public anywheresoftware.b4a.objects.collections.Map _customfonts = null;
public boolean _kerningenabled = false;
public int _indentwidth = 0;
public b4a.B4APagesNavBar.b4xset _vowelscodepoints = null;
public b4a.B4APagesNavBar.b4xorderedmap _asyncbcs = null;
public b4a.example.bitmapcreator _asyncbc = null;
public anywheresoftware.b4a.objects.collections.List _asynctasks = null;
public boolean _asyncmode = false;
public b4a.B4APagesNavBar.b4xset _rtlchars = null;
public int _textdirectionltr = 0;
public int _textdirectionunknown = 0;
public int _textdirectionrtl = 0;
public anywheresoftware.b4a.objects.collections.Map _arabicmap = null;
public b4a.B4APagesNavBar.b4xset _arabicnonlinkedletters = null;
public b4a.B4APagesNavBar.b4xset _arabiccharsconnectedprev = null;
public b4a.example.bitmapcreator._premultipliedcolor _pmdefaultcolor = null;
public boolean _rtlaware = false;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.B4APagesNavBar.bctextengine __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
byte[] _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="CustomFonts.Initialize";
__ref._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="VowelsCodePoints.Initialize";
__ref._vowelscodepoints /*b4a.B4APagesNavBar.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="EmptyTextChars = CreateBCTextCharsFromString(\"\")";
__ref._emptytextchars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,"");
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="setSpaceBetweenCharacters(100dip / 100)";
__ref._setspacebetweencharacters /*String*/ (null,(float) (__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="setSpaceBetweenLines(20dip)";
__ref._setspacebetweenlines /*String*/ (null,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="ResizeCharBC(50dip * mScale, 50dip * mScale)";
__ref._resizecharbc /*String*/ (null,(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ),(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="Brushes.Initialize";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15073303;
 //BA.debugLineNum = 15073303;BA.debugLine="ResizeLayers(200dip * mScale, 100dip * mScale)";
__ref._resizelayers /*String*/ (null,(int) (__c.DipToCurrent((int) (200))*__ref._mscale /*float*/ ),(int) (__c.DipToCurrent((int) (100))*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=15073304;
 //BA.debugLineNum = 15073304;BA.debugLine="cbccache.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .Initialize();
RDebugUtils.currentLine=15073305;
 //BA.debugLineNum = 15073305;BA.debugLine="cbccache.ColorsMap.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .ColorsMap.Initialize();
RDebugUtils.currentLine=15073306;
 //BA.debugLineNum = 15073306;BA.debugLine="FontMetricsCache.Initialize";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15073307;
 //BA.debugLineNum = 15073307;BA.debugLine="Dim b(CharBC.SAME_COLOR_LENGTH_FOR_CACHE * 4 * Ch";
_b = new byte[(int) (__ref._charbc /*b4a.example.bitmapcreator*/ ._same_color_length_for_cache*4*__ref._charbc /*b4a.example.bitmapcreator*/ ._max_same_color_size+4)];
;
RDebugUtils.currentLine=15073308;
 //BA.debugLineNum = 15073308;BA.debugLine="cbccache.mBuffer = b";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .mBuffer = _b;
RDebugUtils.currentLine=15073309;
 //BA.debugLineNum = 15073309;BA.debugLine="DefaultFont = xui.CreateDefaultFont(16)";
__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (16));
RDebugUtils.currentLine=15073310;
 //BA.debugLineNum = 15073310;BA.debugLine="DefaultStyle = CreateStyle";
__ref._defaultstyle /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/  = __ref._createstyle /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=15073311;
 //BA.debugLineNum = 15073311;BA.debugLine="TagParser.Initialize (Me)";
__ref._tagparser /*b4a.B4APagesNavBar.bbcodeparser*/ ._initialize /*String*/ (null,ba,(b4a.B4APagesNavBar.bctextengine)(this));
RDebugUtils.currentLine=15073312;
 //BA.debugLineNum = 15073312;BA.debugLine="DefaultUnderlineStyle.Initialize";
__ref._defaultunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ .Initialize();
RDebugUtils.currentLine=15073313;
 //BA.debugLineNum = 15073313;BA.debugLine="DefaultUnderlineStyle.Clr = 0";
__ref._defaultunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ .Clr /*int*/  = (int) (0);
RDebugUtils.currentLine=15073314;
 //BA.debugLineNum = 15073314;BA.debugLine="DefaultUnderlineStyle.Style = \"line\"";
__ref._defaultunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ .Style /*String*/  = "line";
RDebugUtils.currentLine=15073315;
 //BA.debugLineNum = 15073315;BA.debugLine="DefaultUnderlineStyle.Thickness = 1dip";
__ref._defaultunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ .Thickness /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=15073316;
 //BA.debugLineNum = 15073316;BA.debugLine="For Each v As B4XView In Parent.GetAllViewsRecurs";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group24 = _parent.GetAllViewsRecursive();
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group24.Get(index24)));
RDebugUtils.currentLine=15073317;
 //BA.debugLineNum = 15073317;BA.debugLine="If v.Tag Is BBCodeView Or v.Tag Is BBLabel Then";
if (_v.getTag() instanceof b4a.B4APagesNavBar.bbcodeview || _v.getTag() instanceof b4a.B4APagesNavBar.bblabel) { 
RDebugUtils.currentLine=15073318;
 //BA.debugLineNum = 15073318;BA.debugLine="CallSub2(v.Tag, \"setTextEngine\", Me)";
__c.CallSubDebug2(ba,_v.getTag(),"setTextEngine",this);
 };
 }
};
RDebugUtils.currentLine=15073322;
 //BA.debugLineNum = 15073322;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bctextchars  _createbctextcharsfromstring(b4a.B4APagesNavBar.bctextengine __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextcharsfromstring", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextchars) Debug.delegate(ba, "createbctextcharsfromstring", new Object[] {_s}));}
byte[] _b = null;
String[] _chars = null;
int _i = 0;
int _bi = 0;
boolean _shouldaddtoprevchar = false;
boolean _therearevowels = false;
int _cp = 0;
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub CreateBCTextCharsFromString (s As Strin";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="If RTLAware Then LoadArabicData";
if (__ref._rtlaware /*boolean*/ ) { 
__ref._loadarabicdata /*String*/ (null);};
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Dim b() As Byte = s.GetBytes(Charset)";
_b = _s.getBytes(__ref._charset /*String*/ );
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="Dim chars(b.Length / 4) As String";
_chars = new String[(int) (_b.length/(double)4)];
java.util.Arrays.fill(_chars,"");
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="Dim i, bi As Int = 0";
_i = 0;
_bi = (int) (0);
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="Dim ShouldAddToPrevChar As Boolean";
_shouldaddtoprevchar = false;
RDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="Dim ThereAreVowels As Boolean = VowelsCodePoints.";
_therearevowels = __ref._vowelscodepoints /*b4a.B4APagesNavBar.b4xset*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=18612231;
 //BA.debugLineNum = 18612231;BA.debugLine="Do While bi <= chars.Length - 1";
while (_bi<=_chars.length-1) {
RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="chars(i) = BytesToString(b, bi * 4, 4, Charset)";
_chars[_i] = __c.BytesToString(_b,(int) (_bi*4),(int) (4),__ref._charset /*String*/ );
RDebugUtils.currentLine=18612233;
 //BA.debugLineNum = 18612233;BA.debugLine="If LookForComplexCharacters Then";
if (__ref._lookforcomplexcharacters /*boolean*/ ) { 
RDebugUtils.currentLine=18612234;
 //BA.debugLineNum = 18612234;BA.debugLine="Dim cp As Int = BytesToInt(b, bi * 4)";
_cp = __ref._bytestoint /*int*/ (null,_b,(int) (_bi*4));
RDebugUtils.currentLine=18612235;
 //BA.debugLineNum = 18612235;BA.debugLine="If i > 0 And (cp = 0x200d Or (cp >= 0xFE00 And";
if (_i>0 && (_cp==((int)0x200d) || (_cp>=((int)0xfe00) && _cp<=((int)0xfe0f)))) { 
RDebugUtils.currentLine=18612236;
 //BA.debugLineNum = 18612236;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=18612237;
 //BA.debugLineNum = 18612237;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=18612238;
 //BA.debugLineNum = 18612238;BA.debugLine="ShouldAddToPrevChar = True";
_shouldaddtoprevchar = __c.True;
 }else 
{RDebugUtils.currentLine=18612239;
 //BA.debugLineNum = 18612239;BA.debugLine="Else If i > 0 And (cp >= 0x1F3FB And cp <= 0x1F";
if (_i>0 && (_cp>=((int)0x1f3fb) && _cp<=((int)0x1f3ff))) { 
RDebugUtils.currentLine=18612240;
 //BA.debugLineNum = 18612240;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=18612241;
 //BA.debugLineNum = 18612241;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=18612242;
 //BA.debugLineNum = 18612242;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=18612243;
 //BA.debugLineNum = 18612243;BA.debugLine="Else If i > 0 And (ThereAreVowels And VowelsCod";
if (_i>0 && (_therearevowels && __ref._vowelscodepoints /*b4a.B4APagesNavBar.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp)))) { 
RDebugUtils.currentLine=18612244;
 //BA.debugLineNum = 18612244;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=18612245;
 //BA.debugLineNum = 18612245;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=18612246;
 //BA.debugLineNum = 18612246;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=18612247;
 //BA.debugLineNum = 18612247;BA.debugLine="Else If RTLAware And i > 0 And chars(i - 1) = \"";
if (__ref._rtlaware /*boolean*/  && _i>0 && (_chars[(int) (_i-1)]).equals("ل") && (_cp==((int)0x622) || _cp==((int)0x623) || _cp==((int)0x625) || _cp==((int)0x627))) { 
RDebugUtils.currentLine=18612248;
 //BA.debugLineNum = 18612248;BA.debugLine="Select cp";
switch (_cp) {
case 0x622: {
RDebugUtils.currentLine=18612250;
 //BA.debugLineNum = 18612250;BA.debugLine="chars(i - 1) = Chr(0xFEF5)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef5)));
 break; }
case 0x623: {
RDebugUtils.currentLine=18612252;
 //BA.debugLineNum = 18612252;BA.debugLine="chars(i - 1) = Chr(0xFEF7)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef7)));
 break; }
case 0x625: {
RDebugUtils.currentLine=18612254;
 //BA.debugLineNum = 18612254;BA.debugLine="chars(i - 1) = Chr(0xFEF9)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef9)));
 break; }
case 0x627: {
RDebugUtils.currentLine=18612256;
 //BA.debugLineNum = 18612256;BA.debugLine="chars(i - 1) = Chr(0xFEFB)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfefb)));
 break; }
}
;
RDebugUtils.currentLine=18612258;
 //BA.debugLineNum = 18612258;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=18612259;
 //BA.debugLineNum = 18612259;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=18612260;
 //BA.debugLineNum = 18612260;BA.debugLine="Else If i > 0 And ShouldAddToPrevChar Then";
if (_i>0 && _shouldaddtoprevchar) { 
RDebugUtils.currentLine=18612261;
 //BA.debugLineNum = 18612261;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=18612262;
 //BA.debugLineNum = 18612262;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=18612263;
 //BA.debugLineNum = 18612263;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else {
RDebugUtils.currentLine=18612265;
 //BA.debugLineNum = 18612265;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }}}}}
;
 };
RDebugUtils.currentLine=18612268;
 //BA.debugLineNum = 18612268;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
RDebugUtils.currentLine=18612269;
 //BA.debugLineNum = 18612269;BA.debugLine="bi = bi + 1";
_bi = (int) (_bi+1);
 }
;
RDebugUtils.currentLine=18612271;
 //BA.debugLineNum = 18612271;BA.debugLine="If RTLAware Then";
if (__ref._rtlaware /*boolean*/ ) { 
RDebugUtils.currentLine=18612272;
 //BA.debugLineNum = 18612272;BA.debugLine="PreprocessArabic(chars, i)";
__ref._preprocessarabic /*String*/ (null,_chars,_i);
 };
RDebugUtils.currentLine=18612274;
 //BA.debugLineNum = 18612274;BA.debugLine="Return CreateBCTextChars(chars, 0, i)";
if (true) return __ref._createbctextchars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,_chars,(int) (0),_i);
RDebugUtils.currentLine=18612275;
 //BA.debugLineNum = 18612275;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bctextrun  _createconnectedparent(b4a.B4APagesNavBar.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createconnectedparent", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextrun) Debug.delegate(ba, "createconnectedparent", null));}
b4a.B4APagesNavBar.bctextengine._bcconnectedruns _connected = null;
b4a.B4APagesNavBar.bctextengine._bctextrun _parent = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub CreateConnectedParent As BCTextRun";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim connected As BCConnectedRuns";
_connected = new b4a.B4APagesNavBar.bctextengine._bcconnectedruns();
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="connected.Initialize";
_connected.Initialize();
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="connected.Runs.Initialize";
_connected.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="Dim parent As BCTextRun = CreateRun(\"\")";
_parent = __ref._createrun /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ (null,"");
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="parent.Extra.Initialize";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="parent.Extra.Put(EXTRA_CONNECTEDRUNS, connected)";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._extra_connectedruns /*String*/ ),(Object)(_connected));
RDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="Return parent";
if (true) return _parent;
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bcfontmetrics  _getfontmetrics(b4a.B4APagesNavBar.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfontmetrics", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcfontmetrics) Debug.delegate(ba, "getfontmetrics", new Object[] {_fnt,_clr}));}
String _key = "";
b4a.B4APagesNavBar.bctextengine._bcfontmetrics _fm = null;
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub GetFontMetrics(Fnt As B4XFont, clr As I";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Dim key As String = FontToKey(Fnt, clr)";
_key = __ref._fonttokey /*String*/ (null,_fnt,_clr);
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="If FontMetricsCache.ContainsKey(key) Then Return";
if (__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))) { 
if (true) return (b4a.B4APagesNavBar.bctextengine._bcfontmetrics)(__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));};
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Dim fm As BCFontMetrics";
_fm = new b4a.B4APagesNavBar.bctextengine._bcfontmetrics();
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="fm.Initialize";
_fm.Initialize();
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="fm.Glyphs.Initialize";
_fm.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="fm.Clr = clr";
_fm.Clr /*int*/  = _clr;
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="fm.Fnt = Fnt";
_fm.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _fnt;
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="If clr = DefaultColor Then";
if (_clr==__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="fm.KerningTable.Initialize";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=17694730;
 //BA.debugLineNum = 17694730;BA.debugLine="fm.DefaultColorMetrics = fm";
_fm.DefaultColorMetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/  = _fm;
RDebugUtils.currentLine=17694731;
 //BA.debugLineNum = 17694731;BA.debugLine="fm.xWidth = CreateGlyph(\"x\", fm, False).Width";
_fm.xWidth /*int*/  = __ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,"x",_fm,__c.False).Width /*int*/ ;
 }else {
RDebugUtils.currentLine=17694733;
 //BA.debugLineNum = 17694733;BA.debugLine="fm.DefaultColorMetrics = GetFontMetrics(Fnt, Def";
_fm.DefaultColorMetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/  = __ref._getfontmetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ (null,_fnt,__ref._defaultcolor /*int*/ );
RDebugUtils.currentLine=17694734;
 //BA.debugLineNum = 17694734;BA.debugLine="fm.xWidth = fm.DefaultColorMetrics.xWidth";
_fm.xWidth /*int*/  = _fm.DefaultColorMetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ .xWidth /*int*/ ;
RDebugUtils.currentLine=17694735;
 //BA.debugLineNum = 17694735;BA.debugLine="fm.KerningTable = fm.DefaultColorMetrics.Kerning";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/  = _fm.DefaultColorMetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ .KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=17694737;
 //BA.debugLineNum = 17694737;BA.debugLine="FontMetricsCache.Put(key, fm)";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_fm));
RDebugUtils.currentLine=17694738;
 //BA.debugLineNum = 17694738;BA.debugLine="Return fm";
if (true) return _fm;
RDebugUtils.currentLine=17694739;
 //BA.debugLineNum = 17694739;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bctextrun  _createrun(b4a.B4APagesNavBar.bctextengine __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createrun", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextrun) Debug.delegate(ba, "createrun", new Object[] {_text}));}
b4a.B4APagesNavBar.bctextengine._bctextrun _r = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub CreateRun (Text As String) As BCTextRun";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim r As BCTextRun";
_r = new b4a.B4APagesNavBar.bctextengine._bctextrun();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="r.Initialize";
_r.Initialize();
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="r.BackgroundColor = 0";
_r.BackgroundColor /*int*/  = (int) (0);
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="r.CharacterSpacingFactor = 1";
_r.CharacterSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="r.TextFont = DefaultFont";
_r.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="r.TextChars = CreateBCTextCharsFromString(Text)";
_r.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,_text);
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="r.Text = Text";
_r.Text /*String*/  = _text;
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="r.TextColor = DefaultColor";
_r.TextColor /*int*/  = __ref._defaultcolor /*int*/ ;
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bctextchars  _createbctextchars(b4a.B4APagesNavBar.bctextengine __ref,String[] _buffer,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextchars", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextchars) Debug.delegate(ba, "createbctextchars", new Object[] {_buffer,_startindex,_length}));}
b4a.B4APagesNavBar.bctextengine._bctextchars _t1 = null;
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub CreateBCTextChars (Buffer() As String,";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Dim t1 As BCTextChars";
_t1 = new b4a.B4APagesNavBar.bctextengine._bctextchars();
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="t1.Buffer = Buffer";
_t1.Buffer /*String[]*/  = _buffer;
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="t1.StartIndex = StartIndex";
_t1.StartIndex /*int*/  = _startindex;
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="t1.Length = Length";
_t1.Length /*int*/  = _length;
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bcsinglestylesection  _findsinglestylesection(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _paragraph,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findsinglestylesection", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcsinglestylesection) Debug.delegate(ba, "findsinglestylesection", new Object[] {_paragraph,_x,_y}));}
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _s = null;
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub FindSingleStyleSection (Paragraph As BC";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="x = x * mScale";
_x = (int) (_x*__ref._mscale /*float*/ );
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="y = y * mScale";
_y = (int) (_y*__ref._mscale /*float*/ );
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group3 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="If line.BaseLineY - line.MaxHeightAboveBaseLine";
if (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y) { 
RDebugUtils.currentLine=17498118;
 //BA.debugLineNum = 17498118;BA.debugLine="For Each un As BCUnbreakableText In line.Unbrea";
{
final anywheresoftware.b4a.BA.IterableList group5 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group5.Get(index5));
RDebugUtils.currentLine=17498119;
 //BA.debugLineNum = 17498119;BA.debugLine="If (Paragraph.Style.RTL = False And line.Start";
if ((_paragraph.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ==__c.False && _line.StartX /*int*/ +_un.StartX /*int*/ <=_x && _line.StartX /*int*/ +_un.StartX /*int*/ +_un.Width /*int*/ >=_x) || (_paragraph.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y)) { 
RDebugUtils.currentLine=17498121;
 //BA.debugLineNum = 17498121;BA.debugLine="For Each s As BCSingleStyleSection In un.Sing";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_s = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=17498122;
 //BA.debugLineNum = 17498122;BA.debugLine="If s.AbsoluteStartX <= x And s.AbsoluteStart";
if (_s.AbsoluteStartX /*int*/ <=_x && _s.AbsoluteStartX /*int*/ +_s.Width /*int*/ >=_x) { 
if (true) return _s;};
 }
};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=17498128;
 //BA.debugLineNum = 17498128;BA.debugLine="Return Null";
if (true) return (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(__c.Null);
RDebugUtils.currentLine=17498129;
 //BA.debugLineNum = 17498129;BA.debugLine="End Sub";
return null;
}
public String  _drawsingleline(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.B4APagesNavBar.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsingleline", true))
	 {return ((String) Debug.delegate(ba, "drawsingleline", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub DrawSingleLine (line As BCTextLine, iv";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(xui.Color_Tra";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="ForegroundBC.SetBitmapToImageView(ForegroundBC.B";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._getbitmap().Crop((int) (0),(int) (0),(int) (_r.getWidth()),(int) (_r.getHeight())),_iv);
 };
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bcparagraphstyle  _createstyle(b4a.B4APagesNavBar.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcparagraphstyle) Debug.delegate(ba, "createstyle", null));}
b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _s = null;
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub CreateStyle As BCParagraphStyle";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim s As BCParagraphStyle";
_s = new b4a.B4APagesNavBar.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="s.Initialize";
_s.Initialize();
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="s.LineSpacingFactor = 1";
_s.LineSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="s.HorizontalAlignment = \"Left\"";
_s.HorizontalAlignment /*String*/  = "Left";
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="s.MaxWidth = 300dip";
_s.MaxWidth /*int*/  = __c.DipToCurrent((int) (300));
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="s.Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_s.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="s.WordWrap = True";
_s.WordWrap /*boolean*/  = __c.True;
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bcparagraph  _prepareforlazydrawing(b4a.B4APagesNavBar.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepareforlazydrawing", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcparagraph) Debug.delegate(ba, "prepareforlazydrawing", new Object[] {_runs,_style,_sv}));}
b4a.B4APagesNavBar.bctextengine._bcparagraph _par = null;
int _maxheight = 0;
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub PrepareForLazyDrawing (Runs As List, St";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2dip";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()+_par.Height /*int*/ /(double)__ref._mscale /*float*/ )));
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="Dim MaxHeight As Int";
_maxheight = 0;
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="MaxHeight = Max(MaxHeight, line.MaxHeightAboveBa";
_maxheight = (int) (__c.Max(_maxheight,_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
RDebugUtils.currentLine=15466503;
 //BA.debugLineNum = 15466503;BA.debugLine="ResizeLayers(par.Width, MaxHeight)";
__ref._resizelayers /*String*/ (null,_par.Width /*int*/ ,_maxheight);
RDebugUtils.currentLine=15466504;
 //BA.debugLineNum = 15466504;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=15466506;
 //BA.debugLineNum = 15466506;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bcparagraph  _drawtext(b4a.B4APagesNavBar.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawtext", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcparagraph) Debug.delegate(ba, "drawtext", new Object[] {_runs,_style,_foregroundimageview,_sv}));}
b4a.B4APagesNavBar.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub DrawText (Runs As List, Style As BCPara";
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="ResizeLayers(par.Width, par.Height)";
__ref._resizelayers /*String*/ (null,_par.Width /*int*/ ,_par.Height /*int*/ );
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="DrawParagraph(par)";
__ref._drawparagraph /*String*/ (null,_par);
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="If par.Width > 0 And par.Height > 0 Then";
if (_par.Width /*int*/ >0 && _par.Height /*int*/ >0) { 
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="ResizeImageView(ForegroundBC, par, ForegroundIma";
__ref._resizeimageview /*String*/ (null,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ,_par,_foregroundimageview,_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/ );
 };
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="If par.Style.ResizeHeightAutomatically And sv.IsI";
if (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  && _sv.IsInitialized()) { 
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2di";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_foregroundimageview.getHeight()+_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom())));
 };
RDebugUtils.currentLine=15532044;
 //BA.debugLineNum = 15532044;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="End Sub";
return null;
}
public String  _addltritems(b4a.B4APagesNavBar.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _ltrlist,anywheresoftware.b4a.objects.collections.List _newlist) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addltritems", true))
	 {return ((String) Debug.delegate(ba, "addltritems", new Object[] {_ltrlist,_newlist}));}
int _startindex = 0;
int _lastindex = 0;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _lastun = null;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _prev = null;
int _i = 0;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub AddLTRItems (LTRList As List, NewList";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="If LTRList.Size = 0 Then Return";
if (_ltrlist.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="NewList.AddAll(LTRList)";
_newlist.AddAll(_ltrlist);
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="If LTRList.Size > 1 Then";
if (_ltrlist.getSize()>1) { 
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Dim StartIndex As Int = 1";
_startindex = (int) (1);
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="If IsUNSeparator(LTRList.Get(0)) Then";
if (__ref._isunseparator /*boolean*/ (null,(b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (0))))) { 
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="StartIndex = 2";
_startindex = (int) (2);
 };
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="Dim LastIndex As Int = LTRList.Size - 1";
_lastindex = (int) (_ltrlist.getSize()-1);
RDebugUtils.currentLine=15859721;
 //BA.debugLineNum = 15859721;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=15859722;
 //BA.debugLineNum = 15859722;BA.debugLine="If IsUNSeparator(LTRList.Get(LastIndex)) Then";
if (__ref._isunseparator /*boolean*/ (null,(b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex)))) { 
RDebugUtils.currentLine=15859723;
 //BA.debugLineNum = 15859723;BA.debugLine="LastIndex = LastIndex - 1";
_lastindex = (int) (_lastindex-1);
 };
 };
RDebugUtils.currentLine=15859726;
 //BA.debugLineNum = 15859726;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=15859727;
 //BA.debugLineNum = 15859727;BA.debugLine="Dim lastun As BCUnbreakableText = LTRList.Get(L";
_lastun = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex));
RDebugUtils.currentLine=15859728;
 //BA.debugLineNum = 15859728;BA.debugLine="Dim prev As BCUnbreakableText = LTRList.Get(Sta";
_prev = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (_startindex-1)));
RDebugUtils.currentLine=15859729;
 //BA.debugLineNum = 15859729;BA.debugLine="prev.StartX = lastun.StartX";
_prev.StartX /*int*/  = _lastun.StartX /*int*/ ;
RDebugUtils.currentLine=15859730;
 //BA.debugLineNum = 15859730;BA.debugLine="For i = StartIndex To LastIndex";
{
final int step18 = 1;
final int limit18 = _lastindex;
_i = _startindex ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=15859731;
 //BA.debugLineNum = 15859731;BA.debugLine="Dim un As BCUnbreakableText = LTRList.Get(i)";
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_ltrlist.Get(_i));
RDebugUtils.currentLine=15859732;
 //BA.debugLineNum = 15859732;BA.debugLine="un.StartX = prev.StartX + prev.Width + mSpaceB";
_un.StartX /*int*/  = (int) (_prev.StartX /*int*/ +_prev.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=15859733;
 //BA.debugLineNum = 15859733;BA.debugLine="prev = un";
_prev = _un;
 }
};
 };
 };
RDebugUtils.currentLine=15859737;
 //BA.debugLineNum = 15859737;BA.debugLine="LTRList.Clear";
_ltrlist.Clear();
RDebugUtils.currentLine=15859738;
 //BA.debugLineNum = 15859738;BA.debugLine="End Sub";
return "";
}
public boolean  _isunseparator(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isunseparator", true))
	 {return ((Boolean) Debug.delegate(ba, "isunseparator", new Object[] {_un}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Private Sub IsUNSeparator (un As BCUnbreakableText";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="If un.NotFullTextChars.Length = 0 Then Return Fal";
if (_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Return WordBoundaries.Contains(un.NotFullTextChar";
if (true) return __ref._wordboundaries /*String*/ .contains(_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .StartIndex /*int*/ ]);
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="End Sub";
return false;
}
public String  _addparagraphviews(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addparagraphviews", true))
	 {return ((String) Debug.delegate(ba, "addparagraphviews", new Object[] {_par}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub AddParagraphViews (par As BCParagraph)";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="If par.Views.IsInitialized Then";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="For Each v As B4XView In par.Views";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _par.Views /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="v.SetLayoutAnimated(0, par.Style.Padding.Left +";
_v.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()+_v.getLeft()),(int) (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_v.getTop()),_v.getWidth(),_v.getHeight());
 }
};
 };
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="End Sub";
return "";
}
public int  _bytestoint(b4a.B4APagesNavBar.bctextengine __ref,byte[] _bytes,int _startindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "bytestoint", true))
	 {return ((Integer) Debug.delegate(ba, "bytestoint", new Object[] {_bytes,_startindex}));}
int _cp = 0;
int _i = 0;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub BytesToInt (Bytes() As Byte, StartInde";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Dim cp As Int";
_cp = 0;
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="cp = Bit.Or(cp, Bit.ShiftLeft(Bit.And(0xff, Byte";
_cp = __c.Bit.Or(_cp,__c.Bit.ShiftLeft(__c.Bit.And(((int)0xff),(int) (_bytes[(int) (_i+_startindex)])),(int) (8*_i)));
 }
};
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="Return cp";
if (true) return _cp;
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.B4APagesNavBar.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Public cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Type BCFontMetrics (Glyphs As Map, DefaultColorMe";
;
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="Type BCTextChars (Buffer() As String, StartIndex";
;
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="Type BCParagraphStyle (HorizontalAlignment As Str";
;
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="Type BCTextRun (TextFont As B4XFont, TextColor As";
;
RDebugUtils.currentLine=15007756;
 //BA.debugLineNum = 15007756;BA.debugLine="Type BCConnectedRuns (ConnectedWidth As Int, Runs";
;
RDebugUtils.currentLine=15007757;
 //BA.debugLineNum = 15007757;BA.debugLine="Type BCStyledUnderline (Clr As Int, Style As Stri";
;
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="Public const EXTRA_CONNECTEDRUNS = \"ConnectedRuns";
_extra_connectedruns = "ConnectedRuns";
_extra_styledunderline = "StyledUnderline";
RDebugUtils.currentLine=15007761;
 //BA.debugLineNum = 15007761;BA.debugLine="Type BCParagraph (TextLines As List, CurrentLine";
;
RDebugUtils.currentLine=15007764;
 //BA.debugLineNum = 15007764;BA.debugLine="Type BCTextLine (StartX As Int, BaselineY As Int,";
;
RDebugUtils.currentLine=15007766;
 //BA.debugLineNum = 15007766;BA.debugLine="Type BCUnbreakableText (Width As Int, StartX As I";
;
RDebugUtils.currentLine=15007768;
 //BA.debugLineNum = 15007768;BA.debugLine="Type BCSingleStyleSection (AbsoluteStartX As Int,";
;
RDebugUtils.currentLine=15007770;
 //BA.debugLineNum = 15007770;BA.debugLine="Type BCGlyphAndOffset (Glyph As BCGlyph, SpaceBet";
;
RDebugUtils.currentLine=15007771;
 //BA.debugLineNum = 15007771;BA.debugLine="Type BCGlyph (cbc As CompressedBC, baseline As In";
;
RDebugUtils.currentLine=15007772;
 //BA.debugLineNum = 15007772;BA.debugLine="Private CharBC As BitmapCreator";
_charbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=15007773;
 //BA.debugLineNum = 15007773;BA.debugLine="Private cbccache As InternalCompressedBCCache";
_cbccache = new b4a.example.bitmapcreator._internalcompressedbccache();
RDebugUtils.currentLine=15007774;
 //BA.debugLineNum = 15007774;BA.debugLine="Public DefaultUnderlineStyle As BCStyledUnderline";
_defaultunderlinestyle = new b4a.B4APagesNavBar.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=15007775;
 //BA.debugLineNum = 15007775;BA.debugLine="Public mScale As Float = 1";
_mscale = (float) (1);
RDebugUtils.currentLine=15007776;
 //BA.debugLineNum = 15007776;BA.debugLine="Private mSpaceBetweenCharacters As Float";
_mspacebetweencharacters = 0f;
RDebugUtils.currentLine=15007777;
 //BA.debugLineNum = 15007777;BA.debugLine="Private mSpaceBetweenLines As Int";
_mspacebetweenlines = 0;
RDebugUtils.currentLine=15007778;
 //BA.debugLineNum = 15007778;BA.debugLine="Private FontMetricsCache As Map";
_fontmetricscache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007779;
 //BA.debugLineNum = 15007779;BA.debugLine="Private ForegroundBC, BackgroundBC As BitmapCreat";
_foregroundbc = new b4a.example.bitmapcreator();
_backgroundbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=15007780;
 //BA.debugLineNum = 15007780;BA.debugLine="Public DefaultColor As Int = xui.Color_Black";
_defaultcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=15007781;
 //BA.debugLineNum = 15007781;BA.debugLine="Public WordBoundaries As String = \"&*+-/.<>=\\' ,:";
_wordboundaries = "&*+-/.<>=\\' ,:{}"+__c.TAB+__c.CRLF+BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=15007782;
 //BA.debugLineNum = 15007782;BA.debugLine="Public WordBoundariesThatCanConnectToPrevWord As";
_wordboundariesthatcanconnecttoprevword = ".,:";
RDebugUtils.currentLine=15007783;
 //BA.debugLineNum = 15007783;BA.debugLine="Private Brushes As Map";
_brushes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007784;
 //BA.debugLineNum = 15007784;BA.debugLine="Public DefaultStyle As BCParagraphStyle";
_defaultstyle = new b4a.B4APagesNavBar.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=15007785;
 //BA.debugLineNum = 15007785;BA.debugLine="Public DefaultFont As B4XFont";
_defaultfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=15007786;
 //BA.debugLineNum = 15007786;BA.debugLine="Private mMinGapBetweenLines As Int = 5dip";
_mmingapbetweenlines = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=15007788;
 //BA.debugLineNum = 15007788;BA.debugLine="Private stubForContext As Panel 'ignore";
_stubforcontext = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15007793;
 //BA.debugLineNum = 15007793;BA.debugLine="Private const TabWidthMeasuredInX As Int = 4";
_tabwidthmeasuredinx = (int) (4);
RDebugUtils.currentLine=15007794;
 //BA.debugLineNum = 15007794;BA.debugLine="Public TagParser As BBCodeParser";
_tagparser = new b4a.B4APagesNavBar.bbcodeparser();
RDebugUtils.currentLine=15007795;
 //BA.debugLineNum = 15007795;BA.debugLine="Private EmptyTextChars As BCTextChars";
_emptytextchars = new b4a.B4APagesNavBar.bctextengine._bctextchars();
RDebugUtils.currentLine=15007796;
 //BA.debugLineNum = 15007796;BA.debugLine="Private Emojis As B4XSet";
_emojis = new b4a.B4APagesNavBar.b4xset();
RDebugUtils.currentLine=15007797;
 //BA.debugLineNum = 15007797;BA.debugLine="Public const Charset As String = \"UTF-32LE\"";
_charset = "UTF-32LE";
RDebugUtils.currentLine=15007798;
 //BA.debugLineNum = 15007798;BA.debugLine="Public LookForComplexCharacters As Boolean = True";
_lookforcomplexcharacters = __c.True;
RDebugUtils.currentLine=15007799;
 //BA.debugLineNum = 15007799;BA.debugLine="Public CustomFonts As Map";
_customfonts = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007800;
 //BA.debugLineNum = 15007800;BA.debugLine="Public KerningEnabled As Boolean = True";
_kerningenabled = __c.True;
RDebugUtils.currentLine=15007801;
 //BA.debugLineNum = 15007801;BA.debugLine="Private IndentWidth As Int";
_indentwidth = 0;
RDebugUtils.currentLine=15007802;
 //BA.debugLineNum = 15007802;BA.debugLine="Public VowelsCodePoints As B4XSet";
_vowelscodepoints = new b4a.B4APagesNavBar.b4xset();
RDebugUtils.currentLine=15007803;
 //BA.debugLineNum = 15007803;BA.debugLine="Private AsyncBCs As B4XOrderedMap";
_asyncbcs = new b4a.B4APagesNavBar.b4xorderedmap();
RDebugUtils.currentLine=15007804;
 //BA.debugLineNum = 15007804;BA.debugLine="Private AsyncBC As BitmapCreator";
_asyncbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=15007805;
 //BA.debugLineNum = 15007805;BA.debugLine="Private AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15007806;
 //BA.debugLineNum = 15007806;BA.debugLine="Private AsyncMode As Boolean";
_asyncmode = false;
RDebugUtils.currentLine=15007807;
 //BA.debugLineNum = 15007807;BA.debugLine="Private RTLChars As B4XSet";
_rtlchars = new b4a.B4APagesNavBar.b4xset();
RDebugUtils.currentLine=15007808;
 //BA.debugLineNum = 15007808;BA.debugLine="Public Const TextDirectionLTR = 1, TextDirectionU";
_textdirectionltr = (int) (1);
_textdirectionunknown = (int) (0);
_textdirectionrtl = (int) (-1);
RDebugUtils.currentLine=15007809;
 //BA.debugLineNum = 15007809;BA.debugLine="Private ArabicMap As Map";
_arabicmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007810;
 //BA.debugLineNum = 15007810;BA.debugLine="Private ArabicNonLinkedLetters As B4XSet";
_arabicnonlinkedletters = new b4a.B4APagesNavBar.b4xset();
RDebugUtils.currentLine=15007811;
 //BA.debugLineNum = 15007811;BA.debugLine="Private ArabicCharsConnectedPrev As B4XSet";
_arabiccharsconnectedprev = new b4a.B4APagesNavBar.b4xset();
RDebugUtils.currentLine=15007812;
 //BA.debugLineNum = 15007812;BA.debugLine="Private PMDefaultColor As PremultipliedColor";
_pmdefaultcolor = new b4a.example.bitmapcreator._premultipliedcolor();
RDebugUtils.currentLine=15007813;
 //BA.debugLineNum = 15007813;BA.debugLine="Public RTLAware As Boolean";
_rtlaware = false;
RDebugUtils.currentLine=15007814;
 //BA.debugLineNum = 15007814;BA.debugLine="End Sub";
return "";
}
public String  _loadarabicdata(b4a.B4APagesNavBar.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loadarabicdata", true))
	 {return ((String) Debug.delegate(ba, "loadarabicdata", null));}
b4a.example.bitmapcreator._argbcolor _a = null;
String _line = "";
String[] _split = null;
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Private Sub LoadArabicData";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="If ArabicMap.IsInitialized = False Then";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="ArabicMap.Initialize";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="ArabicNonLinkedLetters.Initialize";
__ref._arabicnonlinkedletters /*b4a.B4APagesNavBar.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="ArabicCharsConnectedPrev.Initialize";
__ref._arabiccharsconnectedprev /*b4a.B4APagesNavBar.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="Dim a As ARGBColor";
_a = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="CharBC.ColorToARGB(DefaultColor, a)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._defaultcolor /*int*/ ,_a);
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="CharBC.ARGBToPremultipliedColor(a, PMDefaultColo";
__ref._charbc /*b4a.example.bitmapcreator*/ ._argbtopremultipliedcolor(_a,__ref._pmdefaultcolor /*b4a.example.bitmapcreator._premultipliedcolor*/ );
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="For Each line As String In File.ReadList(File.Di";
{
final anywheresoftware.b4a.BA.IterableList group8 = __c.File.ReadList(__c.File.getDirAssets(),"arabic_mapping.txt");
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_line = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="Dim split() As String = Regex.Split(\",\", line)";
_split = __c.Regex.Split(",",_line);
RDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="If split.Length = 2 And split(1) = \"0\" Then";
if (_split.length==2 && (_split[(int) (1)]).equals("0")) { 
RDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="VowelsCodePoints.Add(Bit.ParseInt(split(0), 16";
__ref._vowelscodepoints /*b4a.B4APagesNavBar.b4xset*/ ._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_split[(int) (0)],(int) (16))));
 }else {
RDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="ArabicMap.Put(Chr(Bit.ParseInt(split(0), 16)).";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))),(Object)(__c.Bit.ParseInt(_split[(int) (1)],(int) (16))));
RDebugUtils.currentLine=18874382;
 //BA.debugLineNum = 18874382;BA.debugLine="If 2 = split(2) Then";
if (2==(double)(Double.parseDouble(_split[(int) (2)]))) { 
RDebugUtils.currentLine=18874383;
 //BA.debugLineNum = 18874383;BA.debugLine="ArabicNonLinkedLetters.Add(Chr(Bit.ParseInt(s";
__ref._arabicnonlinkedletters /*b4a.B4APagesNavBar.b4xset*/ ._add /*String*/ (null,(Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))));
 };
 };
 }
};
 };
RDebugUtils.currentLine=18874388;
 //BA.debugLineNum = 18874388;BA.debugLine="End Sub";
return "";
}
public String  _preprocessarabic(b4a.B4APagesNavBar.bctextengine __ref,String[] _chars,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "preprocessarabic", true))
	 {return ((String) Debug.delegate(ba, "preprocessarabic", new Object[] {_chars,_length}));}
b4a.B4APagesNavBar.b4xbitset _arabicchars = null;
b4a.B4APagesNavBar.b4xbitset _arabicnonlinked = null;
String[] _fullchars = null;
boolean _found = false;
int _i = 0;
boolean _connecttoprev = false;
boolean _connecttonext = false;
int _offset = 0;
int _targetcp = 0;
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub PreprocessArabic(chars() As String, Len";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="LoadArabicData";
__ref._loadarabicdata /*String*/ (null);
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Dim ArabicChars, ArabicNonLinked As B4XBitSet";
_arabicchars = new b4a.B4APagesNavBar.b4xbitset();
_arabicnonlinked = new b4a.B4APagesNavBar.b4xbitset();
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="Dim FullChars(Length) As String";
_fullchars = new String[_length];
java.util.Arrays.fill(_fullchars,"");
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="Dim Found As Boolean";
_found = false;
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="For i = 0 To Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="If ArabicMap.ContainsKey(chars(i).CharAt(0).As(S";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)((BA.ObjectToString(_chars[_i].charAt((int) (0))))))) { 
RDebugUtils.currentLine=18939911;
 //BA.debugLineNum = 18939911;BA.debugLine="If chars(i).Length > 1 Then";
if (_chars[_i].length()>1) { 
RDebugUtils.currentLine=18939912;
 //BA.debugLineNum = 18939912;BA.debugLine="FullChars(i) = chars(i).SubString(1)";
_fullchars[_i] = _chars[_i].substring((int) (1));
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="chars(i) = chars(i).CharAt(0).As(String)";
_chars[_i] = (BA.ObjectToString(_chars[_i].charAt((int) (0))));
 };
RDebugUtils.currentLine=18939915;
 //BA.debugLineNum = 18939915;BA.debugLine="If Found = False Then";
if (_found==__c.False) { 
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="Found = True";
_found = __c.True;
RDebugUtils.currentLine=18939917;
 //BA.debugLineNum = 18939917;BA.debugLine="ArabicChars.Initialize(Length)";
_arabicchars._initialize /*String*/ (null,ba,_length);
RDebugUtils.currentLine=18939918;
 //BA.debugLineNum = 18939918;BA.debugLine="ArabicNonLinked.Initialize(Length)";
_arabicnonlinked._initialize /*String*/ (null,ba,_length);
 };
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="ArabicChars.Set(i, True)";
_arabicchars._set /*String*/ (null,_i,__c.True);
RDebugUtils.currentLine=18939921;
 //BA.debugLineNum = 18939921;BA.debugLine="If ArabicNonLinkedLetters.Contains(chars(i)) Th";
if (__ref._arabicnonlinkedletters /*b4a.B4APagesNavBar.b4xset*/ ._contains /*boolean*/ (null,(Object)(_chars[_i]))) { 
RDebugUtils.currentLine=18939922;
 //BA.debugLineNum = 18939922;BA.debugLine="ArabicNonLinked.Set(i, True)";
_arabicnonlinked._set /*String*/ (null,_i,__c.True);
 };
 };
 }
};
RDebugUtils.currentLine=18939926;
 //BA.debugLineNum = 18939926;BA.debugLine="If Found = False Then Return";
if (_found==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=18939927;
 //BA.debugLineNum = 18939927;BA.debugLine="For i = 0 To Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=18939928;
 //BA.debugLineNum = 18939928;BA.debugLine="If ArabicChars.Get(i) Then";
if (_arabicchars._get /*boolean*/ (null,_i)) { 
RDebugUtils.currentLine=18939929;
 //BA.debugLineNum = 18939929;BA.debugLine="Dim ConnectToPrev As Boolean = i > 0 And Arabic";
_connecttoprev = _i>0 && _arabicchars._get /*boolean*/ (null,(int) (_i-1)) && _arabicnonlinked._get /*boolean*/ (null,(int) (_i-1))==__c.False;
RDebugUtils.currentLine=18939930;
 //BA.debugLineNum = 18939930;BA.debugLine="Dim ConnectToNext As Boolean = i < Length - 1 A";
_connecttonext = _i<_length-1 && _arabicchars._get /*boolean*/ (null,(int) (_i+1)) && _arabicnonlinked._get /*boolean*/ (null,_i)==__c.False;
RDebugUtils.currentLine=18939931;
 //BA.debugLineNum = 18939931;BA.debugLine="If ConnectToNext = False And ConnectToPrev = Fa";
if (_connecttonext==__c.False && _connecttoprev==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=18939932;
 //BA.debugLineNum = 18939932;BA.debugLine="Dim offset As Int = IIf(ConnectToPrev And Conne";
_offset = (int)(BA.ObjectToNumber(((_connecttoprev && _connecttonext) ? ((Object)(3)) : (((_connecttoprev) ? ((Object)(1)) : ((Object)(2)))))));
RDebugUtils.currentLine=18939933;
 //BA.debugLineNum = 18939933;BA.debugLine="Dim TargetCP As Int = ArabicMap.Get(chars(i))";
_targetcp = (int)(BA.ObjectToNumber(__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_chars[_i]))));
RDebugUtils.currentLine=18939934;
 //BA.debugLineNum = 18939934;BA.debugLine="If TargetCP = Asc(chars(i)) Then";
if (_targetcp==__c.Asc(BA.ObjectToChar(_chars[_i]))) { 
RDebugUtils.currentLine=18939935;
 //BA.debugLineNum = 18939935;BA.debugLine="offset = 0";
_offset = (int) (0);
 };
RDebugUtils.currentLine=18939937;
 //BA.debugLineNum = 18939937;BA.debugLine="TargetCP = TargetCP + offset";
_targetcp = (int) (_targetcp+_offset);
RDebugUtils.currentLine=18939938;
 //BA.debugLineNum = 18939938;BA.debugLine="chars(i) = Chr(TargetCP)";
_chars[_i] = BA.ObjectToString(__c.Chr(_targetcp));
RDebugUtils.currentLine=18939939;
 //BA.debugLineNum = 18939939;BA.debugLine="If FullChars(i).Length > 0 Then chars(i) = char";
if (_fullchars[_i].length()>0) { 
_chars[_i] = _chars[_i]+_fullchars[_i];};
RDebugUtils.currentLine=18939940;
 //BA.debugLineNum = 18939940;BA.debugLine="If ConnectToPrev Then ArabicCharsConnectedPrev.";
if (_connecttoprev) { 
__ref._arabiccharsconnectedprev /*b4a.B4APagesNavBar.b4xset*/ ._add /*String*/ (null,(Object)(_chars[_i]));};
 };
 }
};
RDebugUtils.currentLine=18939943;
 //BA.debugLineNum = 18939943;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bcglyph  _createglyph(b4a.B4APagesNavBar.bctextengine __ref,String _c,b4a.B4APagesNavBar.bctextengine._bcfontmetrics _fontmetrics,boolean _justmeasure) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyph", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcglyph) Debug.delegate(ba, "createglyph", new Object[] {_c,_fontmetrics,_justmeasure}));}
b4a.B4APagesNavBar.bctextengine._bcglyph _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _leftoffset = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2 = null;
b4a.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub CreateGlyph (c As String, FontMetrics";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Dim g As BCGlyph = FontMetrics.Glyphs.Get(c)";
_g = (b4a.B4APagesNavBar.bctextengine._bcglyph)(_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_c)));
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="If g <> Null Then Return g";
if (_g!= null) { 
if (true) return _g;};
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="If FontMetrics.clr <> DefaultColor Then";
if (_fontmetrics.Clr /*int*/ !=__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="Return CreateGlyphFromDefaultColor(c, FontMetric";
if (true) return __ref._createglyphfromdefaultcolor /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,_c,_fontmetrics.DefaultColorMetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ ,_fontmetrics.Clr /*int*/ );
 }else {
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(c, FontMetric";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_c,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="Dim BaseLine As Int = -r.Top + 5";
_baseline = (int) (-_r.getTop()+5);
RDebugUtils.currentLine=17760265;
 //BA.debugLineNum = 17760265;BA.debugLine="r.Left = r.Left * mScale";
_r.setLeft((float) (_r.getLeft()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=17760266;
 //BA.debugLineNum = 17760266;BA.debugLine="r.Top = r.Top * mScale";
_r.setTop((float) (_r.getTop()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=17760267;
 //BA.debugLineNum = 17760267;BA.debugLine="r.Right = r.Right * mScale";
_r.setRight((float) (_r.getRight()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=17760268;
 //BA.debugLineNum = 17760268;BA.debugLine="r.Bottom = r.Bottom * mScale";
_r.setBottom((float) (_r.getBottom()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=17760269;
 //BA.debugLineNum = 17760269;BA.debugLine="If CharBC.mWidth < r.Width + 20 * mScale Or Char";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._mwidth<_r.getWidth()+20*__ref._mscale /*float*/  || __ref._charbc /*b4a.example.bitmapcreator*/ ._mheight<_r.getHeight()+20*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=17760270;
 //BA.debugLineNum = 17760270;BA.debugLine="ResizeCharBC(r.Width + 30 * mScale, r.Height +";
__ref._resizecharbc /*String*/ (null,(int) (_r.getWidth()+30*__ref._mscale /*float*/ ),(int) (_r.getHeight()+30*__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=17760273;
 //BA.debugLineNum = 17760273;BA.debugLine="Dim leftOffset As Int = 5";
_leftoffset = (int) (5);
RDebugUtils.currentLine=17760274;
 //BA.debugLineNum = 17760274;BA.debugLine="cvs.DrawText(c, leftOffset, BaseLine, FontMetric";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_c,(float) (_leftoffset),(float) (_baseline),_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_fontmetrics.Clr /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=17760276;
 //BA.debugLineNum = 17760276;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .CreateBitmap();
RDebugUtils.currentLine=17760287;
 //BA.debugLineNum = 17760287;BA.debugLine="CharBC.CopyPixelsFromBitmap(bmp)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=17760288;
 //BA.debugLineNum = 17760288;BA.debugLine="Dim r2 As B4XRect = FindMinRect(leftOffset + r.R";
_r2 = __ref._findminrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,(int) (_leftoffset+_r.getRight()+20*__ref._mscale /*float*/ ),(int) (_r.getHeight()+20*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=17760290;
 //BA.debugLineNum = 17760290;BA.debugLine="Dim g As BCGlyph";
_g = new b4a.B4APagesNavBar.bctextengine._bcglyph();
RDebugUtils.currentLine=17760291;
 //BA.debugLineNum = 17760291;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=17760292;
 //BA.debugLineNum = 17760292;BA.debugLine="g.baseline = BaseLine * mScale - r2.Top";
_g.baseline /*int*/  = (int) (_baseline*__ref._mscale /*float*/ -_r2.getTop());
RDebugUtils.currentLine=17760293;
 //BA.debugLineNum = 17760293;BA.debugLine="If r2.Width > 0 Then";
if (_r2.getWidth()>0) { 
RDebugUtils.currentLine=17760294;
 //BA.debugLineNum = 17760294;BA.debugLine="r2.Left = Floor(r2.Left)";
_r2.setLeft((float) (__c.Floor(_r2.getLeft())));
RDebugUtils.currentLine=17760295;
 //BA.debugLineNum = 17760295;BA.debugLine="r2.Right = Ceil(r2.Right)";
_r2.setRight((float) (__c.Ceil(_r2.getRight())));
RDebugUtils.currentLine=17760296;
 //BA.debugLineNum = 17760296;BA.debugLine="If RTLAware Then RecolorEdgesOfConnectedCharact";
if (__ref._rtlaware /*boolean*/ ) { 
__ref._recoloredgesofconnectedcharacters /*String*/ (null,_c,_r2);};
RDebugUtils.currentLine=17760302;
 //BA.debugLineNum = 17760302;BA.debugLine="Dim cbc As CompressedBC = CharBC.ExtractCompres";
_cbc = __ref._charbc /*b4a.example.bitmapcreator*/ ._extractcompressedbc(_r2,__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=17760303;
 //BA.debugLineNum = 17760303;BA.debugLine="g.cbc = cbc";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/  = _cbc;
RDebugUtils.currentLine=17760304;
 //BA.debugLineNum = 17760304;BA.debugLine="g.width = cbc.mWidth";
_g.Width /*int*/  = _cbc.mWidth;
 }else {
RDebugUtils.currentLine=17760306;
 //BA.debugLineNum = 17760306;BA.debugLine="g.Empty = True";
_g.Empty /*boolean*/  = __c.True;
RDebugUtils.currentLine=17760307;
 //BA.debugLineNum = 17760307;BA.debugLine="If c = TAB Then";
if ((_c).equals(__c.TAB)) { 
RDebugUtils.currentLine=17760308;
 //BA.debugLineNum = 17760308;BA.debugLine="g.Width = FontMetrics.xWidth * TabWidthMeasure";
_g.Width /*int*/  = (int) (_fontmetrics.xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
 }else 
{RDebugUtils.currentLine=17760309;
 //BA.debugLineNum = 17760309;BA.debugLine="Else if c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=17760310;
 //BA.debugLineNum = 17760310;BA.debugLine="g.width = CreateGlyph(\"x x\", FontMetrics, True";
_g.Width /*int*/  = (int) (__ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,"x x",_fontmetrics,__c.True).Width /*int*/ -_fontmetrics.xWidth /*int*/ *2);
 }else 
{RDebugUtils.currentLine=17760311;
 //BA.debugLineNum = 17760311;BA.debugLine="Else If c = \"x\" Then";
if ((_c).equals("x")) { 
RDebugUtils.currentLine=17760312;
 //BA.debugLineNum = 17760312;BA.debugLine="g = CreateGlyph(\"X\", FontMetrics, True)";
_g = __ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,"X",_fontmetrics,__c.True);
 }else 
{RDebugUtils.currentLine=17760313;
 //BA.debugLineNum = 17760313;BA.debugLine="Else If c = \"x x\" Then";
if ((_c).equals("x x")) { 
RDebugUtils.currentLine=17760314;
 //BA.debugLineNum = 17760314;BA.debugLine="g = CreateGlyph(\"X X\", FontMetrics, True)";
_g = __ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,"X X",_fontmetrics,__c.True);
 }else {
RDebugUtils.currentLine=17760316;
 //BA.debugLineNum = 17760316;BA.debugLine="g.Width = CreateGlyph(\" \", FontMetrics, False)";
_g.Width /*int*/  = __ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null," ",_fontmetrics,__c.False).Width /*int*/ ;
 }}}}
;
 };
RDebugUtils.currentLine=17760319;
 //BA.debugLineNum = 17760319;BA.debugLine="If xui.IsB4J = False And MightBeAnEmoji(c) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False && __ref._mightbeanemoji /*boolean*/ (null,_c)) { 
RDebugUtils.currentLine=17760320;
 //BA.debugLineNum = 17760320;BA.debugLine="If Emojis.IsInitialized = False Then LoadData(E";
if (__ref._emojis /*b4a.B4APagesNavBar.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._loaddata /*String*/ (null,__ref._emojis /*b4a.B4APagesNavBar.b4xset*/ ,"emoji-data.txt");};
RDebugUtils.currentLine=17760321;
 //BA.debugLineNum = 17760321;BA.debugLine="g.Emoji = Emojis.Contains(BytesToInt(c.GetBytes";
_g.Emoji /*boolean*/  = __ref._emojis /*b4a.B4APagesNavBar.b4xset*/ ._contains /*boolean*/ (null,(Object)(__ref._bytestoint /*int*/ (null,_c.getBytes(__ref._charset /*String*/ ),(int) (0))));
 };
RDebugUtils.currentLine=17760323;
 //BA.debugLineNum = 17760323;BA.debugLine="If JustMeasure = False Then";
if (_justmeasure==__c.False) { 
RDebugUtils.currentLine=17760324;
 //BA.debugLineNum = 17760324;BA.debugLine="FontMetrics.Glyphs.Put(c, g)";
_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_c),(Object)(_g));
 };
RDebugUtils.currentLine=17760326;
 //BA.debugLineNum = 17760326;BA.debugLine="Return g";
if (true) return _g;
 };
RDebugUtils.currentLine=17760328;
 //BA.debugLineNum = 17760328;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bcglyph  _createglyphfromdefaultcolor(b4a.B4APagesNavBar.bctextengine __ref,String _c,b4a.B4APagesNavBar.bctextengine._bcfontmetrics _defaultcolormetrics,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyphfromdefaultcolor", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcglyph) Debug.delegate(ba, "createglyphfromdefaultcolor", new Object[] {_c,_defaultcolormetrics,_clr}));}
b4a.B4APagesNavBar.bctextengine._bcglyph _blackglyph = null;
b4a.B4APagesNavBar.bctextengine._bcglyph _g = null;
byte[] _buffer = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
int _ai = 0;
int _ri = 0;
int _gi = 0;
int _bi = 0;
int _i = 0;
int _a = 0;
float _af = 0f;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub CreateGlyphFromDefaultColor(c As Strin";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim BlackGlyph As BCGlyph = CreateGlyph(c, Defaul";
_blackglyph = __ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,_c,_defaultcolormetrics,__c.False);
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="If BlackGlyph.cbc.IsInitialized = False Or BlackG";
if (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized==__c.False || _blackglyph.Emoji /*boolean*/ ) { 
if (true) return _blackglyph;};
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="Dim g As BCGlyph";
_g = new b4a.B4APagesNavBar.bctextengine._bcglyph();
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="g.baseline = BlackGlyph.baseline";
_g.baseline /*int*/  = _blackglyph.baseline /*int*/ ;
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="g.width = BlackGlyph.width";
_g.Width /*int*/  = _blackglyph.Width /*int*/ ;
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="g.cbc.Initialize";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Initialize();
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="g.cbc.Cache = BlackGlyph.cbc.Cache";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache;
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="g.cbc.mHeight = BlackGlyph.cbc.mHeight";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight;
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="g.cbc.mWidth = BlackGlyph.cbc.mWidth";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth;
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="g.cbc.Rows = BlackGlyph.cbc.Rows";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows;
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="g.cbc.TargetRect = BlackGlyph.cbc.TargetRect";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect;
RDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="Dim buffer(BlackGlyph.cbc.mBuffer.Length) As Byte";
_buffer = new byte[_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer.length];
;
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=18022415;
 //BA.debugLineNum = 18022415;BA.debugLine="CharBC.ColorToARGB(clr, argb)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._colortoargb(_clr,_argb);
RDebugUtils.currentLine=18022416;
 //BA.debugLineNum = 18022416;BA.debugLine="Dim ai, ri, gi, bi As Int";
_ai = 0;
_ri = 0;
_gi = 0;
_bi = 0;
RDebugUtils.currentLine=18022418;
 //BA.debugLineNum = 18022418;BA.debugLine="ai = 3";
_ai = (int) (3);
RDebugUtils.currentLine=18022419;
 //BA.debugLineNum = 18022419;BA.debugLine="ri = 0";
_ri = (int) (0);
RDebugUtils.currentLine=18022420;
 //BA.debugLineNum = 18022420;BA.debugLine="gi = 1";
_gi = (int) (1);
RDebugUtils.currentLine=18022421;
 //BA.debugLineNum = 18022421;BA.debugLine="bi = 2";
_bi = (int) (2);
RDebugUtils.currentLine=18022428;
 //BA.debugLineNum = 18022428;BA.debugLine="For i = 0 To buffer.Length - 1 Step 4";
{
final int step21 = 4;
final int limit21 = (int) (_buffer.length-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=18022437;
 //BA.debugLineNum = 18022437;BA.debugLine="Dim a As Int = Bit.And(0xff, BlackGlyph.cbc.mBuf";
_a = __c.Bit.And(((int)0xff),(int) (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer[(int) (_i+_ai)]));
RDebugUtils.currentLine=18022438;
 //BA.debugLineNum = 18022438;BA.debugLine="Dim af As Float = a / 255";
_af = (float) (_a/(double)255);
RDebugUtils.currentLine=18022439;
 //BA.debugLineNum = 18022439;BA.debugLine="buffer(i + ai) = a";
_buffer[(int) (_i+_ai)] = (byte) (_a);
RDebugUtils.currentLine=18022440;
 //BA.debugLineNum = 18022440;BA.debugLine="buffer(i + ri) = argb.r * af";
_buffer[(int) (_i+_ri)] = (byte) (_argb.r*_af);
RDebugUtils.currentLine=18022441;
 //BA.debugLineNum = 18022441;BA.debugLine="buffer(i + gi) = argb.g * af";
_buffer[(int) (_i+_gi)] = (byte) (_argb.g*_af);
RDebugUtils.currentLine=18022442;
 //BA.debugLineNum = 18022442;BA.debugLine="buffer(i + bi) = argb.b * af";
_buffer[(int) (_i+_bi)] = (byte) (_argb.b*_af);
 }
};
RDebugUtils.currentLine=18022445;
 //BA.debugLineNum = 18022445;BA.debugLine="g.cbc.mBuffer = buffer";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer = _buffer;
RDebugUtils.currentLine=18022446;
 //BA.debugLineNum = 18022446;BA.debugLine="Return g";
if (true) return _g;
RDebugUtils.currentLine=18022447;
 //BA.debugLineNum = 18022447;BA.debugLine="End Sub";
return null;
}
public String  _resizecharbc(b4a.B4APagesNavBar.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizecharbc", true))
	 {return ((String) Debug.delegate(ba, "resizecharbc", new Object[] {_width,_height}));}
int _scaledwidth = 0;
int _scaledheight = 0;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub ResizeCharBC(width As Int, height As I";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Dim ScaledWidth As Int = (width + 5) / mScale";
_scaledwidth = (int) ((_width+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Dim ScaledHeight As Int = (height + 5) / mScale";
_scaledheight = (int) ((_height+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="CharBC.Initialize(ScaledWidth * mScale, ScaledHei";
__ref._charbc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_scaledwidth*__ref._mscale /*float*/ ),(int) (_scaledheight*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="CharBC.MAX_SAME_COLOR_SIZE = 0";
__ref._charbc /*b4a.example.bitmapcreator*/ ._max_same_color_size = (int) (0);
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="CharBC.AlphaThresholdForCBCExtraction = 0";
__ref._charbc /*b4a.example.bitmapcreator*/ ._alphathresholdforcbcextraction = (int) (0);
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="cvs.Resize(ScaledWidth, ScaledHeight)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_scaledwidth),(float) (_scaledheight));
RDebugUtils.currentLine=17432596;
 //BA.debugLineNum = 17432596;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _findminrect(b4a.B4APagesNavBar.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findminrect", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "findminrect", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub FindMinRect (width As Int, height As I";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="r.Initialize(width / 2, -1, -1, 0)";
_r.Initialize((float) (_width/(double)2),(float) (-1),(float) (-1),(float) (0));
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="For y = 0 To height - 1";
{
final int step3 = 1;
final int limit3 = (int) (_height-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="For x = 0 To width - 1";
{
final int step4 = 1;
final int limit4 = (int) (_width-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="r.Left = Min(r.Left, x)";
_r.setLeft((float) (__c.Min(_r.getLeft(),_x)));
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=18087946;
 //BA.debugLineNum = 18087946;BA.debugLine="If x < width Then";
if (_x<_width) { 
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="If r.Top = -1 Then";
if (_r.getTop()==-1) { 
RDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="r.Top = y";
_r.setTop((float) (_y));
 }else {
RDebugUtils.currentLine=18087950;
 //BA.debugLineNum = 18087950;BA.debugLine="r.Bottom = y + 1";
_r.setBottom((float) (_y+1));
 };
RDebugUtils.currentLine=18087952;
 //BA.debugLineNum = 18087952;BA.debugLine="For x = width - 1 To 0 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (0);
_x = (int) (_width-1) ;
for (;_x >= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=18087953;
 //BA.debugLineNum = 18087953;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=18087954;
 //BA.debugLineNum = 18087954;BA.debugLine="r.Right = Max(r.Right, x + 1)";
_r.setRight((float) (__c.Max(_r.getRight(),_x+1)));
RDebugUtils.currentLine=18087955;
 //BA.debugLineNum = 18087955;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=18087960;
 //BA.debugLineNum = 18087960;BA.debugLine="r.Bottom = Max(r.Bottom, r.Top + 1)";
_r.setBottom((float) (__c.Max(_r.getBottom(),_r.getTop()+1)));
RDebugUtils.currentLine=18087961;
 //BA.debugLineNum = 18087961;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=18087962;
 //BA.debugLineNum = 18087962;BA.debugLine="End Sub";
return null;
}
public String  _recoloredgesofconnectedcharacters(b4a.B4APagesNavBar.bctextengine __ref,String _c,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "recoloredgesofconnectedcharacters", true))
	 {return ((String) Debug.delegate(ba, "recoloredgesofconnectedcharacters", new Object[] {_c,_r2}));}
boolean _first = false;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub RecolorEdgesOfConnectedCharacters(c As";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="If ArabicCharsConnectedPrev.Contains(c) Then";
if (__ref._arabiccharsconnectedprev /*b4a.B4APagesNavBar.b4xset*/ ._contains /*boolean*/ (null,(Object)(_c))) { 
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Dim First As Boolean = True";
_first = __c.True;
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="For y = r2.Top To r2.Bottom - 1";
{
final int step3 = 1;
final int limit3 = (int) (_r2.getBottom()-1);
_y = (int) (_r2.getTop()) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="For x = r2.Right - 1 To Max(r2.Left, r2.Right -";
{
final int step4 = -1;
final int limit4 = (int) (__c.Max(_r2.getLeft(),_r2.getRight()-5));
_x = (int) (_r2.getRight()-1) ;
for (;_x >= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="If First Then";
if (_first) { 
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="First = False";
_first = __c.False;
 }else {
RDebugUtils.currentLine=17825801;
 //BA.debugLineNum = 17825801;BA.debugLine="CharBC.SetPremultipliedColor(x, y, PMDefault";
__ref._charbc /*b4a.example.bitmapcreator*/ ._setpremultipliedcolor(_x,_y,__ref._pmdefaultcolor /*b4a.example.bitmapcreator._premultipliedcolor*/ );
 };
RDebugUtils.currentLine=17825803;
 //BA.debugLineNum = 17825803;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=17825808;
 //BA.debugLineNum = 17825808;BA.debugLine="End Sub";
return "";
}
public boolean  _mightbeanemoji(b4a.B4APagesNavBar.bctextengine __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mightbeanemoji", true))
	 {return ((Boolean) Debug.delegate(ba, "mightbeanemoji", new Object[] {_c}));}
int _cp = 0;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Private Sub MightBeAnEmoji(c As String) As Boolean";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Dim cp As Int = Asc(c)";
_cp = __c.Asc(BA.ObjectToChar(_c));
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Return cp >= 0x231A Or c.Length > 1";
if (true) return _cp>=((int)0x231a) || _c.length()>1;
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="End Sub";
return false;
}
public String  _loaddata(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.b4xset _set,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loaddata", true))
	 {return ((String) Debug.delegate(ba, "loaddata", new Object[] {_set,_filename}));}
String _line = "";
int _i = 0;
int _a = 0;
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Private Sub LoadData(Set As B4XSet, FileName As St";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Set.Initialize";
_set._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = __c.File.ReadList(__c.File.getDirAssets(),_filename);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="line = line.Trim";
_line = _line.trim();
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="Dim i As Int = line.IndexOf(\".\")";
_i = _line.indexOf(".");
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="Set.Add(Bit.ParseInt(line, 16))";
_set._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_line,(int) (16))));
 }else {
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="For a = Bit.ParseInt(line.SubString2(0, i), 16)";
{
final int step8 = 1;
final int limit8 = __c.Bit.ParseInt(_line.substring((int) (_i+2)),(int) (16));
_a = __c.Bit.ParseInt(_line.substring((int) (0),_i),(int) (16)) ;
for (;_a <= limit8 ;_a = _a + step8 ) {
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="Set.Add(a)";
_set._add /*String*/ (null,(Object)(_a));
 }
};
 };
 }
};
RDebugUtils.currentLine=19070989;
 //BA.debugLineNum = 19070989;BA.debugLine="End Sub";
return "";
}
public String  _createline(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createline", true))
	 {return ((String) Debug.delegate(ba, "createline", new Object[] {_p}));}
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Private Sub CreateLine(p As BCParagraph)";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim line As BCTextLine";
_line = new b4a.B4APagesNavBar.bctextengine._bctextline();
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="line.Initialize";
_line.Initialize();
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="line.Unbreakables.Initialize";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="line.ParentParagraph = p";
_line.ParentParagraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/  = _p;
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="p.TextLines.Add(line)";
_p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="p.CurrentLine = line";
_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/  = _line;
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bcsinglestylesection  _createsinglesection(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextrun _run,b4a.B4APagesNavBar.bctextengine._bctextchars _textchars,b4a.B4APagesNavBar.bctextengine._bcfontmetrics _fontmetrics) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createsinglesection", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcsinglestylesection) Debug.delegate(ba, "createsinglesection", new Object[] {_run,_textchars,_fontmetrics}));}
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
String _prevchar = "";
b4a.B4APagesNavBar.bctextengine._bcglyphandoffset _prevgo = null;
int _i = 0;
String _s = "";
b4a.B4APagesNavBar.bctextengine._bcglyphandoffset _go = null;
b4a.B4APagesNavBar.bctextengine._bcglyph _g = null;
b4a.B4APagesNavBar.bctextengine._bcstyledunderline _u = null;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub CreateSingleSection (Run As BCTextRun,";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim single As BCSingleStyleSection";
_single = new b4a.B4APagesNavBar.bctextengine._bcsinglestylesection();
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="single.Initialize";
_single.Initialize();
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="single.GlyphsAndOffsets.Initialize";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="single.Run = Run";
_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/  = _run;
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="single.fm = FontMetrics";
_single.fm /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/  = _fontmetrics;
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="Dim PrevChar As String";
_prevchar = "";
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="Dim PrevGO As BCGlyphAndOffset";
_prevgo = new b4a.B4APagesNavBar.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=16646152;
 //BA.debugLineNum = 16646152;BA.debugLine="For i = 0 To TextChars.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_textchars.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="Dim s As String = TextChars.Buffer(i + TextChars";
_s = _textchars.Buffer /*String[]*/ [(int) (_i+_textchars.StartIndex /*int*/ )];
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="Dim go As BCGlyphAndOffset";
_go = new b4a.B4APagesNavBar.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="Dim g As BCGlyph = CreateGlyph(s, FontMetrics, F";
_g = __ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,_s,_fontmetrics,__c.False);
RDebugUtils.currentLine=16646156;
 //BA.debugLineNum = 16646156;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="If KerningEnabled Then";
if (__ref._kerningenabled /*boolean*/ ) { 
RDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = GetKernSpaceB";
_prevgo.SpaceBetweenThisAndNext /*int*/  = __ref._getkernspacebetweenchars /*int*/ (null,_fontmetrics,_prevchar,_s,_prevgo.Glyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ ,_g);
 }else {
RDebugUtils.currentLine=16646160;
 //BA.debugLineNum = 16646160;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = mSpaceBetween";
_prevgo.SpaceBetweenThisAndNext /*int*/  = (int) (__ref._mspacebetweencharacters /*float*/ );
 };
 };
RDebugUtils.currentLine=16646163;
 //BA.debugLineNum = 16646163;BA.debugLine="go.Glyph = g";
_go.Glyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/  = _g;
RDebugUtils.currentLine=16646164;
 //BA.debugLineNum = 16646164;BA.debugLine="single.GlyphsAndOffsets.Add(go)";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_go));
RDebugUtils.currentLine=16646165;
 //BA.debugLineNum = 16646165;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=16646166;
 //BA.debugLineNum = 16646166;BA.debugLine="single.MaxHeightAboveBaseLine = Max(single.MaxH";
_single.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_g.baseline /*int*/ -_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=16646167;
 //BA.debugLineNum = 16646167;BA.debugLine="single.MaxHeightBelowBaseLine = Max(single.MaxH";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight-_g.baseline /*int*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=16646169;
 //BA.debugLineNum = 16646169;BA.debugLine="single.Width = single.Width + g.Width";
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_g.Width /*int*/ );
RDebugUtils.currentLine=16646170;
 //BA.debugLineNum = 16646170;BA.debugLine="If i > 0 Then single.Width = single.Width + Prev";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=16646171;
 //BA.debugLineNum = 16646171;BA.debugLine="If Run.Underline Or Run.AutoUnderline Then";
if (_run.Underline /*boolean*/  || _run.AutoUnderline /*boolean*/ ) { 
RDebugUtils.currentLine=16646172;
 //BA.debugLineNum = 16646172;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ (null,_run);
RDebugUtils.currentLine=16646173;
 //BA.debugLineNum = 16646173;BA.debugLine="single.MaxHeightBelowBaseLine = Max((u.Thicknes";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max((_u.Thickness /*float*/ +2)*__ref._mscale /*float*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ,_single.MaxHeightBelowBaseLine /*int*/ ));
 };
RDebugUtils.currentLine=16646175;
 //BA.debugLineNum = 16646175;BA.debugLine="PrevGO = go";
_prevgo = _go;
RDebugUtils.currentLine=16646176;
 //BA.debugLineNum = 16646176;BA.debugLine="PrevChar = s";
_prevchar = _s;
 }
};
RDebugUtils.currentLine=16646178;
 //BA.debugLineNum = 16646178;BA.debugLine="If i > 0 Then single.Width = single.Width + PrevG";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=16646179;
 //BA.debugLineNum = 16646179;BA.debugLine="If TextChars.Length = 0 And Run.View.IsInitialize";
if (_textchars.Length /*int*/ ==0 && _run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16646180;
 //BA.debugLineNum = 16646180;BA.debugLine="Run.View.Left = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=16646181;
 //BA.debugLineNum = 16646181;BA.debugLine="Run.View.Top = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=16646182;
 //BA.debugLineNum = 16646182;BA.debugLine="single.Width = Run.View.Width * mScale + mSpaceB";
_single.Width /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*__ref._mscale /*float*/ +__ref._mspacebetweencharacters /*float*/ *2);
RDebugUtils.currentLine=16646183;
 //BA.debugLineNum = 16646183;BA.debugLine="single.MaxHeightAboveBaseLine = (Run.View.Height";
_single.MaxHeightAboveBaseLine /*int*/  = (int) ((_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_run.VerticalOffset /*int*/ )*__ref._mscale /*float*/ );
RDebugUtils.currentLine=16646184;
 //BA.debugLineNum = 16646184;BA.debugLine="single.MaxHeightBelowBaseLine = Run.View.Height";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mscale /*float*/ -_single.MaxHeightAboveBaseLine /*int*/ );
 };
RDebugUtils.currentLine=16646187;
 //BA.debugLineNum = 16646187;BA.debugLine="Return single";
if (true) return _single;
RDebugUtils.currentLine=16646188;
 //BA.debugLineNum = 16646188;BA.debugLine="End Sub";
return null;
}
public int  _getkernspacebetweenchars(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcfontmetrics _fm,String _prevchar,String _thischar,b4a.B4APagesNavBar.bctextengine._bcglyph _prevglyph,b4a.B4APagesNavBar.bctextengine._bcglyph _thisglyph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getkernspacebetweenchars", true))
	 {return ((Integer) Debug.delegate(ba, "getkernspacebetweenchars", new Object[] {_fm,_prevchar,_thischar,_prevglyph,_thisglyph}));}
String _together = "";
int _space = 0;
int _res = 0;
int _w = 0;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub GetKernSpaceBetweenChars (fm As BCFont";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Dim together As String = PrevChar & ThisChar";
_together = _prevchar+_thischar;
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Dim Space As Int = fm.KerningTable.GetDefault(tog";
_space = (int)(BA.ObjectToNumber(_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_together),(Object)(-1000))));
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="If Space > -1000 Then Return Space";
if (_space>-1000) { 
if (true) return _space;};
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="If ThisGlyph.Empty Or PrevGlyph.Empty Then";
if (_thisglyph.Empty /*boolean*/  || _prevglyph.Empty /*boolean*/ ) { 
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="res = mSpaceBetweenCharacters";
_res = (int) (__ref._mspacebetweencharacters /*float*/ );
 }else {
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="Dim w As Int = CreateGlyph(together, fm, True).W";
_w = __ref._createglyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ (null,_together,_fm,__c.True).Width /*int*/ ;
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="res = w - PrevGlyph.Width - ThisGlyph.Width";
_res = (int) (_w-_prevglyph.Width /*int*/ -_thisglyph.Width /*int*/ );
 };
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="fm.KerningTable.Put(together, res)";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_together),(Object)(_res));
RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="End Sub";
return 0;
}
public b4a.B4APagesNavBar.bctextengine._bcstyledunderline  _getunderlinestyle(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getunderlinestyle", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcstyledunderline) Debug.delegate(ba, "getunderlinestyle", new Object[] {_run}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Private Sub GetUnderlineStyle(run As BCTextRun) As";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="If run.Extra.IsInitialized = False Then Return De";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __ref._defaultunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ ;};
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="Return run.Extra.GetDefault(EXTRA_STYLEDUNDERLINE";
if (true) return (b4a.B4APagesNavBar.bctextengine._bcstyledunderline)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._extra_styledunderline /*String*/ ),(Object)(__ref._defaultunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ )));
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="End Sub";
return null;
}
public b4a.B4APagesNavBar.bctextengine._bcunbreakabletext  _createunbreakable(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextrun _run,b4a.B4APagesNavBar.bctextengine._bctextchars _textchars,b4a.B4APagesNavBar.bctextengine._bcfontmetrics _fontmetrics,boolean _isseparator,b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createunbreakable", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcunbreakabletext) Debug.delegate(ba, "createunbreakable", new Object[] {_run,_textchars,_fontmetrics,_isseparator,_style}));}
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _unbreakable = null;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub CreateUnbreakable (Run As BCTextRun, T";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Dim unbreakable As BCUnbreakableText";
_unbreakable = new b4a.B4APagesNavBar.bctextengine._bcunbreakabletext();
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="unbreakable.Initialize";
_unbreakable.Initialize();
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="unbreakable.SingleStyleSections.Initialize";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="unbreakable.IsMergable = Not(IsSeparator) And Not";
_unbreakable.IsMergable /*boolean*/  = __c.Not(_isseparator) && __c.Not(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized());
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="Dim single As BCSingleStyleSection = CreateSingle";
_single = __ref._createsinglesection /*b4a.B4APagesNavBar.bctextengine._bcsinglestylesection*/ (null,_run,_textchars,_fontmetrics);
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="single.ParentUN = unbreakable";
_single.ParentUN /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/  = _unbreakable;
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="unbreakable.SingleStyleSections.Add(single)";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_single));
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="unbreakable.Width = single.Width";
_unbreakable.Width /*int*/  = _single.Width /*int*/ ;
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="unbreakable.NotFullTextChars = TextChars";
_unbreakable.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = _textchars;
RDebugUtils.currentLine=16318474;
 //BA.debugLineNum = 16318474;BA.debugLine="If style.RTL Then";
if (_style.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=16318475;
 //BA.debugLineNum = 16318475;BA.debugLine="unbreakable.RTL = Run.TextDirection = TextDirect";
_unbreakable.RTL /*boolean*/  = _run.TextDirection /*int*/ ==__ref._textdirectionrtl /*int*/  || (_run.TextDirection /*int*/ ==__ref._textdirectionunknown /*int*/  && __ref._detectrtl /*boolean*/ (null,_unbreakable)==__c.True);
 };
RDebugUtils.currentLine=16318477;
 //BA.debugLineNum = 16318477;BA.debugLine="unbreakable.Anchor = GetRunAnchorIfCurrentNotSet(";
_unbreakable.Anchor /*String*/  = __ref._getrunanchorifcurrentnotset /*String*/ (null,_run,"");
RDebugUtils.currentLine=16318478;
 //BA.debugLineNum = 16318478;BA.debugLine="Return unbreakable";
if (true) return _unbreakable;
RDebugUtils.currentLine=16318479;
 //BA.debugLineNum = 16318479;BA.debugLine="End Sub";
return null;
}
public boolean  _detectrtl(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "detectrtl", true))
	 {return ((Boolean) Debug.delegate(ba, "detectrtl", new Object[] {_un}));}
String _firstchar = "";
int _cp = 0;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub DetectRTL (un As BCUnbreakableText) As";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="If un.NotFullTextChars.Length = 0 Then";
if (_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="If RTLChars.IsInitialized = False Then";
if (__ref._rtlchars /*b4a.B4APagesNavBar.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="LoadData(RTLChars, \"rtl-data.txt\")";
__ref._loaddata /*String*/ (null,__ref._rtlchars /*b4a.B4APagesNavBar.b4xset*/ ,"rtl-data.txt");
 };
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Dim firstChar As String = un.NotFullTextChars.Buf";
_firstchar = _un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .StartIndex /*int*/ ];
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="Dim cp As Int = BytesToInt(firstChar.GetBytes(Cha";
_cp = __ref._bytestoint /*int*/ (null,_firstchar.getBytes(__ref._charset /*String*/ ),(int) (0));
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="Return RTLChars.Contains(cp)";
if (true) return __ref._rtlchars /*b4a.B4APagesNavBar.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp));
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="End Sub";
return false;
}
public String  _getrunanchorifcurrentnotset(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextrun _textrun,String _current) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getrunanchorifcurrentnotset", true))
	 {return ((String) Debug.delegate(ba, "getrunanchorifcurrentnotset", new Object[] {_textrun,_current}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub GetRunAnchorIfCurrentNotSet(TextRun As";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="If Current <> \"\" Then Return Current";
if ((_current).equals("") == false) { 
if (true) return _current;};
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="If TextRun.Extra.IsInitialized = False Then Retur";
if (_textrun.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Return TextRun.Extra.GetDefault(\"a\", \"\")";
if (true) return BA.ObjectToString(_textrun.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("a"),(Object)("")));
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="End Sub";
return "";
}
public String  _drawline(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextline _line,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawline", true))
	 {return ((String) Debug.delegate(ba, "drawline", new Object[] {_line,_offsety}));}
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Private Sub DrawLine(line As BCTextLine, OffsetY A";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreaka";
{
final anywheresoftware.b4a.BA.IterableList group1 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group1.Get(index1));
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="DrawUnbreakable(un, OffsetY)";
__ref._drawunbreakable /*String*/ (null,_un,_offsety);
 }
};
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="End Sub";
return "";
}
public String  _drawunbreakable(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawunbreakable", true))
	 {return ((String) Debug.delegate(ba, "drawunbreakable", new Object[] {_un,_offsety}));}
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Private Sub DrawUnbreakable (un As BCUnbreakableTe";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="For Each single As BCSingleStyleSection In un.Sin";
{
final anywheresoftware.b4a.BA.IterableList group1 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_single = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(group1.Get(index1));
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="DrawSingleStyleSection(single, OffsetY)";
__ref._drawsinglestylesection /*String*/ (null,_single,_offsety);
 }
};
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="End Sub";
return "";
}
public String  _drawparagraph(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _paragraph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawparagraph", true))
	 {return ((String) Debug.delegate(ba, "drawparagraph", new Object[] {_paragraph}));}
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub DrawParagraph (Paragraph As BCParagrap";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="DrawLine(line, line.BaselineY)";
__ref._drawline /*String*/ (null,_line,_line.BaselineY /*int*/ );
 }
};
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _drawsinglelineshared(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.B4APagesNavBar.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineshared", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "drawsinglelineshared", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub DrawSingleLineShared (line As BCTextLi";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="r.Initialize(0, 0, ForegroundBC.mWidth, line.MaxH";
_r.Initialize((float) (0),(float) (0),(float) (__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="iv.SetLayoutAnimated(0,  par.Style.Padding.Left,";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+(_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ )/(double)__ref._mscale /*float*/ ),(int) (__c.Ceil(_r.getWidth()/(double)__ref._mscale /*float*/ )),(int) (__c.Ceil(_r.getHeight()/(double)__ref._mscale /*float*/ )));
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="End Sub";
return null;
}
public b4a.example.bcpath._bcbrush  _getbrush(b4a.B4APagesNavBar.bctextengine __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getbrush", true))
	 {return ((b4a.example.bcpath._bcbrush) Debug.delegate(ba, "getbrush", new Object[] {_clr}));}
b4a.example.bcpath._bcbrush _b = null;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub GetBrush(clr As Int) As BCBrush";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="If Brushes.ContainsKey(clr) Then Return Brushes.G";
if (__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
if (true) return (b4a.example.bcpath._bcbrush)(__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr)));};
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="Dim b As BCBrush = ForegroundBC.CreateBrushFromCo";
_b = __ref._foregroundbc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(_clr);
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Brushes.Put(clr, b)";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_clr),(Object)(_b));
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _drawsinglelineasync(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.B4APagesNavBar.bctextengine._bcparagraph _par,Object _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineasync", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "drawsinglelineasync", new Object[] {_line,_iv,_par,_target}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub DrawSingleLineAsync (line As BCTextLine";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="AsyncMode = True";
__ref._asyncmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="If AsyncBCs.IsInitialized = False Then AsyncBCs.";
if (__ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ ._initialize /*String*/ (null,ba);};
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="Dim AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="AsyncTasks.Initialize";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="AsyncBC = FindAsyncBC (r.Width, r.Height)";
__ref._asyncbc /*b4a.example.bitmapcreator*/  = __ref._findasyncbc /*b4a.example.bitmapcreator*/ (null,(int) (_r.getWidth()),(int) (_r.getHeight()));
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBrush";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0))));
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="AsyncBC.DrawBitmapCreatorsAsync(Target, \"BC\", As";
__ref._asyncbc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(_target,"BC",__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=16973835;
 //BA.debugLineNum = 16973835;BA.debugLine="AsyncMode = False";
__ref._asyncmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="Return AsyncBC";
if (true) return __ref._asyncbc /*b4a.example.bitmapcreator*/ ;
 };
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Return Null";
if (true) return (b4a.example.bitmapcreator)(__c.Null);
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _findasyncbc(b4a.B4APagesNavBar.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findasyncbc", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "findasyncbc", new Object[] {_width,_height}));}
b4a.example.bitmapcreator _bc = null;
boolean _used = false;
int _i = 0;
boolean _b = false;
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub FindAsyncBC (Width As Int, Height As I";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="For Each bc As BitmapCreator In AsyncBCs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_bc = (b4a.example.bitmapcreator)(group1.Get(index1));
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="If bc.mWidth = Width And bc.mHeight = Height The";
if (_bc._mwidth==_width && _bc._mheight==_height) { 
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Dim Used As Boolean = AsyncBCs.Get(bc)";
_used = BA.ObjectToBoolean(__ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_bc)));
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="If Used = False Then";
if (_used==__c.False) { 
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="Return bc";
if (true) return _bc;
 };
 };
 }
};
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=17039371;
 //BA.debugLineNum = 17039371;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,_width,_height);
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="For Each b As Boolean In AsyncBCs.Values";
{
final anywheresoftware.b4a.BA.IterableList group14 = __ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_b = BA.ObjectToBoolean(group14.Get(index14));
RDebugUtils.currentLine=17039375;
 //BA.debugLineNum = 17039375;BA.debugLine="If b Then i = i + 1";
if (_b) { 
_i = (int) (_i+1);};
 }
};
RDebugUtils.currentLine=17039377;
 //BA.debugLineNum = 17039377;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=17039378;
 //BA.debugLineNum = 17039378;BA.debugLine="End Sub";
return null;
}
public String  _drawsinglestylesection(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglestylesection", true))
	 {return ((String) Debug.delegate(ba, "drawsinglestylesection", new Object[] {_single,_offsety}));}
int _offsetx = 0;
boolean _rtl = false;
b4a.B4APagesNavBar.bctextengine._bcglyphandoffset _go = null;
b4a.B4APagesNavBar.bctextengine._bcglyph _g = null;
int _x = 0;
b4a.example.bitmapcreator._drawtask _dt = null;
b4a.B4APagesNavBar.bctextengine._bcstyledunderline _u = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Private Sub DrawSingleStyleSection (single As BCSi";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Dim OffsetX As Int = single.AbsoluteStartX";
_offsetx = _single.AbsoluteStartX /*int*/ ;
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Dim rtl As Boolean = single.ParentUN.RTL";
_rtl = _single.ParentUN /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/ .RTL /*boolean*/ ;
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="If rtl Then OffsetX = single.AbsoluteStartX + sin";
if (_rtl) { 
_offsetx = (int) (_single.AbsoluteStartX /*int*/ +_single.Width /*int*/ );};
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="For Each go As BCGlyphAndOffset In single.GlyphsA";
{
final anywheresoftware.b4a.BA.IterableList group4 = _single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_go = (b4a.B4APagesNavBar.bctextengine._bcglyphandoffset)(group4.Get(index4));
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="Dim g As BCGlyph = go.Glyph";
_g = _go.Glyph /*b4a.B4APagesNavBar.bctextengine._bcglyph*/ ;
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="If g = Null Then Continue";
if (_g== null) { 
if (true) continue;};
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="Dim x As Int = OffsetX";
_x = _offsetx;
RDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="If rtl Then x = x - g.cbc.mWidth";
if (_rtl) { 
_x = (int) (_x-_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth);};
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="Dim dt As DrawTask = AsyncBC.CreateDrawTask(g.";
_dt = __ref._asyncbc /*b4a.example.bitmapcreator*/ ._createdrawtask((Object)(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ),_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ),__c.True);
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=17301519;
 //BA.debugLineNum = 17301519;BA.debugLine="AsyncTasks.Add(dt)";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_dt));
 }else {
RDebugUtils.currentLine=17301521;
 //BA.debugLineNum = 17301521;BA.debugLine="ForegroundBC.DrawCompressedBitmap(g.cbc, g.cbc";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawcompressedbitmap(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
 };
RDebugUtils.currentLine=17301524;
 //BA.debugLineNum = 17301524;BA.debugLine="If single.Run.Underline Then";
if (_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .Underline /*boolean*/ ) { 
RDebugUtils.currentLine=17301525;
 //BA.debugLineNum = 17301525;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*b4a.B4APagesNavBar.bctextengine._bcstyledunderline*/ (null,_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ );
RDebugUtils.currentLine=17301526;
 //BA.debugLineNum = 17301526;BA.debugLine="Dim clr As Int = u.Clr";
_clr = _u.Clr /*int*/ ;
RDebugUtils.currentLine=17301527;
 //BA.debugLineNum = 17301527;BA.debugLine="If clr = 0 Then clr = single.Run.TextColor";
if (_clr==0) { 
_clr = _single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .TextColor /*int*/ ;};
RDebugUtils.currentLine=17301528;
 //BA.debugLineNum = 17301528;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=17301529;
 //BA.debugLineNum = 17301529;BA.debugLine="r.Initialize(x, single.Run.VerticalOffset * mSc";
_r.Initialize((float) (_x),(float) (_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ +_offsety+__ref._mscale /*float*/ ),(float) (_x+_g.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ ),(float) (_offsety+__ref._mscale /*float*/ +_u.Thickness /*float*/ *__ref._mscale /*float*/ +_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=17301531;
 //BA.debugLineNum = 17301531;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=17301532;
 //BA.debugLineNum = 17301532;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBru";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0))));
 }else {
RDebugUtils.currentLine=17301534;
 //BA.debugLineNum = 17301534;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(clr), True,";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0));
 };
 };
RDebugUtils.currentLine=17301537;
 //BA.debugLineNum = 17301537;BA.debugLine="If rtl Then";
if (_rtl) { 
RDebugUtils.currentLine=17301538;
 //BA.debugLineNum = 17301538;BA.debugLine="OffsetX = OffsetX - g.Width - go.SpaceBetweenTh";
_offsetx = (int) (_offsetx-_g.Width /*int*/ -_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 }else {
RDebugUtils.currentLine=17301540;
 //BA.debugLineNum = 17301540;BA.debugLine="OffsetX = OffsetX + g.Width + go.SpaceBetweenTh";
_offsetx = (int) (_offsetx+_g.Width /*int*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 };
 }
};
RDebugUtils.currentLine=17301543;
 //BA.debugLineNum = 17301543;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bcparagraph  _prepare(b4a.B4APagesNavBar.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepare", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcparagraph) Debug.delegate(ba, "prepare", new Object[] {_runs,_style}));}
b4a.B4APagesNavBar.bctextengine._bcparagraph _par = null;
anywheresoftware.b4a.objects.collections.List _unbreakeables = null;
b4a.B4APagesNavBar.bctextengine._bctextrun _run = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub Prepare (Runs As List, Style As BCPara";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Dim par As BCParagraph";
_par = new b4a.B4APagesNavBar.bctextengine._bcparagraph();
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="par.Initialize";
_par.Initialize();
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="par.TextLines.Initialize";
_par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="par.Style = Style";
_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/  = _style;
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="IndentWidth = GetFontMetrics(DefaultFont, Default";
__ref._indentwidth /*int*/  = (int) (__ref._getfontmetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ (null,__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._defaultcolor /*int*/ ).xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="Dim unbreakeables As List";
_unbreakeables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="unbreakeables.Initialize";
_unbreakeables.Initialize();
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="For Each run As BCTextRun In Runs";
{
final anywheresoftware.b4a.BA.IterableList group8 = _runs;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_run = (b4a.B4APagesNavBar.bctextengine._bctextrun)(group8.Get(index8));
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="If run.Extra.IsInitialized And run.Extra.Contain";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._extra_connectedruns /*String*/ ))) { 
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="HandleConnectedTextRuns(run, unbreakeables, Sty";
__ref._handleconnectedtextruns /*String*/ (null,_run,_unbreakeables,_style);
 }else {
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="HandleTextRun(run, unbreakeables, Style)";
__ref._handletextrun /*String*/ (null,_run,_unbreakeables,_style);
 };
 }
};
RDebugUtils.currentLine=15400975;
 //BA.debugLineNum = 15400975;BA.debugLine="CreateLine(par)";
__ref._createline /*String*/ (null,_par);
RDebugUtils.currentLine=15400976;
 //BA.debugLineNum = 15400976;BA.debugLine="OrganizeUnbreakables(par, unbreakeables)";
__ref._organizeunbreakables /*String*/ (null,_par,_unbreakeables);
RDebugUtils.currentLine=15400977;
 //BA.debugLineNum = 15400977;BA.debugLine="OrganizeLines(par)";
__ref._organizelines /*String*/ (null,_par);
RDebugUtils.currentLine=15400978;
 //BA.debugLineNum = 15400978;BA.debugLine="OrganizeSingleStyles(par)";
__ref._organizesinglestyles /*String*/ (null,_par);
RDebugUtils.currentLine=15400979;
 //BA.debugLineNum = 15400979;BA.debugLine="If par.Style.RTL Then OrganizeRTLParagraph(par)";
if (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ) { 
__ref._organizertlparagraph /*String*/ (null,_par);};
RDebugUtils.currentLine=15400980;
 //BA.debugLineNum = 15400980;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=15400981;
 //BA.debugLineNum = 15400981;BA.debugLine="End Sub";
return null;
}
public String  _resizelayers(b4a.B4APagesNavBar.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizelayers", true))
	 {return ((String) Debug.delegate(ba, "resizelayers", new Object[] {_width,_height}));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub ResizeLayers (Width As Int, Height As";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Width = Max(Width, 2 * mScale)";
_width = (int) (__c.Max(_width,2*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Height = Max(Height, 2 * mScale)";
_height = (int) (__c.Max(_height,2*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="If ForegroundBC.IsInitialized = False Or Width >";
if (__ref._foregroundbc /*b4a.example.bitmapcreator*/ .IsInitialized()==__c.False || _width>__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth || _height>__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mheight) { 
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="If ForegroundBC.IsInitialized Then";
if (__ref._foregroundbc /*b4a.example.bitmapcreator*/ .IsInitialized()) { 
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Width = Max(Width, ForegroundBC.mWidth)";
_width = (int) (__c.Max(_width,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth));
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Height = Max(Height, ForegroundBC.mHeight)";
_height = (int) (__c.Max(_height,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mheight));
 };
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="Brushes.Clear";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="ForegroundBC.Initialize(Width, Height)";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._initialize(ba,_width,_height);
 }else {
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="ForegroundBC.DrawRect2(ForegroundBC.TargetRect,";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
 };
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="End Sub";
return "";
}
public String  _resizeimageview(b4a.B4APagesNavBar.bctextengine __ref,b4a.example.bitmapcreator _bc,b4a.B4APagesNavBar.bctextengine._bcparagraph _par,anywheresoftware.b4a.objects.B4XViewWrapper _iv,boolean _resizeheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizeimageview", true))
	 {return ((String) Debug.delegate(ba, "resizeimageview", new Object[] {_bc,_par,_iv,_resizeheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _ivheight = 0;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub ResizeImageView (bc As BitmapCreator,";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _bc._getbitmap();
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="Dim ivHeight As Int = Ceil(par.Height / mScale)";
_ivheight = (int) (__c.Ceil(_par.Height /*int*/ /(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="If ResizeHeight = False Then ivHeight = Min(ivHei";
if (_resizeheight==__c.False) { 
_ivheight = (int) (__c.Min(_ivheight,_iv.getParent().getHeight()-_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()-_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));};
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="iv.SetLayoutAnimated(0, par.Style.Padding.Left, p";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__c.Ceil(_par.Width /*int*/ /(double)__ref._mscale /*float*/ )),_ivheight);
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="bc.SetBitmapToImageView(bmp.Crop(0, 0, iv.Width *";
_bc._setbitmaptoimageview(_bmp.Crop((int) (0),(int) (0),(int) (_iv.getWidth()*__ref._mscale /*float*/ ),(int) (_iv.getHeight()*__ref._mscale /*float*/ )),_iv);
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="End Sub";
return "";
}
public String  _fonttokey(b4a.B4APagesNavBar.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "fonttokey", true))
	 {return ((String) Debug.delegate(ba, "fonttokey", new Object[] {_fnt,_clr}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub FontToKey (fnt As B4XFont, Clr As Int)";
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Dim jo As JavaObject = fnt.ToNativeFont";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fnt.ToNativeFont().getObject()));
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="Return Clr + jo.RunMethod(\"hashCode\", Null) + fnt";
if (true) return BA.NumberToString(_clr+(double)(BA.ObjectToNumber(_jo.RunMethod("hashCode",(Object[])(__c.Null))))+_fnt.getSize());
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bcsinglestylesection  _getfirstsinglestyle(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextline _line) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfirstsinglestyle", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bcsinglestylesection) Debug.delegate(ba, "getfirstsinglestyle", new Object[] {_line}));}
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _firstun = null;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub GetFirstSingleStyle (Line As BCTextLin";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Dim FirstUN As BCUnbreakableText = Line.Unbreakab";
_firstun = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="Return FirstUN.SingleStyleSections.Get(0)";
if (true) return (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(_firstun.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="End Sub";
return null;
}
public int  _getmingapbetweenlines(b4a.B4APagesNavBar.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getmingapbetweenlines", true))
	 {return ((Integer) Debug.delegate(ba, "getmingapbetweenlines", null));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub getMinGapBetweenLines As Int";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Return mMinGapBetweenLines";
if (true) return __ref._mmingapbetweenlines /*int*/ ;
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="End Sub";
return 0;
}
public float  _getspacebetweencharacters(b4a.B4APagesNavBar.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweencharacters", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweencharacters", null));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub getSpaceBetweenCharacters As Float";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Return mSpaceBetweenCharacters / mScale";
if (true) return (float) (__ref._mspacebetweencharacters /*float*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return 0f;
}
public float  _getspacebetweenlines(b4a.B4APagesNavBar.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweenlines", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweenlines", null));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Public Sub getSpaceBetweenLines As Float";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Return mSpaceBetweenLines / mScale";
if (true) return (float) (__ref._mspacebetweenlines /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
return 0f;
}
public String  _handleconnectedtextruns(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handleconnectedtextruns", true))
	 {return ((String) Debug.delegate(ba, "handleconnectedtextruns", new Object[] {_run,_unbreakables,_style}));}
anywheresoftware.b4a.objects.collections.List _children = null;
b4a.B4APagesNavBar.bctextengine._bcconnectedruns _cr = null;
b4a.B4APagesNavBar.bctextengine._bctextrun _r = null;
int _width = 0;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
b4a.B4APagesNavBar.bctextengine._bcfontmetrics _fm = null;
int _connectedwidth = 0;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _u = null;
int _i = 0;
int _leftoffset = 0;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub HandleConnectedTextRuns (Run As BCText";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim children As List";
_children = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="children.Initialize";
_children.Initialize();
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="Dim cr As BCConnectedRuns = Run.EXTRA.Get(EXTRA_C";
_cr = (b4a.B4APagesNavBar.bctextengine._bcconnectedruns)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="For Each r As BCTextRun In cr.Runs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = (b4a.B4APagesNavBar.bctextengine._bctextrun)(group4.Get(index4));
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="HandleTextRun(r, children, Style)";
__ref._handletextrun /*String*/ (null,_r,_children,_style);
 }
};
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="For Each un As BCUnbreakableText In children";
{
final anywheresoftware.b4a.BA.IterableList group8 = _children;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group8.Get(index8));
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="un.IsMergable = True";
_un.IsMergable /*boolean*/  = __c.True;
RDebugUtils.currentLine=16187402;
 //BA.debugLineNum = 16187402;BA.debugLine="width = width + un.Width";
_width = (int) (_width+_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=16187404;
 //BA.debugLineNum = 16187404;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="Dim ConnectedWidth As Int = cr.ConnectedWidth * m";
_connectedwidth = (int) (_cr.ConnectedWidth /*int*/ *__ref._mscale /*float*/ );
RDebugUtils.currentLine=16187407;
 //BA.debugLineNum = 16187407;BA.debugLine="Dim u As BCUnbreakableText = children.Get(0)";
_u = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_children.Get((int) (0)));
RDebugUtils.currentLine=16187408;
 //BA.debugLineNum = 16187408;BA.debugLine="For i = 1 To children.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_children.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=16187409;
 //BA.debugLineNum = 16187409;BA.debugLine="MergeUnbreakables(u, children.Get(i))";
__ref._mergeunbreakables /*String*/ (null,_u,(b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_children.Get(_i)));
 }
};
RDebugUtils.currentLine=16187411;
 //BA.debugLineNum = 16187411;BA.debugLine="If width < ConnectedWidth Then";
if (_width<_connectedwidth) { 
RDebugUtils.currentLine=16187412;
 //BA.debugLineNum = 16187412;BA.debugLine="Dim leftOffset As Int";
_leftoffset = 0;
RDebugUtils.currentLine=16187413;
 //BA.debugLineNum = 16187413;BA.debugLine="Select cr.Alignment.ToLowerCase";
switch (BA.switchObjectToInt(_cr.Alignment /*String*/ .toLowerCase(),"center","right")) {
case 0: {
RDebugUtils.currentLine=16187415;
 //BA.debugLineNum = 16187415;BA.debugLine="leftOffset = (ConnectedWidth - u.Width) / 2";
_leftoffset = (int) ((_connectedwidth-_u.Width /*int*/ )/(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=16187417;
 //BA.debugLineNum = 16187417;BA.debugLine="leftOffset = ConnectedWidth - u.Width - mSpace";
_leftoffset = (int) (_connectedwidth-_u.Width /*int*/ -__ref._mspacebetweencharacters /*float*/ );
 break; }
}
;
RDebugUtils.currentLine=16187419;
 //BA.debugLineNum = 16187419;BA.debugLine="u.Width = ConnectedWidth";
_u.Width /*int*/  = _connectedwidth;
RDebugUtils.currentLine=16187420;
 //BA.debugLineNum = 16187420;BA.debugLine="If leftOffset > 0 Then";
if (_leftoffset>0) { 
RDebugUtils.currentLine=16187421;
 //BA.debugLineNum = 16187421;BA.debugLine="Dim single As BCSingleStyleSection = CreateSing";
_single = __ref._createsinglesection /*b4a.B4APagesNavBar.bctextengine._bcsinglestylesection*/ (null,_run,__ref._emptytextchars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,_fm);
RDebugUtils.currentLine=16187422;
 //BA.debugLineNum = 16187422;BA.debugLine="single.Width = leftOffset";
_single.Width /*int*/  = _leftoffset;
RDebugUtils.currentLine=16187423;
 //BA.debugLineNum = 16187423;BA.debugLine="u.SingleStyleSections.InsertAt(0, single)";
_u.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (0),(Object)(_single));
 };
 };
RDebugUtils.currentLine=16187426;
 //BA.debugLineNum = 16187426;BA.debugLine="u.IsMergable = False";
_u.IsMergable /*boolean*/  = __c.False;
RDebugUtils.currentLine=16187427;
 //BA.debugLineNum = 16187427;BA.debugLine="Unbreakables.Add(u)";
_unbreakables.Add((Object)(_u));
RDebugUtils.currentLine=16187428;
 //BA.debugLineNum = 16187428;BA.debugLine="End Sub";
return "";
}
public String  _handletextrun(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4a.B4APagesNavBar.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handletextrun", true))
	 {return ((String) Debug.delegate(ba, "handletextrun", new Object[] {_run,_unbreakables,_style}));}
b4a.B4APagesNavBar.bctextengine._bcfontmetrics _fm = null;
int _i1 = 0;
int _i = 0;
String _c = "";
boolean _separatorgoestogetherwithtext = false;
int _offset = 0;
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub HandleTextRun (Run As BCTextRun, Unbre";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*b4a.B4APagesNavBar.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Dim i1 As Int";
_i1 = 0;
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="For i = 0 To Run.TextChars.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="Dim c As String = Run.TextChars.Buffer(Run.TextC";
_c = _run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Buffer /*String[]*/ [(int) (_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .StartIndex /*int*/ +_i)];
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="If WordBoundaries.Contains(c) Then";
if (__ref._wordboundaries /*String*/ .contains(_c)) { 
RDebugUtils.currentLine=16252934;
 //BA.debugLineNum = 16252934;BA.debugLine="Dim SeparatorGoesTogetherWithText As Boolean";
_separatorgoestogetherwithtext = false;
RDebugUtils.currentLine=16252935;
 //BA.debugLineNum = 16252935;BA.debugLine="If i >= i1 + 1 Then";
if (_i>=_i1+1) { 
RDebugUtils.currentLine=16252936;
 //BA.debugLineNum = 16252936;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="If WordBoundariesThatCanConnectToPrevWord.Inde";
if (__ref._wordboundariesthatcanconnecttoprevword /*String*/ .indexOf(_c)>-1) { 
RDebugUtils.currentLine=16252938;
 //BA.debugLineNum = 16252938;BA.debugLine="offset = 1";
_offset = (int) (1);
RDebugUtils.currentLine=16252939;
 //BA.debugLineNum = 16252939;BA.debugLine="SeparatorGoesTogetherWithText = True";
_separatorgoestogetherwithtext = __c.True;
 };
RDebugUtils.currentLine=16252941;
 //BA.debugLineNum = 16252941;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,_i1,(int) (_i+_offset)),_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=16252943;
 //BA.debugLineNum = 16252943;BA.debugLine="If SeparatorGoesTogetherWithText = False Then";
if (_separatorgoestogetherwithtext==__c.False) { 
RDebugUtils.currentLine=16252944;
 //BA.debugLineNum = 16252944;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,_i,(int) (_i+1)),_fm,__c.True,_style)));
 }else {
RDebugUtils.currentLine=16252946;
 //BA.debugLineNum = 16252946;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyT";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=16252948;
 //BA.debugLineNum = 16252948;BA.debugLine="i1 = i + 1";
_i1 = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=16252949;
 //BA.debugLineNum = 16252949;BA.debugLine="Else If c = Chr(13) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
RDebugUtils.currentLine=16252950;
 //BA.debugLineNum = 16252950;BA.debugLine="Continue";
if (true) continue;
 }}
;
 }
};
RDebugUtils.currentLine=16252953;
 //BA.debugLineNum = 16252953;BA.debugLine="If i1 < Run.TextChars.Length Then Unbreakables.Ad";
if (_i1<_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Length /*int*/ ) { 
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,_i1,_run.TextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Length /*int*/ ),_fm,__c.False,_style)));};
RDebugUtils.currentLine=16252954;
 //BA.debugLineNum = 16252954;BA.debugLine="If Run.View.IsInitialized Then";
if (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16252955;
 //BA.debugLineNum = 16252955;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyTex";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,_fm,__c.False,_style)));
 };
RDebugUtils.currentLine=16252957;
 //BA.debugLineNum = 16252957;BA.debugLine="End Sub";
return "";
}
public String  _mergeunbreakables(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un1,b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mergeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "mergeunbreakables", new Object[] {_un1,_un2}));}
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub MergeUnbreakables (un1 As BCUnbreakabl";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="un1.Width = un1.Width + un2.Width + mSpaceBetween";
_un1.Width /*int*/  = (int) (_un1.Width /*int*/ +_un2.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="For Each single As BCSingleStyleSection In un2.Si";
{
final anywheresoftware.b4a.BA.IterableList group2 = _un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_single = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(group2.Get(index2));
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="single.ParentUN = un1";
_single.ParentUN /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/  = _un1;
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="un1.Anchor = GetRunAnchorIfCurrentNotSet(single.";
_un1.Anchor /*String*/  = __ref._getrunanchorifcurrentnotset /*String*/ (null,_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ ,_un1.Anchor /*String*/ );
 }
};
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="un1.SingleStyleSections.AddAll(un2.SingleStyleSec";
_un1.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="If un1.NotFullTextChars.Length = 0 Then un1.NotFu";
if (_un1.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
_un1.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/  = _un2.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ;};
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="End Sub";
return "";
}
public b4a.B4APagesNavBar.bctextengine._bctextchars  _textcharssubstring(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextchars _tc,int _startindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharssubstring", true))
	 {return ((b4a.B4APagesNavBar.bctextengine._bctextchars) Debug.delegate(ba, "textcharssubstring", new Object[] {_tc,_startindex,_endindex}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub TextCharsSubstring(TC As BCTextChars,";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Return CreateBCTextChars(TC.Buffer, StartIndex +";
if (true) return __ref._createbctextchars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ (null,_tc.Buffer /*String[]*/ ,(int) (_startindex+_tc.StartIndex /*int*/ ),(int) (_endindex-_startindex));
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
return null;
}
public String  _setspacebetweencharacters(b4a.B4APagesNavBar.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweencharacters", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweencharacters", new Object[] {_f}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub setSpaceBetweenCharacters(f As Float)";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="mSpaceBetweenCharacters = f * mScale";
__ref._mspacebetweencharacters /*float*/  = (float) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return "";
}
public String  _setspacebetweenlines(b4a.B4APagesNavBar.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweenlines", new Object[] {_f}));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub setSpaceBetweenLines(f As Float)";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="mSpaceBetweenLines = f * mScale";
__ref._mspacebetweenlines /*int*/  = (int) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
return "";
}
public boolean  _isspace(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isspace", true))
	 {return ((Boolean) Debug.delegate(ba, "isspace", new Object[] {_tc}));}
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Private Sub IsSpace(TC As BCTextChars) As Boolean";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Return TextCharEquals(TC, \" \")";
if (true) return __ref._textcharequals /*boolean*/ (null,_tc," ");
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="End Sub";
return false;
}
public boolean  _textcharequals(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextchars _tc,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharequals", true))
	 {return ((Boolean) Debug.delegate(ba, "textcharequals", new Object[] {_tc,_s}));}
int _i = 0;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Private Sub TextCharEquals (TC As BCTextChars, s A";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="If TC.Length <> s.Length Then Return False";
if (_tc.Length /*int*/ !=_s.length()) { 
if (true) return __c.False;};
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="For i = 0 To TC.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_tc.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="If TC.Buffer(i + TC.StartIndex) <> s.CharAt(i) T";
if ((_tc.Buffer /*String[]*/ [(int) (_i+_tc.StartIndex /*int*/ )]).equals(BA.ObjectToString(_s.charAt(_i))) == false) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="End Sub";
return false;
}
public String  _organizelines(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizelines", true))
	 {return ((String) Debug.delegate(ba, "organizelines", new Object[] {_p}));}
String _paralignment = "";
int _count = 0;
int _prevlinebelowbaselineheight = 0;
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
int _maxwidth = 0;
String _alignment = "";
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _linestyle = null;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _last = null;
int _numberofgaps = 0;
float _delta = 0f;
float _accumalated = 0f;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub OrganizeLines (p As BCParagraph)";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim ParAlignment As String = p.Style.HorizontalAl";
_paralignment = _p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/ .toLowerCase();
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="Dim PrevLineBelowBaselineHeight As Int";
_prevlinebelowbaselineheight = 0;
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="p.Width = Max(p.Width, line.Width)";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,_line.Width /*int*/ ));
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=15728647;
 //BA.debugLineNum = 15728647;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_single = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="line.MaxHeightAboveBaseLine = Max(single.MaxHe";
_line.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_line.MaxHeightAboveBaseLine /*int*/ ));
RDebugUtils.currentLine=15728649;
 //BA.debugLineNum = 15728649;BA.debugLine="line.MaxHeightBelowBaseLine = Max(single.MaxHe";
_line.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=15728652;
 //BA.debugLineNum = 15728652;BA.debugLine="If count = 0 Then";
if (_count==0) { 
RDebugUtils.currentLine=15728653;
 //BA.debugLineNum = 15728653;BA.debugLine="line.Height = line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = _line.MaxHeightAboveBaseLine /*int*/ ;
 }else {
RDebugUtils.currentLine=15728655;
 //BA.debugLineNum = 15728655;BA.debugLine="line.Height =  Max(line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = (int) (__c.Max(_line.MaxHeightAboveBaseLine /*int*/ +_prevlinebelowbaselineheight+__ref._mmingapbetweenlines /*int*/ *__ref._mscale /*float*/ ,__ref._mspacebetweenlines /*int*/ *_p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .LineSpacingFactor /*float*/ ));
 };
RDebugUtils.currentLine=15728657;
 //BA.debugLineNum = 15728657;BA.debugLine="p.Height = p.Height + line.Height";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.Height /*int*/ );
RDebugUtils.currentLine=15728658;
 //BA.debugLineNum = 15728658;BA.debugLine="line.BaselineY = p.Height";
_line.BaselineY /*int*/  = _p.Height /*int*/ ;
RDebugUtils.currentLine=15728659;
 //BA.debugLineNum = 15728659;BA.debugLine="PrevLineBelowBaselineHeight = line.MaxHeightBelo";
_prevlinebelowbaselineheight = _line.MaxHeightBelowBaseLine /*int*/ ;
RDebugUtils.currentLine=15728660;
 //BA.debugLineNum = 15728660;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
RDebugUtils.currentLine=15728662;
 //BA.debugLineNum = 15728662;BA.debugLine="Dim MaxWidth As Int = (p.Style.MaxWidth - p.Style";
_maxwidth = (int) ((_p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ );
RDebugUtils.currentLine=15728663;
 //BA.debugLineNum = 15728663;BA.debugLine="p.Width = Min(MaxWidth, p.Width)";
_p.Width /*int*/  = (int) (__c.Min(_maxwidth,_p.Width /*int*/ ));
RDebugUtils.currentLine=15728664;
 //BA.debugLineNum = 15728664;BA.debugLine="p.Height = p.Height + line.MaxHeightBelowBaseLine";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ );
RDebugUtils.currentLine=15728665;
 //BA.debugLineNum = 15728665;BA.debugLine="Dim alignment As String";
_alignment = "";
RDebugUtils.currentLine=15728666;
 //BA.debugLineNum = 15728666;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group26 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group26.Get(index26));
RDebugUtils.currentLine=15728667;
 //BA.debugLineNum = 15728667;BA.debugLine="If line.Unbreakables.Size = 0 Then Continue";
if (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=15728668;
 //BA.debugLineNum = 15728668;BA.debugLine="Dim linestyle As BCSingleStyleSection = GetFirst";
_linestyle = __ref._getfirstsinglestyle /*b4a.B4APagesNavBar.bctextengine._bcsinglestylesection*/ (null,_line);
RDebugUtils.currentLine=15728669;
 //BA.debugLineNum = 15728669;BA.debugLine="If linestyle.Run.HorizontalAlignment = \"\" Then a";
if ((_linestyle.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ ).equals("")) { 
_alignment = _paralignment;}
else {
_alignment = _linestyle.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ .toLowerCase();};
RDebugUtils.currentLine=15728670;
 //BA.debugLineNum = 15728670;BA.debugLine="If alignment = \"left\" Then";
if ((_alignment).equals("left")) { 
RDebugUtils.currentLine=15728671;
 //BA.debugLineNum = 15728671;BA.debugLine="If linestyle.Run.IndentLevel > 0 Then";
if (_linestyle.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .IndentLevel /*int*/ >0) { 
RDebugUtils.currentLine=15728672;
 //BA.debugLineNum = 15728672;BA.debugLine="line.StartX = IndentWidth * linestyle.Run.Inde";
_line.StartX /*int*/  = (int) (__ref._indentwidth /*int*/ *_linestyle.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=15728673;
 //BA.debugLineNum = 15728673;BA.debugLine="p.Width = Max(p.Width, Min(MaxWidth, line.Widt";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,__c.Min(_maxwidth,_line.Width /*int*/ +_line.StartX /*int*/ )));
 };
 }else {
RDebugUtils.currentLine=15728676;
 //BA.debugLineNum = 15728676;BA.debugLine="p.Width = MaxWidth";
_p.Width /*int*/  = _maxwidth;
 };
RDebugUtils.currentLine=15728678;
 //BA.debugLineNum = 15728678;BA.debugLine="Select alignment";
switch (BA.switchObjectToInt(_alignment,"center","right","justify")) {
case 0: {
RDebugUtils.currentLine=15728680;
 //BA.debugLineNum = 15728680;BA.debugLine="line.StartX = p.Width / 2 - line.Width / 2";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ /(double)2-_line.Width /*int*/ /(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=15728682;
 //BA.debugLineNum = 15728682;BA.debugLine="line.StartX = p.Width - line.Width";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ -_line.Width /*int*/ );
 break; }
case 2: {
RDebugUtils.currentLine=15728684;
 //BA.debugLineNum = 15728684;BA.debugLine="If line.EndsWithSoftLineBreak Then";
if (_line.EndsWithSoftLineBreak /*boolean*/ ) { 
RDebugUtils.currentLine=15728685;
 //BA.debugLineNum = 15728685;BA.debugLine="Dim last As BCUnbreakableText = line.Unbreaka";
_last = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=15728686;
 //BA.debugLineNum = 15728686;BA.debugLine="If IsSpace(last.NotFullTextChars) Then";
if (__ref._isspace /*boolean*/ (null,_last.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ )) { 
RDebugUtils.currentLine=15728687;
 //BA.debugLineNum = 15728687;BA.debugLine="line.Unbreakables.RemoveAt(line.Unbreakables";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=15728688;
 //BA.debugLineNum = 15728688;BA.debugLine="line.Width = line.Width - last.Width";
_line.Width /*int*/  = (int) (_line.Width /*int*/ -_last.Width /*int*/ );
 };
RDebugUtils.currentLine=15728690;
 //BA.debugLineNum = 15728690;BA.debugLine="Dim NumberOfGaps As Int = line.Unbreakables.S";
_numberofgaps = (int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=15728691;
 //BA.debugLineNum = 15728691;BA.debugLine="If NumberOfGaps > 0 Then";
if (_numberofgaps>0) { 
RDebugUtils.currentLine=15728692;
 //BA.debugLineNum = 15728692;BA.debugLine="Dim delta As Float = (p.Width - line.Width)";
_delta = (float) ((_p.Width /*int*/ -_line.Width /*int*/ )/(double)_numberofgaps);
RDebugUtils.currentLine=15728693;
 //BA.debugLineNum = 15728693;BA.debugLine="Dim accumalated As Float = 0";
_accumalated = (float) (0);
RDebugUtils.currentLine=15728694;
 //BA.debugLineNum = 15728694;BA.debugLine="For Each un As BCUnbreakableText In line.Unb";
{
final anywheresoftware.b4a.BA.IterableList group54 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group54.Get(index54));
RDebugUtils.currentLine=15728695;
 //BA.debugLineNum = 15728695;BA.debugLine="un.StartX = un.StartX + accumalated";
_un.StartX /*int*/  = (int) (_un.StartX /*int*/ +_accumalated);
RDebugUtils.currentLine=15728696;
 //BA.debugLineNum = 15728696;BA.debugLine="accumalated = accumalated + delta";
_accumalated = (float) (_accumalated+_delta);
 }
};
 };
 };
 break; }
}
;
 }
};
RDebugUtils.currentLine=15728702;
 //BA.debugLineNum = 15728702;BA.debugLine="End Sub";
return "";
}
public String  _organizertlparagraph(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizertlparagraph", true))
	 {return ((String) Debug.delegate(ba, "organizertlparagraph", new Object[] {_par}));}
anywheresoftware.b4a.objects.collections.List _ltrlist = null;
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.collections.List _newlist = null;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub OrganizeRTLParagraph (par As BCParagra";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim LTRList As List";
_ltrlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="LTRList.Initialize";
_ltrlist.Initialize();
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group3 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="Dim NewList As List";
_newlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="NewList.Initialize";
_newlist.Initialize();
RDebugUtils.currentLine=15794186;
 //BA.debugLineNum = 15794186;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=15794187;
 //BA.debugLineNum = 15794187;BA.debugLine="If un.RTL Then";
if (_un.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=15794188;
 //BA.debugLineNum = 15794188;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=15794189;
 //BA.debugLineNum = 15794189;BA.debugLine="NewList.Add(un)";
_newlist.Add((Object)(_un));
 }else {
RDebugUtils.currentLine=15794191;
 //BA.debugLineNum = 15794191;BA.debugLine="LTRList.InsertAt(0, un)";
_ltrlist.InsertAt((int) (0),(Object)(_un));
 };
 }
};
RDebugUtils.currentLine=15794194;
 //BA.debugLineNum = 15794194;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=15794195;
 //BA.debugLineNum = 15794195;BA.debugLine="line.Unbreakables = NewList";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/  = _newlist;
RDebugUtils.currentLine=15794200;
 //BA.debugLineNum = 15794200;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group16 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group16.Get(index16));
RDebugUtils.currentLine=15794201;
 //BA.debugLineNum = 15794201;BA.debugLine="un.StartX = line.Width - un.StartX";
_un.StartX /*int*/  = (int) (_line.Width /*int*/ -_un.StartX /*int*/ );
RDebugUtils.currentLine=15794202;
 //BA.debugLineNum = 15794202;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=15794203;
 //BA.debugLineNum = 15794203;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group19 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_single = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(group19.Get(index19));
RDebugUtils.currentLine=15794204;
 //BA.debugLineNum = 15794204;BA.debugLine="x = x - single.Width";
_x = (int) (_x-_single.Width /*int*/ );
RDebugUtils.currentLine=15794205;
 //BA.debugLineNum = 15794205;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=15794206;
 //BA.debugLineNum = 15794206;BA.debugLine="x = x - mSpaceBetweenCharacters";
_x = (int) (_x-__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=15794207;
 //BA.debugLineNum = 15794207;BA.debugLine="If single.Run.View.IsInitialized Then";
if (_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=15794208;
 //BA.debugLineNum = 15794208;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=15794209;
 //BA.debugLineNum = 15794209;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ ));
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=15794214;
 //BA.debugLineNum = 15794214;BA.debugLine="End Sub";
return "";
}
public String  _organizesinglestyles(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizesinglestyles", true))
	 {return ((String) Debug.delegate(ba, "organizesinglestyles", new Object[] {_p}));}
b4a.B4APagesNavBar.bctextengine._bctextline _line = null;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.B4APagesNavBar.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub OrganizeSingleStyles (p As BCParagraph";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group1 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.B4APagesNavBar.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group4 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_single = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(group4.Get(index4));
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="If single.GlyphsAndOffsets.Size = 0 And single";
if (_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="Dim par As BCParagraph = single.ParentUN.Pare";
_par = _single.ParentUN /*b4a.B4APagesNavBar.bctextengine._bcunbreakabletext*/ .ParentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .ParentParagraph /*b4a.B4APagesNavBar.bctextengine._bcparagraph*/ ;
RDebugUtils.currentLine=15990793;
 //BA.debugLineNum = 15990793;BA.debugLine="If par.Views.IsInitialized = False Then par.V";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=15990795;
 //BA.debugLineNum = 15990795;BA.debugLine="v.Top = line.BaselineY / mScale - v.Height +";
_v.setTop((int) (_line.BaselineY /*int*/ /(double)__ref._mscale /*float*/ -_v.getHeight()+_single.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .VerticalOffset /*int*/ ));
RDebugUtils.currentLine=15990796;
 //BA.debugLineNum = 15990796;BA.debugLine="par.Views.Add(v)";
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v.getObject()));
 };
RDebugUtils.currentLine=15990798;
 //BA.debugLineNum = 15990798;BA.debugLine="x = x + single.Width + mSpaceBetweenCharacters";
_x = (int) (_x+_single.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
 }
};
 }
};
 }
};
RDebugUtils.currentLine=15990802;
 //BA.debugLineNum = 15990802;BA.debugLine="End Sub";
return "";
}
public String  _organizeunbreakables(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bcparagraph _p,anywheresoftware.b4a.objects.collections.List _unbreakables) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "organizeunbreakables", new Object[] {_p,_unbreakables}));}
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _un = null;
int _i = 0;
b4a.B4APagesNavBar.bctextengine._bcunbreakabletext _nextun = null;
b4a.B4APagesNavBar.bctextengine._bcsinglestylesection _singlestyle = null;
int _indent = 0;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub OrganizeUnbreakables (p As BCParagraph";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="If unbreakables.Size = 0 Then Return";
if (_unbreakables.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim un As BCUnbreakableText = unbreakables.Get(0)";
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_unbreakables.Get((int) (0)));
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="Dim i As Int = 1";
_i = (int) (1);
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="Do While i < unbreakables.Size";
while (_i<_unbreakables.getSize()) {
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="Dim NextUn As BCUnbreakableText = unbreakables.G";
_nextun = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(_unbreakables.Get(_i));
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="If un.IsMergable = True And NextUn.IsMergable =";
if (_un.IsMergable /*boolean*/ ==__c.True && _nextun.IsMergable /*boolean*/ ==__c.True && _un.RTL /*boolean*/ ==_nextun.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="MergeUnbreakables(un, NextUn)";
__ref._mergeunbreakables /*String*/ (null,_un,_nextun);
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="unbreakables.RemoveAt(i)";
_unbreakables.RemoveAt(_i);
RDebugUtils.currentLine=16449545;
 //BA.debugLineNum = 16449545;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 }else {
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="un = NextUn";
_un = _nextun;
 };
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="For Each un As BCUnbreakableText In unbreakables";
{
final anywheresoftware.b4a.BA.IterableList group15 = _unbreakables;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_un = (b4a.B4APagesNavBar.bctextengine._bcunbreakabletext)(group15.Get(index15));
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(13))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (13))))) { 
if (true) continue;};
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(10))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (10))))) { 
RDebugUtils.currentLine=16449554;
 //BA.debugLineNum = 16449554;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
RDebugUtils.currentLine=16449555;
 //BA.debugLineNum = 16449555;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=16449557;
 //BA.debugLineNum = 16449557;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 And p.Sty";
if (_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && _p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/ ) { 
RDebugUtils.currentLine=16449558;
 //BA.debugLineNum = 16449558;BA.debugLine="Dim SingleStyle As BCSingleStyleSection = un.Si";
_singlestyle = (b4a.B4APagesNavBar.bctextengine._bcsinglestylesection)(_un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=16449559;
 //BA.debugLineNum = 16449559;BA.debugLine="Dim indent As Int = IndentWidth * SingleStyle.R";
_indent = (int) (__ref._indentwidth /*int*/ *_singlestyle.Run /*b4a.B4APagesNavBar.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=16449560;
 //BA.debugLineNum = 16449560;BA.debugLine="If p.CurrentLine.Width + mSpaceBetweenCharacter";
if (_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_un.Width /*int*/ +_indent>(_p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4a.B4APagesNavBar.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=16449561;
 //BA.debugLineNum = 16449561;BA.debugLine="p.CurrentLine.EndsWithSoftLineBreak = True";
_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .EndsWithSoftLineBreak /*boolean*/  = __c.True;
RDebugUtils.currentLine=16449562;
 //BA.debugLineNum = 16449562;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
 };
 };
RDebugUtils.currentLine=16449565;
 //BA.debugLineNum = 16449565;BA.debugLine="p.CurrentLine.Unbreakables.Add(un)";
_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_un));
RDebugUtils.currentLine=16449566;
 //BA.debugLineNum = 16449566;BA.debugLine="un.ParentLine = p.CurrentLine";
_un.ParentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/  = _p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ ;
RDebugUtils.currentLine=16449567;
 //BA.debugLineNum = 16449567;BA.debugLine="If un.Anchor <> \"\" Then";
if ((_un.Anchor /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=16449568;
 //BA.debugLineNum = 16449568;BA.debugLine="If p.Anchors.IsInitialized = False Then p.Ancho";
if (_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=16449569;
 //BA.debugLineNum = 16449569;BA.debugLine="p.Anchors.Put(un.Anchor, p.CurrentLine)";
_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_un.Anchor /*String*/ ),(Object)(_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ ));
 };
RDebugUtils.currentLine=16449571;
 //BA.debugLineNum = 16449571;BA.debugLine="If IsSpace(un.NotFullTextChars) And p.CurrentLin";
if (__ref._isspace /*boolean*/ (null,_un.NotFullTextChars /*b4a.B4APagesNavBar.bctextengine._bctextchars*/ ) && _p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=16449572;
 //BA.debugLineNum = 16449572;BA.debugLine="un.Width = 0";
_un.Width /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=16449574;
 //BA.debugLineNum = 16449574;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 Then p.Cu";
if (_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );};
RDebugUtils.currentLine=16449575;
 //BA.debugLineNum = 16449575;BA.debugLine="un.StartX = p.CurrentLine.Width";
_un.StartX /*int*/  = _p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Width /*int*/ ;
RDebugUtils.currentLine=16449576;
 //BA.debugLineNum = 16449576;BA.debugLine="p.CurrentLine.Width = p.CurrentLine.Width + un.W";
_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4a.B4APagesNavBar.bctextengine._bctextline*/ .Width /*int*/ +_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=16449578;
 //BA.debugLineNum = 16449578;BA.debugLine="End Sub";
return "";
}
public String  _printtextchars(b4a.B4APagesNavBar.bctextengine __ref,b4a.B4APagesNavBar.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "printtextchars", true))
	 {return ((String) Debug.delegate(ba, "printtextchars", new Object[] {_tc}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub PrintTextChars(TC As BCTextChars)";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="For i = TC.StartIndex To TC.StartIndex + TC.Lengt";
{
final int step3 = 1;
final int limit3 = (int) (_tc.StartIndex /*int*/ +_tc.Length /*int*/ -1);
_i = _tc.StartIndex /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="sb.Append(TC.Buffer(i))";
_sb.Append(_tc.Buffer /*String[]*/ [_i]);
 }
};
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("919005446",_sb.ToString(),0);
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="End Sub";
return "";
}
public String  _releaseasyncbc(b4a.B4APagesNavBar.bctextengine __ref,b4a.example.bitmapcreator _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "releaseasyncbc", true))
	 {return ((String) Debug.delegate(ba, "releaseasyncbc", new Object[] {_bc}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub ReleaseAsyncBC(bc As BitmapCreator)";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="AsyncBCs.Put(bc, False)";
__ref._asyncbcs /*b4a.B4APagesNavBar.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.False));
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="End Sub";
return "";
}
public String  _setmingapbetweenlines(b4a.B4APagesNavBar.bctextengine __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setmingapbetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setmingapbetweenlines", new Object[] {_i}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub setMinGapBetweenLines(i As Int)";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="mMinGapBetweenLines = i";
__ref._mmingapbetweenlines /*int*/  = _i;
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="End Sub";
return "";
}
}