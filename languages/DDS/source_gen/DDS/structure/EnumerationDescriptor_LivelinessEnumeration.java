package DDS.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_LivelinessEnumeration extends EnumerationDescriptorBase {

  public EnumerationDescriptor_LivelinessEnumeration() {
    super(0x331f7a18c6574dd7L, 0x870742124f20f67bL, 0x7358ab7c0bd70c6eL, "LivelinessEnumeration", "r:7f874e35-ef79-4b8f-ae49-2ebc5153760e(DDS.structure)/8311581661575187566");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_AUTOMATIC_0 = new EnumerationDescriptor.MemberDescriptor("AUTOMATIC", "AUTOMATIC", 0x7358ab7c0bd70c6fL, "r:7f874e35-ef79-4b8f-ae49-2ebc5153760e(DDS.structure)/8311581661575187567");
  private final EnumerationDescriptor.MemberDescriptor myMember_MANUAL_BY_TOPIC_0 = new EnumerationDescriptor.MemberDescriptor("MANUAL_BY_TOPIC", "MANUAL_BY_TOPIC", 0x7358ab7c0bd70c70L, "r:7f874e35-ef79-4b8f-ae49-2ebc5153760e(DDS.structure)/8311581661575187568");
  private final EnumerationDescriptor.MemberDescriptor myMember_MANUAL_BY_PARTICIPANT_0 = new EnumerationDescriptor.MemberDescriptor("MANUAL_BY_PARTICIPANT", "MANUAL_BY_PARTICIPANT", 0x3717cb3de2d3548bL, "r:7f874e35-ef79-4b8f-ae49-2ebc5153760e(DDS.structure)/3969865063209325707");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x331f7a18c6574dd7L, 0x870742124f20f67bL, 0x7358ab7c0bd70c6eL, 0x7358ab7c0bd70c6fL, 0x7358ab7c0bd70c70L, 0x3717cb3de2d3548bL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_AUTOMATIC_0, myMember_MANUAL_BY_TOPIC_0, myMember_MANUAL_BY_PARTICIPANT_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_AUTOMATIC_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "AUTOMATIC":
        return myMember_AUTOMATIC_0;
      case "MANUAL_BY_TOPIC":
        return myMember_MANUAL_BY_TOPIC_0;
      case "MANUAL_BY_PARTICIPANT":
        return myMember_MANUAL_BY_PARTICIPANT_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
