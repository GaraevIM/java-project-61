setup:
	@if [ -d code/app ]; then \
		cd code/app && ./gradlew clean installDist; \
	else \
		./gradlew clean installDist; \
	fi

run-dist:
	@if [ -x code/app/build/install/app/bin/app ]; then \
		code/app/build/install/app/bin/app; \
	else \
		build/install/app/bin/app; \
	fi
