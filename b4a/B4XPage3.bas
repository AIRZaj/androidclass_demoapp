B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	'Private lblInfo As B4XView
	Dim lbl As Label
	Dim info As String
	Private Panel1 As B4XView
	Private lblName As B4XView
	Private lblTitle As B4XView
	Private lblDept As B4XView
	Private lblRoom As B4XView
	Private lblPhone As B4XView
	Private lblMail As B4XView
	Private ImgAvatar As B4XImageView
	Private ImgView1 As B4XImageView
	Private ImgView2 As B4XImageView
	Private ImgView3 As B4XImageView
	Private phoneNumber As String
End Sub

Public Sub Initialize
	' Do nothing
End Sub



Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.Color = xui.Color_White
	Root.LoadLayout("detail2")
	
	ImgAvatar.Load(File.DirAssets, "avatar.png")
	' Tworzenie etykiety w sposób zgodny z B4XPages
	'Dim lbl As Label
	'lbl.Initialize("")
	'lbl.TextSize = 16
	'lbl.TextColor = xui.Color_White
	'lbl.Text = "Szczegóły osoby..."
	'lbl.Color = xui.Color_Black
    
	' Konwersja Label na B4XView
	'lblInfo = lbl
	'lblInfo.SetTextAlignment("TOP", "LEFT") ' Ustawienie wyrównania tekstu
    
	' Dodanie etykiety do Root
	'Root.AddView(lblInfo, 10dip, 10dip, 90%x, 100dip) ' Wysokość dostosowana do treści
	
End Sub



Public Sub LoadPerson(p As Map)
	'lblTitle.Text = $"Tytuł: ${p.Get("tytul")}"$
	lblName.Text = $"${p.Get("tytul")}. ${p.Get("imie")} ${p.Get("nazwisko")}"$
	lblDept.Text = $"${p.Get("zaklad")}"$
	lblRoom.Text = $"${p.Get("pokoj")}"$
	lblMail.Text = $"${p.Get("mail")}"$
	phoneNumber=p.Get("telefon")
End Sub

Sub ImgView1_Click
	Log("Klik działa")
End Sub

Sub Panel3_Click
	Log("Klik działa")
	Dim p As PhoneCalls
	StartActivity(p.Call(phoneNumber))
End Sub


'Public Sub LoadPerson(p As Map) - test na chwile wylaczone
	'Dim info As String
	'info = $"Imię: ${p.Get("imie")}
'Nazwisko: ${p.Get("nazwisko")}
'Tytuł: ${p.Get("tytul")}
'Zakład: ${p.Get("zaklad")}
'Pokój: ${p.Get("pokoj")}
'Telefon: ${p.Get("numer_telefonu")}"$
    
'	lblInfo.Text = info
'End Sub