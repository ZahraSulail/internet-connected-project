
package com.barmej.apod.data;


import android.os.Parcel;
import android.os.Parcelable;

public class Astronomy  implements Parcelable {
    /*
     Variables of Json file
     */
    private String copyright;
    private String date;
    private String explanation;
    private String hdurl;
    private String mediaType;
    private String serviceVersion;
    private String title;
    private String url;

    /*
     Empty constructor
     */
    public Astronomy() {

    }

    /*
      Parcel method
     */
    protected Astronomy(Parcel in) {
        copyright = in.readString();
        date = in.readString();
        explanation = in.readString();
        hdurl = in.readString();
        mediaType = in.readString();
        serviceVersion = in.readString();
        title = in.readString();
        url = in.readString();
    }

    public static final Creator<Astronomy> CREATOR = new Creator<Astronomy>() {
        @Override
        public Astronomy createFromParcel(Parcel in) {
            return new Astronomy( in );
        }

        @Override
        public Astronomy[] newArray(int size) {
            return new Astronomy[size];
        }
    };

    /*
     Setter an getter methods
     */
    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getHdurl() {
        return hdurl;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString( copyright );
        dest.writeString( date );
        dest.writeString( explanation );
        dest.writeString( hdurl );
        dest.writeString( mediaType );
        dest.writeString( serviceVersion );
        dest.writeString( title );
        dest.writeString( url );
    }
}
