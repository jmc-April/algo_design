package better;

import better.imp.Node;

import java.util.ArrayList;
import java.util.Map;

/**
 * @version 1.0
 * @Author xxx
 * @Date 2023/7/16 14:23
 * @注释
 */
public interface HuffmanTree {
    Node buildHuffmanTree(String data, boolean hasW);

    Map<String, String> getHuffmanCode(Node root);

    int printTreeHorizontally(Node root, int row, int col, String[][] res);
    int printTreeVertically(Node root, int row, int col, String[][] res);
}
