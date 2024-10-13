package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMessageSquareX: ImageVector
    get() {
        if (_bxsMessageSquareX != null) {
            return _bxsMessageSquareX!!
        }
        _bxsMessageSquareX = Builder(name = "BxsMessageSquareX", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                curveTo(4.691f, 2.0f, 2.0f, 4.691f, 2.0f, 8.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                lineTo(22.0f, 8.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(16.706f, 15.293f)
                lineTo(15.292f, 16.707f)
                lineTo(12.0f, 13.415f)
                lineToRelative(-3.292f, 3.292f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.292f, -3.292f)
                lineToRelative(-3.292f, -3.292f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 10.587f)
                lineToRelative(3.292f, -3.292f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.292f, 3.292f)
                lineToRelative(3.292f, 3.292f)
                close()
            }
        }
        .build()
        return _bxsMessageSquareX!!
    }

private var _bxsMessageSquareX: ImageVector? = null
