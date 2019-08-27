package cn.mycookies.test21memento;

import java.util.Stack;

/**
 * @author Jann Lee
 * @date 2019-08-27 23:01
 **/
public class ArticleMementoManager {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STATCK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento(){
        return ARTICLE_MEMENTO_STATCK.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STATCK.push(articleMemento);
    }

}
