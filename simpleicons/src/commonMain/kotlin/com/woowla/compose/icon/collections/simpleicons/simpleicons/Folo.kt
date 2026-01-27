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

public val Simpleicons.Folo: ImageVector
    get() {
        if (_folo != null) {
            return _folo!!
        }
        _folo = Builder(name = "Folo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.382f, 0.0f)
                horizontalLineToRelative(13.236f)
                arcTo(5.37f, 5.37f, 0.0f, false, true, 24.0f, 5.383f)
                verticalLineToRelative(13.235f)
                arcTo(5.37f, 5.37f, 0.0f, false, true, 18.618f, 24.0f)
                lineTo(5.382f, 24.0f)
                arcTo(5.37f, 5.37f, 0.0f, false, true, 0.0f, 18.618f)
                lineTo(0.0f, 5.383f)
                arcTo(5.37f, 5.37f, 0.0f, false, true, 5.382f, 0.001f)
                close()
                moveTo(13.269f, 17.31f)
                arcToRelative(1.813f, 1.813f, 0.0f, true, false, -3.626f, 0.002f)
                arcToRelative(1.813f, 1.813f, 0.0f, false, false, 3.626f, -0.002f)
                moveToRelative(-0.535f, -6.527f)
                lineTo(7.213f, 10.783f)
                arcToRelative(1.813f, 1.813f, 0.0f, true, false, 0.0f, 3.624f)
                horizontalLineToRelative(5.521f)
                arcToRelative(1.813f, 1.813f, 0.0f, true, false, 0.0f, -3.624f)
                moveToRelative(4.417f, -4.712f)
                lineTo(8.87f, 6.071f)
                arcToRelative(1.813f, 1.813f, 0.0f, true, false, 0.0f, 3.625f)
                horizontalLineToRelative(8.283f)
                arcToRelative(1.813f, 1.813f, 0.0f, true, false, 0.0f, -3.624f)
                close()
            }
        }
        .build()
        return _folo!!
    }

private var _folo: ImageVector? = null
