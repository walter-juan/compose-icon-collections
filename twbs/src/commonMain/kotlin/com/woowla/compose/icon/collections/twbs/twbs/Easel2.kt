package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Easel2: ImageVector
    get() {
        if (_easel2 != null) {
            return _easel2!!
        }
        _easel2 = Builder(name = "Easel2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.447f, 0.276f)
                lineTo(8.81f, 1.0f)
                horizontalLineToRelative(4.69f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 2.5f)
                lineTo(15.0f, 11.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-2.86f)
                lineToRelative(0.845f, 3.379f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.97f, 0.242f)
                lineTo(12.11f, 14.0f)
                lineTo(3.89f, 14.0f)
                lineToRelative(-0.405f, 1.621f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.97f, -0.242f)
                lineTo(3.36f, 12.0f)
                lineTo(0.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(1.0f, 11.0f)
                lineTo(1.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 1.0f)
                horizontalLineToRelative(4.691f)
                lineToRelative(0.362f, -0.724f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 0.0f)
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(12.0f)
                lineTo(14.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(11.61f, 12.0f)
                lineTo(4.39f, 12.0f)
                lineToRelative(-0.25f, 1.0f)
                horizontalLineToRelative(7.72f)
                close()
            }
        }
        .build()
        return _easel2!!
    }

private var _easel2: ImageVector? = null
