package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.8f, 70.1f)
                curveToRelative(14.3f, 10.4f, 17.5f, 30.4f, 7.1f, 44.7f)
                lineToRelative(-256.0f, 352.0f)
                curveToRelative(-5.5f, 7.6f, -14.0f, 12.3f, -23.4f, 13.1f)
                reflectiveCurveToRelative(-18.5f, -2.7f, -25.1f, -9.3f)
                lineToRelative(-128.0f, -128.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(101.5f, 101.5f)
                lineToRelative(234.0f, -321.7f)
                curveToRelative(10.4f, -14.3f, 30.4f, -17.5f, 44.7f, -7.1f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
