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

public val Twbs.TypeBold: ImageVector
    get() {
        if (_typeBold != null) {
            return _typeBold!!
        }
        _typeBold = Builder(name = "TypeBold", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.21f, 13.0f)
                curveToRelative(2.106f, 0.0f, 3.412f, -1.087f, 3.412f, -2.823f)
                curveToRelative(0.0f, -1.306f, -0.984f, -2.283f, -2.324f, -2.386f)
                verticalLineToRelative(-0.055f)
                arcToRelative(2.176f, 2.176f, 0.0f, false, false, 1.852f, -2.14f)
                curveToRelative(0.0f, -1.51f, -1.162f, -2.46f, -3.014f, -2.46f)
                lineTo(3.843f, 3.136f)
                lineTo(3.843f, 13.0f)
                close()
                moveTo(5.908f, 4.674f)
                horizontalLineToRelative(1.696f)
                curveToRelative(0.963f, 0.0f, 1.517f, 0.451f, 1.517f, 1.244f)
                curveToRelative(0.0f, 0.834f, -0.629f, 1.32f, -1.73f, 1.32f)
                lineTo(5.908f, 7.238f)
                lineTo(5.908f, 4.673f)
                close()
                moveTo(5.908f, 11.462f)
                lineTo(5.908f, 8.598f)
                horizontalLineToRelative(1.73f)
                curveToRelative(1.217f, 0.0f, 1.88f, 0.492f, 1.88f, 1.415f)
                curveToRelative(0.0f, 0.943f, -0.643f, 1.449f, -1.832f, 1.449f)
                lineTo(5.907f, 11.462f)
                close()
            }
        }
        .build()
        return _typeBold!!
    }

private var _typeBold: ImageVector? = null
