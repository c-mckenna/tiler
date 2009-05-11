package util;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;

import util.FileFilters.DirectoryFileFilter;

public class FileUtil
{
	public static void recursivelyAddFiles(Collection<File> files, File dir,
			FileFilter filter)
	{
		File[] list = dir.listFiles(filter);
		for (File file : list)
		{
			files.add(file);
		}
		File[] dirs = dir.listFiles(new DirectoryFileFilter());
		for (File d : dirs)
		{
			recursivelyAddFiles(files, d, filter);
		}
	}
	
	public static String paddedInt(int value, int charcount)
	{
		String str = String.valueOf(value);
		while (str.length() < charcount)
		{
			str = "0" + str;
		}
		return str;
	}
}
