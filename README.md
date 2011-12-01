# storm-monitor

  A monitor for storm to check if storm is running well.

## Usage

Just clone the source code to your machine,then copy your storm.yaml to conf/storm.yaml,and edit the conf/monitor.yaml to modify monitor settings.
Then type command:

	    sh start.sh

to  start the monitor.

By default, storm-monitor just write alerts to logs/monitor.log, you can modify the src/storm_monitor/alarm.clj  to fit your application.For example,send alert to your mobile phone.

The logs:

		112  [pool-3-thread-1] INFO  storm-monitor.alarm  - Send alert to 88888888 with message:Topologies [topology1,topology2] have been killed
		112  [pool-3-thread-1] INFO  storm-monitor.alarm  - Send alert to 99999999 with message:Topologies [topology1,topology2] have been killed
		112  [pool-3-thread-1] INFO  storm-monitor.alarm  - Send alert to 88888888 with message:Topologies [topology1,topology2] have no active tasks
		112  [pool-3-thread-1] INFO  storm-monitor.alarm  - Send alert to 99999999 with message:Topologies [topology1,topology2] have no active tasks

## License

Copyright (C) 2011 

Distributed under the Eclipse Public License, the same as Clojure.
