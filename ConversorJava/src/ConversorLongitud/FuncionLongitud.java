package ConversorLongitud;

import javax.swing.JOptionPane;

public class FuncionLongitud {
	
	
	ConvertirAMetros kmetros = new ConvertirAMetros();
	ConvertirDeMetros convertidor = new ConvertirDeMetros();
	
	 public void ConvertirLongitud(double Minput) {
	    	String opcion = (JOptionPane.showInputDialog(null, 
	    			"Elije la unidad de longitud ", "metros", 
	    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
	    			{"De kilometros a metros", "De kilometros a decimetros", "De kilometros a centimetros","De kilometros a millimetros","De Metros a Kilometros","De Metros a Decimetros", "De Metros a Centimetros", "De Metros a Milimetros"}, 
	    			"Seleccion")).toString();
	    	
	    	
	    	
	    	switch(opcion) {
	        case "De kilometros a metros":
	        	kmetros.convertirKilometrosAMetros(Minput);
	        	break;
	        case "De kilometros a decimetros":
	        	kmetros.convertirDecimetrosAMetros(Minput);
	        	break;
	        case "De kilometros a centimetros":
	        	kmetros.convertirCentimetrosAMetros(Minput);
	        	break;
	        case "De kilometros a millimetros":
	        	kmetros.convertirMilimetrosAMetros(Minput);
	        	break;
	        case "De Metros a Kilometros":
	        	convertidor.convertirMetrosAKilometros(Minput);
	        	break;
	        case "De Metros a Decimetros":
	        	convertidor.convertirMetrosADecimetros(Minput);
	        	break;
	        case "De Metros a Centimetros":
	        	convertidor.convertirMetrosACentimetros(Minput);
	        	break;
	        case "De Metros a Milimetros":
	        	convertidor.convertirMetrosAMilimetros(Minput);
	        	break;
	        
	        }      
	    }
	        

}
