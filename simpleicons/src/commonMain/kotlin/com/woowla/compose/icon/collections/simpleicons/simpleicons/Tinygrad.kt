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

public val Simpleicons.Tinygrad: ImageVector
    get() {
        if (_tinygrad != null) {
            return _tinygrad!!
        }
        _tinygrad = Builder(name = "Tinygrad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.846f, 7.385f)
                lineTo(1.846f, 9.23f)
                lineTo(0.0f, 9.23f)
                verticalLineToRelative(1.846f)
                horizontalLineToRelative(1.846f)
                verticalLineToRelative(3.692f)
                horizontalLineToRelative(3.692f)
                verticalLineToRelative(-1.846f)
                lineTo(3.692f, 12.922f)
                verticalLineToRelative(-1.846f)
                horizontalLineToRelative(1.846f)
                lineTo(5.538f, 9.23f)
                lineTo(3.692f, 9.23f)
                lineTo(3.692f, 7.385f)
                close()
                moveTo(7.385f, 7.385f)
                lineTo(7.385f, 9.23f)
                lineTo(9.23f, 9.23f)
                lineTo(9.23f, 7.385f)
                close()
                moveTo(11.077f, 9.231f)
                verticalLineToRelative(5.538f)
                horizontalLineToRelative(1.846f)
                verticalLineToRelative(-3.692f)
                horizontalLineToRelative(1.846f)
                lineTo(14.769f, 9.23f)
                horizontalLineToRelative(-1.846f)
                close()
                moveTo(14.769f, 11.077f)
                verticalLineToRelative(3.692f)
                horizontalLineToRelative(1.846f)
                verticalLineToRelative(-3.692f)
                close()
                moveTo(18.462f, 9.231f)
                verticalLineToRelative(3.692f)
                horizontalLineToRelative(3.692f)
                verticalLineToRelative(1.846f)
                lineTo(24.0f, 14.769f)
                lineTo(24.0f, 9.231f)
                horizontalLineToRelative(-1.846f)
                verticalLineToRelative(1.846f)
                horizontalLineToRelative(-1.846f)
                lineTo(20.308f, 9.23f)
                close()
                moveTo(22.154f, 14.769f)
                horizontalLineToRelative(-3.692f)
                verticalLineToRelative(1.846f)
                horizontalLineToRelative(3.692f)
                close()
                moveTo(7.384f, 11.077f)
                verticalLineToRelative(3.692f)
                horizontalLineToRelative(1.847f)
                verticalLineToRelative(-3.692f)
                close()
            }
        }
        .build()
        return _tinygrad!!
    }

private var _tinygrad: ImageVector? = null
