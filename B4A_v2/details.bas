B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private lblInfo As B4XView
	Dim lbl As Label
	Dim info As String
	Private Panel1 As B4XView
End Sub

Public Sub Initialize
	' Do nothing
End Sub

Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.Color = xui.Color_White
	Root.LoadLayout("detail2")
	' Tworzenie etykiety w sposób zgodny z B4XPages
	Dim lbl As Label
	lbl.Initialize("")
	lbl.TextSize = 16
	lbl.TextColor = xui.Color_Black
	lbl.Text = "Szczegóły osoby..."
    
	' Konwersja Label na B4XView
	lblInfo = lbl
	lblInfo.SetTextAlignment("TOP", "LEFT") ' Ustawienie wyrównania tekstu
    
	' Dodanie etykiety do Root
	Root.AddView(lblInfo, 10dip, 10dip, 90%x, 100dip) ' Wysokość dostosowana do treści
End Sub

Public Sub LoadPerson(p As Map)
	Dim info As String
	info = $"Imię: ${p.Get("imie")}
Nazwisko: ${p.Get("nazwisko")}
Tytuł: ${p.Get("tytul")}
Zakład: ${p.Get("zaklad")}
Pokój: ${p.Get("pokoj")}
Telefon: ${p.Get("numer_telefonu")}"$
    
	lblInfo.Text = info
End Sub