package spring.trip.domain;

public class Story {
	private int storyNo;
	private String storyTitle;
	private String storyContent;
	private String storyLocation;
	private String storyTripDate;
	private String storyPictureUrl;
	private String storyIsPublic;
	private int storyHit;
	private String storyCreateDate;
	private String storyLatitude;
	private String storyLongitude;
	
	private Book book;
	private Member member;
	
	public Story() {
	}
	
	//not null column
	public Story(int storyNo, String storyTitle, String storyContent, String storyIsPublic, int storyHit,
			String storyCreateDate, Book book, Member member) {
		super();
		this.storyNo = storyNo;
		this.storyTitle = storyTitle;
		this.storyContent = storyContent;
		this.storyIsPublic = storyIsPublic;
		this.storyHit = storyHit;
		this.storyCreateDate = storyCreateDate;
		this.book = book;
		this.member = member;
	}

	public Story(int storyNo, String storyTitle, String storyContent, String storyLocation, String storyTripDate,
			String storyPictureUrl, String storyIsPublic, int storyHit, String storyCreateDate, String storyLatitude,
			String storyLongitude, Book book, Member member) {
		super();
		this.storyNo = storyNo;
		this.storyTitle = storyTitle;
		this.storyContent = storyContent;
		this.storyLocation = storyLocation;
		this.storyTripDate = storyTripDate;
		this.storyPictureUrl = storyPictureUrl;
		this.storyIsPublic = storyIsPublic;
		this.storyHit = storyHit;
		this.storyCreateDate = storyCreateDate;
		this.storyLatitude = storyLatitude;
		this.storyLongitude = storyLongitude;
		this.book = book;
		this.member = member;
	}

	public int getStoryNo() {
		return storyNo;
	}
	public void setStoryNo(int storyNo) {
		this.storyNo = storyNo;
	}
	public String getStoryTitle() {
		return storyTitle;
	}
	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}
	public String getStoryContent() {
		return storyContent;
	}
	public void setStoryContent(String storyContent) {
		this.storyContent = storyContent;
	}
	public String getStoryLocation() {
		return storyLocation;
	}
	public void setStoryLocation(String storyLocation) {
		this.storyLocation = storyLocation;
	}
	public String getStoryTripDate() {
		return storyTripDate;
	}
	public void setStoryTripDate(String storyTripDate) {
		this.storyTripDate = storyTripDate;
	}
	public String getStoryPictureUrl() {
		return storyPictureUrl;
	}
	public void setStoryPictureUrl(String storyPictureUrl) {
		this.storyPictureUrl = storyPictureUrl;
	}
	public String getStoryIsPublic() {
		return storyIsPublic;
	}
	public void setStoryIsPublic(String storyIsPublic) {
		this.storyIsPublic = storyIsPublic;
	}
	public int getStoryHit() {
		return storyHit;
	}
	public void setStoryHit(int storyHit) {
		this.storyHit = storyHit;
	}
	public String getStoryCreateDate() {
		return storyCreateDate;
	}
	public void setStoryCreateDate(String storyCreateDate) {
		this.storyCreateDate = storyCreateDate;
	}
	public String getStoryLatitude() {
		return storyLatitude;
	}
	public void setStoryLatitude(String storyLatitude) {
		this.storyLatitude = storyLatitude;
	}
	public String getStoryLongitude() {
		return storyLongitude;
	}
	public void setStoryLongitude(String storyLongitude) {
		this.storyLongitude = storyLongitude;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	@Override
	public String toString() {
		return "Story [storyNo=" + storyNo + ", storyTitle=" + storyTitle + ", storyContent=" + storyContent
				+ ", storyLocation=" + storyLocation + ", storyTripDate=" + storyTripDate + ", storyPictureUrl="
				+ storyPictureUrl + ", storyIsPublic=" + storyIsPublic + ", storyHit=" + storyHit + ", storyCreateDate="
				+ storyCreateDate + ", storyLatitude=" + storyLatitude + ", storyLongitude=" + storyLongitude
				+ ", book=" + book + ", member=" + member + "]";
	}
}
