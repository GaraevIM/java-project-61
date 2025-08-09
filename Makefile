setup:
	cd code/app && ./gradlew clean installdist

run-dist:
	code/app/build/install/app/bin/app
