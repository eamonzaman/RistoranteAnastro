public class Cibo {
    String nome;
    Double costo;

    public Cibo(int NPiatto) {
        switch (NPiatto) {
            case 1:
                this.nome = "Nigiri";
                this.costo = 3.0;
                break;
            case 2:
                this.nome = "Hosomaki";
                this.costo = 3.0;
                break;
            case 3:
                this.nome = "Futomaki";
                this.costo = 3.0;
                break;
            case 4:
                this.nome = "Uramaki";
                this.costo = 3.8;
                break;
            case 5:
                this.nome = "Temaki";
                this.costo = 3.9;
                break;
            case 6:
                this.nome = "Gunkan";
                this.costo = 3.6;
                break;
            case 7:
                this.nome = "Ramen";
                this.costo = 8.6;
                break;
            case 8:
                this.nome = "Yakisoba";
                this.costo = 9.0;
                break;
            case 9:
                this.nome = "Temari";
                this.costo = 4.0;
                break;
            case 0:
                this.nome = "Maki";
                this.costo = 3.5;
                break;
            default:
                this.nome = "piatto vuoto";
                this.costo = 0.0;
                break;
        }
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

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " | Costo: " + this.costo;
    }
}
