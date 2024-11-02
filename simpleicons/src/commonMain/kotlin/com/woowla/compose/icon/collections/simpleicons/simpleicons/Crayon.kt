package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Crayon: ImageVector
    get() {
        if (_crayon != null) {
            return _crayon!!
        }
        _crayon = Builder(name = "Crayon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.949f, 16.562f)
                curveTo(3.184f, 17.798f, 4.8f, 18.416f, 6.416f, 18.416f)
                curveToRelative(1.616f, 0.0f, 3.232f, -0.618f, 4.467f, -1.854f)
                lineToRelative(5.798f, -5.798f)
                lineToRelative(-1.426f, -1.426f)
                lineToRelative(-5.798f, 5.751f)
                curveToRelative(-1.663f, 1.663f, -4.372f, 1.663f, -6.083f, 0.0f)
                lineToRelative(-0.095f, -0.095f)
                curveToRelative(-1.663f, -1.663f, -1.663f, -4.372f, 0.0f, -6.083f)
                lineToRelative(0.095f, -0.095f)
                curveToRelative(1.663f, -1.663f, 4.372f, -1.663f, 6.083f, 0.0f)
                lineToRelative(0.475f, 0.523f)
                lineToRelative(1.426f, -1.426f)
                lineToRelative(-0.475f, -0.523f)
                curveToRelative(-2.471f, -2.471f, -6.511f, -2.471f, -8.982f, 0.0f)
                lineToRelative(-0.047f, 0.142f)
                curveToRelative(-2.471f, 2.471f, -2.471f, 6.511f, 0.0f, 8.982f)
                close()
                moveTo(22.004f, 7.438f)
                curveToRelative(-1.236f, -1.236f, -2.852f, -1.854f, -4.467f, -1.854f)
                curveToRelative(-1.616f, 0.0f, -3.232f, 0.618f, -4.467f, 1.854f)
                lineToRelative(-5.798f, 5.798f)
                lineToRelative(1.426f, 1.426f)
                lineToRelative(5.798f, -5.751f)
                curveToRelative(1.663f, -1.663f, 4.372f, -1.663f, 6.083f, 0.0f)
                lineToRelative(0.095f, 0.095f)
                curveToRelative(1.663f, 1.663f, 1.663f, 4.372f, 0.0f, 6.083f)
                lineToRelative(-0.095f, 0.095f)
                curveToRelative(-1.663f, 1.663f, -4.372f, 1.663f, -6.083f, 0.0f)
                lineToRelative(-0.475f, -0.475f)
                lineToRelative(-1.426f, 1.426f)
                lineToRelative(0.475f, 0.475f)
                curveToRelative(2.471f, 2.471f, 6.511f, 2.471f, 8.982f, 0.0f)
                lineToRelative(0.095f, -0.095f)
                curveToRelative(2.471f, -2.471f, 2.471f, -6.511f, 0.0f, -8.982f)
                curveToRelative(-0.047f, 0.0f, -0.142f, -0.095f, -0.142f, -0.095f)
                close()
            }
        }
        .build()
        return _crayon!!
    }

private var _crayon: ImageVector? = null
