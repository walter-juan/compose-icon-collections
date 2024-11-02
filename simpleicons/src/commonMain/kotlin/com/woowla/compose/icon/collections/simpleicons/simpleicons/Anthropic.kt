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

public val Simpleicons.Anthropic: ImageVector
    get() {
        if (_anthropic != null) {
            return _anthropic!!
        }
        _anthropic = Builder(name = "Anthropic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.304f, 3.541f)
                horizontalLineToRelative(-3.672f)
                lineToRelative(6.696f, 16.918f)
                lineTo(24.0f, 20.459f)
                close()
                moveTo(6.696f, 3.541f)
                lineTo(0.0f, 20.459f)
                horizontalLineToRelative(3.744f)
                lineToRelative(1.369f, -3.553f)
                horizontalLineToRelative(7.005f)
                lineToRelative(1.369f, 3.553f)
                horizontalLineToRelative(3.744f)
                lineTo(10.536f, 3.541f)
                close()
                moveTo(6.325f, 13.764f)
                lineTo(8.616f, 7.819f)
                lineTo(10.908f, 13.764f)
                close()
            }
        }
        .build()
        return _anthropic!!
    }

private var _anthropic: ImageVector? = null
