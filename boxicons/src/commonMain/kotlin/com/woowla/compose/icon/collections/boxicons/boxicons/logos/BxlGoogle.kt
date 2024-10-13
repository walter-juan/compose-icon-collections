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

public val LogosGroup.BxlGoogle: ImageVector
    get() {
        if (_bxlGoogle != null) {
            return _bxlGoogle!!
        }
        _bxlGoogle = Builder(name = "BxlGoogle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.283f, 10.356f)
                horizontalLineToRelative(-8.327f)
                verticalLineToRelative(3.451f)
                horizontalLineToRelative(4.792f)
                curveToRelative(-0.446f, 2.193f, -2.313f, 3.453f, -4.792f, 3.453f)
                arcToRelative(5.27f, 5.27f, 0.0f, false, true, -5.279f, -5.28f)
                arcToRelative(5.27f, 5.27f, 0.0f, false, true, 5.279f, -5.279f)
                curveToRelative(1.259f, 0.0f, 2.397f, 0.447f, 3.29f, 1.178f)
                lineToRelative(2.6f, -2.599f)
                curveToRelative(-1.584f, -1.381f, -3.615f, -2.233f, -5.89f, -2.233f)
                arcToRelative(8.908f, 8.908f, 0.0f, false, false, -8.934f, 8.934f)
                arcToRelative(8.907f, 8.907f, 0.0f, false, false, 8.934f, 8.934f)
                curveToRelative(4.467f, 0.0f, 8.529f, -3.249f, 8.529f, -8.934f)
                curveToRelative(0.0f, -0.528f, -0.081f, -1.097f, -0.202f, -1.625f)
                close()
            }
        }
        .build()
        return _bxlGoogle!!
    }

private var _bxlGoogle: ImageVector? = null
