# TestPublishApp #

This is a test project for publishing to various forms of maven/ivy repositories.
The companion library is [testPublishApp](https://github.com/mslinn/testPublishLib)
Read my [blog posting](http://mikeslinn.blogspot.com/2013/07/publishing-maven-artifacts-to-aws-s3.html) on how to use this project.

This project is set up to fetch `testPublishLib` artifacts from the `snapshots` directory of an S3 bucket
that I created called `www.mavenrepo`.
