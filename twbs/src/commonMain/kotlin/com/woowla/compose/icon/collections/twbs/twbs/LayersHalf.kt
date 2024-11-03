package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.LayersHalf: ImageVector
    get() {
        if (_layersHalf != null) {
            return _layersHalf!!
        }
        _layersHalf = Builder(name = "LayersHalf", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.235f, 1.559f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.47f, 0.0f)
                lineToRelative(-7.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.882f)
                lineTo(3.188f, 8.0f)
                lineTo(0.264f, 9.559f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.882f)
                lineToRelative(7.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.47f, 0.0f)
                lineToRelative(7.5f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.882f)
                lineTo(12.813f, 8.0f)
                lineToRelative(2.922f, -1.559f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.882f)
                close()
                moveTo(8.0f, 9.433f)
                lineTo(1.562f, 6.0f)
                lineTo(8.0f, 2.567f)
                lineTo(14.438f, 6.0f)
                close()
            }
        }
        .build()
        return _layersHalf!!
    }

private var _layersHalf: ImageVector? = null
