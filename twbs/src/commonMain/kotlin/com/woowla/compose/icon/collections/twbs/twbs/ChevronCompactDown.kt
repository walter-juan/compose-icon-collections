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

public val Twbs.ChevronCompactDown: ImageVector
    get() {
        if (_chevronCompactDown != null) {
            return _chevronCompactDown!!
        }
        _chevronCompactDown = Builder(name = "ChevronCompactDown", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.553f, 6.776f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.67f, -0.223f)
                lineTo(8.0f, 9.44f)
                lineToRelative(5.776f, -2.888f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.448f, 0.894f)
                lineToRelative(-6.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.448f, 0.0f)
                lineToRelative(-6.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.223f, -0.67f)
            }
        }
        .build()
        return _chevronCompactDown!!
    }

private var _chevronCompactDown: ImageVector? = null
