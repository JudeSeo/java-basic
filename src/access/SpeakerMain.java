package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolumn();

        speaker.volumnUp();
        speaker.showVolumn();

        speaker.volumnUp();
        speaker.showVolumn();

        System.out.println("volumn 필드 직접 접근 수정");
//        speaker.volumn = 200;
        speaker.showVolumn();
    }
}
