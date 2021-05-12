public class SaludaController{
    @GetMapping("/contarCaracAlfanum/{texto}")
    public int contarCaracteres(String texto){
        Datos datos = new Datos();
        datos.setTexto(texto);
        return datos.contarCaracteres();
    }

} 