package org.example.task.reading

import org.apache.log4j.Logger
import org.example.task.AbstractTask

abstract class AbstractReading extends AbstractTask {
  @transient lazy val readingTaskLogger: Logger = new Logger(getClass)
}
