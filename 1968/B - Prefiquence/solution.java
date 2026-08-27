import java.io.*;
 
public class Main {
 
    private static final int BUFFER_SIZE = 1 << 16;
    private static byte[] buffer = new byte[BUFFER_SIZE];
    private static int bufferPointer = 0, bytesRead = 0;
    private static InputStream in = System.in;
 
    private static int readByte() throws IOException {
        if (bufferPointer == bytesRead) {
            bytesRead = in.read(buffer, 0, BUFFER_SIZE);
            bufferPointer = 0;
            if (bytesRead == -1) return -1;
        }
        return buffer[bufferPointer++];
    }
 
    private static int nextInt() throws IOException {
        int ret = 0;
        int b = readByte();
        while (b < '0' || b > '9') b = readByte();
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = readByte();
        }
        return ret;
    }
 
    // Reads a token of 0/1 characters into a reusable buffer, returns length
    private static int nextBinaryString(byte[] dest) throws IOException {
        int b = readByte();
        while (b == ' ' || b == '
' || b == '\r') b = readByte();
        int len = 0;
        while (b == '0' || b == '1') {
            dest[len++] = (byte) b;
            b = readByte();
        }
        return len;
    }
 
    public static void main(String[] args) throws IOException {
        int t = nextInt();
        StringBuilder sb = new StringBuilder();
 
        byte[] aBuf = new byte[200005];
        byte[] bBuf = new byte[200005];
 
        while (t-- > 0) {
            int n = nextInt();
            int m = nextInt();
 
            int lenA = nextBinaryString(aBuf);
            int lenB = nextBinaryString(bBuf);
            // lenA should equal n, lenB should equal m
 
            int i = 0; // pointer into a
            for (int j = 0; j < lenB && i < lenA; j++) {
                if (bBuf[j] == aBuf[i]) {
                    i++;
                }
            }
 
            sb.append(i).append('
');
        }
 
        System.out.print(sb);
    }
}