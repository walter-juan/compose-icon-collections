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

public val RegularGroup.BxCircle: ImageVector
    get() {
        if (_bxCircle != null) {
            return _bxCircle!!
        }
        _bxCircle = Builder(name = "BxCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.001f, 5.515f, 4.487f, 10.001f, 10.0f, 10.001f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.001f, -10.001f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.001f, -10.0f)
                close()
                moveTo(12.0f, 20.001f)
                curveToRelative(-4.41f, 0.0f, -7.999f, -3.589f, -8.0f, -8.001f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(4.412f, 0.0f, 8.001f, 3.589f, 8.001f, 8.0f)
                curveToRelative(-0.001f, 4.412f, -3.59f, 8.001f, -8.001f, 8.001f)
                close()
            }
        }
        .build()
        return _bxCircle!!
    }

private var _bxCircle: ImageVector? = null
