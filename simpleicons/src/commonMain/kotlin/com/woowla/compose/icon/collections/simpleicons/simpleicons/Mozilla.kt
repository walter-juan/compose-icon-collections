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

public val Simpleicons.Mozilla: ImageVector
    get() {
        if (_mozilla != null) {
            return _mozilla!!
        }
        _mozilla = Builder(name = "Mozilla", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.819f, 24.0f)
                lineTo(1.75f, 24.0f)
                lineTo(1.75f, 0.0f)
                lineTo(4.82f, 0.0f)
                close()
                moveTo(7.33f, 12.242f)
                lineTo(19.48f, 12.242f)
                verticalLineToRelative(-0.69f)
                lineTo(11.562f, 8.67f)
                lineTo(11.562f, 6.25f)
                lineToRelative(7.918f, -2.872f)
                verticalLineToRelative(-0.7f)
                lineTo(10.1f, 2.678f)
                lineTo(10.1f, 0.0f)
                horizontalLineToRelative(12.149f)
                verticalLineToRelative(4.89f)
                lineToRelative(-6.445f, 2.224f)
                verticalLineToRelative(0.69f)
                lineToRelative(6.445f, 2.224f)
                verticalLineToRelative(4.89f)
                lineTo(7.33f, 14.918f)
                close()
                moveTo(7.33f, 2.677f)
                horizontalLineToRelative(2.77f)
                verticalLineToRelative(2.77f)
                lineTo(7.33f, 5.447f)
                close()
            }
        }
        .build()
        return _mozilla!!
    }

private var _mozilla: ImageVector? = null
