#!/bin/sh
LOGDIR=$(dirname $0)/logs

if [ ! -d "$LOGDIR" ]; then
	mkdir "$LOGDIR"
fi

LOGFILE=$LOGDIR/monitor.log

nohup lein  exec src/storm_monitor/core.clj  $@ 2>&1 >>$LOGFILE &