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

public val Twbs.Regex: ImageVector
    get() {
        if (_regex != null) {
            return _regex!!
        }
        _regex = Builder(name = "Regex", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.05f, 3.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 9.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.707f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.314f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, 0.707f)
                moveToRelative(9.9f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.314f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.707f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -9.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                moveTo(6.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(5.0f, -6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(2.117f)
                lineTo(8.257f, 5.57f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.514f, 0.858f)
                lineTo(9.528f, 7.5f)
                lineTo(7.743f, 8.571f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.514f, 0.858f)
                lineTo(10.0f, 8.383f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineTo(8.383f)
                lineToRelative(1.743f, 1.046f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.514f, -0.858f)
                lineTo(11.472f, 7.5f)
                lineToRelative(1.785f, -1.071f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.514f, -0.858f)
                lineTo(11.0f, 6.617f)
                close()
            }
        }
        .build()
        return _regex!!
    }

private var _regex: ImageVector? = null
