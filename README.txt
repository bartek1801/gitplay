Git hints
====================================================================================================================

git rebase - zamiast mergować się z masterem trzeba zrobić rebase do mastera

git checkout cool-feature
git pull --rebase origin master
(Resolve conflicts if any. Squash commits if necessary.)
git push origin +cool-feature (it's better than -f as it will not mix the branches: git push origin cool-feature -f)

fajna jest ta opcja z `+` zamiast `-f` bo trochę bezpieczniejsza


======================================================================================================================

squash/fixup - scalanie commitów ze zdalnego repo


https://stackoverflow.com/questions/5667884/how-to-squash-commits-in-git-after-they-have-been-pushed

Squash commits locally with

git rebase -i origin/master~4 master
and then force push with

git push origin +{branch name}
Difference between --force and +
From the documentation of git push:

Note that --force applies to all the refs that are pushed, hence using it with push.default set to matching or with multiple push destinations configured with remote.*.push may overwrite refs other than the current branch (including local refs that are strictly behind their remote counterpart). To force a push to only one branch, use a + in front of the refspec to push (e.g git push origin +master to force a push to the master branch).

=====================================================================================================
