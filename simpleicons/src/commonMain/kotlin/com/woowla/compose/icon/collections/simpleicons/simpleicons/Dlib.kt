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

public val Simpleicons.Dlib: ImageVector
    get() {
        if (_dlib != null) {
            return _dlib!!
        }
        _dlib = Builder(name = "Dlib", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.219f, 0.002f)
                curveToRelative(-0.508f, -0.01f, -1.016f, 0.015f, -1.522f, 0.046f)
                verticalLineToRelative(23.909f)
                curveToRelative(0.972f, 0.068f, 1.954f, 0.055f, 2.924f, -0.032f)
                curveToRelative(0.284f, -0.94f, 0.574f, -1.878f, 0.86f, -2.818f)
                curveToRelative(1.488f, -0.245f, 2.917f, -0.708f, 4.192f, -1.361f)
                curveToRelative(1.04f, 0.502f, 2.08f, 1.005f, 3.12f, 1.507f)
                arcToRelative(14.212f, 14.212f, 0.0f, false, false, 2.076f, -1.581f)
                curveToRelative(-0.635f, -0.83f, -1.273f, -1.659f, -1.91f, -2.488f)
                curveToRelative(0.829f, -1.02f, 1.443f, -2.161f, 1.726f, -3.356f)
                curveToRelative(1.19f, -0.229f, 2.38f, -0.458f, 3.57f, -0.687f)
                arcToRelative(10.528f, 10.528f, 0.0f, false, false, -0.03f, -2.287f)
                curveToRelative(-1.183f, -0.228f, -2.365f, -0.455f, -3.548f, -0.682f)
                curveToRelative(-0.292f, -1.194f, -0.871f, -2.344f, -1.724f, -3.355f)
                curveToRelative(0.638f, -0.829f, 1.276f, -1.659f, 1.915f, -2.488f)
                curveToRelative(-0.613f, -0.588f, -1.297f, -1.117f, -2.043f, -1.598f)
                curveToRelative(-1.054f, 0.51f, -2.109f, 1.019f, -3.163f, 1.528f)
                curveToRelative(-1.267f, -0.667f, -2.697f, -1.143f, -4.187f, -1.387f)
                curveTo(7.188f, 1.929f, 6.898f, 0.987f, 6.61f, 0.044f)
                curveToRelative(-0.463f, -0.028f, -0.927f, -0.049f, -1.391f, -0.042f)
                close()
                moveTo(7.549f, 5.39f)
                curveToRelative(3.687f, 0.814f, 6.464f, 3.746f, 6.278f, 6.801f)
                curveToRelative(-0.093f, 2.897f, -2.682f, 5.658f, -6.243f, 6.398f)
                curveToRelative(-0.169f, -0.227f, -0.025f, -0.78f, -0.073f, -1.133f)
                curveToRelative(-0.002f, -4.024f, -0.003f, -8.049f, -0.005f, -12.073f)
                lineToRelative(0.043f, 0.01f)
                close()
            }
        }
        .build()
        return _dlib!!
    }

private var _dlib: ImageVector? = null
