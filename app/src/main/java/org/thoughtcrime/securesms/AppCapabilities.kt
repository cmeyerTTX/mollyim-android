package org.thoughtcrime.securesms

import org.whispersystems.signalservice.api.account.AccountAttributes

object AppCapabilities {
  /**
   * @param storageCapable Whether or not the user can use storage service. This is another way of
   * asking if the user has set a Signal PIN or not.
   */
  @JvmStatic
  fun getCapabilities(storageCapable: Boolean): AccountAttributes.Capabilities {
    return AccountAttributes.Capabilities(
      storage = storageCapable,
      senderKey = true,
      announcementGroup = true,
      changeNumber = true,
      stories = true,
      giftBadges = false,
      pni = true,
      paymentActivation = false,
      deleteSync = true // just for debugging, DO NOT USE
    )
  }
}
