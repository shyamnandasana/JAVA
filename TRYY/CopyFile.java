import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CopyFile {
public static void main(String[] args) throws IOException {
FileReader fr = new FileReader("input.txt");
BufferedReader br = new BufferedReader(fr);
char c[] = new char[20];
br.skip(8);
if (br.ready()) {
System.out.println(br.readLine());
br.read(c);
for (int i = 0; i < 20; i++) {
	System.out.print(c[i]);
}
}
}
}