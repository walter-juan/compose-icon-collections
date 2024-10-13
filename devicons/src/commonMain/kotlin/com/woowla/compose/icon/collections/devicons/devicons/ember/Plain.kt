package com.woowla.compose.icon.collections.devicons.devicons.ember

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.EmberGroup

public val EmberGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(65.27f, 24.13f)
                curveToRelative(8.25f, -0.16f, 14.07f, 2.07f, 19.09f, 9.19f)
                curveToRelative(10.93f, 27.11f, -28.15f, 41.1f, -29.71f, 41.65f)
                lineToRelative(-0.05f, 0.01f)
                reflectiveCurveToRelative(-1.18f, 7.36f, 10.03f, 7.08f)
                curveToRelative(13.79f, 0.0f, 28.3f, -10.69f, 33.81f, -15.21f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, true, 4.47f, 0.26f)
                lineToRelative(4.13f, 4.29f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, true, 0.08f, 4.49f)
                curveToRelative(-3.59f, 4.0f, -12.01f, 12.2f, -24.69f, 17.5f)
                curveToRelative(0.0f, 0.0f, -21.16f, 9.8f, -35.42f, 0.52f)
                curveToRelative(-8.5f, -5.53f, -10.84f, -12.15f, -11.79f, -19.04f)
                curveToRelative(0.0f, 0.0f, -10.32f, -0.53f, -16.96f, -3.12f)
                curveToRelative(-6.64f, -2.59f, 0.05f, -10.41f, 0.05f, -10.41f)
                reflectiveCurveToRelative(2.04f, -3.23f, 5.92f, 0.0f)
                curveToRelative(3.88f, 3.23f, 11.13f, 1.77f, 11.13f, 1.77f)
                curveToRelative(0.65f, -5.1f, 1.72f, -11.83f, 4.88f, -18.93f)
                curveToRelative(6.63f, -14.89f, 16.79f, -19.91f, 25.04f, -20.07f)
                close()
                moveTo(66.93f, 37.99f)
                curveToRelative(-5.48f, 0.37f, -13.88f, 8.86f, -14.28f, 24.5f)
                curveToRelative(0.0f, 0.0f, 3.72f, 1.13f, 11.97f, -4.53f)
                curveToRelative(8.25f, -5.66f, 9.87f, -14.72f, 5.5f, -18.92f)
                curveToRelative(-0.82f, -0.79f, -1.93f, -1.13f, -3.19f, -1.05f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
