
//Regra de negócio (educação)
//Só são aprovado alunos que tiverem nota igual ou maior que 6 e menos que 25% de faltas em cada disciplina.
public class NotasService {

    public static String verificarAprovacao(double nota, int nAulas, int nFaltas) {

        double limiteFaltas;
        limiteFaltas = nAulas * 0.25;
        if (nota < 6 || nFaltas > limiteFaltas) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
//Só são aprovados alunos que tiverem nota igual ou maior que 6.
    public static String verificarAprovacao(double nota) {
        if (nota < 6) {
            return "Reprovado";

        } else {
            return "Aprovado";
        }
    }
   
}
