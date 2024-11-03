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

public val Twbs.Stripe: ImageVector
    get() {
        if (_stripe != null) {
            return _stripe!!
        }
        _stripe = Builder(name = "Stripe", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(8.226f, 5.385f)
                curveToRelative(-0.584f, 0.0f, -0.937f, 0.164f, -0.937f, 0.593f)
                curveToRelative(0.0f, 0.468f, 0.607f, 0.674f, 1.36f, 0.93f)
                curveToRelative(1.228f, 0.415f, 2.844f, 0.963f, 2.851f, 2.993f)
                curveTo(11.5f, 11.868f, 9.924f, 13.0f, 7.63f, 13.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -3.009f, -0.626f)
                lineTo(4.621f, 9.758f)
                curveToRelative(0.926f, 0.506f, 2.095f, 0.88f, 3.01f, 0.88f)
                curveToRelative(0.617f, 0.0f, 1.058f, -0.165f, 1.058f, -0.671f)
                curveToRelative(0.0f, -0.518f, -0.658f, -0.755f, -1.453f, -1.041f)
                curveTo(6.026f, 8.49f, 4.5f, 7.94f, 4.5f, 6.11f)
                curveTo(4.5f, 4.165f, 5.988f, 3.0f, 8.226f, 3.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, 2.734f, 0.505f)
                verticalLineToRelative(2.583f)
                curveToRelative(-0.838f, -0.45f, -1.896f, -0.703f, -2.734f, -0.703f)
            }
        }
        .build()
        return _stripe!!
    }

private var _stripe: ImageVector? = null
