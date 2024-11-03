package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Mouse2Fill: ImageVector
    get() {
        if (_mouse2Fill != null) {
            return _mouse2Fill!!
        }
        _mouse2Fill = Builder(name = "Mouse2Fill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 0.026f)
                curveTo(4.958f, 0.286f, 3.0f, 2.515f, 3.0f, 5.188f)
                lineTo(3.0f, 5.5f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(8.5f, 0.026f)
                lineTo(8.5f, 5.5f)
                lineTo(13.0f, 5.5f)
                verticalLineToRelative(-0.312f)
                curveTo(13.0f, 2.515f, 11.042f, 0.286f, 8.5f, 0.026f)
                moveTo(13.0f, 6.5f)
                lineTo(3.0f, 6.5f)
                verticalLineToRelative(4.313f)
                curveTo(3.0f, 13.658f, 5.22f, 16.0f, 8.0f, 16.0f)
                reflectiveCurveToRelative(5.0f, -2.342f, 5.0f, -5.188f)
                close()
            }
        }
        .build()
        return _mouse2Fill!!
    }

private var _mouse2Fill: ImageVector? = null
