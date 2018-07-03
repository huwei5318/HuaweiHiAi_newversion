package com.repository.huaweihiai.bean;

import java.util.List;

/**
 * Created by huwei on 2018/5/31.
 */

public class MissCallNotice {


    /**
     * intentions : [{"name":"missedCallNotice","attributes":[{"number":"13096971683","callTime":{"normalTime":{"start":{"timestamp":1543981980000,"section":"P","standardTime":"2018年12月05日11时53分00秒"}},"oriText":"12/05 11:53","origin":"1527757315498","charOffset":22},"party":0}],"confidence":1}]
     * code : 0
     * message : success
     */

    private int code;
    private String message;
    private List<IntentionsBean> intentions;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<IntentionsBean> getIntentions() {
        return intentions;
    }

    public void setIntentions(List<IntentionsBean> intentions) {
        this.intentions = intentions;
    }

    public static class IntentionsBean {
        /**
         * name : missedCallNotice
         * attributes : [{"number":"13096971683","callTime":{"normalTime":{"start":{"timestamp":1543981980000,"section":"P","standardTime":"2018年12月05日11时53分00秒"}},"oriText":"12/05 11:53","origin":"1527757315498","charOffset":22},"party":0}]
         * confidence : 1
         */

        private String name;
        private int confidence;
        private List<AttributesBean> attributes;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getConfidence() {
            return confidence;
        }

        public void setConfidence(int confidence) {
            this.confidence = confidence;
        }

        public List<AttributesBean> getAttributes() {
            return attributes;
        }

        public void setAttributes(List<AttributesBean> attributes) {
            this.attributes = attributes;
        }

        public static class AttributesBean {
            /**
             * number : 13096971683
             * callTime : {"normalTime":{"start":{"timestamp":1543981980000,"section":"P","standardTime":"2018年12月05日11时53分00秒"}},"oriText":"12/05 11:53","origin":"1527757315498","charOffset":22}
             * party : 0
             */

            private String number;
            private CallTimeBean callTime;
            private int party;

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public CallTimeBean getCallTime() {
                return callTime;
            }

            public void setCallTime(CallTimeBean callTime) {
                this.callTime = callTime;
            }

            public int getParty() {
                return party;
            }

            public void setParty(int party) {
                this.party = party;
            }

            public static class CallTimeBean {
                /**
                 * normalTime : {"start":{"timestamp":1543981980000,"section":"P","standardTime":"2018年12月05日11时53分00秒"}}
                 * oriText : 12/05 11:53
                 * origin : 1527757315498
                 * charOffset : 22
                 */

                private NormalTimeBean normalTime;
                private String oriText;
                private String origin;
                private int charOffset;

                public NormalTimeBean getNormalTime() {
                    return normalTime;
                }

                public void setNormalTime(NormalTimeBean normalTime) {
                    this.normalTime = normalTime;
                }

                public String getOriText() {
                    return oriText;
                }

                public void setOriText(String oriText) {
                    this.oriText = oriText;
                }

                public String getOrigin() {
                    return origin;
                }

                public void setOrigin(String origin) {
                    this.origin = origin;
                }

                public int getCharOffset() {
                    return charOffset;
                }

                public void setCharOffset(int charOffset) {
                    this.charOffset = charOffset;
                }

                public static class NormalTimeBean {
                    /**
                     * start : {"timestamp":1543981980000,"section":"P","standardTime":"2018年12月05日11时53分00秒"}
                     */

                    private StartBean start;

                    public StartBean getStart() {
                        return start;
                    }

                    public void setStart(StartBean start) {
                        this.start = start;
                    }

                    public static class StartBean {
                        /**
                         * timestamp : 1543981980000
                         * section : P
                         * standardTime : 2018年12月05日11时53分00秒
                         */

                        private long timestamp;
                        private String section;
                        private String standardTime;

                        public long getTimestamp() {
                            return timestamp;
                        }

                        public void setTimestamp(long timestamp) {
                            this.timestamp = timestamp;
                        }

                        public String getSection() {
                            return section;
                        }

                        public void setSection(String section) {
                            this.section = section;
                        }

                        public String getStandardTime() {
                            return standardTime;
                        }

                        public void setStandardTime(String standardTime) {
                            this.standardTime = standardTime;
                        }
                    }
                }
            }
        }
    }
}
