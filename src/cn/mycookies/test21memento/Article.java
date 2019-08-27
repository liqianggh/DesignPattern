package cn.mycookies.test21memento;

/**
 * 文章
 *
 * @author Jann Lee
 * @date 2019-08-27 23:01
 **/
public class Article {

    private String title;

    private String content;

    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArticleMemento saveToArticleMemento(){
        return new ArticleMemento(this);
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.author = articleMemento.getAuthor();
        this.content = articleMemento.getContent();
    }

    @Override
    public String toString() {
        return "Article{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", author='" + author + '\'' + '}';
    }
}
