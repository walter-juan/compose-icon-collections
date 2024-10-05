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

public val FilledGroup.SquareChevronsRight: ImageVector
    get() {
        if (_squareChevronsRight != null) {
            return _squareChevronsRight!!
        }
        _squareChevronsRight = Builder(name = "SquareChevronsRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(8.613f, 8.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 0.083f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.083f, 1.32f)
                lineToRelative(2.292f, 2.293f)
                lineToRelative(-2.292f, 2.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.497f, 1.32f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.083f, -1.32f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(13.613f, 8.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 0.083f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.083f, 1.32f)
                lineToRelative(2.292f, 2.293f)
                lineToRelative(-2.292f, 2.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.497f, 1.32f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.083f, -1.32f)
                lineToRelative(-3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _squareChevronsRight!!
    }

private var _squareChevronsRight: ImageVector? = null