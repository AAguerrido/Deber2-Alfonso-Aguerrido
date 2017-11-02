
package diamuertos;


public class menuclase {
    public menuclase(){
       //constructor 
       opciones();
    }
    Integer opcion=0;
    public void setMenu(int opc){
        
        opcion=opc;//obtener valores para el menu
        switch(opcion){
            case 1:
                System.out.println("½ kg de mortiños\n" +
"½ kg. de moras\n" +
"¼ kg de frutillas\n" +
"1 piña\n" +
"½ babaco\n" +
"10 naranjillas\n" +
"1 taza de pasas\n" +
"Canela en rama\n" +
"Clavo de olor\n" +
"Pimienta dulce\n" +
"Hojas de naranja, hierbaluisa y arrayán\n" +
"50 grs. de azúcar o 1 panela\n" +
"½ kg de harina morada");
                break;
            case 2:
                System.out.println("¼ oz levadura instantánea (~ 1 cucharada)\n" +
"½ taza de leche tibia + unas cucharadas de leche adicional si lo necesita\n" +
"½ taza de azúcar\n" +
"2 cucharaditas de sal\n" +
"4 tazas de harina + harina adicional si lo necesita\n" +
"1 cucharadita de canela en polvo\n" +
"1 (4 oz) barra de mantequilla, sin sal, a temperatura ambiente\n" +
"4 huevos\n" +
"1 cucharadita de esencia de vainilla\n" +
"Sabores y extractos adicionales a su gusto: ralladura de naranja, extracto de almendras/anís, especias adicionales, etc\n" +
"Opciones de rellenos: chocolate, dulce de leche, mermelada o dulce de guayaba, nutella, etc\n" +
"2 yemas de huevo (batidas) para pintar las guaguas antes de hornearlas\n" +
"Glaseado de colores distintos, pasas, grageas para decorar");
                break;
            default:
                System.out.println("LA OPCION NO EXISTE");
                break;
                
            
        }
    }
    
    public void opciones(){
        System.out.println("Seleccione la opcion 1 para ingredientes de "
                + "colada morada");
        System.out.println("Seleccione la opcion 2 para ingredientes de "
                + "la guagua de pan");
    }
}
