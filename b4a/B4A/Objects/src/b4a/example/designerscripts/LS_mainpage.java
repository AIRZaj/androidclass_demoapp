package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlmainpage").vw.setTop((int)((0d / 100 * height)));
views.get("pnlmainpage").vw.setHeight((int)((103.4d * scale)));
views.get("pnlmainpage").vw.setWidth((int)((100d / 100 * width)));
views.get("logo").vw.setWidth((int)((88.6d * scale)));
views.get("logo").vw.setHeight((int)((views.get("pnlmainpage").vw.getHeight())-(1d * scale)));
views.get("label1").vw.setTop((int)((views.get("pnlmainpage").vw.getHeight())/2d-(views.get("label1").vw.getHeight())/2d));
views.get("label1").vw.setLeft((int)((views.get("logo").vw.getLeft() + views.get("logo").vw.getWidth())+(10d * scale)));
views.get("news").vw.setHeight((int)(((100d / 100 * height)-(views.get("pnlmainpage").vw.getHeight()))/5d));
views.get("news").vw.setWidth((int)((100d / 100 * width)));
views.get("news").vw.setLeft((int)((0d / 100 * width)));
views.get("news").vw.setLeft((int)((100d / 100 * width) - (views.get("news").vw.getWidth())));
views.get("news").vw.setTop((int)((views.get("pnlmainpage").vw.getTop() + views.get("pnlmainpage").vw.getHeight())+(10d * scale)));
views.get("newsimage").vw.setLeft((int)((0d / 100 * width)));
views.get("newsimage").vw.setHeight((int)((views.get("news").vw.getHeight())));
views.get("newstitle").vw.setTop((int)((5d * scale)));
views.get("newstitle").vw.setHeight((int)((30d * scale)));
views.get("newstitle").vw.setLeft((int)((views.get("newsimage").vw.getLeft() + views.get("newsimage").vw.getWidth())+(10d * scale)));
views.get("newstitle").vw.setWidth((int)((60d / 100 * width)));
views.get("newsdsc").vw.setTop((int)((40d * scale)));
views.get("newsdsc").vw.setHeight((int)((30d * scale)));
views.get("newsdsc").vw.setLeft((int)((views.get("newsimage").vw.getLeft() + views.get("newsimage").vw.getWidth())+(10d * scale)));
views.get("newsdsc").vw.setWidth((int)((60d / 100 * width)));

}
}