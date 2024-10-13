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

public val SolidGroup.BxsWatchAlt: ImageVector
    get() {
        if (_bxsWatchAlt != null) {
            return _bxsWatchAlt!!
        }
        _bxsWatchAlt = Builder(name = "BxsWatchAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                curveToRelative(0.0f, -0.909f, -0.613f, -1.67f, -1.445f, -1.912f)
                lineToRelative(-1.31f, -3.443f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.311f, 2.0f)
                lineTo(8.689f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.934f, 0.645f)
                lineToRelative(-1.31f, 3.443f)
                arcTo(1.996f, 1.996f, 0.0f, false, false, 5.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.909f, 0.613f, 1.67f, 1.445f, 1.912f)
                lineToRelative(1.31f, 3.443f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.934f, 0.645f)
                horizontalLineToRelative(5.621f)
                curveToRelative(0.415f, 0.0f, 0.787f, -0.257f, 0.935f, -0.645f)
                lineToRelative(1.31f, -3.443f)
                arcTo(1.996f, 1.996f, 0.0f, false, false, 18.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 8.0f)
                close()
                moveTo(16.002f, 16.0f)
                lineTo(7.0f, 16.0f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(0.002f, 8.0f)
                close()
            }
        }
        .build()
        return _bxsWatchAlt!!
    }

private var _bxsWatchAlt: ImageVector? = null
