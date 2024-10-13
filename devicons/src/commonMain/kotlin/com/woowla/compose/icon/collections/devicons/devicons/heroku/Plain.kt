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

public val HerokuGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF6762A6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.1f, 2.0f)
                lineTo(25.9f, 2.0f)
                curveTo(19.3f, 2.0f, 14.0f, 7.3f, 14.0f, 13.9f)
                verticalLineToRelative(100.3f)
                curveToRelative(0.0f, 6.6f, 5.3f, 11.9f, 11.9f, 11.9f)
                horizontalLineToRelative(76.3f)
                curveToRelative(6.6f, 0.0f, 11.9f, -5.3f, 11.9f, -11.9f)
                lineTo(114.1f, 13.9f)
                curveTo(114.0f, 7.3f, 108.7f, 2.0f, 102.1f, 2.0f)
                close()
                moveTo(37.0f, 108.7f)
                lineTo(37.0f, 80.5f)
                lineToRelative(14.1f, 14.1f)
                lineTo(37.0f, 108.7f)
                close()
                moveTo(90.0f, 109.0f)
                lineTo(76.9f, 109.0f)
                lineToRelative(0.1f, -0.2f)
                lineTo(77.0f, 59.4f)
                reflectiveCurveToRelative(3.1f, -11.8f, -39.7f, 4.8f)
                curveToRelative(-0.1f, 0.2f, -0.2f, -45.7f, -0.2f, -45.7f)
                lineToRelative(13.9f, -0.1f)
                verticalLineToRelative(29.4f)
                reflectiveCurveToRelative(39.0f, -15.4f, 39.0f, 11.7f)
                lineTo(90.0f, 109.0f)
                close()
                moveTo(84.8f, 36.0f)
                lineTo(70.0f, 36.0f)
                curveToRelative(5.3f, -6.0f, 10.2f, -17.0f, 10.2f, -17.0f)
                horizontalLineToRelative(15.3f)
                reflectiveCurveToRelative(-2.6f, 7.0f, -10.7f, 17.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
