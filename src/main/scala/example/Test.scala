package example

import cats.Apply
import cats.data.Kleisli
import cats.syntax.apply.*

class KleisliApply[F[_]: Apply, AA] extends Apply[Kleisli[F, AA, *]] {
  override def ap[A, B](ff: Kleisli[F, AA, A => B])(fa: Kleisli[F, AA, A]): Kleisli[F, AA, B] = (ff, fa).mapN(_(_))
  override def map[A, B](fa: Kleisli[F, AA, A])(f: A => B): Kleisli[F, AA, B] = fa.map(f)
}
