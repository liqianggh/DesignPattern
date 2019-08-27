package cn.mycookies.test21memento;

/**
 * @author Jann Lee
 * @date 2019-08-27 23:17
 **/
public class Client {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("深入理解JVM", "hello", "Jann");

        ArticleMemento articleMemento = article.saveToArticleMemento();

        articleMementoManager.addMemento(articleMemento);
        System.out.println(article);

        article.setTitle("深入理解JVM 第二版");
        article.setContent("hello ccc world");
        System.out.println(article);

        System.out.println("回退");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println(article);


    }

}
