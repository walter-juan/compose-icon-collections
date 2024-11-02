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

public val Simpleicons.Parrotsecurity: ImageVector
    get() {
        if (_parrotsecurity != null) {
            return _parrotsecurity!!
        }
        _parrotsecurity = Builder(name = "Parrotsecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(18.267f, 2.784f)
                lineTo(13.03f, 5.54f)
                lineToRelative(8.05f, -0.179f)
                lineToRelative(-8.05f, 3.333f)
                lineToRelative(-2.154f, 2.688f)
                lineToRelative(5.007f, 9.038f)
                lineToRelative(-1.536f, -1.605f)
                lineToRelative(1.645f, 3.456f)
                lineToRelative(-4.937f, -5.527f)
                lineToRelative(-6.268f, -6.28f)
                lineTo(2.77f, 12.11f)
                lineToRelative(0.7f, -3.442f)
                lineToRelative(4.018f, -0.261f)
                lineToRelative(0.823f, -4.06f)
                close()
            }
        }
        .build()
        return _parrotsecurity!!
    }

private var _parrotsecurity: ImageVector? = null
