B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
'	Private fx As JFX
	Private xui As XUI
	
	Private pnlParent As B4XView
	Private btnMainPage As B4XView
	Private MP As B4XMainPage
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Parent As B4XView)
	pnlParent = Parent
	
	MP = B4XPages.MainPage
	pnlParent.LoadLayout("NavBar")
End Sub

Private Sub btnNavBar_Click
	Private btn As B4XView
	Private Index As Int
	
	btn = Sender
	Index = btn.Tag



	Select Index
		Case 1
			MP.CurrentPage = MP
			B4XPages.ShowPageAndRemovePreviousPages("MainPage")
		Case 2
			MP.CurrentPage = MP.Page2
			B4XPages.ShowPageAndRemovePreviousPages("Page 2")
		Case 4
			MP.CurrentPage = MP.Page4
			B4XPages.ShowPageAndRemovePreviousPages("Page 4")
	End Select
End Sub
