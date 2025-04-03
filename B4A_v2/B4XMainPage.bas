B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private sv As ScrollView
	Private btnUpdate As B4XView
	Private xHttp As HttpJob
	Private personsList As List
	Private Details As details
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Public Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.Color = xui.Color_White
    
	Details.Initialize
	B4XPages.AddPageAndCreate("Details", Details)
	
	' Poprawne tworzenie Button
	Dim btn As Button
	btn.Initialize("btnUpdate")
	btn.Text = "🔄 Aktualizujjjj"
	btn.TextColor = xui.Color_White
	btn.Color = xui.Color_RGB(0,150,1)
	btnUpdate = btn
	Root.AddView(btnUpdate, 10dip, 10dip, 150dip, 50dip)
    
	Dim svPanel As ScrollView
	svPanel.Initialize(100%y)
	sv = svPanel
	Root.AddView(sv, 0, 70dip, 100%x, 100%y - 70dip)
    
	personsList.Initialize
	FetchData
    
End Sub

Private Sub AddClickEvent(v As B4XView)
	Dim jo As JavaObject = v
	jo.RunMethod("setOnClickListener", Array As Object(Me, "HandleClick"))
End Sub

Sub HandleClick (ViewTag As Object)
	If ViewTag = "update" Then
		FetchData
	Else
		' Kliknięto na wizytówkę
		Dim idx As Int = ViewTag
		Dim person As Map = personsList.Get(idx)
		B4XPages.ShowPageAndRemovePreviousPages("DetailsPage")
		B4XPages.GetPage("Details").As(details).LoadPerson(person)
	End If
End Sub

Sub FetchData
	xHttp.Initialize("Job1", Me)
	xHttp.Download("https://api.android.mzelent.pl/persons/")
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		ParseJSON(Job.GetString)
	Else
		xui.MsgboxAsync("Błąd: " & Job.ErrorMessage, "Błąd")
	End If
	Job.Release
End Sub

Sub ParseJSON(jsonString As String)
	Dim parser As JSONParser
	parser.Initialize(jsonString)
	Try
		personsList = parser.NextArray
		sv.Panel.RemoveAllViews
		sv.Panel.Height = personsList.Size * 130dip

		For i = 0 To personsList.Size - 1
			Dim item As Map = personsList.Get(i)

			' Karta
			Dim card As Panel
			card.Initialize("card")
			card.Tag = item ' Cały map przekazujemy do szczegółów
			card.Color = Colors.White
			sv.Panel.AddView(card, 5%x, i * 130dip, 90%x, 120dip)

			' Dane
			Dim lblName As Label
			lblName.Initialize("")
			lblName.Text = item.Get("tytul") & " " & item.Get("imie") & " " & item.Get("nazwisko")
			lblName.TextSize = 18
			lblName.TextColor = Colors.Black
			lblName.Typeface = Typeface.DEFAULT_BOLD
			card.AddView(lblName, 10dip, 10dip, 80%x, 30dip)

			Dim lblDetails As Label
			lblDetails.Initialize("")
			lblDetails.Text = "Pokój: " & item.Get("pokoj") & " | Zakład: " & item.Get("zaklad")
			lblDetails.TextSize = 14
			lblDetails.TextColor = Colors.Gray
			card.AddView(lblDetails, 10dip, 45dip, 80%x, 20dip)

			Dim lblPhone As Label
			lblPhone.Initialize("phoneLabel")
			lblPhone.Text = "📞 " & item.Get("numer_telefonu")
			lblPhone.TextSize = 14
			lblPhone.TextColor = Colors.Blue
			lblPhone.Tag = item.Get("numer_telefonu")
			card.AddView(lblPhone, 10dip, 70dip, 80%x, 20dip)

			' Styl
			Dim cd As ColorDrawable
			cd.Initialize(Colors.White, 10dip)
			card.Background = cd
			card.Elevation = 5dip
		Next
	Catch
		xui.MsgboxAsync("Błąd przetwarzania JSON!", "Błąd")
	End Try
End Sub


Sub card_Click
	Dim clickedPanel As Panel = Sender
	Dim personData As Map = clickedPanel.Tag
	B4XPages.ShowPage("Details")
	B4XPages.GetPage("Details").As(details).LoadPerson(personData)
	
End Sub

Private Sub CreateCard(item As Map, idx As Int) As B4XView
	Dim pnl As B4XView = xui.CreatePanel("")
	pnl.Color = xui.Color_White
	pnl.Tag = idx
	AddClickEvent(pnl)

	Dim cd As ColorDrawable
	cd.Initialize(xui.Color_White, 10dip)
	
	pnl.SetColorAndBorder(Colors.Black, 0, 0, 10dip)
    
	Dim lbl1 As Label
	lbl1.Initialize("")
	lbl1.Text = item.Get("tytul") & " " & item.Get("imie") & " " & item.Get("nazwisko")
	lbl1.TextSize = 18
	lbl1.TextColor = Colors.Black
	lbl1.Typeface = Typeface.DEFAULT_BOLD
	pnl.AddView(lbl1, 10dip, 10dip, 80%x, 30dip)

	Dim lbl2 As Label
	lbl2.Initialize("")
	lbl2.Text = "Pokój: " & item.Get("pokoj") & " | Zakład: " & item.Get("zaklad")
	lbl2.TextSize = 14
	lbl2.TextColor = Colors.Gray
	pnl.AddView(lbl2, 10dip, 45dip, 80%x, 20dip)

	Dim lbl3 As Label
	lbl3.Initialize("")
	lbl3.Text = "📞 " & item.Get("numer_telefonu")
	lbl3.TextSize = 14
	lbl3.TextColor = Colors.Blue
	pnl.AddView(lbl3, 10dip, 70dip, 80%x, 20dip)

	Return pnl
End Sub