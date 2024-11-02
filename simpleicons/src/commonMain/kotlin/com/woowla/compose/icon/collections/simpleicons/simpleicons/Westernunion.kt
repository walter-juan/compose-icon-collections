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

public val Simpleicons.Westernunion: ImageVector
    get() {
        if (_westernunion != null) {
            return _westernunion!!
        }
        _westernunion = Builder(name = "Westernunion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.799f, 5.188f)
                horizontalLineToRelative(5.916f)
                lineTo(24.0f, 9.155f)
                lineToRelative(-4.643f, 8.043f)
                curveToRelative(-1.246f, 2.153f, -3.28f, 2.153f, -4.526f, 0.0f)
                lineTo(7.893f, 5.188f)
                horizontalLineToRelative(5.919f)
                lineToRelative(4.273f, 7.39f)
                arcToRelative(1.127f, 1.127f, 0.0f, false, false, 1.981f, 0.002f)
                lineToRelative(-4.267f, -7.392f)
                close()
                moveTo(0.0f, 5.188f)
                horizontalLineToRelative(5.921f)
                lineToRelative(6.237f, 10.802f)
                lineToRelative(-0.697f, 1.204f)
                curveToRelative(-1.246f, 2.153f, -3.285f, 2.153f, -4.531f, 0.0f)
                lineTo(0.0f, 5.188f)
                close()
            }
        }
        .build()
        return _westernunion!!
    }

private var _westernunion: ImageVector? = null
