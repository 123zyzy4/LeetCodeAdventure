package Hot100.day13;

public class Trie {

    Trie[] children;
    boolean isend;
    public Trie() {
        children = new Trie[26];
        isend = false;
    }

    public void insert(String word) {
        Trie tmp = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i)-'a';
            if(tmp.children[index] == null){
                tmp.children[index] = new Trie();
            }
            tmp = tmp.children[index];
        }
        tmp.isend = true;

    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isend;

    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix)!= null;
    }
    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {

            int index = prefix.charAt(i) - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }


    //虽然可以但是太土味了，还是看看远方的前缀树数据结构吧家人们
//    LinkedList<String> list;
//    public Trie() {
//        list =new LinkedList<>();
//    }
//
//    public void insert(String word) {
//        list.add(word);
//    }
//
//    public boolean search(String word) {
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if(next.equals(word)){
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public boolean startsWith(String prefix) {
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if(judge(next,prefix)){
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    private boolean judge(String word,String prefix){
//        if(prefix.length()>word.length()){
//            return false;
//        }
//        for (int i = 0; i < prefix.length(); i++) {
//            if(prefix.charAt(i)==word.charAt(i)){
//                continue;
//            }else {
//                return false;
//            }
//
//        }
//        return true;
//    }
}
