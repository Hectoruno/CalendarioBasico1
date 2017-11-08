public class CalendarioBasico
{
    // Declarando variables dia, mes y año
    private int day;
    private int month;
    private int year;

    /**
     * Constructor de la clase CalendarioBasico
     */ 
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * Fijamos la fecha nueva
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
    }

    /**
     *Metodo para obtener la fecha
     */
    public String obtenerFecha()
    {
        String textoADevolver = "";
        String parte1 = day + "";
        String parte2 = month + "";
        String parte3 = year + "";
        if (parte1.length() < 2) {
            parte1 = "0" + parte1;  
        }
        if (month < 10) {
            parte2 = "0" + parte2;
        }
        if (year < 10)
            parte3= "0" + parte3; 
        {
            textoADevolver = parte1 + "-" + parte2 + "-" + parte3;
            return textoADevolver;
        }
    }

    /**
     * Avanza un día
     */
    public void avanzarFecha()
    {
        day = day + 1;
        if (day == 31) {
            day = 1;
            month = month + 1;
            if (month == 13) {
                month = 1;
                year = year + 1;
            }
        }
    }
}
