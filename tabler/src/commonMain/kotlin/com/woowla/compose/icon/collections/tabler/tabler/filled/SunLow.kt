package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.SunLow: ImageVector
    get() {
        if (_sunLow != null) {
            return _sunLow!!
        }
        _sunLow = Builder(name = "SunLow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.407f, 16.993f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                moveToRelative(-11.4f, 0.0f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                moveToRelative(4.993f, -9.993f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -5.0f, 5.0f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.995f, -4.783f)
                moveToRelative(-4.993f, -1.407f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                moveToRelative(11.4f, 0.0f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, -1.414f)
                moveToRelative(-14.397f, 5.407f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(8.01f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
        }
        .build()
        return _sunLow!!
    }

private var _sunLow: ImageVector? = null
