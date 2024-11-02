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

public val Simpleicons.Suno: ImageVector
    get() {
        if (_suno != null) {
            return _suno!!
        }
        _suno = Builder(name = "Suno", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 0.0f)
                curveTo(20.642f, 0.0f, 24.0f, 5.373f, 24.0f, 12.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(0.0f, 6.627f, -3.358f, 12.0f, -7.5f, 12.0f)
                curveTo(3.358f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.0f, -6.627f, 3.358f, -12.0f, 7.5f, -12.0f)
                close()
            }
        }
        .build()
        return _suno!!
    }

private var _suno: ImageVector? = null
