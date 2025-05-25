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

public val Twbs.MeasuringCup: ImageVector
    get() {
        if (_measuringCup != null) {
            return _measuringCup!!
        }
        _measuringCup = Builder(name = "MeasuringCup", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.038f, 0.309f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.0f)
                lineTo(14.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(5.959f)
                arcToRelative(1.041f, 1.041f, 0.0f, false, true, -2.069f, 0.17f)
                lineToRelative(-0.849f, -5.094f)
                arcTo(0.041f, 0.041f, 0.0f, false, false, 13.0f, 3.04f)
                lineTo(13.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(2.0f, 3.743f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.732f, -1.768f)
                lineTo(0.146f, 0.854f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.038f, 0.309f)
                moveTo(1.708f, 1.0f)
                lineToRelative(0.267f, 0.268f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 3.743f)
                lineTo(3.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(12.0f, 3.041f)
                arcToRelative(1.041f, 1.041f, 0.0f, false, true, 2.069f, -0.17f)
                lineToRelative(0.849f, 5.094f)
                arcTo(0.041f, 0.041f, 0.0f, false, false, 15.0f, 7.96f)
                lineTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(4.0f, 10.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _measuringCup!!
    }

private var _measuringCup: ImageVector? = null
