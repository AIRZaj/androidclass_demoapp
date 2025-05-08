package b4a.B4APagesNavBar;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bctoast extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.B4APagesNavBar.bctoast");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.B4APagesNavBar.bctoast.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _showindex = 0;
public b4a.B4APagesNavBar.bblabel _bb1 = null;
public b4a.B4APagesNavBar.bctextengine _te = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public int _durationms = 0;
public int _defaulttextcolor = 0;
public int _paddingsides = 0;
public int _paddingtopbottom = 0;
public int _maxheight = 0;
public int _verticalcenterpercentage = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.B4APagesNavBar.main _main = null;
public b4a.B4APagesNavBar.starter _starter = null;
public b4a.B4APagesNavBar.b4xpages _b4xpages = null;
public b4a.B4APagesNavBar.b4xcollections _b4xcollections = null;
public b4a.B4APagesNavBar.httputils2service _httputils2service = null;
public b4a.B4APagesNavBar.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.B4APagesNavBar.bctoast __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctoast";
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Public pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Private ShowIndex As Int";
_showindex = 0;
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="Public BB1 As BBLabel";
_bb1 = new b4a.B4APagesNavBar.bblabel();
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Private te As BCTextEngine";
_te = new b4a.B4APagesNavBar.bctextengine();
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="Public DurationMs As Int = 3000";
_durationms = (int) (3000);
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="Public DefaultTextColor As Int = 0xFF3E3E3E";
_defaulttextcolor = ((int)0xff3e3e3e);
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="Public PaddingSides As Int = 15dip";
_paddingsides = __c.DipToCurrent((int) (15));
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="Public PaddingTopBottom As Int = 10dip";
_paddingtopbottom = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="Public MaxHeight As Int = 100dip";
_maxheight = __c.DipToCurrent((int) (100));
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="Public VerticalCenterPercentage As Int = 85";
_verticalcenterpercentage = (int) (85);
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.B4APagesNavBar.bctoast __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctoast";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="pnl = xui.CreatePanel(\"\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Parent.AddView(pnl, 0, 0, Parent.Width - 30dip, M";
_parent.AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (_parent.getWidth()-__c.DipToCurrent((int) (30))),__ref._maxheight /*int*/ );
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="pnl.LoadLayout(\"BCToast\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("BCToast",ba);
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="pnl.SetColorAndBorder(0xFFC3C3C3, 0dip, xui.Color";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xffc3c3c3),__c.DipToCurrent((int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="pnl.Visible = False";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="te.Initialize(pnl)";
__ref._te /*b4a.B4APagesNavBar.bctextengine*/ ._initialize /*String*/ (null,ba,__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="iv = BB1.mBase.GetView(0)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="BB1.DisableResizeEvent = True";
__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._disableresizeevent /*boolean*/  = __c.True;
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Dim p As Panel = pnl";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="p.Elevation = 5dip";
_p.setElevation((float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="End Sub";
return "";
}
public void  _show(b4a.B4APagesNavBar.bctoast __ref,String _message) throws Exception{
RDebugUtils.currentModule="bctoast";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_message}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_message);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.B4APagesNavBar.bctoast parent,b4a.B4APagesNavBar.bctoast __ref,String _message) {
this.parent = parent;
this.__ref = __ref;
this._message = _message;
this.__ref = parent;
}
b4a.B4APagesNavBar.bctoast __ref;
b4a.B4APagesNavBar.bctoast parent;
String _message;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
int _w = 0;
int _h = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
int _newleft = 0;
int _dx = 0;
int _dy = 0;
int _myindex = 0;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bctoast";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="BB1.ParseData.DefaultColor = DefaultTextColor";
__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._parsedata /*b4a.B4APagesNavBar.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = __ref._defaulttextcolor /*int*/ ;
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="For Each v As B4XView In pnl.GetAllViewsRecursive";
if (true) break;

case 1:
//for
this.state = 10;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group3 = __ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index3 = 0;
groupLen3 = group3.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index3 < groupLen3) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));}
if (true) break;

case 20:
//C
this.state = 19;
index3++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="If v.Tag = \"to remove\" Then v.RemoveViewFromPare";
if (true) break;

