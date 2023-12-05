package com.bridgelabz.main;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Map;
import java.util.HashMap;

public class Java8WatchService {

	private static final Kind<?> ENTRY_CREATE = null;
	private static final Kind<?> ENTRY_DELETE = null;
	private static final Kind<?> ENTRY_MODIFY = null;
	private final WatchService watcher;
	private final Map<WatchKey, Path> dirWatchers;
	
	Java8WatchService(Path dir) throws IOException{
		this.watcher=FileSystems.getDefault().newWatchService();
		this.dirWatchers=new HashMap<WatchKey, Path>();
		scanAndRegister(dir);
	}
	
     private void registerDirWatches(Path dir) throws IOException{
    	 WatchKey key=dir.register(watcher,ENTRY_CREATE, ENTRY_DELETE,ENTRY_MODIFY);
 		
 		dirWatchers.put(key, dir);
     }
	private void scanAndRegister(final Path dir) throws IOException {

	}
	
	
	
}
