package biochemsimulation.simulation.persistence;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PersistenceUtils {
	
	public static List<String> getAllFilesInFolder(String folder) {
		List<String> fileNames = new LinkedList<String>();
		File dir = new File(folder);
		if(dir.exists()) {
			File[] contents = dir.listFiles();
			for(File f : contents) {
				try {
					fileNames.add(f.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return fileNames;
	}
}