case 4:
//if
this.state = 9;
if ((_v.getTag()).equals((Object)("to remove"))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_v.RemoveViewFromParent();
if (true) break;

case 9:
//C
this.state = 20;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="pnl.Width = pnl.Parent.Width - 2 * PaddingSides";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getWidth()-2*__ref._paddingsides /*int*/ ));
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="pnl.Height = MaxHeight";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._maxheight /*int*/ );
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="BB1.mBase.Width = pnl.Width";
__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="BB1.mBase.Height = pnl.Height";
__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="BB1.mBase.AddView(iv, 0, 0, BB1.mBase.Width, BB1.";
__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="BB1.Text = Message";
__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._settext /*String*/ (null,_message);
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="Dim iv As B4XView = BB1.mBase.GetView(0)";
parent._iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._iv = __ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="Dim w As Int = iv.Width + 2 * PaddingSides";
_w = (int) (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+2*__ref._paddingsides /*int*/ );
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="Dim h As Int = iv.Height + 2 * PaddingTopBottom";
_h = (int) (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+2*__ref._paddingtopbottom /*int*/ );
RDebugUtils.currentLine=11534352;
 //BA.debugLineNum = 11534352;BA.debugLine="Dim Parent As B4XView = pnl.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = __ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="Dim NewLeft As Int = Parent.Width / 2 - w / 2";
_newleft = (int) (_parent.getWidth()/(double)2-_w/(double)2);
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="pnl.SetLayoutAnimated(0, NewLeft, Parent.Height *";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_newleft,(int) (_parent.getHeight()*__ref._verticalcenterpercentage /*int*/ /(double)100-_h/(double)2),_w,_h);
RDebugUtils.currentLine=11534355;
 //BA.debugLineNum = 11534355;BA.debugLine="pnl.BringToFront";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=11534356;
 //BA.debugLineNum = 11534356;BA.debugLine="Dim dx As Int = PaddingSides - iv.Left";
_dx = (int) (__ref._paddingsides /*int*/ -__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=11534357;
 //BA.debugLineNum = 11534357;BA.debugLine="Dim dy As Int = PaddingTopBottom - iv.Top";
_dy = (int) (__ref._paddingtopbottom /*int*/ -__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
RDebugUtils.currentLine=11534358;
 //BA.debugLineNum = 11534358;BA.debugLine="pnl.AddView(iv, PaddingSides, PaddingTopBottom, i";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._paddingsides /*int*/ ,__ref._paddingtopbottom /*int*/ ,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11534360;
 //BA.debugLineNum = 11534360;BA.debugLine="Do While BB1.mBase.NumberOfViews > 0";
if (true) break;

case 11:
//do while
this.state = 14;
while (__ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()>0) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
RDebugUtils.currentLine=11534361;
 //BA.debugLineNum = 11534361;BA.debugLine="Dim v As B4XView = BB1.mBase.GetView(0)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = __ref._bb1 /*b4a.B4APagesNavBar.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=11534362;
 //BA.debugLineNum = 11534362;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=11534363;
 //BA.debugLineNum = 11534363;BA.debugLine="v.Tag = \"to remove\"";
_v.setTag((Object)("to remove"));
RDebugUtils.currentLine=11534364;
 //BA.debugLineNum = 11534364;BA.debugLine="pnl.AddView(v, dx + v.Left, dy + v.Top, v.Width,";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_v.getObject()),(int) (_dx+_v.getLeft()),(int) (_dy+_v.getTop()),_v.getWidth(),_v.getHeight());
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=11534366;
 //BA.debugLineNum = 11534366;BA.debugLine="pnl.SetVisibleAnimated(200, True)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (200),parent.__c.True);
RDebugUtils.currentLine=11534367;
 //BA.debugLineNum = 11534367;BA.debugLine="ShowIndex = ShowIndex + 1";
__ref._showindex /*int*/  = (int) (__ref._showindex /*int*/ +1);
RDebugUtils.currentLine=11534368;
 //BA.debugLineNum = 11534368;BA.debugLine="Dim MyIndex As Int = ShowIndex";
_myindex = __ref._showindex /*int*/ ;
RDebugUtils.currentLine=11534369;
 //BA.debugLineNum = 11534369;BA.debugLine="Sleep(DurationMs)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bctoast", "show"),__ref._durationms /*int*/ );
this.state = 21;
return;
case 21:
//C
this.state = 15;
;
RDebugUtils.currentLine=11534370;
 //BA.debugLineNum = 11534370;BA.debugLine="If MyIndex = ShowIndex Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_myindex==__ref._showindex /*int*/ ) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=11534371;
 //BA.debugLineNum = 11534371;BA.debugLine="pnl.SetVisibleAnimated(200, False)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (200),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=11534374;
 //BA.debugLineNum = 11534374;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}