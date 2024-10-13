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

public val SolidGroup.BxsRocket: ImageVector
    get() {
        if (_bxsRocket != null) {
            return _bxsRocket!!
        }
        _bxsRocket = Builder(name = "BxsRocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.78f, 15.84f)
                reflectiveCurveTo(18.64f, 13.0f, 19.61f, 12.0f)
                curveToRelative(3.07f, -3.0f, 1.54f, -9.18f, 1.54f, -9.18f)
                reflectiveCurveTo(15.0f, 1.29f, 12.0f, 4.36f)
                curveTo(9.66f, 6.64f, 8.14f, 8.22f, 8.14f, 8.22f)
                reflectiveCurveTo(4.3f, 7.42f, 2.0f, 9.72f)
                lineTo(14.25f, 22.0f)
                curveToRelative(2.3f, -2.33f, 1.53f, -6.16f, 1.53f, -6.16f)
                close()
                moveTo(14.28f, 6.84f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.83f, 0.0f)
                close()
                moveTo(3.0f, 21.0f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, false, 5.0f, -2.0f)
                lineToRelative(-3.0f, -3.0f)
                curveToRelative(-2.0f, 1.0f, -2.0f, 5.0f, -2.0f, 5.0f)
                close()
            }
        }
        .build()
        return _bxsRocket!!
    }

private var _bxsRocket: ImageVector? = null
