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

public val Twbs.PencilFill: ImageVector
    get() {
        if (_pencilFill != null) {
            return _pencilFill!!
        }
        _pencilFill = Builder(name = "PencilFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.854f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineTo(10.5f, 1.793f)
                lineTo(14.207f, 5.5f)
                lineToRelative(1.647f, -1.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.708f)
                close()
                moveTo(13.5f, 6.207f)
                lineTo(9.793f, 2.5f)
                lineTo(3.293f, 9.0f)
                lineTo(3.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.207f)
                close()
                moveTo(6.032f, 13.675f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 13.5f)
                lineTo(6.0f, 13.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(5.0f, 12.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(4.0f, 11.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.175f, -0.032f)
                lineToRelative(-0.179f, 0.178f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.11f, 0.168f)
                lineToRelative(-2.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.65f, 0.65f)
                lineToRelative(5.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.168f, -0.11f)
                close()
            }
        }
        .build()
        return _pencilFill!!
    }

private var _pencilFill: ImageVector? = null
