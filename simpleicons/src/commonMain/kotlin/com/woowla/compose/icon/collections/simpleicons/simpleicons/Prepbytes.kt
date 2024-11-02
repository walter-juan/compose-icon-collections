package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Prepbytes: ImageVector
    get() {
        if (_prepbytes != null) {
            return _prepbytes!!
        }
        _prepbytes = Builder(name = "Prepbytes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.427f, 0.0f, 0.1f, 5.372f, 0.102f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.327f, 12.0f, 11.898f, 12.0f)
                reflectiveCurveToRelative(11.898f, -5.374f, 11.898f, -12.0f)
                curveToRelative(0.0f, -6.628f, -5.327f, -12.0f, -11.898f, -12.0f)
                close()
                moveTo(13.408f, 7.16f)
                horizontalLineToRelative(1.127f)
                verticalLineToRelative(3.914f)
                lineToRelative(0.268f, -0.185f)
                arcToRelative(3.565f, 3.565f, 0.0f, false, true, 2.252f, -0.699f)
                curveToRelative(0.009f, 0.0f, 0.02f, 0.002f, 0.029f, 0.002f)
                curveToRelative(1.924f, 0.105f, 3.4f, 1.75f, 3.297f, 3.674f)
                curveToRelative(-0.215f, 3.539f, -5.069f, 4.585f, -6.625f, 1.395f)
                curveToRelative(-0.376f, -0.776f, -0.348f, -0.484f, -0.375f, -4.506f)
                lineToRelative(0.027f, -3.594f)
                close()
                moveTo(8.676f, 7.293f)
                arcToRelative(3.426f, 3.426f, 0.0f, false, true, 2.131f, 0.754f)
                curveToRelative(1.508f, 1.176f, 1.794f, 3.348f, 0.639f, 4.873f)
                curveToRelative(-1.167f, 1.541f, -3.362f, 1.845f, -4.902f, 0.678f)
                curveToRelative(-0.08f, -0.053f, -0.19f, -0.107f, -0.27f, -0.16f)
                curveToRelative(-0.027f, 0.0f, -0.027f, 0.856f, -0.027f, 1.93f)
                verticalLineToRelative(1.93f)
                lineTo(5.119f, 17.297f)
                verticalLineToRelative(-3.19f)
                curveToRelative(0.0f, -3.861f, 0.001f, -4.077f, 0.377f, -4.828f)
                arcTo(3.605f, 3.605f, 0.0f, false, true, 7.91f, 7.375f)
                curveToRelative(0.254f, -0.057f, 0.51f, -0.083f, 0.766f, -0.082f)
                close()
                moveTo(8.607f, 8.397f)
                curveToRelative(-1.054f, -0.006f, -1.979f, 0.697f, -2.254f, 1.715f)
                curveToRelative(-0.334f, 1.236f, 0.399f, 2.51f, 1.637f, 2.844f)
                curveToRelative(1.236f, 0.334f, 2.508f, -0.399f, 2.842f, -1.637f)
                curveToRelative(0.334f, -1.236f, -0.397f, -2.508f, -1.635f, -2.842f)
                arcToRelative(2.21f, 2.21f, 0.0f, false, false, -0.59f, -0.08f)
                close()
                moveTo(17.027f, 11.293f)
                curveToRelative(-1.123f, -0.069f, -2.142f, 0.659f, -2.44f, 1.744f)
                curveToRelative(-0.347f, 1.266f, 0.398f, 2.575f, 1.664f, 2.922f)
                curveToRelative(1.266f, 0.347f, 2.575f, -0.398f, 2.922f, -1.664f)
                curveToRelative(0.347f, -1.266f, -0.398f, -2.575f, -1.664f, -2.922f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, false, -0.482f, -0.08f)
                close()
            }
        }
        .build()
        return _prepbytes!!
    }

private var _prepbytes: ImageVector? = null
