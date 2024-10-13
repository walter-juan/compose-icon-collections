package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsDropletHalf: ImageVector
    get() {
        if (_bxsDropletHalf != null) {
            return _bxsDropletHalf!!
        }
        _bxsDropletHalf = Builder(name = "BxsDropletHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.578f, 2.184f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -1.156f, 0.0f)
                curveTo(11.119f, 2.398f, 4.0f, 7.513f, 4.0f, 13.75f)
                curveTo(4.0f, 18.53f, 7.364f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(8.0f, -3.468f, 8.0f, -8.246f)
                curveToRelative(0.0f, -6.241f, -7.119f, -11.356f, -7.422f, -11.57f)
                close()
                moveTo(6.0f, 13.75f)
                curveToRelative(0.0f, -4.283f, 4.395f, -8.201f, 6.0f, -9.49f)
                verticalLineTo(20.0f)
                curveToRelative(-3.533f, 0.0f, -6.0f, -2.57f, -6.0f, -6.25f)
                close()
            }
        }
        .build()
        return _bxsDropletHalf!!
    }

private var _bxsDropletHalf: ImageVector? = null
