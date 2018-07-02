package jp.funnything.offing_harbor;

public class ConvertConfig {
    public Who who;

    public enum ConvertFormat {
        PLAIN, ANDROID_ANNOTATIONS, BUTTER_KNIFE;

        public boolean requireAssignMethod() {
            return this == PLAIN;
        }
    }

    public enum Visibility {
        PRIVATE, PACKAGE_PRIVATE, PROTECTED
    }
    public ConvertPrefix prefix;
    public ConvertFormat format;
    public Visibility visibility;
    public boolean useSmartType;

    public ConvertConfig() {
        // default values
        prefix = ConvertPrefix.NONE;
        format = ConvertFormat.PLAIN;
        visibility = Visibility.PRIVATE;
        who = Who.NONE;
        useSmartType = false;
    }

    public enum ConvertPrefix {
        NONE, AS_IS, MEMBER, UNDERSCORE;

        public boolean willModify() {
            return this != NONE;
        }
    }

    public enum Who {
        NONE, VIEW, ITEM_VIEW, $
    }
}

