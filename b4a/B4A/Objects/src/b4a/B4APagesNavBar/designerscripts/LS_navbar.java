package b4a.B4APagesNavBar.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_navbar{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _gap="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlnavbarfront").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlnavbarfront").vw.getWidth() / 2)));
_gap = BA.NumberToString((20d / 100 * width));
views.get("btnmainpage").vw.setLeft((int)(Double.parseDouble(_gap)-(20d * scale)));
views.get("btnpage2").vw.setLeft((int)(Double.parseDouble(_gap)+((100d / 100 * width)-Double.parseDouble(_gap))/4d-(20d * scale)));
views.get("btnpage3").vw.setLeft((int)(Double.parseDouble(_gap)+((100d / 100 * width)-Double.parseDouble(_gap))/4d*2d-(20d * scale)));
views.get("btnpage4").vw.setLeft((int)(Double.parseDouble(_gap)+((100d / 100 * width)-Double.parseDouble(_gap))/4d*3d-(20d * scale)));

}
}