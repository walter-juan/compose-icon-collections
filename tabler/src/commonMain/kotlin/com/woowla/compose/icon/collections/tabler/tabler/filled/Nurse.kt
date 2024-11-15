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

public val FilledGroup.Nurse: ImageVector
    get() {
        if (_nurse != null) {
            return _nurse!!
        }
        _nurse = Builder(name = "Nurse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 4.0f)
                curveToRelative(2.866f, 0.0f, 6.7f, 1.365f, 9.532f, 3.155f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.45f, 1.024f)
                lineToRelative(-2.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.984f, 0.821f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.984f, -0.821f)
                lineToRelative(-2.0f, -11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.45f, -1.024f)
                curveToRelative(2.834f, -1.792f, 6.724f, -3.16f, 9.536f, -3.155f)
                moveToRelative(-0.002f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                close()
            }
        }
        .build()
        return _nurse!!
    }

private var _nurse: ImageVector? = null
