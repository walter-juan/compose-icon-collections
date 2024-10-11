package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.TwitterLine: ImageVector
    get() {
        if (_twitterLine != null) {
            return _twitterLine!!
        }
        _twitterLine = Builder(name = "TwitterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.35f, 5.55f)
                curveTo(13.768f, 5.55f, 12.479f, 6.818f, 12.45f, 8.397f)
                lineTo(12.422f, 9.972f)
                curveTo(12.416f, 10.303f, 12.143f, 10.567f, 11.812f, 10.561f)
                curveTo(11.788f, 10.56f, 11.765f, 10.559f, 11.741f, 10.555f)
                lineTo(10.181f, 10.343f)
                curveTo(8.127f, 10.063f, 6.159f, 9.117f, 4.271f, 7.544f)
                curveTo(3.673f, 10.854f, 4.84f, 13.147f, 7.653f, 14.916f)
                lineTo(9.4f, 16.014f)
                curveTo(9.681f, 16.191f, 9.765f, 16.561f, 9.589f, 16.841f)
                curveTo(9.549f, 16.906f, 9.496f, 16.962f, 9.435f, 17.007f)
                lineTo(7.843f, 18.17f)
                curveTo(8.79f, 18.229f, 9.689f, 18.188f, 10.435f, 18.039f)
                curveTo(15.153f, 17.097f, 18.29f, 13.547f, 18.29f, 7.691f)
                curveTo(18.29f, 7.213f, 17.277f, 5.55f, 15.35f, 5.55f)
                close()
                moveTo(10.451f, 8.361f)
                curveTo(10.498f, 5.696f, 12.674f, 3.55f, 15.35f, 3.55f)
                curveTo(16.713f, 3.55f, 17.947f, 4.107f, 18.835f, 5.005f)
                curveTo(19.546f, 5.0f, 20.151f, 5.18f, 21.503f, 4.36f)
                curveTo(21.169f, 6.0f, 21.003f, 6.712f, 20.29f, 7.691f)
                curveTo(20.29f, 15.333f, 15.593f, 19.049f, 10.826f, 20.0f)
                curveTo(7.559f, 20.652f, 2.806f, 19.581f, 1.445f, 18.159f)
                curveTo(2.139f, 18.105f, 4.959f, 17.802f, 6.589f, 16.609f)
                curveTo(5.21f, 15.699f, -0.279f, 12.468f, 3.328f, 3.786f)
                curveTo(5.021f, 5.763f, 6.738f, 7.109f, 8.478f, 7.823f)
                curveTo(9.635f, 8.298f, 9.92f, 8.288f, 10.451f, 8.361f)
                close()
            }
        }
        .build()
        return _twitterLine!!
    }

private var _twitterLine: ImageVector? = null
