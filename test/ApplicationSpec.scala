import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.test.WithApplication
import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification {

  "Application" should {

    "send 404 on a bad request" in new WithApplication {
      val Some(boum) = route(FakeRequest(GET, "/boum"))

      status(boum) must equalTo(NOT_FOUND)
    }

    "render the index page" in new WithApplication {
      val home = route(FakeRequest(GET, "/")).get

      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
      contentAsString(home) must contain ("Hello Play Framework")
    }
  }
}
