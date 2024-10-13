package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlFacebookCircle: ImageVector
    get() {
        if (_bxlFacebookCircle != null) {
            return _bxlFacebookCircle!!
        }
        _bxlFacebookCircle = Builder(name = "BxlFacebookCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.002f)
                curveToRelative(-5.522f, 0.0f, -9.999f, 4.477f, -9.999f, 9.999f)
                curveToRelative(0.0f, 4.99f, 3.656f, 9.126f, 8.437f, 9.879f)
                verticalLineToRelative(-6.988f)
                horizontalLineToRelative(-2.54f)
                verticalLineToRelative(-2.891f)
                horizontalLineToRelative(2.54f)
                verticalLineTo(9.798f)
                curveToRelative(0.0f, -2.508f, 1.493f, -3.891f, 3.776f, -3.891f)
                curveToRelative(1.094f, 0.0f, 2.24f, 0.195f, 2.24f, 0.195f)
                verticalLineToRelative(2.459f)
                horizontalLineToRelative(-1.264f)
                curveToRelative(-1.24f, 0.0f, -1.628f, 0.772f, -1.628f, 1.563f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(2.771f)
                lineToRelative(-0.443f, 2.891f)
                horizontalLineToRelative(-2.328f)
                verticalLineToRelative(6.988f)
                curveTo(18.344f, 21.129f, 22.0f, 16.992f, 22.0f, 12.001f)
                curveToRelative(0.0f, -5.522f, -4.477f, -9.999f, -9.999f, -9.999f)
                close()
            }
        }
        .build()
        return _bxlFacebookCircle!!
    }

private var _bxlFacebookCircle: ImageVector? = null
