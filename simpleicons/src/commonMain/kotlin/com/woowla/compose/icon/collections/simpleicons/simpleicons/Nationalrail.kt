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

public val Simpleicons.Nationalrail: ImageVector
    get() {
        if (_nationalrail != null) {
            return _nationalrail!!
        }
        _nationalrail = Builder(name = "Nationalrail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.372f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.627f, 0.0f, 11.999f, 5.373f, 11.999f, 12.0f)
                curveToRelative(0.0f, 6.628f, -5.372f, 12.0f, -11.999f, 12.0f)
                curveToRelative(-6.628f, 0.0f, -12.0f, -5.372f, -12.0f, -12.0f)
                close()
                moveTo(6.195f, 6.158f)
                lineTo(12.271f, 8.952f)
                lineTo(2.835f, 8.952f)
                verticalLineToRelative(1.884f)
                horizontalLineToRelative(9.499f)
                lineToRelative(-4.616f, 2.246f)
                lineTo(2.835f, 13.082f)
                verticalLineToRelative(1.868f)
                horizontalLineToRelative(4.883f)
                lineToRelative(5.778f, 2.795f)
                horizontalLineToRelative(4.333f)
                lineToRelative(-6.092f, -2.795f)
                horizontalLineToRelative(9.469f)
                verticalLineToRelative(-1.868f)
                horizontalLineToRelative(-9.453f)
                lineToRelative(4.616f, -2.246f)
                horizontalLineToRelative(4.837f)
                lineTo(21.206f, 8.952f)
                horizontalLineToRelative(-4.868f)
                lineToRelative(-5.777f, -2.794f)
                lineTo(6.195f, 6.158f)
            }
        }
        .build()
        return _nationalrail!!
    }

private var _nationalrail: ImageVector? = null
