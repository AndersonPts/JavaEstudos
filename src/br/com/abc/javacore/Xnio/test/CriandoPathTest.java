package br.com.abc.javacore.Xnio.test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {

	public static void main(String[] args) {
		Path p1 = Paths.get("D:\\JAVA\\Versionando seu código com Git.txt");
		Path p2 = Paths.get("D:\\JAVA\\", "MySql.txt");
		System.out.println(p2.toAbsolutePath());
		
		File file = p2.toFile();
		Path path = file.toPath();
		
		Path path1 = Paths.get("Pasta");
		Path path2 = Paths.get("Pasta\\subpasta\\subpasta");
		
		try {
//			if (Files.notExists(path2))
//			Files.createDirectory(path1);
			if (Files.notExists(path2))
				Files.createDirectories(path2);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
