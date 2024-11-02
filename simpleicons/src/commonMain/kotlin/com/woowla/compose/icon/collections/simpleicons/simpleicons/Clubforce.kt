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

public val Simpleicons.Clubforce: ImageVector
    get() {
        if (_clubforce != null) {
            return _clubforce!!
        }
        _clubforce = Builder(name = "Clubforce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4f, 0.0f)
                curveTo(0.624f, 0.0f, 0.0f, 0.624f, 0.0f, 1.4f)
                verticalLineToRelative(21.2f)
                curveToRelative(0.0f, 0.776f, 0.624f, 1.4f, 1.4f, 1.4f)
                horizontalLineToRelative(21.2f)
                curveToRelative(0.776f, 0.0f, 1.4f, -0.624f, 1.4f, -1.4f)
                lineTo(24.0f, 1.4f)
                curveToRelative(0.0f, -0.776f, -0.624f, -1.4f, -1.4f, -1.4f)
                close()
                moveTo(6.178f, 5.5f)
                horizontalLineToRelative(9.61f)
                lineToRelative(-2.83f, 2.112f)
                lineTo(8.331f, 7.612f)
                verticalLineToRelative(3.472f)
                lineTo(6.18f, 12.72f)
                lineTo(6.18f, 5.5f)
                close()
                moveTo(17.822f, 6.817f)
                verticalLineToRelative(7.415f)
                lineTo(11.96f, 18.5f)
                lineToRelative(-4.786f, -3.629f)
                lineToRelative(1.675f, -1.317f)
                lineToRelative(3.111f, 2.354f)
                lineToRelative(3.19f, -2.392f)
                lineToRelative(-3.23f, -2.234f)
                lineToRelative(1.834f, -1.355f)
                lineToRelative(1.955f, 1.355f)
                verticalLineToRelative(-2.87f)
                close()
            }
        }
        .build()
        return _clubforce!!
    }

private var _clubforce: ImageVector? = null
