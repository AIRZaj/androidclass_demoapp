package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_detail2{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _middleofpanel2="";
String _halfwidth="";
String _imagewidth="";
String _spacing="";
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[detail2/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="Panel1.Width = 150dip  ' Lepiej użyć dip niż %x, aby zachować proporcje"[detail2/General script]
views.get("panel1").vw.setWidth((int)((150d * scale)));
//BA.debugLineNum = 5;BA.debugLine="Panel1.Height = 150dip"[detail2/General script]
views.get("panel1").vw.setHeight((int)((150d * scale)));
//BA.debugLineNum = 6;BA.debugLine="Panel1.VerticalCenter = 20%y"[detail2/General script]
views.get("panel1").vw.setTop((int)((20d / 100 * height) - (views.get("panel1").vw.getHeight() / 2)));
//BA.debugLineNum = 7;BA.debugLine="Panel1.HorizontalCenter = 50%x"[detail2/General script]
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
//BA.debugLineNum = 8;BA.debugLine="ImgAvatar.Height = Panel1.Height"[detail2/General script]
views.get("imgavatar").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
//BA.debugLineNum = 9;BA.debugLine="ImgAvatar.Width = Panel1.Width"[detail2/General script]
views.get("imgavatar").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
//BA.debugLineNum = 10;BA.debugLine="borderAvatar.Height = ImgAvatar.Height"[detail2/General script]
views.get("borderavatar").vw.setHeight((int)((views.get("imgavatar").vw.getHeight())));
//BA.debugLineNum = 11;BA.debugLine="borderAvatar.Width = ImgAvatar.Width"[detail2/General script]
views.get("borderavatar").vw.setWidth((int)((views.get("imgavatar").vw.getWidth())));
//BA.debugLineNum = 16;BA.debugLine="Panel2.SetLeftAndRight(10%x, 10%x)"[detail2/General script]
views.get("panel2").vw.setLeft((int)((10d / 100 * width)));
views.get("panel2").vw.setWidth((int)((10d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 17;BA.debugLine="Panel2.Height = 70%y"[detail2/General script]
views.get("panel2").vw.setHeight((int)((70d / 100 * height)));
//BA.debugLineNum = 18;BA.debugLine="Panel2.Width = 80%x"[detail2/General script]
views.get("panel2").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 19;BA.debugLine="Panel2.Top = Panel1.Bottom - 200"[detail2/General script]
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())-200d));
//BA.debugLineNum = 23;BA.debugLine="lblName.HorizontalCenter = 50%x"[detail2/General script]
views.get("lblname").vw.setLeft((int)((50d / 100 * width) - (views.get("lblname").vw.getWidth() / 2)));
//BA.debugLineNum = 24;BA.debugLine="lblName.Top = 15%y"[detail2/General script]
views.get("lblname").vw.setTop((int)((15d / 100 * height)));
//BA.debugLineNum = 25;BA.debugLine="lblName.Width = 80%x"[detail2/General script]
views.get("lblname").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 28;BA.debugLine="lblMail.Top = lblName.Bottom + 10"[detail2/General script]
views.get("lblmail").vw.setTop((int)((views.get("lblname").vw.getTop() + views.get("lblname").vw.getHeight())+10d));
//BA.debugLineNum = 29;BA.debugLine="lblMail.Width = 80%x"[detail2/General script]
views.get("lblmail").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="lblMail.SetLeftAndRight(10%x,90%x)"[detail2/General script]
views.get("lblmail").vw.setLeft((int)((10d / 100 * width)));
views.get("lblmail").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 34;BA.debugLine="MiddleOfPanel2 = Panel2.Width / 2"[detail2/General script]
_middleofpanel2 = BA.NumberToString((views.get("panel2").vw.getWidth())/2d);
//BA.debugLineNum = 35;BA.debugLine="lblName.Left = MiddleOfPanel2 - lblName.Width / 2"[detail2/General script]
views.get("lblname").vw.setLeft((int)(Double.parseDouble(_middleofpanel2)-(views.get("lblname").vw.getWidth())/2d));
//BA.debugLineNum = 37;BA.debugLine="MiddleOfPanel2 = Panel2.Width / 2"[detail2/General script]
_middleofpanel2 = BA.NumberToString((views.get("panel2").vw.getWidth())/2d);
//BA.debugLineNum = 38;BA.debugLine="lblMail.Left = MiddleOfPanel2 - lblMail.Width / 2"[detail2/General script]
views.get("lblmail").vw.setLeft((int)(Double.parseDouble(_middleofpanel2)-(views.get("lblmail").vw.getWidth())/2d));
//BA.debugLineNum = 41;BA.debugLine="lblDeptDsc.Top = lblMail.Bottom + 30dip"[detail2/General script]
views.get("lbldeptdsc").vw.setTop((int)((views.get("lblmail").vw.getTop() + views.get("lblmail").vw.getHeight())+(30d * scale)));
//BA.debugLineNum = 42;BA.debugLine="lblDept.Top = lblDeptDsc.Bottom - 10dip"[detail2/General script]
views.get("lbldept").vw.setTop((int)((views.get("lbldeptdsc").vw.getTop() + views.get("lbldeptdsc").vw.getHeight())-(10d * scale)));
//BA.debugLineNum = 44;BA.debugLine="lblRoomDsc.Top = lblMail.Bottom + 30dip"[detail2/General script]
views.get("lblroomdsc").vw.setTop((int)((views.get("lblmail").vw.getTop() + views.get("lblmail").vw.getHeight())+(30d * scale)));
//BA.debugLineNum = 45;BA.debugLine="lblRoom.Top = lblRoomDsc.Bottom - 10dip"[detail2/General script]
views.get("lblroom").vw.setTop((int)((views.get("lblroomdsc").vw.getTop() + views.get("lblroomdsc").vw.getHeight())-(10d * scale)));
//BA.debugLineNum = 49;BA.debugLine="halfWidth = (Panel2.Width - 20dip) / 2"[detail2/General script]
_halfwidth = BA.NumberToString(((views.get("panel2").vw.getWidth())-(20d * scale))/2d);
//BA.debugLineNum = 52;BA.debugLine="lblDeptDsc.Left = 10dip"[detail2/General script]
views.get("lbldeptdsc").vw.setLeft((int)((10d * scale)));
//BA.debugLineNum = 53;BA.debugLine="lblDeptDsc.Width = halfWidth"[detail2/General script]
views.get("lbldeptdsc").vw.setWidth((int)(Double.parseDouble(_halfwidth)));
//BA.debugLineNum = 55;BA.debugLine="lblDept.Left = 10dip"[detail2/General script]
views.get("lbldept").vw.setLeft((int)((10d * scale)));
//BA.debugLineNum = 56;BA.debugLine="lblDept.Width = halfWidth"[detail2/General script]
views.get("lbldept").vw.setWidth((int)(Double.parseDouble(_halfwidth)));
//BA.debugLineNum = 59;BA.debugLine="lblRoomDsc.Left = 10dip + halfWidth + 10dip"[detail2/General script]
views.get("lblroomdsc").vw.setLeft((int)((10d * scale)+Double.parseDouble(_halfwidth)+(10d * scale)));
//BA.debugLineNum = 60;BA.debugLine="lblRoomDsc.Width = halfWidth"[detail2/General script]
views.get("lblroomdsc").vw.setWidth((int)(Double.parseDouble(_halfwidth)));
//BA.debugLineNum = 62;BA.debugLine="lblRoom.Left = lblRoomDsc.Left"[detail2/General script]
views.get("lblroom").vw.setLeft((int)((views.get("lblroomdsc").vw.getLeft())));
//BA.debugLineNum = 63;BA.debugLine="lblRoom.Width = halfWidth"[detail2/General script]
views.get("lblroom").vw.setWidth((int)(Double.parseDouble(_halfwidth)));
//BA.debugLineNum = 68;BA.debugLine="imageWidth = 10%x"[detail2/General script]
_imagewidth = BA.NumberToString((10d / 100 * width));
//BA.debugLineNum = 70;BA.debugLine="spacing = (Panel2.Width - (imageWidth * 3)) / 4"[detail2/General script]
_spacing = BA.NumberToString(((views.get("panel2").vw.getWidth())-(Double.parseDouble(_imagewidth)*3d))/4d);
//BA.debugLineNum = 73;BA.debugLine="ImgView1.Width = imageWidth"[detail2/General script]
views.get("imgview1").vw.setWidth((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 74;BA.debugLine="ImgView2.Width = imageWidth"[detail2/General script]
views.get("imgview2").vw.setWidth((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 75;BA.debugLine="ImgView3.Width = imageWidth"[detail2/General script]
views.get("imgview3").vw.setWidth((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 76;BA.debugLine="ImgView1.Height = imageWidth"[detail2/General script]
views.get("imgview1").vw.setHeight((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 77;BA.debugLine="ImgView2.Height = imageWidth"[detail2/General script]
views.get("imgview2").vw.setHeight((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 78;BA.debugLine="ImgView3.Height = imageWidth"[detail2/General script]
views.get("imgview3").vw.setHeight((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 79;BA.debugLine="MailButton.Height = imageWidth"[detail2/General script]
views.get("mailbutton").vw.setHeight((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 80;BA.debugLine="MailButton.Width = imageWidth"[detail2/General script]
views.get("mailbutton").vw.setWidth((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 81;BA.debugLine="MessageButton.Height = imageWidth"[detail2/General script]
views.get("messagebutton").vw.setHeight((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 82;BA.debugLine="MessageButton.Width = imageWidth"[detail2/General script]
views.get("messagebutton").vw.setWidth((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 83;BA.debugLine="PhoneButton.Height = imageWidth"[detail2/General script]
views.get("phonebutton").vw.setHeight((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 84;BA.debugLine="PhoneButton.Width = imageWidth"[detail2/General script]
views.get("phonebutton").vw.setWidth((int)(Double.parseDouble(_imagewidth)));
//BA.debugLineNum = 86;BA.debugLine="MailButton.Left = spacing"[detail2/General script]
views.get("mailbutton").vw.setLeft((int)(Double.parseDouble(_spacing)));
//BA.debugLineNum = 87;BA.debugLine="MessageButton.Left = MailButton.Right + spacing"[detail2/General script]
views.get("messagebutton").vw.setLeft((int)((views.get("mailbutton").vw.getLeft() + views.get("mailbutton").vw.getWidth())+Double.parseDouble(_spacing)));
//BA.debugLineNum = 89;BA.debugLine="MailButton.Top = lblRoom.Bottom + 10dip"[detail2/General script]
views.get("mailbutton").vw.setTop((int)((views.get("lblroom").vw.getTop() + views.get("lblroom").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 90;BA.debugLine="MessageButton.Top = MailButton.Top"[detail2/General script]
views.get("messagebutton").vw.setTop((int)((views.get("mailbutton").vw.getTop())));
//BA.debugLineNum = 92;BA.debugLine="PhoneButton.Top = MailButton.Top"[detail2/General script]
views.get("phonebutton").vw.setTop((int)((views.get("mailbutton").vw.getTop())));
//BA.debugLineNum = 93;BA.debugLine="PhoneButton.Left = MessageButton.Right + spacing"[detail2/General script]
views.get("phonebutton").vw.setLeft((int)((views.get("messagebutton").vw.getLeft() + views.get("messagebutton").vw.getWidth())+Double.parseDouble(_spacing)));
//BA.debugLineNum = 95;BA.debugLine="ImgView1.Top=0"[detail2/General script]
views.get("imgview1").vw.setTop((int)(0d));
//BA.debugLineNum = 96;BA.debugLine="ImgView1.Left=0"[detail2/General script]
views.get("imgview1").vw.setLeft((int)(0d));
//BA.debugLineNum = 98;BA.debugLine="ImgView2.Top=0"[detail2/General script]
views.get("imgview2").vw.setTop((int)(0d));
//BA.debugLineNum = 99;BA.debugLine="ImgView2.Left=0"[detail2/General script]
views.get("imgview2").vw.setLeft((int)(0d));
//BA.debugLineNum = 101;BA.debugLine="ImgView3.Top=0"[detail2/General script]
views.get("imgview3").vw.setTop((int)(0d));
//BA.debugLineNum = 102;BA.debugLine="ImgView3.Left=0"[detail2/General script]
views.get("imgview3").vw.setLeft((int)(0d));

}
}