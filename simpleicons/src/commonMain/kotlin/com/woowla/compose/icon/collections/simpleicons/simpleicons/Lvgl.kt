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

public val Simpleicons.Lvgl: ImageVector
    get() {
        if (_lvgl != null) {
            return _lvgl!!
        }
        _lvgl = Builder(name = "Lvgl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.23f, 16.615f)
                horizontalLineToRelative(5.54f)
                curveToRelative(0.51f, 0.0f, 0.922f, 0.412f, 0.922f, 0.923f)
                verticalLineToRelative(5.539f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, true, -0.923f, 0.923f)
                lineTo(9.231f, 24.0f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, true, -0.923f, -0.923f)
                verticalLineToRelative(-5.539f)
                curveToRelative(0.0f, -0.511f, 0.411f, -0.923f, 0.923f, -0.923f)
                close()
                moveTo(0.0f, 17.538f)
                curveToRelative(0.0f, -0.51f, 0.413f, -0.923f, 0.923f, -0.923f)
                horizontalLineToRelative(5.539f)
                curveToRelative(0.51f, 0.0f, 0.923f, 0.413f, 0.923f, 0.923f)
                verticalLineToRelative(5.539f)
                curveToRelative(0.0f, 0.51f, -0.414f, 0.923f, -0.923f, 0.923f)
                lineTo(2.769f, 24.0f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 0.0f, 21.23f)
                close()
                moveTo(0.923f, 8.308f)
                horizontalLineToRelative(5.539f)
                curveToRelative(0.511f, 0.0f, 0.923f, 0.411f, 0.923f, 0.922f)
                verticalLineToRelative(5.539f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, true, -0.923f, 0.923f)
                lineTo(0.923f, 15.692f)
                arcTo(0.921f, 0.921f, 0.0f, false, true, 0.0f, 14.769f)
                lineTo(0.0f, 9.23f)
                curveToRelative(0.0f, -0.511f, 0.412f, -0.923f, 0.923f, -0.923f)
                close()
                moveTo(2.77f, 0.0f)
                arcTo(2.77f, 2.77f, 0.0f, false, false, 0.0f, 2.769f)
                lineTo(0.0f, 6.46f)
                curveToRelative(0.0f, 0.51f, 0.413f, 0.923f, 0.923f, 0.923f)
                horizontalLineToRelative(5.539f)
                curveToRelative(1.02f, 0.0f, 1.846f, 0.827f, 1.846f, 1.846f)
                verticalLineToRelative(5.539f)
                curveToRelative(0.0f, 0.51f, 0.413f, 0.923f, 0.923f, 0.923f)
                horizontalLineToRelative(5.538f)
                curveToRelative(1.02f, 0.0f, 1.847f, 0.826f, 1.847f, 1.846f)
                verticalLineToRelative(5.539f)
                curveToRelative(0.0f, 0.51f, 0.413f, 0.923f, 0.923f, 0.923f)
                horizontalLineToRelative(3.692f)
                arcTo(2.77f, 2.77f, 0.0f, false, false, 24.0f, 21.23f)
                lineTo(24.0f, 2.77f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, false, -2.77f, -2.77f)
                close()
                moveTo(20.77f, 1.846f)
                arcToRelative(1.385f, 1.385f, 0.0f, true, true, 0.0f, 2.769f)
                arcToRelative(1.385f, 1.385f, 0.0f, false, true, 0.0f, -2.77f)
                close()
            }
        }
        .build()
        return _lvgl!!
    }

private var _lvgl: ImageVector? = null
