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

public val Twbs.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                lineTo(6.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(4.14f)
                lineToRelative(0.386f, -1.158f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-0.64f)
                lineToRelative(-0.311f, 0.935f)
                lineToRelative(0.807f, 1.29f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -0.848f, 0.53f)
                lineToRelative(-0.508f, -0.812f)
                lineToRelative(-2.076f, 3.322f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 10.5f)
                lineTo(5.959f, 10.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.815f, -3.274f)
                lineTo(5.0f, 5.856f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(1.5f, 2.443f)
                lineToRelative(-0.508f, 0.814f)
                curveToRelative(0.5f, 0.444f, 0.85f, 1.054f, 0.967f, 1.743f)
                horizontalLineToRelative(1.139f)
                close()
                moveTo(8.0f, 9.057f)
                lineTo(9.598f, 6.5f)
                lineTo(6.402f, 6.5f)
                close()
                moveTo(4.937f, 9.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.487f, -0.877f)
                lineToRelative(-0.548f, 0.877f)
                close()
                moveTo(3.603f, 8.092f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 4.937f, 10.5f)
                lineTo(3.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.424f, -0.765f)
                close()
                moveTo(11.55f, 8.622f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.848f, -0.53f)
                lineToRelative(1.026f, 1.643f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.848f, 0.53f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
