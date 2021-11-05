package org.example.task

import org.apache.log4j.Logger

abstract class AbstractTask {
  @transient lazy val logger: Logger = new Logger(getClass)
}
