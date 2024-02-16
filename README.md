# [Scalafix issue #1801](https://github.com/scalacenter/scalafix/pull/1801)

[Test.scala](https://github.com/mrdziuban/scalafix-issue-1801/blob/main/src/main/scala/example/Test.scala) contains a minimal reproduction of [Scalafix issue #1801](https://github.com/scalacenter/scalafix/pull/1801).

To reproduce:

1. Clone this repo
2. `cd` into it
3. Run `sbt scalafix`

You'll see an error like this:

```
[error] scalafix.internal.v1.FileException: unexpected error processing file /Users/matt/scalafix-issue-1801/src/main/scala/example/Test.scala
[error] Caused by: scala.MatchError: LambdaType(Some(Scope(Vector(),Vector(SymbolInformation([B],SCALA,TYPE_PARAMETER,0,B,TypeSignature(None,TypeRef(Empty,scala/Nothing#,Vector()),TypeRef(Empty,scala/Any#,Vector())),Vector(),Empty,Vector(),None)))),TypeRef(Empty,cats/data/Kleisli#,Vector(TypeRef(Empty,example/KleisliApply#[F],Vector()), TypeRef(Empty,example/KleisliApply#[AA],Vector()), TypeRef(Empty,[B],Vector())))) (of class scala.meta.internal.semanticdb.LambdaType)
[error]   at scalafix.internal.v0.LegacyCodePrinter.pprint(LegacyCodePrinter.scala:103)
[error]   at scalafix.internal.v0.LegacyCodePrinter.$anonfun$loop$4(LegacyCodePrinter.scala:204)
[error]   at scalafix.internal.v0.LegacyCodePrinter.$anonfun$loop$4$adapted(LegacyCodePrinter.scala:204)
[error]   at scalafix.internal.v0.LegacyCodePrinter.$anonfun$mkString$1(LegacyCodePrinter.scala:49
[error]   at scalafix.internal.v0.LegacyCodePrinter.$anonfun$mkString$1$adapted(LegacyCodePrinter.scala:43)
[error]   at scala.collection.immutable.Vector.foreach(Vector.scala:2124)
[error]   at scalafix.internal.v0.LegacyCodePrinter.mkString(LegacyCodePrinter.scala:43)
[error]   at scalafix.internal.v0.LegacyCodePrinter.loop(LegacyCodePrinter.scala:204)
[error]   at scalafix.internal.v0.LegacyCodePrinter.loop(LegacyCodePrinter.scala:181)
[error]   at scalafix.internal.v0.LegacyCodePrinter.convertSynthetic(LegacyCodePrinter.scala:209)
[error]   at scalafix.internal.v0.LegacySemanticdbIndex$.syntheticToLegacy(LegacySemanticdbIndex.scala:171)
[error]   at scalafix.internal.v0.LegacySemanticdbIndex.$anonfun$synthetics$1(LegacySemanticdbIndex.scala:53)
[error]   at scala.collection.immutable.Vector1.map(Vector.scala:2140)
[error]   at scala.collection.immutable.Vector1.map(Vector.scala:385)
[error]   at scalafix.internal.v0.LegacySemanticdbIndex.synthetics(LegacySemanticdbIndex.scala:52)
[error]   at scalafix.internal.scaluzzi.Disable.checkSynthetics(Disable.scala:163)
[error]   at scalafix.internal.scaluzzi.Disable.check(Disable.scala:184)
[error]   at scalafix.internal.v0.LegacyRule$.lints(LegacyRule.scala:12)
[error]   at scalafix.internal.v0.LegacySemanticRule.fix(LegacySemanticRule.scala:29)
[error]   at scalafix.internal.v1.Rules.$anonfun$semanticPatch$1(Rules.scala:78)
[error]   at scala.collection.immutable.List.map(List.scala:246)
[error]   at scalafix.internal.v1.Rules.semanticPatch(Rules.scala:76)
[error]   at scalafix.internal.v1.MainOps$.getPatchesAndDiags(MainOps.scala:306)
[error]   at scalafix.internal.v1.MainOps$.unsafeHandleFile(MainOps.scala:256)
[error] (Compile / scalafix) scalafix.sbt.ScalafixFailed: UnexpectedError
```
