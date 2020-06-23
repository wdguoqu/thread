package com.damon.utils;

/**
 * @Description: TODO
 * @Author: YNa
 * @Date: 2020/6/20 15:42
 * @Version: #1.0 Copyright © 2020
 */
public final class ThreadUtil {
	private int size;
	private int thread = 0;
	private int endIndex = 0;
	private int threadNum = 5;
	private int startIndex = 0;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getThread() {
		return thread;
	}

	public void setThread(int thread) {
		this.thread = thread;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		if (endIndex > 0) {
			this.endIndex = endIndex;
		} else if(thread == threadNum - 1){
			this.endIndex = size;
	    } else {
			this.endIndex = size / threadNum * (thread + 1);
		}
	}

	public int getThreadNum() {
		return threadNum;
	}

	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		if (startIndex > 0) {
			this.startIndex = startIndex;
		} else {
			this.startIndex = size / threadNum * thread;
		}
	}
}
