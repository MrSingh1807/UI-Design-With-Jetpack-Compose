package com.example.uidesign.Designs

import android.content.Context
import android.view.animation.Transformation
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.example.uidesign.IMAGE_ADDRESS_URL
import com.example.uidesign.R


@Composable
fun CoilImage(
    context: Context = LocalContext.current,
    imageURL: String = IMAGE_ADDRESS_URL
) {
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp),
        contentAlignment = Alignment.Center
    ) {
        val painter = rememberAsyncImagePainter(
            model = ImageRequest.Builder(context)
                .data(imageURL)
                .allowHardware(false)
                .placeholder(R.drawable.ic_image_not_available)
                .error(R.drawable.ic_error)
                .crossfade(1000)
                .transformations(
                    // CircleCropTransformation(),
                    RoundedCornersTransformation(50f))
                .build()
        )
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painter,
            contentDescription = "Logo Img"
        )

    }
}

@Preview
@Composable
fun PreviewCoilImage() {
    CoilImage()
}