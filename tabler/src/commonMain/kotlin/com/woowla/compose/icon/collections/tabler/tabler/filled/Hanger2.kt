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

public val FilledGroup.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) {
            return _hanger2!!
        }
        _hanger2 = Builder(name = "Hanger2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, -0.004f)
                curveToRelative(0.006f, 1.516f, 0.495f, 2.579f, 1.486f, 3.13f)
                lineToRelative(7.97f, 4.428f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.544f, 2.623f)
                verticalLineToRelative(0.823f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-0.823f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.543f, -2.623f)
                lineToRelative(6.695f, -3.72f)
                curveToRelative(-0.832f, -0.976f, -1.232f, -2.296f, -1.238f, -3.834f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                moveToRelative(0.0f, 8.144f)
                lineToRelative(-7.486f, 4.158f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.514f, 0.875f)
                verticalLineToRelative(0.823f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.83f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.306f, 0.0f, 2.418f, 0.835f, 2.83f, 2.0f)
                horizontalLineToRelative(0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-0.823f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.515f, -0.875f)
                close()
            }
        }
        .build()
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
