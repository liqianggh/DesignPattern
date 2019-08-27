package cn.mycookies.test21memento;

/**
 * 文章副本
 *
 * @author Jann Lee
 * @date 2019-08-27 23:02
 **/
public class ArticleMemento {

    private String title;

    private String content;

    private String author;

    public ArticleMemento(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
        this.author = article.getAuthor();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "ArticleMemento{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", author='" + author + '\'' + '}';
    }
}
