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

public val Twbs.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 2.0f)
                horizontalLineToRelative(9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 3.5f)
                lineTo(12.0f, 5.0f)
                horizontalLineToRelative(1.02f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.17f, 0.563f)
                lineToRelative(1.481f, 1.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.329f, 0.938f)
                lineTo(16.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.998f, -0.085f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 10.5f)
                close()
                moveTo(1.294f, 10.956f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.732f, 11.0f)
                horizontalLineToRelative(5.536f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.732f, -0.732f)
                lineTo(11.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.294f, 0.456f)
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.732f, 1.0f)
                horizontalLineToRelative(0.768f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(15.0f, 8.35f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.11f, -0.312f)
                lineToRelative(-1.48f, -1.85f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.02f, 6.0f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(9.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
