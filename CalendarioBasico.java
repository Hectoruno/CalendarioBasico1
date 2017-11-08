public class CalendarioBasico
{
    // Declarando variables dia, mes y año
    private DisplayDosCaracteres day;
    private DisplayDosCaracteres month;
    private DisplayDosCaracteres year;

    /**
     * Constructor de la clase CalendarioBasico
     */ 
    public CalendarioBasico()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(100);
    }

    /**
     * Fijamos la fecha nueva
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day.setValorAlmacenado(dia);
        month.setValorAlmacenado(mes);
        year.setValorAlmacenado(ano);
    }

    /**
     *Metodo para obtener la fecha
     */
    public String obtenerFecha()
    {
        return day.getTextoDelDisplay() + "-" + month.getTextoDelDisplay() + "-" + year.getTextoDelDisplay();
    }

    /**
     * Avanza un día
     */
    public void avanzarFecha()
    {
        day.incrementaValorAlmacenado();
        if (day.getValorAlmacenado() == 1){
            month.incrementaValorAlmacenado();
            if (month.getValorAlmacenado() == 1){
                year.incrementaValorAlmacenado();
            }
        }
    }
}
