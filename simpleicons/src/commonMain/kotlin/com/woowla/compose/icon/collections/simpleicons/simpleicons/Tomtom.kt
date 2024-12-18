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

public val Simpleicons.Tomtom: ImageVector
    get() {
        if (_tomtom != null) {
            return _tomtom!!
        }
        _tomtom = Builder(name = "Tomtom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.584f)
                arcToRelative(4.325f, 4.325f, 0.0f, false, true, -4.32f, -4.32f)
                arcTo(4.325f, 4.325f, 0.0f, false, true, 12.0f, 3.944f)
                arcToRelative(4.325f, 4.325f, 0.0f, false, true, 4.32f, 4.32f)
                arcToRelative(4.325f, 4.325f, 0.0f, false, true, -4.32f, 4.32f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(7.443f, 0.0f, 3.736f, 3.707f, 3.736f, 8.264f)
                curveToRelative(0.0f, 4.557f, 3.707f, 8.264f, 8.264f, 8.264f)
                curveToRelative(4.557f, 0.0f, 8.264f, -3.707f, 8.264f, -8.264f)
                curveTo(20.264f, 3.707f, 16.557f, 0.0f, 12.0f, 0.0f)
                moveToRelative(0.0f, 24.0f)
                lineToRelative(3.167f, -5.486f)
                horizontalLineTo(8.833f)
                close()
            }
        }
        .build()
        return _tomtom!!
    }

private var _tomtom: ImageVector? = null
