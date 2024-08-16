/*---------------------------------------------------\
|  Copyright (©) 2K24 EPN-FIS. All rights reserved.  |
|  pat_mic@hotmail.com  PROPRIETARY/CONFIDENTIAL.    |
|  Use is subject to license terms.       pat_mic    |
\---------------------------------------------------*/

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;

import UserInterface.Form.RMMain;
import UserInterface.Form.SplashScreenForm;

public class App {
    public static void main(String[] args) throws Exception {
        FlatLightLaf.setup();
        FlatLightLaf.supportsNativeWindowDecorations();
        try {
                UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
            } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } 
    
       SplashScreenForm.show();
       RMMain frmMain = new RMMain();
    }
}
