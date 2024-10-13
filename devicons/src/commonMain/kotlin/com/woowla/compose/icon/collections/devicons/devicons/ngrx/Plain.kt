package com.woowla.compose.icon.collections.devicons.devicons.ngrx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NgrxGroup

public val NgrxGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.1f, 126.6f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(-0.1f, 0.1f)
                verticalLineToRelative(-0.1f)
                lineTo(14.0f, 99.3f)
                lineTo(5.6f, 21.7f)
                lineTo(63.9f, 1.5f)
                verticalLineToRelative(-0.1f)
                horizontalLineToRelative(0.2f)
                verticalLineToRelative(0.1f)
                lineToRelative(58.3f, 20.2f)
                lineToRelative(-8.4f, 77.6f)
                lineToRelative(-49.9f, 27.2f)
                close()
                moveTo(93.2f, 44.3f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(0.1f, 0.1f)
                close()
                moveTo(93.2f, 44.3f)
                quadToRelative(4.9f, 17.8f, -12.1f, 31.1f)
                quadTo(87.4f, 76.5f, 93.0f, 72.0f)
                quadToRelative(-9.8f, 10.0f, -20.8f, 10.3f)
                quadToRelative(4.3f, 4.9f, 11.4f, 4.7f)
                quadToRelative(-16.3f, 3.8f, -29.1f, -11.4f)
                curveToRelative(-0.6f, 2.8f, 1.2f, 6.2f, 5.3f, 10.2f)
                quadToRelative(-12.7f, -5.9f, -12.7f, -19.0f)
                quadToRelative(-0.2f, -14.2f, 14.9f, -18.5f)
                quadToRelative(28.8f, 11.9f, 30.2f, 0.6f)
                quadTo(91.0f, 40.3f, 78.6f, 33.0f)
                quadToRelative(-8.7f, -5.0f, -17.1f, -4.5f)
                quadToRelative(-3.4f, -3.5f, -7.8f, -3.3f)
                curveToRelative(-2.0f, 0.0f, -3.6f, 0.6f, -4.7f, 1.8f)
                curveToRelative(-1.7f, 1.8f, -4.6f, 5.7f, -9.8f, 6.1f)
                quadToRelative(-5.3f, 0.4f, -5.2f, 5.1f)
                quadToRelative(0.1f, 4.8f, -0.4f, 5.4f)
                quadToRelative(-0.5f, 1.1f, -3.1f, 3.3f)
                quadToRelative(-2.6f, 2.1f, -2.6f, 4.1f)
                quadToRelative(0.2f, 4.0f, 1.5f, 5.9f)
                quadToRelative(0.6f, 2.8f, -0.5f, 4.4f)
                curveToRelative(-1.0f, 1.5f, -1.6f, 2.0f, -1.3f, 3.6f)
                curveToRelative(0.4f, 1.6f, 0.4f, 2.0f, 4.1f, 5.9f)
                quadToRelative(3.4f, 10.8f, 12.5f, 17.9f)
                reflectiveCurveToRelative(9.5f, 8.8f, 24.3f, 8.8f)
                quadToRelative(22.9f, -1.1f, 31.4f, -21.7f)
                quadToRelative(-8.0f, 6.0f, -12.9f, 6.4f)
                quadToRelative(15.3f, -8.6f, 13.5f, -25.1f)
                quadToRelative(-4.2f, 8.1f, -7.4f, 10.6f)
                quadToRelative(4.3f, -6.8f, 4.2f, -12.9f)
                quadToRelative(-0.2f, -6.0f, -4.1f, -10.5f)
                close()
                moveTo(72.6f, 42.9f)
                curveToRelative(-0.9f, 0.0f, -1.7f, -0.8f, -1.7f, -1.7f)
                curveToRelative(0.0f, -0.9f, 0.8f, -1.6f, 1.7f, -1.6f)
                curveToRelative(0.9f, 0.0f, 1.6f, 0.7f, 1.6f, 1.6f)
                curveToRelative(0.0f, 0.9f, -0.7f, 1.7f, -1.6f, 1.7f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
