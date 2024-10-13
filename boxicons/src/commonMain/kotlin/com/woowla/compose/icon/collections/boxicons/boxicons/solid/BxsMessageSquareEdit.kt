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

public val SolidGroup.BxsMessageSquareEdit: ImageVector
    get() {
        if (_bxsMessageSquareEdit != null) {
            return _bxsMessageSquareEdit!!
        }
        _bxsMessageSquareEdit = Builder(name = "BxsMessageSquareEdit", defaultWidth = 24.0.dp,
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
                moveTo(8.999f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-1.999f)
                lineToRelative(5.53f, -5.522f)
                lineToRelative(1.999f, 1.999f)
                lineTo(8.999f, 17.0f)
                close()
                moveTo(15.472f, 10.535f)
                lineTo(13.473f, 8.536f)
                lineTo(14.997f, 7.013f)
                lineTo(16.996f, 9.012f)
                lineTo(15.472f, 10.535f)
                close()
            }
        }
        .build()
        return _bxsMessageSquareEdit!!
    }

private var _bxsMessageSquareEdit: ImageVector? = null
