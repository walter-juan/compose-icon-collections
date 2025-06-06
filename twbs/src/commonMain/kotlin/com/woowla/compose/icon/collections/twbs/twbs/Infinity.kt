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

public val Twbs.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.68f, 5.792f)
                lineTo(7.345f, 7.75f)
                lineTo(5.681f, 9.708f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, -3.916f)
                close()
                moveTo(8.0f, 6.978f)
                lineTo(6.416f, 5.113f)
                lineToRelative(-0.014f, -0.015f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, false, 0.0f, 5.304f)
                lineToRelative(0.014f, -0.015f)
                lineTo(8.0f, 8.522f)
                lineToRelative(1.584f, 1.865f)
                lineToRelative(0.014f, 0.015f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, false, 0.0f, -5.304f)
                lineToRelative(-0.014f, 0.015f)
                close()
                moveTo(8.656f, 7.75f)
                lineTo(10.319f, 5.792f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 3.916f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
