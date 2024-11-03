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

public val Twbs.Sliders: ImageVector
    get() {
        if (_sliders != null) {
            return _sliders!!
        }
        _sliders = Builder(name = "Sliders", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveTo(9.05f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(16.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(0.0f, 4.0f)
                lineTo(0.0f, 3.0f)
                close()
                moveTo(4.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveTo(2.05f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(16.0f, 8.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.95f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(0.0f, 9.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(11.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-2.45f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(16.0f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _sliders!!
    }

private var _sliders: ImageVector? = null
