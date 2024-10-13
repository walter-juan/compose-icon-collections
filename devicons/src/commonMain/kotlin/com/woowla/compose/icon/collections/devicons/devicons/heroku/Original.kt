package com.woowla.compose.icon.collections.devicons.devicons.heroku

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.HerokuGroup

public val HerokuGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF6762A6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.0f, 13.9f)
                curveTo(114.0f, 7.3f, 108.7f, 2.0f, 102.1f, 2.0f)
                lineTo(25.9f, 2.0f)
                curveTo(19.3f, 2.0f, 14.0f, 7.3f, 14.0f, 13.9f)
                verticalLineToRelative(100.3f)
                curveToRelative(0.0f, 6.6f, 5.3f, 11.9f, 11.9f, 11.9f)
                horizontalLineToRelative(76.3f)
                curveToRelative(6.6f, 0.0f, 11.9f, -5.3f, 11.9f, -11.9f)
                lineTo(114.1f, 13.9f)
                close()
                moveTo(110.0f, 14.0f)
                verticalLineToRelative(99.3f)
                curveToRelative(0.0f, 4.7f, -3.5f, 8.7f, -8.2f, 8.7f)
                lineTo(26.5f, 122.0f)
                curveToRelative(-4.7f, 0.0f, -8.5f, -4.0f, -8.5f, -8.7f)
                lineTo(18.0f, 14.0f)
                curveToRelative(0.0f, -4.7f, 3.9f, -8.0f, 8.5f, -8.0f)
                horizontalLineToRelative(75.2f)
                curveToRelative(4.7f, 0.0f, 8.4f, 3.6f, 8.4f, 8.3f)
                lineToRelative(-0.1f, -0.3f)
                close()
                moveTo(37.0f, 108.7f)
                lineToRelative(14.1f, -14.1f)
                lineTo(37.0f, 80.5f)
                close()
                moveTo(51.0f, 47.8f)
                lineTo(51.0f, 18.4f)
                lineToRelative(-13.9f, 0.1f)
                reflectiveCurveToRelative(0.1f, 45.9f, 0.2f, 45.7f)
                curveTo(80.1f, 47.5f, 77.0f, 59.4f, 77.0f, 59.4f)
                verticalLineToRelative(49.4f)
                lineToRelative(-0.1f, 0.2f)
                lineTo(90.0f, 109.0f)
                lineTo(90.0f, 59.5f)
                curveToRelative(0.0f, -27.1f, -39.0f, -11.7f, -39.0f, -11.7f)
                close()
                moveTo(70.0f, 36.0f)
                horizontalLineToRelative(14.8f)
                curveToRelative(8.0f, -10.0f, 10.7f, -17.0f, 10.7f, -17.0f)
                lineTo(80.2f, 19.0f)
                reflectiveCurveTo(75.3f, 30.0f, 70.0f, 36.0f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
