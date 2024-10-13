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

public val SolidGroup.BxsAdjustAlt: ImageVector
    get() {
        if (_bxsAdjustAlt != null) {
            return _bxsAdjustAlt!!
        }
        _bxsAdjustAlt = Builder(name = "BxsAdjustAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 19.071f)
                curveToRelative(3.833f, -3.833f, 3.833f, -10.31f, 0.0f, -14.143f)
                reflectiveCurveToRelative(-10.31f, -3.833f, -14.143f, 0.0f)
                reflectiveCurveToRelative(-3.833f, 10.31f, 0.0f, 14.143f)
                reflectiveCurveToRelative(10.31f, 3.833f, 14.143f, 0.0f)
                close()
                moveTo(7.051f, 7.051f)
                curveToRelative(2.706f, -2.707f, 7.191f, -2.708f, 9.898f, 0.0f)
                lineToRelative(-9.898f, 9.898f)
                curveToRelative(-2.708f, -2.707f, -2.71f, -7.19f, 0.0f, -9.898f)
                close()
            }
        }
        .build()
        return _bxsAdjustAlt!!
    }

private var _bxsAdjustAlt: ImageVector? = null
