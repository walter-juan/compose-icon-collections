package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Wsh: ImageVector
    get() {
        if (_wsh != null) {
            return _wsh!!
        }
        _wsh = Builder(name = "Wsh", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9f, 479.8f)
                lineToRelative(83.4f, 0.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(-83.4f, 47.0f)
                lineToRelative(0.0f, 65.0f)
                close()
                moveTo(347.9f, 479.8f)
                lineToRelative(82.4f, 0.0f)
                lineToRelative(0.0f, -65.0f)
                lineToRelative(-82.4f, -47.0f)
                lineToRelative(0.0f, 112.0f)
                close()
                moveTo(347.9f, 31.8f)
                lineToRelative(0.0f, 219.8f)
                lineToRelative(-123.6f, -72.4f)
                lineToRelative(-121.7f, 72.4f)
                lineToRelative(0.0f, -219.8f)
                lineToRelative(-83.7f, 0.0f)
                lineToRelative(0.0f, 360.8f)
                lineToRelative(205.4f, -122.3f)
                lineToRelative(206.0f, 122.3f)
                lineToRelative(0.0f, -360.8f)
                lineToRelative(-82.3f, 0.0f)
                close()
            }
        }
        .build()
        return _wsh!!
    }

private var _wsh: ImageVector? = null
