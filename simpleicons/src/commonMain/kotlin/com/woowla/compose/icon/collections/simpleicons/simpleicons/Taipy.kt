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

public val Simpleicons.Taipy: ImageVector
    get() {
        if (_taipy != null) {
            return _taipy!!
        }
        _taipy = Builder(name = "Taipy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.273f, 4.153f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, true, 0.917f, -0.65f)
                horizontalLineToRelative(21.325f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, 0.458f, 0.646f)
                lineToRelative(-1.245f, 3.56f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, true, -0.917f, 0.65f)
                lineTo(0.486f, 8.359f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, -0.459f, -0.646f)
                close()
                moveTo(6.128f, 10.223f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, true, 0.917f, -0.65f)
                horizontalLineToRelative(8.337f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, 0.458f, 0.645f)
                lineToRelative(-1.245f, 3.56f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, true, -0.917f, 0.65f)
                lineTo(5.341f, 14.428f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, -0.458f, -0.646f)
                close()
                moveTo(8.826f, 16.291f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, true, 0.917f, -0.65f)
                horizontalLineToRelative(3.482f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, 0.458f, 0.646f)
                lineToRelative(-1.246f, 3.56f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, true, -0.916f, 0.65f)
                lineTo(8.039f, 20.497f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, -0.458f, -0.646f)
                close()
            }
        }
        .build()
        return _taipy!!
    }

private var _taipy: ImageVector? = null
