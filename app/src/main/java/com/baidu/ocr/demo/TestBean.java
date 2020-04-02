package com.baidu.ocr.demo;

public class TestBean {

    private WordsResultBean wordsResultBean;

    public WordsResultBean getWordsResultBean() {
        return wordsResultBean;
    }

    public void setWordsResultBean(WordsResultBean wordsResultBean) {
        this.wordsResultBean = wordsResultBean;
    }

    public static class WordsResultBean {
        private String words;

        public String getWords() {
            return words;
        }

        public void setWords(String words) {
            this.words = words;
        }
    }
}
