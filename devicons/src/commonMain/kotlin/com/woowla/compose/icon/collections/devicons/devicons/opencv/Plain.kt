package com.woowla.compose.icon.collections.devicons.devicons.opencv

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.OpencvGroup

public val OpencvGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.87f, 66.6f)
                curveToRelative(9.0f, 5.28f, 15.06f, 15.03f, 15.07f, 26.19f)
                curveToRelative(0.03f, 16.81f, -13.62f, 30.45f, -30.48f, 30.48f)
                curveToRelative(-16.86f, 0.03f, -30.56f, -13.57f, -30.59f, -30.38f)
                curveToRelative(-0.02f, -11.16f, 6.0f, -20.93f, 14.98f, -26.25f)
                lineToRelative(8.77f, 14.78f)
                curveToRelative(0.22f, 0.37f, 0.09f, 0.85f, -0.26f, 1.09f)
                curveToRelative(-3.32f, 2.25f, -5.5f, 6.05f, -5.49f, 10.35f)
                curveToRelative(0.01f, 6.89f, 5.63f, 12.48f, 12.55f, 12.46f)
                curveToRelative(6.92f, -0.01f, 12.52f, -5.61f, 12.5f, -12.5f)
                curveToRelative(-0.01f, -4.3f, -2.19f, -8.09f, -5.52f, -10.33f)
                curveToRelative(-0.35f, -0.24f, -0.48f, -0.72f, -0.27f, -1.09f)
                close()
                moveTo(45.48f, 66.42f)
                arcToRelative(30.5f, 30.5f, 0.0f, false, false, -14.91f, -3.87f)
                curveTo(13.7f, 62.56f, 0.04f, 76.18f, 0.04f, 92.99f)
                curveToRelative(0.0f, 16.8f, 13.67f, 30.43f, 30.53f, 30.43f)
                curveToRelative(16.95f, 0.0f, 30.95f, -14.34f, 30.52f, -31.21f)
                lineTo(43.91f, 92.2f)
                curveToRelative(-0.45f, 0.0f, -0.81f, 0.38f, -0.81f, 0.83f)
                curveToRelative(-0.04f, 6.72f, -5.67f, 12.43f, -12.52f, 12.43f)
                curveToRelative(-6.92f, 0.0f, -12.53f, -5.59f, -12.53f, -12.48f)
                curveToRelative(0.0f, -6.89f, 5.61f, -12.48f, 12.53f, -12.48f)
                curveToRelative(1.81f, 0.0f, 3.53f, 0.38f, 5.09f, 1.07f)
                curveToRelative(0.38f, 0.17f, 0.84f, 0.04f, 1.05f, -0.32f)
                close()
                moveTo(47.95f, 61.65f)
                curveToRelative(-8.99f, -5.29f, -15.03f, -15.05f, -15.03f, -26.22f)
                curveTo(32.92f, 18.63f, 46.59f, 5.0f, 63.45f, 5.0f)
                reflectiveCurveToRelative(30.53f, 13.63f, 30.53f, 30.43f)
                curveToRelative(0.0f, 11.16f, -6.03f, 20.92f, -15.03f, 26.22f)
                lineTo(70.21f, 46.86f)
                curveToRelative(-0.22f, -0.37f, -0.09f, -0.85f, 0.27f, -1.09f)
                curveToRelative(3.32f, -2.25f, 5.5f, -6.04f, 5.5f, -10.34f)
                curveToRelative(0.0f, -6.89f, -5.61f, -12.48f, -12.53f, -12.48f)
                curveToRelative(-6.92f, 0.0f, -12.53f, 5.59f, -12.53f, 12.48f)
                curveToRelative(0.0f, 4.3f, 2.18f, 8.09f, 5.5f, 10.34f)
                curveToRelative(0.36f, 0.24f, 0.48f, 0.72f, 0.26f, 1.09f)
                close()
                moveTo(47.95f, 61.65f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
