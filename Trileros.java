/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trileros;

/**
 *
 * @author mabardaji
 */
public class Trileros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temps= 500; //nivell de dificultat a menys temps, més díficil
        dibujarCubiletes(temps);
        intercambiarposicion1con2(temps);
        intercambiarposicion1con3(temps);
        intercambiarposicion2con3(temps);
    }
    
    public static void dibujarCubiletes(int temps) {
       
        limpiarConsola(temps);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("  ***     ***     ***");
        System.out.println(" *   *   *   *   *   *");    
        System.out.println("******* ******* *******");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static void intercambiarposicion1con3(int temps) {
       
        dibujarCubiletes(temps);
        limpiarConsola(temps);
         
         System.out.println("");
          System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *    ***    ");
        System.out.println("*******  *   *    ***");    
        System.out.println("        *******  *   *");
        System.out.println("                *******");
         System.out.println("");
          System.out.println("");
        limpiarConsola(temps);
         System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******   ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******   ***");
        System.out.println("                 *   *");        
        System.out.println("                *******");        
         System.out.println("");
        limpiarConsola(temps);
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                  ***");
        System.out.println("                 *   *");        
        System.out.println("                *******");        
        limpiarConsola(temps);
        System.out.println("   ***");
        System.out.println("  *   *");
        System.out.println(" *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                 ***");
        System.out.println("                *   *");        
        System.out.println("               *******");        
        limpiarConsola(temps);
        System.out.println("    ***");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                ***");
        System.out.println("               *   *");        
        System.out.println("              *******");        
        limpiarConsola(temps);
        System.out.println("     ***");
        System.out.println("    *   *");
        System.out.println("   *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("               ***");
        System.out.println("              *   *");        
        System.out.println("             *******");        
        limpiarConsola(temps);
        System.out.println("       ***");
        System.out.println("      *   *");
        System.out.println("     *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("             ***");
        System.out.println("            *   *");        
        System.out.println("           *******");        
        limpiarConsola(temps);
        System.out.println("         ***");
        System.out.println("        *   *");
        System.out.println("       *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("           ***");
        System.out.println("          *   *");        
        System.out.println("         *******");        
        limpiarConsola(temps);        
        System.out.println("           ***");
        System.out.println("          *   *");
        System.out.println("         *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("         ***");
        System.out.println("        *   *");        
        System.out.println("       *******");        
        limpiarConsola(temps);    
        System.out.println("             ***");
        System.out.println("            *   *");
        System.out.println("           *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("       ***");
        System.out.println("      *   *");        
        System.out.println("     *******");        
        limpiarConsola(temps);    
        System.out.println("               ***");
        System.out.println("              *   *");
        System.out.println("             *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("     ***");
        System.out.println("    *   *");        
        System.out.println("   *******");        
        limpiarConsola(temps);    
        System.out.println("                 ***");
        System.out.println("                *   *");
        System.out.println("               *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("   ***");
        System.out.println("  *   *");        
        System.out.println(" *******");        
        limpiarConsola(temps);            
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("                *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("  ***");
        System.out.println(" *   *");        
        System.out.println("*******");        
        limpiarConsola(temps);    
       
         System.out.println("");
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("          ***   *******");
        System.out.println("         *   *          ");    
        System.out.println("  ***   *******      ");
        System.out.println(" *   *");
        System.out.println("*******");        
         System.out.println("");
       
        limpiarConsola(temps);    
       
         System.out.println("");
          System.out.println("");
        System.out.println("                  ***");
        System.out.println("          ***    *   *");
        System.out.println("  ***    *   *  *******");    
        System.out.println(" *   *  *******      ");
        System.out.println("*******");
        System.out.println("");
        System.out.println("");
        dibujarCubiletes(temps);


    }

    
    public static void intercambiarposicion1con2(int temps) {
       
        dibujarCubiletes(temps);
        limpiarConsola(temps);
         
        System.out.println("");
        System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *            ***");
        System.out.println("*******   ***    *   *");    
        System.out.println("         *   *  ******* ");
        System.out.println("        *******        ");
        System.out.println("");
        System.out.println("");
        limpiarConsola(temps);
        
        System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******           ***");
        System.out.println("                 *   *");    
        System.out.println("          ***   ******* ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola(temps);
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("           ***");
        System.out.println("          *   *");        
        System.out.println("         *******");        
        limpiarConsola(temps);
        System.out.println("   ***");
        System.out.println("  *   *");
        System.out.println(" *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("          ***");
        System.out.println("         *   *");        
        System.out.println("        *******");        
        limpiarConsola(temps);       
        System.out.println("    ***");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("         ***");
        System.out.println("        *   *");        
        System.out.println("       *******");        
        limpiarConsola(temps);       
        System.out.println("     ***");
        System.out.println("    *   *");
        System.out.println("   *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("        ***");
        System.out.println("       *   *");        
        System.out.println("      *******");        
        limpiarConsola(temps);       
 
        System.out.println("      ***");
        System.out.println("     *   *");
        System.out.println("    *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("       ***");
        System.out.println("      *   *");        
        System.out.println("     *******");        
        limpiarConsola(temps);       
        System.out.println("       ***");
        System.out.println("      *   *");
        System.out.println("     *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("      ***");
        System.out.println("     *   *");        
        System.out.println("    *******");        
        limpiarConsola(temps);       
        System.out.println("        ***");
        System.out.println("       *   *");
        System.out.println("      *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("     ***");
        System.out.println("    *   *");        
        System.out.println("   *******");        
        limpiarConsola(temps);             
        System.out.println("         ***");
        System.out.println("        *   *");
        System.out.println("       *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("    ***");
        System.out.println("   *   *");        
        System.out.println("  *******");        
        limpiarConsola(temps);     
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("  ***");
        System.out.println(" *   *");        
        System.out.println("*******");        
        limpiarConsola(temps);   
                 
          System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******   *** ");
        System.out.println("                 *   *  ");    
        System.out.println("  ***           *******");        
        System.out.println(" *   *");        
        System.out.println("*******");        
                 
          System.out.println("");
        limpiarConsola(temps);     
          System.out.println("");
          System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *    *** ");
        System.out.println("  ***   *******  *   *  ");    
        System.out.println(" *   *          *******");        
        System.out.println("*******");        
                 System.out.println("");
          System.out.println("");   

        dibujarCubiletes(temps);


    }
    

    public static void intercambiarposicion2con3(int temps) {
       
        dibujarCubiletes();
        limpiarConsola(temps);
         
        System.out.println("");
        System.out.println("");
        System.out.println("                  *** ");
        System.out.println("  ***            *   *");
        System.out.println(" *   *    ***   ******* ");    
        System.out.println("*******  *   *         ");
        System.out.println("        *******        ");
        System.out.println("");
        System.out.println("");
        limpiarConsola(temps);
        
        
        
        System.out.println("");
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("  ***           *******");
        System.out.println(" *   *                ");    
        System.out.println("*******   ***           ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola(temps);
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("                *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("          ***           ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola(temps);
        System.out.println("                 ***");
        System.out.println("                *   *");
        System.out.println("               *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("           ***           ");
        System.out.println("          *   *        ");        
        System.out.println("         *******        ");                 
     
        limpiarConsola(temps); 
        System.out.println("                ***");
        System.out.println("               *   *");
        System.out.println("              *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("            ***           ");
        System.out.println("           *   *        ");        
        System.out.println("          *******        ");                 

        limpiarConsola(); 
        System.out.println("               ***");
        System.out.println("              *   *");
        System.out.println("             *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("             ***           ");
        System.out.println("            *   *        ");        
        System.out.println("           *******        ");                 

        limpiarConsola(); 
        System.out.println("              ***");
        System.out.println("             *   *");
        System.out.println("            *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("              ***           ");
        System.out.println("             *   *        ");        
        System.out.println("            *******        ");                 

        limpiarConsola(); 
        System.out.println("             ***");
        System.out.println("            *   *");
        System.out.println("           *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("               ***           ");
        System.out.println("              *   *        ");        
        System.out.println("             *******        ");                 

        limpiarConsola(); 
        System.out.println("           ***");
        System.out.println("          *   *");
        System.out.println("         *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("                 ***           ");
        System.out.println("                *   *        ");        
        System.out.println("               *******        ");                 
        
        limpiarConsola(); 
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("                  ***           ");
        System.out.println("                 *   *        ");        
        System.out.println("                *******        ");                 
        
        limpiarConsola(); 
        System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("  ***   *******        ");
        System.out.println(" *   *                ");    
        System.out.println("*******           *** ");
        System.out.println("                 *   *        ");        
        System.out.println("                *******        ");                 
        System.out.println("");
        
        limpiarConsola(); 
        System.out.println("");
        System.out.println("");
        System.out.println("          ***");
        System.out.println("  ***    *   *        ");
        System.out.println(" *   *  *******   *** ");    
        System.out.println("*******          *   *");
        System.out.println("                *******        ");                 
        System.out.println("");
        
        dibujarCubiletes();


    }


    
    
    public static void limpiarConsola(int temps) {
       try {
           Thread.sleep(temps);
           for (int i = 0; i < 10; i++) {
               System.out.println("");
           }
       } catch (InterruptedException ex) {
           System.out.println("no sleep");
       }
    
    }

}
