package EXERCICIOS;
class CARRO {
    String cor;
    String modelo;
    int capacidadeTanque;
    
    //Construtor
    CARRO() {
    }


    CARRO(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    //get e set tanque

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustível) {
        return capacidadeTanque * valorCombustível;
    }

    //método do total para encher o tanue
}
