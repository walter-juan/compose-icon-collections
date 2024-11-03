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

public val Twbs.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.049f)
                curveToRelative(0.0f, -4.446f, -3.582f, -8.05f, -8.0f, -8.05f)
                curveTo(3.58f, 0.0f, -0.002f, 3.603f, -0.002f, 8.05f)
                curveToRelative(0.0f, 4.017f, 2.926f, 7.347f, 6.75f, 7.951f)
                verticalLineToRelative(-5.625f)
                horizontalLineToRelative(-2.03f)
                verticalLineTo(8.05f)
                horizontalLineTo(6.75f)
                verticalLineTo(6.275f)
                curveToRelative(0.0f, -2.017f, 1.195f, -3.131f, 3.022f, -3.131f)
                curveToRelative(0.876f, 0.0f, 1.791f, 0.157f, 1.791f, 0.157f)
                verticalLineToRelative(1.98f)
                horizontalLineToRelative(-1.009f)
                curveToRelative(-0.993f, 0.0f, -1.303f, 0.621f, -1.303f, 1.258f)
                verticalLineToRelative(1.51f)
                horizontalLineToRelative(2.218f)
                lineToRelative(-0.354f, 2.326f)
                horizontalLineTo(9.25f)
                verticalLineTo(16.0f)
                curveToRelative(3.824f, -0.604f, 6.75f, -3.934f, 6.75f, -7.951f)
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
