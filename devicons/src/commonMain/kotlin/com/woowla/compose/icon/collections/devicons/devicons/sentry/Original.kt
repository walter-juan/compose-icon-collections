package com.woowla.compose.icon.collections.devicons.devicons.sentry

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SentryGroup

public val SentryGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF362d59)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.01f, 13.33f)
                curveToRelative(-2.16f, -3.58f, -6.04f, -5.78f, -10.23f, -5.78f)
                reflectiveCurveToRelative(-8.06f, 2.19f, -10.22f, 5.78f)
                lineTo(36.73f, 42.15f)
                arcToRelative(82.34f, 82.34f, 0.0f, false, true, 45.38f, 68.16f)
                lineTo(70.31f, 110.31f)
                arcToRelative(70.78f, 70.78f, 0.0f, false, false, -39.53f, -58.09f)
                lineToRelative(-15.57f, 26.93f)
                curveToRelative(12.65f, 5.68f, 21.54f, 17.4f, 23.6f, 31.11f)
                lineTo(11.68f, 110.26f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, -1.58f, -2.84f)
                lineToRelative(7.52f, -12.78f)
                curveToRelative(-2.55f, -2.13f, -5.46f, -3.77f, -8.59f, -4.86f)
                lineToRelative(-7.45f, 12.78f)
                curveToRelative(-1.56f, 2.68f, -1.99f, 5.89f, -1.17f, 8.88f)
                reflectiveCurveToRelative(2.79f, 5.55f, 5.49f, 7.07f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 5.78f, 1.53f)
                horizontalLineToRelative(37.15f)
                arcToRelative(49.63f, 49.63f, 0.0f, false, false, -20.45f, -44.26f)
                lineToRelative(5.9f, -10.23f)
                curveToRelative(17.8f, 12.23f, 27.81f, 32.94f, 26.34f, 54.48f)
                lineTo(92.09f, 120.05f)
                arcToRelative(91.74f, 91.74f, 0.0f, false, false, -41.95f, -81.31f)
                lineToRelative(11.94f, -20.45f)
                arcToRelative(1.97f, 1.97f, 0.0f, false, true, 2.68f, -0.69f)
                curveToRelative(1.36f, 0.74f, 51.88f, 88.9f, 52.83f, 89.92f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, -0.04f, 1.95f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, -1.71f, 0.94f)
                horizontalLineToRelative(-12.17f)
                arcToRelative(103.89f, 103.89f, 0.0f, false, true, 0.0f, 9.74f)
                horizontalLineToRelative(12.22f)
                arcToRelative(11.73f, 11.73f, 0.0f, false, false, 11.81f, -11.79f)
                arcToRelative(11.47f, 11.47f, 0.0f, false, false, -1.58f, -5.83f)
                close()
                moveTo(74.01f, 13.33f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
