Run("notepad.exe","C:\Windows")
Sleep(2000)
Send("Java is a Programming language,It is used for development")
Send("{ENTER}")
Send("Python is a Programming language,It is used for development")
Sleep(2000)
WinClose("*Untitled - Notepad")
Sleep(2000)
ControlClick("Notepad","Do&n't Save","Button2")
Sleep(2000)