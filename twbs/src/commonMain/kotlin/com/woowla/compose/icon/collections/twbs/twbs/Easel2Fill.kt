package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Easel2Fill: ImageVector
    get() {
        if (_easel2Fill != null) {
            return _easel2Fill!!
        }
        _easel2Fill = Builder(name = "Easel2Fill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.447f, 0.276f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.894f, 0.0f)
                lineTo(7.19f, 1.0f)
                horizontalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 2.5f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 1.0f)
                horizontalLineTo(8.809f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.86f)
                lineToRelative(-0.845f, 3.379f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.97f, 0.242f)
                lineTo(3.89f, 14.0f)
                horizontalLineToRelative(8.22f)
                lineToRelative(0.405f, 1.621f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.97f, -0.242f)
                lineTo(12.64f, 12.0f)
                horizontalLineToRelative(2.86f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(4.14f, 13.0f)
                lineTo(4.39f, 12.0f)
                horizontalLineToRelative(7.22f)
                lineToRelative(0.25f, 1.0f)
                close()
            }
        }
        .build()
        return _easel2Fill!!
    }

private var _easel2Fill: ImageVector? = null
