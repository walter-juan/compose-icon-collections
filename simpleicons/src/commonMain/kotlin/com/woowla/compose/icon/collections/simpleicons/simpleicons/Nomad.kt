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

public val Simpleicons.Nomad: ImageVector
    get() {
        if (_nomad != null) {
            return _nomad!!
        }
        _nomad = Builder(name = "Nomad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.004f, 0.0f)
                lineToRelative(-10.4f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(10.392f, 6.0f)
                lineToRelative(10.4f, -6.0f)
                lineTo(22.396f, 6.0f)
                lineTo(12.004f, 0.0f)
                close()
                moveTo(16.643f, 13.204f)
                lineTo(13.873f, 14.804f)
                lineTo(10.526f, 12.972f)
                verticalLineToRelative(3.826f)
                lineToRelative(-3.144f, 1.995f)
                lineTo(7.382f, 10.8f)
                lineTo(9.88f, 9.272f)
                lineToRelative(3.462f, 1.823f)
                lineTo(13.342f, 7.191f)
                lineToRelative(3.301f, -1.984f)
                verticalLineToRelative(7.997f)
                close()
            }
        }
        .build()
        return _nomad!!
    }

private var _nomad: ImageVector? = null
