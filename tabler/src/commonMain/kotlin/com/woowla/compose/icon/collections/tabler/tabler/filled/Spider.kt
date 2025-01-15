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

public val FilledGroup.Spider: ImageVector
    get() {
        if (_spider != null) {
            return _spider!!
        }
        _spider = Builder(name = "Spider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.293f, 0.707f)
                lineToRelative(-3.293f, 3.293f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1.209f, -1.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, 0.293f)
                horizontalLineToRelative(-3.585f)
                lineToRelative(4.292f, 4.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.707f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-1.585f)
                lineToRelative(-2.016f, -2.016f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -9.968f, 0.0f)
                lineToRelative(-2.016f, 2.015f)
                verticalLineToRelative(1.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, -0.707f)
                lineToRelative(4.291f, -4.293f)
                horizontalLineToRelative(-3.584f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, -0.293f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.208f, 1.207f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-3.292f, -3.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(1.585f)
                lineToRelative(3.025f, 3.025f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.95f, 0.0f)
                lineToRelative(3.025f, -3.026f)
                verticalLineToRelative(-1.584f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.883f, -0.993f)
                close()
            }
        }
        .build()
        return _spider!!
    }

private var _spider: ImageVector? = null
