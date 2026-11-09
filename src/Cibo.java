public class Cibo {
    String nome;
    Double costo;

    public Cibo(int NPiatto, Double costo) {
        switch (NPiatto) {
            case 1:
                this.nome = "Nigiri";
                break;
            case 2:
                this.nome = "Hosomaki";
                break;
            case 3:
                this.nome = "Futomaki";
                break;
            case 4:
                this.nome = "Uramaki";
                break;
            case 5:
                this.nome = "Temaki";
                break;
            case 6:
                this.nome = "Gunkan";
                break;
            case 7:
                this.nome = "Ramen";
                break;
            case 8:
                this.nome = "Yakisoba";
                break;
            case 9:
                this.nome = "Temari";
                break;
            case 0:
            default:
                    this.nome = "piatto vuoto";
                break;
        }
        this.costo = costo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

}
