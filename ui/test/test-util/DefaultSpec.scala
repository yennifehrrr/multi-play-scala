package util

import org.scalatest._
import org.scalatestplus.play._
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

trait DefaultSpec
  extends PlaySpec
  with    BeforeAndAfterEach
  with    BeforeAndAfterAll
  with    MockitoSugar