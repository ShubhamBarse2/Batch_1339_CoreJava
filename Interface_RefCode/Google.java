package Interface_RefCode;

public class Google implements Gmail, GDrive, Gmap {

	@Override
	public String direction() {
		// TODO Auto-generated method stub
		return "Related to G map ";
	}

	@Override
	public String uploadFiles() {
		// TODO Auto-generated method stub
		return "File uploaded through Google Drive";
	}

	@Override
	public String sent() {
		// TODO Auto-generated method stub
		return "Sent file through Gmail";
	}

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
