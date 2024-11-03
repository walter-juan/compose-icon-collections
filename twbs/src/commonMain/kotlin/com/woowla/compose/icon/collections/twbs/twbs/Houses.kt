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

public val Twbs.Houses: ImageVector
    get() {
        if (_houses != null) {
            return _houses!!
        }
        _houses = Builder(name = "Houses", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.793f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, 0.708f)
                lineTo(6.5f, 1.707f)
                lineTo(2.0f, 6.207f)
                lineTo(2.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 12.5f)
                lineTo(1.0f, 7.207f)
                lineToRelative(-0.146f, 0.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                close()
                moveTo(8.793f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineTo(12.0f, 3.793f)
                lineTo(12.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.293f)
                lineToRelative(1.854f, 1.853f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(15.0f, 8.207f)
                lineTo(15.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 13.5f)
                lineTo(4.0f, 8.207f)
                lineToRelative(-0.146f, 0.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                close()
                moveTo(9.5f, 2.707f)
                lineTo(5.0f, 7.207f)
                lineTo(5.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(14.0f, 7.207f)
                close()
            }
        }
        .build()
        return _houses!!
    }

private var _houses: ImageVector? = null
