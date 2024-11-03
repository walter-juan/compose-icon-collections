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

public val Twbs.Columns: ImageVector
    get() {
        if (_columns != null) {
            return _columns!!
        }
        _columns = Builder(name = "Columns", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(1.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(8.5f, 2.0f)
                verticalLineToRelative(8.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 2.0f)
                close()
                moveTo(8.5f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(15.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.5f, 2.0f)
                lineTo(1.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(1.0f, 14.0f)
                horizontalLineToRelative(6.5f)
                lineTo(7.5f, 6.0f)
                lineTo(1.0f, 6.0f)
                close()
            }
        }
        .build()
        return _columns!!
    }

private var _columns: ImageVector? = null
