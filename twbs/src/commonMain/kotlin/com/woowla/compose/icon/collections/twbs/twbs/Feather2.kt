package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Feather2: ImageVector
    get() {
        if (_feather2 != null) {
            return _feather2!!
        }
        _feather2 = Builder(name = "Feather2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 1.063f)
                verticalLineToRelative(9.556f)
                lineTo(6.0f, 8.819f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.5f, -1.937f)
                moveTo(8.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.116f, 0.32f)
                lineTo(7.5f, 12.181f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-3.319f)
                lineToRelative(2.384f, -2.86f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.0f, 9.0f)
                verticalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                moveToRelative(0.5f, 1.063f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 3.0f)
                verticalLineToRelative(0.293f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(10.0f, 4.707f)
                verticalLineTo(8.82f)
                lineToRelative(-1.5f, 1.8f)
                verticalLineTo(6.207f)
                close()
            }
        }
        .build()
        return _feather2!!
    }

private var _feather2: ImageVector? = null
