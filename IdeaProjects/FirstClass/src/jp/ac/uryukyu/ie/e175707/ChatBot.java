package jp.ac.uryukyu.ie.e175707;

public class ChatBot {
    import java.until.Scanner;



    public class ChatBot {

        public static void main(string[] args){

            string charName ="フェリス"

            system.out.println(charName+"「やあ、ライナ」");

        string input="";

            Scanner in = new Scanner(System.in);

            int num=0

            System.out.println("あなたは、「返事をする」か「返事をしない」を選べます。");

            System.out.println("返事をしますか？");

            while(!(input.equals("返事をする"))){

                input = in.nextLine();2

                switch (input){



                    case "返事する": System.out.println("ライナ「やあ、"+"charName"+"元気にしてたか」");num++; break;

                    case "返事しない": System.out.println(charName +"「おい、ふざけてるのかライナ」");num++;

                    default: System.out.println(charName +"「もういいから団子買ってこい」");num++;

                }

            }System.out.println("ライナは" +num+ "回の会話で返事をしました。");

        }}
}
