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

public val Simpleicons.Bombardier: ImageVector
    get() {
        if (_bombardier != null) {
            return _bombardier!!
        }
        _bombardier = Builder(name = "Bombardier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 23.24f)
                lineToRelative(1.823f, -1.822f)
                curveToRelative(1.823f, -1.823f, 3.645f, -2.127f, 6.076f, -2.127f)
                horizontalLineToRelative(5.012f)
                curveToRelative(2.43f, 0.0f, 3.707f, -0.152f, 5.681f, -1.519f)
                horizontalLineToRelative(0.244f)
                lineToRelative(-3.342f, 3.342f)
                curveToRelative(-1.823f, 1.823f, -3.646f, 2.127f, -6.076f, 2.127f)
                horizontalLineTo(0.0f)
                close()
                moveTo(5.165f, 6.533f)
                lineToRelative(1.822f, 1.822f)
                curveToRelative(1.823f, 1.823f, 3.646f, 2.127f, 6.076f, 2.127f)
                horizontalLineToRelative(5.013f)
                curveToRelative(2.43f, 0.0f, 3.706f, 0.152f, 5.681f, 1.519f)
                curveToRelative(-1.975f, 1.367f, -3.25f, 1.519f, -5.681f, 1.519f)
                horizontalLineToRelative(-5.013f)
                curveToRelative(-2.43f, 0.0f, -4.253f, 0.304f, -6.076f, 2.127f)
                lineToRelative(-1.822f, 1.822f)
                horizontalLineToRelative(9.417f)
                curveToRelative(2.43f, 0.0f, 4.254f, -0.303f, 6.076f, -2.126f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-3.342f, -3.342f)
                curveToRelative(-1.822f, -1.823f, -3.645f, -2.126f, -6.076f, -2.126f)
                horizontalLineTo(5.165f)
                close()
                moveTo(0.0f, 0.759f)
                lineToRelative(1.823f, 1.823f)
                curveTo(3.646f, 4.405f, 5.468f, 4.71f, 7.899f, 4.71f)
                horizontalLineToRelative(5.012f)
                curveToRelative(2.43f, 0.0f, 3.707f, 0.152f, 5.681f, 1.519f)
                horizontalLineToRelative(0.244f)
                lineToRelative(-3.342f, -3.342f)
                curveTo(13.67f, 1.063f, 11.848f, 0.76f, 9.418f, 0.76f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _bombardier!!
    }

private var _bombardier: ImageVector? = null
