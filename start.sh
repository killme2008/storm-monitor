#!/bin/sh
LOGDIR=$(dirname $0)/logs

if [ ! -d "$LOGDIR" ]; then
	mkdir "$LOGDIR"
	echo "mkdir logs"
fi

LOGFILE=$LOGDIR/monitor.log

nohup lein  exec src/taestorm_monitor/core.clj  $@ 2>&1 >>$LOGFILE &