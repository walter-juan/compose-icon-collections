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

public val Simpleicons.X: ImageVector
    get() {
        if (_x != null) {
            return _x!!
        }
        _x = Builder(name = "X", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.234f, 10.162f)
                lineTo(22.977f, 0.0f)
                horizontalLineToRelative(-2.072f)
                lineToRelative(-7.591f, 8.824f)
                lineTo(7.251f, 0.0f)
                lineTo(0.258f, 0.0f)
                lineToRelative(9.168f, 13.343f)
                lineTo(0.258f, 24.0f)
                lineTo(2.33f, 24.0f)
                lineToRelative(8.016f, -9.318f)
                lineTo(16.749f, 24.0f)
                horizontalLineToRelative(6.993f)
                close()
                moveTo(11.397f, 13.461f)
                lineTo(10.468f, 12.132f)
                lineTo(3.076f, 1.56f)
                horizontalLineToRelative(3.182f)
                lineToRelative(5.965f, 8.532f)
                lineToRelative(0.929f, 1.329f)
                lineToRelative(7.754f, 11.09f)
                horizontalLineToRelative(-3.182f)
                close()
            }
        }
        .build()
        return _x!!
    }

private var _x: ImageVector? = null
