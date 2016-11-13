import java.io.*;

public class BRRead {
    public static void main(String args[]) throws IOException
    {
        char c;
        String inputStr = "";
        // 使用System.in 创建 BuffereReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        // 读取字符
        do {
            c = (char) br.read();
            inputStr = inputStr + c;
        } while(c != 'q');
        inputStr = inputStr.replaceAll("\r|\n", "");
        System.out.println("you input:\n" + inputStr);
    }
}
