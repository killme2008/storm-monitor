# storm-monitor

  A monitor for storm to check if storm is running well.

## Usage

Just clone the source code to your machine,then copy your storm.yaml to conf/storm.yaml,and edit the conf/monitor.yaml to modify monitor settings.
Then type command:

	    sh start.sh

to  start the monitor.

By default, storm-monitor just write alerts to logs/monitor.log, you can modify the src/storm_monitor/alarm.clj  to fit your application.For example,send alert to your mobile phone.

## License

Copyright (C) 2011 

Distributed under the Eclipse Public License, the same as Clojure.
