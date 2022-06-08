/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.netty.common;

import java.util.concurrent.ExecutionException;

import io.netty.util.concurrent.Future;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Suspend;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class NettyCoroutine {

	public static class OutOfNettyEventLoop extends RuntimeException {
	}

	public static <T> T await(Future<T> future) throws Suspend, ExecutionException, OutsideCall, OutOfNettyEventLoop {
		throw new NotWeaved();
	}
}
