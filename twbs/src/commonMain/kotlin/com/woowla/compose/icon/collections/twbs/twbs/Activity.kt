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

public val Twbs.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.47f, 0.33f)
                lineTo(10.0f, 12.036f)
                lineToRelative(1.53f, -4.208f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 7.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(-1.88f, 5.17f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.94f, 0.0f)
                lineTo(6.0f, 3.964f)
                lineTo(4.47f, 8.171f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 8.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.15f)
                lineToRelative(1.88f, -5.17f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 2.0f)
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
