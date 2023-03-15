
package ejercicio_19_cap3;

import java.awt.geom.Area;
import java.lang.Math;
import javax.swing.JOptionPane;


public class Ejercicio_19_Cap3 {

    // atributos
    double Lado,Peri,Area,Altura;
    
    //Metodos
    public void Entrada (){
        Lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Valor Numerico DEl Lado"));
        Peri = Lado*3;
        Altura = Math.sqrt((Math.pow(Lado, 2)-Math.pow(Lado/4, 2)));        
        Area = (Lado*Altura)/2;
        
    }
    public void Salida (){
        System.out.println("El Perimetro es: "+Peri+"\nEl Area es: "+Area+"\nLa Altura es:"+Altura);
        JOptionPane.showMessageDialog(null,"El Perimetro es: "+Peri+"\nEl Area es: "+Area+"\nLa Altura es:"+Altura);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio_19_Cap3 Triangulo = new Ejercicio_19_Cap3();
        Triangulo.Entrada();
        Triangulo.Salida();
    }
           
    
}
