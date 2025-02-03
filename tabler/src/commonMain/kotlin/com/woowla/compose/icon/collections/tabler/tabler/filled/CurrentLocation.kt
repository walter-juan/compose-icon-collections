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

public val FilledGroup.CurrentLocation: ImageVector
    get() {
        if (_currentLocation != null) {
            return _currentLocation!!
        }
        _currentLocation = Builder(name = "CurrentLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.055f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, true, 7.946f, 7.945f)
                horizontalLineToRelative(1.054f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.055f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, true, -7.944f, 7.945f)
                lineToRelative(-0.001f, 1.055f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-1.055f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, true, -7.945f, -7.944f)
                lineToRelative(-1.055f, -0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.055f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, true, 7.945f, -7.945f)
                verticalLineToRelative(-1.055f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -14.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, 4.0f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.995f, -3.8f)
            }
        }
        .build()
        return _currentLocation!!
    }

private var _currentLocation: ImageVector? = null
