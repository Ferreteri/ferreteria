/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Logica;
import Modelo.DAO.UsuariosDAO;
import Modelo.VO.UsuariosVO;
import Vista.Principal.SplashScreen;
import Vista.Principal.Login;
import Vista.Principal.MenuPrincipal;





/**
 *
 * @author sistema
 */
public class Coordinator {
        private Logica miLogica;
	private SplashScreen frmSplashScreen;
        
        public SplashScreen getfrmSplashScreen() {
		return frmSplashScreen;
	}
        
}
