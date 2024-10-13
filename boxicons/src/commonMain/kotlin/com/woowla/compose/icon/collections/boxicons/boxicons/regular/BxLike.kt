package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxLike: ImageVector
    get() {
        if (_bxLike != null) {
            return _bxLike!!
        }
        _bxLike = Builder(name = "BxLike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(-5.612f)
                lineToRelative(1.123f, -3.367f)
                curveToRelative(0.202f, -0.608f, 0.1f, -1.282f, -0.275f, -1.802f)
                reflectiveCurveTo(14.253f, 2.0f, 13.612f, 2.0f)
                lineTo(12.0f, 2.0f)
                curveToRelative(-0.297f, 0.0f, -0.578f, 0.132f, -0.769f, 0.36f)
                lineTo(6.531f, 8.0f)
                lineTo(4.0f, 8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.307f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 1.873f, -1.298f)
                lineToRelative(2.757f, -7.351f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(20.0f, 11.819f)
                lineTo(17.307f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 9.362f)
                lineTo(12.468f, 4.0f)
                horizontalLineToRelative(1.146f)
                lineToRelative(-1.562f, 4.683f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 13.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.819f)
                close()
            }
        }
        .build()
        return _bxLike!!
    }

private var _bxLike: ImageVector? = null
