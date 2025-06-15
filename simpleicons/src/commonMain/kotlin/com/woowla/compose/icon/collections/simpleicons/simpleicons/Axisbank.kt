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

public val Simpleicons.Axisbank: ImageVector
    get() {
        if (_axisbank != null) {
            return _axisbank!!
        }
        _axisbank = Builder(name = "Axisbank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.978f, 1.596f)
                lineTo(0.0f, 22.404f)
                horizontalLineToRelative(7.453f)
                lineToRelative(8.265f, -14.369f)
                close()
                moveTo(12.005f, 14.492f)
                lineTo(16.538f, 22.395f)
                lineTo(24.0f, 22.395f)
                lineToRelative(-4.533f, -7.903f)
                close()
            }
        }
        .build()
        return _axisbank!!
    }

private var _axisbank: ImageVector? = null
