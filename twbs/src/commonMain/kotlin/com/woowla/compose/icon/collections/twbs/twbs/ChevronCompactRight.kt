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

public val Twbs.ChevronCompactRight: ImageVector
    get() {
        if (_chevronCompactRight != null) {
            return _chevronCompactRight!!
        }
        _chevronCompactRight = Builder(name = "ChevronCompactRight", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.776f, 1.553f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.671f, 0.223f)
                lineToRelative(3.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.448f)
                lineToRelative(-3.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.894f, -0.448f)
                lineTo(9.44f, 8.0f)
                lineTo(6.553f, 2.224f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.223f, -0.671f)
            }
        }
        .build()
        return _chevronCompactRight!!
    }

private var _chevronCompactRight: ImageVector? = null
