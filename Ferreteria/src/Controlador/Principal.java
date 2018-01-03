/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import static java.awt.image.ImageObserver.ERROR;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


import Modelo.Logica;
import Vista.Principal.SplashScreen;
import Vista.Principal.Login;
import Vista.Principal.MenuPrincipal;



/**
 *
 * @author sistema
 */
public class Principal {
    
    
        Logica miLogica;
	SplashScreen frmSplashScreen;
	Login frmLogin;
	MenuPrincipal frmMenuPrincipal;
	Coordinator ClassCoordinator;
        
        
     public static void main(String[] args) {
         Principal CargaMenu=new Principal();
		CargaMenu.iniciar();
     }
     
     
     private void iniciar() {
		/*Se instancian las clases*/
		frmSplashScreen=new SplashScreen();
	}

     
     
}
