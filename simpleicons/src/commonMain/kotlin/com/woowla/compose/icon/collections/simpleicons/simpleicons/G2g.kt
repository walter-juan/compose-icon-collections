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

public val Simpleicons.G2g: ImageVector
    get() {
        if (_g2g != null) {
            return _g2g!!
        }
        _g2g = Builder(name = "G2g", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(4.357f)
                horizontalLineToRelative(19.643f)
                verticalLineToRelative(6.43f)
                lineTo(24.0f, 10.787f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(0.0f, 6.44f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 12.805f)
                lineTo(6.648f, 12.805f)
                verticalLineToRelative(4.36f)
                horizontalLineToRelative(12.995f)
                verticalLineToRelative(2.478f)
                lineTo(4.357f, 19.643f)
                verticalLineToRelative(-8.846f)
                horizontalLineToRelative(12.995f)
                lineTo(17.352f, 6.439f)
                lineTo(0.0f, 6.439f)
                close()
            }
        }
        .build()
        return _g2g!!
    }

private var _g2g: ImageVector? = null
