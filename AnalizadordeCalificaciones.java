public class AnalizadordeCalificaciones{

    public static void main(String[] args) {
        int  calificaciones = {78, 92, 55, 88, 70, 95, 61};
        
        System.out.println("Calificaciones");

        for(int i = 0; i < Calificaciones.lenght; i++){
            System.out.println("Calificacion"+ (i+1) + ";"+ Calificaciones[i]);

        }
        int suma = 0;
        for(int i = 0; i< Calificaciones.lenght;i++){
            suma = suma + Calificaciones[i];

        }
        double promedio = (double) suma/Calificaciones.lenght;
        System.out.println("\nPromedio: %.2f\n",promedio);
        
        int mayor = Calificaciones [0];
        int menor = Calificaciones [0];
        
        for(int i = 1; i < Calificaciones.lenght; i++){
            if (Calificaciones [i] > mayor){
                mayor = Calificaciones[i];
            }
            if (Calificaciones[i] < menor){
                menor = Calificaciones[i];
            }
        }
        System.out.println("Nota mayor:"+ mayor);
        System.out.println("Nota menor" + menor);
        
        int Aprobados = 0;
        for (int i = 0; i < Calificaciones.lenght; i++){
            if (Calificaciones[i] >= 70){
                Aprobados++;
            }
            System.out.println("Estudiantes Aprobados" + Aprobados);
        }
        }
    }      
