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

public val FilledGroup.GardenCart: ImageVector
    get() {
        if (_gardenCart != null) {
            return _gardenCart!!
        }
        _gardenCart = Builder(name = "GardenCart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.324f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.855f, 1.258f)
                lineToRelative(1.097f, 2.742f)
                horizontalLineToRelative(14.724f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.94f, 1.341f)
                lineToRelative(-0.046f, 0.106f)
                lineToRelative(-2.934f, 5.871f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -4.96f, 3.182f)
                lineToRelative(0.005f, -0.192f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.499f, -1.618f)
                lineToRelative(-2.446f, -0.258f)
                lineToRelative(-3.446f, 4.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.08f, 0.762f)
                lineToRelative(-0.154f, -0.044f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.378f, -1.9f)
                verticalLineToRelative(-9.804f)
                lineToRelative(-1.679f, -4.196f)
                horizontalLineToRelative(-1.321f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(17.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-10.5f, -2.498f)
                lineToRelative(-0.002f, 5.498f)
                lineToRelative(2.783f, -3.833f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.614f, -1.474f)
                close()
            }
        }
        .build()
        return _gardenCart!!
    }

private var _gardenCart: ImageVector? = null
