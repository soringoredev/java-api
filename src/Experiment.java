public class Experiment {
    public static void main(String[] args) {

        Experiment exp = new Experiment();


        exp.metodaRezultat(exp.some(5,3));


        int variabila = exp.some(5,3);


    }

    int some(int numarUnu, int numarDoi) {
        int a = numarUnu;
        int b = numarDoi;

        return numarUnu + numarDoi;
    }

    int metodaRezultat(int rezultat) {

        return rezultat;
    }
}
