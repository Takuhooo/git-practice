public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Git");
        System.out.println("feature/loginブランチ作成");
        System.out.println("ステージング");
        System.err.println("git addA");
        System.err.println("git addB");
        System.err.println("git addC");

        System.out.println("ログイン機能でも下記のようにブランチを分けて作業
                    ログイン画面作成feature/loguin\n" + //
                    "認証処理作成feature/auth\n" + //
                    "DB接続\n" + //
                    "バリデーション\n" + //
                    "エラーメッセージ");
        System.out.println("addで整理、意味のある単位でcommit、数コミットまとめてpush、機能完成時PR、作業中誰かがMainブランチ変更した場合、mainに取り込みサブブランチに反映（merge branch）");
        System.out.println("PRを出す前に最新のmainとの差分を確認するために上記サイクル");

        System.out.println("ローカルでmergeブランチにmainの変更をマージします");
    }
}