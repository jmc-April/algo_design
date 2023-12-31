package better;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author xxx
 * @Date 2023/7/16 19:13
 * @注释
 */
public interface EncodeResult {
    Map<String, String> getHuffmanCode();
    byte[] getZipBytes();
    String getBinString();
    String countRatio(String data);
}
