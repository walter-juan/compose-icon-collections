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

public val SolidGroup.BxsXSquare: ImageVector
    get() {
        if (_bxsXSquare != null) {
            return _bxsXSquare!!
        }
        _bxsXSquare = Builder(name = "BxsXSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(5.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                close()
                moveTo(16.207f, 14.793f)
                lineTo(14.793f, 16.207f)
                lineTo(12.0f, 13.414f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 12.0f)
                lineTo(7.793f, 9.207f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 10.586f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 12.0f)
                lineToRelative(2.793f, 2.793f)
                close()
            }
        }
        .build()
        return _bxsXSquare!!
    }

private var _bxsXSquare: ImageVector? = null
