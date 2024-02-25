package InterviewPreparation;

public class Trie {
    //还可以改进就是不定义TrieNode，把自身作为节点类，child和isEnd直接作为成员变量
    private class TrieNode{
        boolean isEnd;
        TrieNode[] child;
        public TrieNode() {
            child = new TrieNode[26]; // 假设只包含小写字母
            isEnd = false;
        }
    }
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i)-'a';
            if(cur.child[index]==null){
                cur.child[index] = new TrieNode();
            }
            cur = cur.child[index];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i)-'a';
            if(cur.child[index]==null){
                return false;
            }else {
                cur = cur.child[index];
            }
        }
        return cur.isEnd;

    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i)-'a';
            if(cur.child[index]==null){
                return false;
            }else {
                cur = cur.child[index];
            }
        }
        return true;
    }
}
