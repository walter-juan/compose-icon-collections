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

public val FilledGroup.Lego: ImageVector
    get() {
        if (_lego != null) {
            return _lego!!
        }
        _lego = Builder(name = "Lego", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(0.2f, 0.005f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.795f, 3.795f)
                lineToRelative(0.005f, 0.2f)
                verticalLineToRelative(9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.845f, 3.83f)
                lineToRelative(-0.155f, 0.043f)
                verticalLineToRelative(0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-0.127f)
                lineToRelative(-0.155f, -0.042f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.84f, -3.631f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(15.2f, 14.286f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.572f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.428f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.014f, -1.414f)
                moveToRelative(-5.69f, -4.286f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.0f, 0.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _lego!!
    }

private var _lego: ImageVector? = null
