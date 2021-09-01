import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;

public class fileReader {
    public static void main(String[] args){

        String fileName = ".../Desktop/newFile.txt";

        try{
            File file = new File(".../Desktop/LineTest.txt");
            File fileMaking = new File(fileName);
            
            FileReader fileReader = new FileReader(file);
            FileWriter fw = new FileWriter(fileMaking,true);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bw = new BufferedWriter(fw);

            String line = "";
            while((line= bufferedReader.readLine())!=null){
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i) >= '\u3040'&& line.charAt(i) <= '\u309F'){
                        System.out.print(line.charAt(i));
                        bw.write(line.charAt(i));
                        bw.flush();
                    } else if(line.charAt(i) >= '\u30A0'&& line.charAt(i) <= '\u30FF'){
                        System.out.print(line.charAt(i));
                        bw.write(line.charAt(i));
                        bw.flush();
                    } else if(line.charAt(i) >= '\u4E00'&& line.charAt(i) <= '\u9FFF'){
                        System.out.print(line.charAt(i));
                        bw.write(line.charAt(i));
                        bw.flush();
                    } else if(line.charAt(i)>='。'){
                        System.out.print(line.charAt(i));
                        bw.write(line.charAt(i));
                        bw.flush();
                    }
                }
                bw.newLine();

            }
            fileReader.close();
            fw.close();

        }catch(FileNotFoundException e){

        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
