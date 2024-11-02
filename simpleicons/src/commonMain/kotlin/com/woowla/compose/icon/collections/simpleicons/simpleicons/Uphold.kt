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

public val Simpleicons.Uphold: ImageVector
    get() {
        if (_uphold != null) {
            return _uphold!!
        }
        _uphold = Builder(name = "Uphold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.274f, 22.332f)
                arcToRelative(7.852f, 7.852f, 0.0f, false, true, -2.221f, 0.334f)
                horizontalLineToRelative(-0.107f)
                arcToRelative(7.78f, 7.78f, 0.0f, false, true, -2.237f, -0.339f)
                arcToRelative(0.668f, 0.668f, 0.0f, true, false, -0.379f, 1.281f)
                arcTo(9.267f, 9.267f, 0.0f, false, false, 11.947f, 24.0f)
                horizontalLineToRelative(0.107f)
                arcToRelative(9.155f, 9.155f, 0.0f, false, false, 2.6f, -0.39f)
                arcToRelative(0.667f, 0.667f, 0.0f, true, false, -0.379f, -1.278f)
                close()
                moveTo(20.101f, 5.91f)
                lineTo(20.101f, 5.869f)
                arcToRelative(8.522f, 8.522f, 0.0f, false, false, -16.207f, 0.027f)
                verticalLineToRelative(0.016f)
                curveToRelative(-0.753f, 2.213f, -0.481f, 5.175f, 0.734f, 7.935f)
                curveToRelative(1.66f, 3.774f, 4.674f, 6.406f, 7.343f, 6.406f)
                horizontalLineToRelative(0.075f)
                curveToRelative(2.669f, 0.0f, 5.682f, -2.624f, 7.343f, -6.406f)
                curveToRelative(1.199f, -2.754f, 1.471f, -5.722f, 0.713f, -7.938f)
                close()
                moveTo(16.185f, 2.68f)
                curveToRelative(-1.351f, -0.051f, -2.819f, 0.534f, -4.185f, 1.676f)
                curveToRelative(-1.383f, -1.142f, -2.851f, -1.727f, -4.201f, -1.676f)
                arcToRelative(7.231f, 7.23f, 0.0f, false, true, 8.386f, 0.0f)
                close()
                moveTo(13.095f, 18.675f)
                arcToRelative(2.597f, 2.597f, 0.0f, false, true, -2.205f, 0.0f)
                curveToRelative(-2.277f, -1.049f, -2.736f, -5.266f, -1.006f, -9.2f)
                arcToRelative(11.979f, 11.979f, 0.0f, false, true, 2.116f, -3.278f)
                arcToRelative(11.888f, 11.888f, 0.0f, false, true, 2.111f, 3.278f)
                curveToRelative(1.719f, 3.934f, 1.26f, 8.151f, -1.017f, 9.2f)
                close()
                moveTo(5.835f, 13.319f)
                curveToRelative(-1.089f, -2.471f, -1.334f, -5.071f, -0.683f, -6.99f)
                curveToRelative(0.347f, -1.006f, 0.932f, -1.722f, 1.687f, -2.071f)
                curveToRelative(1.182f, -0.547f, 2.714f, -0.16f, 4.182f, 1.028f)
                arcToRelative(13.257f, 13.257f, 0.0f, false, false, -2.357f, 3.651f)
                curveToRelative(-1.169f, 2.669f, -1.428f, 5.389f, -0.889f, 7.505f)
                arcToRelative(12.659f, 12.659f, 0.0f, false, true, -1.94f, -3.123f)
                close()
                moveTo(18.15f, 13.319f)
                arcToRelative(12.726f, 12.726f, 0.0f, false, true, -1.94f, 3.125f)
                curveToRelative(0.534f, -2.119f, 0.267f, -4.852f, -0.889f, -7.508f)
                arcToRelative(13.257f, 13.257f, 0.0f, false, false, -2.357f, -3.651f)
                curveToRelative(1.468f, -1.188f, 2.997f, -1.575f, 4.18f, -1.028f)
                curveToRelative(0.758f, 0.35f, 1.334f, 1.068f, 1.689f, 2.071f)
                curveToRelative(0.659f, 1.906f, 0.403f, 4.519f, -0.694f, 6.99f)
                close()
            }
        }
        .build()
        return _uphold!!
    }

private var _uphold: ImageVector? = null
