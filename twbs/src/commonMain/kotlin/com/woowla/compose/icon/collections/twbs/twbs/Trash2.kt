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

public val Twbs.Trash2: ImageVector
    get() {
        if (_trash2 != null) {
            return _trash2!!
        }
        _trash2 = Builder(name = "Trash2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.037f, 0.225f)
                lineToRelative(-1.684f, 10.104f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.305f, 15.0f)
                horizontalLineTo(5.694f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.973f, -1.671f)
                lineTo(2.037f, 3.225f)
                arcTo(0.7f, 0.7f, 0.0f, false, true, 2.0f, 3.0f)
                curveToRelative(0.0f, -1.105f, 2.686f, -2.0f, 6.0f, -2.0f)
                reflectiveCurveToRelative(6.0f, 0.895f, 6.0f, 2.0f)
                moveTo(3.215f, 4.207f)
                lineToRelative(1.493f, 8.957f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.986f, 0.836f)
                horizontalLineToRelative(4.612f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.986f, -0.836f)
                lineToRelative(1.493f, -8.957f)
                curveTo(11.69f, 4.689f, 9.954f, 5.0f, 8.0f, 5.0f)
                reflectiveCurveToRelative(-3.69f, -0.311f, -4.785f, -0.793f)
            }
        }
        .build()
        return _trash2!!
    }

private var _trash2: ImageVector? = null
