package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandPatreon: ImageVector
    get() {
        if (_brandPatreon != null) {
            return _brandPatreon!!
        }
        _brandPatreon = Builder(name = "BrandPatreon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.462f, 3.1f)
                curveToRelative(2.615f, -1.268f, 6.226f, -1.446f, 9.063f, -0.503f)
                curveToRelative(2.568f, 0.853f, 4.471f, 3.175f, 4.475f, 5.81f)
                curveToRelative(0.004f, 3.061f, -1.942f, 5.492f, -4.896f, 6.243f)
                curveToRelative(-1.693f, 0.43f, -2.338f, 0.75f, -2.942f, 1.582f)
                curveToRelative(-0.238f, 0.328f, -0.45f, 0.745f, -0.796f, 1.533f)
                lineToRelative(-0.22f, 0.5f)
                curveToRelative(-1.146f, 2.601f, -2.156f, 3.762f, -4.236f, 3.735f)
                curveToRelative(-2.232f, -0.03f, -3.603f, -1.742f, -4.313f, -4.48f)
                curveToRelative(-0.458f, -1.768f, -0.617f, -3.808f, -0.594f, -5.876f)
                curveToRelative(0.044f, -3.993f, 1.42f, -7.072f, 4.46f, -8.545f)
                close()
            }
        }
        .build()
        return _brandPatreon!!
    }

private var _brandPatreon: ImageVector? = null
