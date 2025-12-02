import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int pontos = 0;
        List<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.setPergunta("Qual é a linguagem de programação mais usada em aplicações Web e que roda no navegador?");
        q1.setOpcaoA("Java");
        q1.setOpcaoB("JavaScript");
        q1.setOpcaoC("Ruby");
        q1.setOpcaoD("Python");
        q1.setOpcaoE("SQL");
        q1.setCorreta("B");
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.setPergunta("O que é um Tensor em aprendizado de máquina?");
        q2.setOpcaoA("Um agente de I.A");
        q2.setOpcaoB("Fórmula para calcular pesos");
        q2.setOpcaoC("Uma matriz");
        q2.setOpcaoD("Um vetor unidimensional");
        q2.setOpcaoE("Unidade de medida para aprendizado");
        q2.setCorreta("C");
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.setPergunta("Em java, qual palavra reservada sincroniza um objeto para uso limitado a uma thread por vez?");
        q3.setOpcaoA("blocked");
        q3.setOpcaoB("limited");
        q3.setOpcaoC("synchronized");
        q3.setOpcaoD("async");
        q3.setOpcaoE("asynchronous");
        q3.setCorreta("C");
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.setPergunta("Qual linguagem de programação mais de beneficia de Recursão?");
        q4.setOpcaoA("Java");
        q4.setOpcaoB("Haskell");
        q4.setOpcaoC("JavaScript");
        q4.setOpcaoD("SQL");
        q4.setOpcaoE("JSON");
        q4.setCorreta("B");
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.setPergunta("Qual a complexidade algorítmica do 'Problema do Caixeiro Viajante'?");
        q5.setOpcaoA("Logarítmica");
        q5.setOpcaoB("Exponencial");
        q5.setOpcaoC("Linear");
        q5.setOpcaoD("Polinomial");
        q5.setOpcaoE("Nenhuma das Alternativas");
        q5.setCorreta("B");
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.setPergunta("O que significa o 'L' em 'SOLID'?");
        q6.setOpcaoA("Liskov Substitution");
        q6.setOpcaoB("Language Level");
        q6.setOpcaoC("Last Possible Target");
        q6.setOpcaoD("Liskov Segregation");
        q6.setOpcaoE("Level Design");
        q6.setCorreta("A");
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.setPergunta("Qual código representa 'created' em protocolos HTTP?");
        q7.setOpcaoA("200");
        q7.setOpcaoB("201");
        q7.setOpcaoC("202");
        q7.setOpcaoD("203");
        q7.setOpcaoE("204");
        q7.setCorreta("B");
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.setPergunta("Qual palavra reservada em JavaScript declara uma variável que pode sofrer 'Hoisting'?");
        q8.setOpcaoA("var");
        q8.setOpcaoB("const");
        q8.setOpcaoC("let");
        q8.setOpcaoD("declare");
        q8.setOpcaoE("hvar");
        q8.setCorreta("A");
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.setPergunta("Qual o tamanho de um registrador EAX?");
        q9.setOpcaoA("8bits");
        q9.setOpcaoB("16bits");
        q9.setOpcaoC("32bits");
        q9.setOpcaoD("64bits");
        q9.setOpcaoE("128bits");
        q9.setCorreta("C");
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.setPergunta("O que significa a sigla da arquitetura MVC?");
        q10.setOpcaoA("Modules, View, Control");
        q10.setOpcaoB("Material, View, Controller");
        q10.setOpcaoC("Memory, Volatile, Central");
        q10.setOpcaoD("Model, View, Controller");
        q10.setOpcaoE("Nenhuma das Alternativas");
        q10.setCorreta("D");
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.setPergunta("Qual módulo do Java gerencia persistência de dados?");
        q11.setOpcaoA("JPG");
        q11.setOpcaoB("JPA");
        q11.setOpcaoC("POO");
        q11.setOpcaoD("JP");
        q11.setOpcaoE("PJ");
        q11.setCorreta("B");
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.setPergunta("Qual o nome do criador do Linux?");
        q12.setOpcaoA("Jhon Harvard");
        q12.setOpcaoB("Linus Torvalds");
        q12.setOpcaoC("Jeff Bezos");
        q12.setOpcaoD("Linux Maxwell");
        q12.setOpcaoE("Martin L.K.");
        q12.setCorreta("B");
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.setPergunta("Qual código ASCII da letra 'A'?");
        q13.setOpcaoA("65");
        q13.setOpcaoB("25");
        q13.setOpcaoC("97");
        q13.setOpcaoD("48");
        q13.setOpcaoE("67");
        q13.setCorreta("A");
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.setPergunta("Qual distribuição Linux é utilizada majoritariamente para cybersecurity?");
        q14.setOpcaoA("Arch Linux");
        q14.setOpcaoB("Linux Mint");
        q14.setOpcaoC("Kalli Linux");
        q14.setOpcaoD("Manjaro");
        q14.setOpcaoE("Red Hat");
        q14.setCorreta("C");
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.setPergunta("Qual o nome do criador do Git?");
        q15.setOpcaoA("Steve Jobs");
        q15.setOpcaoB("Linus Torvalds");
        q15.setOpcaoC("Jhon Erick");
        q15.setOpcaoD("Van Halen");
        q15.setOpcaoE("Nenhuma das Alternativas");
        q15.setCorreta("B");
        questoes.add(q15);


        System.out.println(">> Quiz da programação <<");
        for (Questao q:questoes){
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) pontos++;
        }
        System.out.println("Você fez "+pontos+" pontos.");

    }
}
