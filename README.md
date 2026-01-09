# Maths Quiz

Short description
Maths Quiz is an Android app for practicing arithmetic with multiple quiz modes, levels, and study reminders.

Full description
Maths Quiz is a math learning and brain-training app built for fast, focused practice. It includes classic
operations such as addition, subtraction, multiplication, and division, plus squares, roots, cubes, and mixed
question sets. Users can choose from several quiz styles (multiple choice, input, true/false, find missing,
and duel), progress through levels, track scores, and review past answers. The app supports multiple languages,
offers daily reminders, and includes a clean, mobile-first UI with optional sound/vibration feedback.

Key features
- Multiple quiz modes: Learn Table, Option, Input, True/False, Find Missing, and Duel
- Progression system with levels, scores, and history/review tests
- Local progress storage (no server dependency)
- Daily reminders and notifications
- Multi-language support
- Optional sound/vibration, night mode, and theme colors
- AdMob banner, interstitial, and rewarded ads support

Tech stack
- Android (Java)
- Gradle build system
- SQLite (local data via sqliteassethelper)
- Google Mobile Ads (AdMob)

Project structure
- `app/src/main/java/com/sandy/quiz/` - application source code
- `app/src/main/res/` - layouts, strings, images, and other resources
- `app/src/main/assets/` - bundled assets such as the prebuilt database

Configuration
- App name: update `app/src/main/res/values/strings.xml`
- Package name: update `app/build.gradle` and manifest/package references
- Privacy policy: set your own URL in `app/src/main/res/values/strings.xml`

AdMob setup
- Add your own AdMob app ID and unit IDs in `app/src/main/res/values/strings.xml`
- Update defaults in `app/src/main/java/com/sandy/quiz/utils/AdsInfo.java` if needed

Getting started
1. Open the project in Android Studio.
2. Let Gradle sync.
3. Run the `app` configuration on a device or emulator.

Build
- Debug APK: `./gradlew assembleDebug`
- Release APK: `./gradlew assembleRelease`

Notes
- The app uses a prebuilt SQLite database under `app/src/main/assets/databases/`.
- If you change the package name, update the FileProvider authority and any resource references accordingly.
