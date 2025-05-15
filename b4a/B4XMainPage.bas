B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@


'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=B4APagesNavBar.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Public Page2 As B4XPage2
	Public Details As Details
	Public Page4 As B4XPage4
	
	Private NavBar1 As NavBar
	Public CurrentPage As Object
	Private pnlMainPage As B4XView
	Dim rp As RuntimePermissions
End Sub

Public Sub Initialize
	rp.CheckAndRequest("android.permission.CALL_PHONE")
	
	B4XPages.GetManager.TransitionAnimationDuration = 0
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	Page2.Initialize
	B4XPages.AddPage("Page 2", Page2)
	Details.Initialize
	B4XPages.AddPage("Details", Details)
	Page4.Initialize
	B4XPages.AddPage("Page 4", Page4)
	
	NavBar1.Initialize(Root)
	CurrentPage = B4XPages.MainPage
	
#If B4A
'	NavBar1.Resize
#End If

End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)

End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

