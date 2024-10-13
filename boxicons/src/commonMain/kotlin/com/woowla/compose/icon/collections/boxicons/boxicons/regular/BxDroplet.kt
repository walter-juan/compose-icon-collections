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

public val RegularGroup.BxDroplet: ImageVector
    get() {
        if (_bxDroplet != null) {
            return _bxDroplet!!
        }
        _bxDroplet = Builder(name = "BxDroplet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(4.636f, 0.0f, 8.0f, -3.468f, 8.0f, -8.246f)
                curveTo(20.0f, 7.522f, 12.882f, 2.4f, 12.579f, 2.185f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.156f, -0.001f)
                curveTo(11.12f, 2.397f, 4.0f, 7.503f, 4.0f, 13.75f)
                curveTo(4.0f, 18.53f, 7.364f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.999f, 4.26f)
                curveTo(13.604f, 5.55f, 18.0f, 9.474f, 18.0f, 13.754f)
                curveTo(18.0f, 17.432f, 15.532f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(-6.0f, -2.57f, -6.0f, -6.25f)
                curveToRelative(0.0f, -4.29f, 4.394f, -8.203f, 5.999f, -9.49f)
                close()
            }
        }
        .build()
        return _bxDroplet!!
    }

private var _bxDroplet: ImageVector? = null
