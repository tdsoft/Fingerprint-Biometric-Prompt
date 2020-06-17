package com.sample.biometrictest

import androidx.biometric.BiometricPrompt
import androidx.fragment.app.FragmentActivity
import java.util.concurrent.Executor

class FingerPrintManagementUtil(activity: FragmentActivity, executor: Executor, callBack:BiometricPrompt.AuthenticationCallback) {
    private var biometricPrompt = BiometricPrompt(activity, executor, callBack)

    fun showBiometricPrompt(){
        val prompt = BiometricPrompt.PromptInfo.Builder()
            .setTitle("Sign in")
            .setSubtitle("Your app name")
            .setDescription("Confirm fingerprint to continue")
            .setNegativeButtonText("Cancel")
            .build()

        biometricPrompt.authenticate(prompt)
    }

}