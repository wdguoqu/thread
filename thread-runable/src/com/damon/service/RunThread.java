package com.damon.service;

/**
 * @Description: TODO
 * @Author: YNa
 * @Date: 2020/6/20 15:42
 * @Version: #1.0 Copyright © 2020
 */
public abstract class RunThread implements Runnable{
	@Override
	public void run() {
		run2doing();
	}
	public void run2doing() {}
}
