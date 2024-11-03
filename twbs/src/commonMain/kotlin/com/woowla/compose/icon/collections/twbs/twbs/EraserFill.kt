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

public val Twbs.EraserFill: ImageVector
    get() {
        if (_eraserFill != null) {
            return _eraserFill!!
        }
        _eraserFill = Builder(name = "EraserFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.086f, 2.207f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
                lineToRelative(3.879f, 3.879f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                lineToRelative(-5.5f, 5.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.879f, 15.0f)
                lineTo(5.12f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.414f, -0.586f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                close()
                moveTo(8.746f, 13.547f)
                lineTo(3.453f, 8.254f)
                lineTo(1.914f, 9.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 0.293f)
                lineTo(7.88f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                close()
            }
        }
        .build()
        return _eraserFill!!
    }

private var _eraserFill: ImageVector? = null
