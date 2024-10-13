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

public val RegularGroup.BxLoaderAlt: ImageVector
    get() {
        if (_bxLoaderAlt != null) {
            return _bxLoaderAlt!!
        }
        _bxLoaderAlt = Builder(name = "BxLoaderAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(5.421f, 0.0f, 10.0f, -4.579f, 10.0f, -10.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 4.337f, -3.663f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.663f, -8.0f, -8.0f)
                curveToRelative(0.0f, -4.336f, 3.663f, -8.0f, 8.0f, -8.0f)
                verticalLineTo(2.0f)
                curveTo(6.579f, 2.0f, 2.0f, 6.58f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.421f, 4.579f, 10.0f, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _bxLoaderAlt!!
    }

private var _bxLoaderAlt: ImageVector? = null
