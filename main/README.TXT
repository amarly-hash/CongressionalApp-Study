TODO:

connect PomoWindow to pomoPrompt


Finish commenting out program

Fix color issue in PomoPrompt

Clean up GUI

set up main so it can open PomoPrompt and notesTaker in their own respective windows

For noteTaker:
this could be useful, dont use it as an excuse to give into feature creep tho.. :
            //Move this to NoteTaker dude, this is better fitted for that. This just needs to tell the user that the file doesnt exist
            JOptionPane.showConfirmDialog(this, "There is no file found at that path. Do you want to make a new file?","New File", JOptionPane.YES_NO_OPTION);

For PomoPrompt:
Make a button in main. When this button is pressed, have it either show the pomoPrompt in either a seperate Window, or in the same window