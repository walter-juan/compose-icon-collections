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

public val RegularGroup.BxDiamond: ImageVector
    get() {
        if (_bxDiamond != null) {
            return _bxDiamond!!
        }
        _bxDiamond = Builder(name = "BxDiamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.813f, 3.838f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.187f, 3.0f)
                horizontalLineTo(7.813f)
                curveToRelative(-0.644f, 0.0f, -1.252f, 0.313f, -1.667f, 0.899f)
                lineToRelative(-4.0f, 6.581f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.111f, 1.188f)
                lineToRelative(9.0f, 10.0f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 1.486f, 0.001f)
                lineToRelative(9.0f, -10.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.111f, -1.188f)
                lineToRelative(-4.041f, -6.643f)
                close()
                moveTo(12.0f, 19.505f)
                lineTo(5.245f, 12.0f)
                horizontalLineToRelative(13.509f)
                lineTo(12.0f, 19.505f)
                close()
                moveTo(4.777f, 10.0f)
                lineToRelative(3.036f, -5.0f)
                lineToRelative(8.332f, -0.062f)
                lineTo(19.222f, 10.0f)
                horizontalLineTo(4.777f)
                close()
            }
        }
        .build()
        return _bxDiamond!!
    }

private var _bxDiamond: ImageVector? = null
