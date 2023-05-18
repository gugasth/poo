package engtelecom.poo;

public enum Planetas {
    MERCURIO(1,4880), VENUS(2,12104), TERRA(3,12742),MARTE(4,6780),JUPITER(5,139822),SATURNO(5,116464),URANO(6,50724),NETUNO(7,49248);


    /**
     * Posição do planeta no sistema solar, em relação a sua proximidade com o sol
     */
    public final int posicao;

    /**
     * Diametro do planeta, em Km.
     */
    public final int diametro;

    /**
     * Construtor da classe enum Planetas
     * @param posicao do planeta em relação ao sol.
     * @param diametro do planeta, em Km.
     */
    Planetas(int posicao, int diametro){
        this.posicao = posicao;
        this.diametro = diametro;
    }
}
